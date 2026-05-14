/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logic;

/**
 *
 * @author ohjun
 */
public class PrivacyCase extends EthicsCase {
    private String dataType;

    public PrivacyCase(String caseTitle, String description, String dataType) {
        super(caseTitle, description, "Privacy"); // 示例，具体category逻辑可根据需要调整
    }

    public String getDataType() {
        return null;
    }

    @Override
    public String toString() {
        return null;
    }
}