package com.anjbo.ws.ccb;

import com.anjbo.utils.ccb.CCBUtil;
import com.anjbo.utils.ccb.DESPlus;

/**
 * This class was generated by Apache CXF 2.7.18
 * 2016-11-17T15:09:11.352+08:00
 * Generated source version: 2.7.18
 * 
 */
public final class TestClient {
	
    /*public static void main(String args[]) throws java.lang.Exception {
    	String tranCode = "C002";
        int encryptFlag = 1;
        String context = DESPlus.encrypt(getC002Xml()) ;//加密xml数据
        AgencyCompanyServer_Service ss = new AgencyCompanyServer_Service();
        AgencyCompanyServer port = ss.getAgencyCompanyServerPort();  
        SecondHouseLoadResp result = port.agencyCompanyLoadReq(tranCode, encryptFlag, context);
        System.out.println("agencyCompanyLoadReq.result="+result.getContext());
    }
    
    
    
    public static String getC002Xml()throws Exception
    {
    	String xml = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>"
    						+"<ROOT>"
    						+"<HEADER>"
    						+"<TRANNO>C002</TRANNO>"
    						+"<COMNO>COM02</COMNO>"
    						+"<BNKNO>442000086</BNKNO>"
    						+"<CHANNELNO>ACG</CHANNELNO>"
    						+"<ISN>"+ CCBUtil.getID()+"</ISN>"
    						+"</HEADER>"
    						+"<BODY>"
    						+"<LOANAPP>"
    						+"<Cst_Nm>测试</Cst_Nm>"
    						+"<Crdt_TpCd>A</Crdt_TpCd>"
    						+"<Crdt_No>440301199008076615</Crdt_No>"
    						+"<PD_Cd>2022</PD_Cd>"
    						+"<Loan_Amt>321.51</Loan_Amt>"
    						+"<Loan_Trm>12</Loan_Trm>"
    						+"<Idv_loan_Use_Cd>76</Idv_loan_Use_Cd>"
    						+"<Cst_RltvAR_ID></Cst_RltvAR_ID>"
    						+"<FstPy_Amt>1234.56</FstPy_Amt>"
    						+"<Hs_Val>123456.78</Hs_Val>"
    						+"<Parn_RspbPsn_ID>测试经办人</Parn_RspbPsn_ID>"
    						+"<Parn_RspbPsn_Phone>18825195364</Parn_RspbPsn_Phone>"
    						+"<RspbPsn_Phone>18018776181</RspbPsn_Phone>"
    						+"<RpMd_Cd>311</RpMd_Cd>"
    						+"<Mrtg_No>0000000128</Mrtg_No>"
    						+"<RcvPymtPs_Grp>"
    						+"<RcvPymtPs_AccNo>6214667207089520</RcvPymtPs_AccNo>"
    						+"<RcvPymtPs_AccNm>何零七</RcvPymtPs_AccNm>"
    						+"<RPPDBnk_Nm_Inf>建设银行</RPPDBnk_Nm_Inf>"
    						+"<OurBnk_Ind>1</OurBnk_Ind>"
    						+ "</RcvPymtPs_Grp>"
    						+"<Rel_Grp>"
    						+"<RelParty_TpCd>3024</RelParty_TpCd>"
    						+ "</Rel_Grp>"
    						+"<Hbs_Grp>"
    						+"<Fam_Exst_Hs_Num>1</Fam_Exst_Hs_Num>"
    						+"<HsStl_Cd>10</HsStl_Cd>"
    						+"<Adr_ID></Adr_ID>"
    						+ "</Hbs_Grp>"
    						+"<Gnt_Grp>"
    						+"<Mrtg_Ind>1</Mrtg_Ind>"
    						+ "</Gnt_Grp>"
    						+"</LOANAPP>"
    						+"</BODY>"
    						+"</ROOT>";
    	
    	return xml;
    }*/
}