/**
 * 
 */
package com.lzf;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author MJCoder
 *
 */
public class DaoTest {
	private static Connection conn = null;
	private static PreparedStatement ps = null;
	private static ResultSet rs = null;

	/**
	 * 
	 */
	public DaoTest() {
		// TODO Auto-generated constructor stub
		System.out.println("DaoTest构造函数");
	}

	public List<SysConfig> selectSysConfig() {
		List<SysConfig> sysConfigs = new ArrayList<>();
		try {
			conn = DBUtil.getConnection();
			ps = conn.prepareStatement("SELECT * FROM sys.sys_config");
			rs = ps.executeQuery();
			while (rs.next()) {
				sysConfigs.add(new SysConfig(rs.getString("variable"), rs.getString("value"),
						rs.getTimestamp("set_time"), rs.getString("set_by")));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.closeDB(conn, ps, rs);
		}
		return sysConfigs;
	}

}
