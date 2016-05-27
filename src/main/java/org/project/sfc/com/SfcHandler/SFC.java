package org.project.sfc.com.SfcHandler;

import org.project.sfc.com.ODL_SFC_driver.JSON.SFCdict.SFCdict;
import org.project.sfc.com.ODL_SFC_driver.JSON.SFCdict.SfcDict;
import org.project.sfc.com.ODL_SFC_driver.ODL_SFC.Opendaylight;
import org.project.sfc.com.ODL_SFC_driver.ODL_SFC.VNFdict;
import org.project.sfc.com.ODL_SFC_driver.ODL_SFC_Classifier.SFCCdict.SFCCdict;

import java.util.HashMap;
import java.util.List;

/**
 * Created by mah on 2/29/16.
 */
// A DB for NSR created and their relative classifiers

public class SFC {

    private static SFC instance;

    private SFC() {}

    public static SFC getInstance() {
        if (instance == null) {
            instance = new SFC();
        }
        return instance;
    }

    HashMap<String,SFC_Data> SFC_MAP=new HashMap<String,SFC_Data>();
    public void add(String nsr_id, String rsp_id, String sfcc_name, boolean Symm,HashMap<Integer,VNFdict> VNFs,SFCdict SFC_dict_info,SFCCdict ClassifierDict){
        SFC_Data sfc_data=new SFC_Data();
        sfc_data.setRspID(rsp_id);
        sfc_data.setSfccName(sfcc_name);
        sfc_data.setSymm(Symm);
        sfc_data.setChainSFs(VNFs);
        sfc_data.setSFCdictInfo(SFC_dict_info);
        sfc_data.setClassifierInfo(ClassifierDict);
        SFC_MAP.put(nsr_id,sfc_data);


    }

    public void remove(String nsr){
        SFC_MAP.remove(nsr);
    }

    public void update(String nsr_id,String new_rsp_id, String new_sfcc_name, boolean Symm,HashMap<Integer,VNFdict> VNFs,SFCdict SFC_dict_info,SFCCdict ClassifierDict){
        SFC_MAP.remove(nsr_id);
        SFC_Data sfc_data=new SFC_Data();
        sfc_data.setRspID(new_rsp_id);
        sfc_data.setSfccName(new_sfcc_name);
        sfc_data.setSymm(Symm);
        sfc_data.setChainSFs(VNFs);
        sfc_data.setSFCdictInfo(SFC_dict_info);
        sfc_data.setClassifierInfo(ClassifierDict);
        SFC_MAP.put(nsr_id,sfc_data);
    }

    public HashMap<String,SFC_Data> getAllSFCs() {

        return SFC_MAP;
    }

        public String getRspID(String nsr_id){
        String chain_id=SFC_MAP.get(nsr_id).getRspID();
        return chain_id;
    }
    public String getSfccName(String nsr_id){
        String sfcc_name=SFC_MAP.get(nsr_id).getSfccName();
        return sfcc_name;
    }

    public boolean isSymmSFC(String nsr_id){
        boolean Symm=SFC_MAP.get(nsr_id).isSymm();
        return Symm;
    }
    public class SFC_Data{
        String rsp_id;
        String SFCC_name;
        boolean Symm;
        HashMap<Integer,VNFdict> VNFs;
        SFCdict SFC_dict_info;
        SFCCdict ClassifierDict;

        public String getRspID() {
            return rsp_id;
        }

        /**
         *
         * @param rsp
         *     The rsp-id
         */
        public void setRspID(String rsp) {
            this.rsp_id = rsp;
        }

        public String getSfccName() {
            return SFCC_name;
        }


        public void setSfccName(String name) {
            this.SFCC_name = name;
        }


        public boolean isSymm() {
            return Symm;
        }


        public void setSymm(boolean Symmx) {
            this.Symm = Symmx;
        }

        public void setChainSFs(HashMap<Integer,VNFdict> vnfs) {
            this.VNFs = vnfs;
        }

        public HashMap<Integer,VNFdict> getChainSFs() {
            return VNFs;
        }

        public void setSFCdictInfo(SFCdict sfc) {
            this.SFC_dict_info = sfc;
        }

        public SFCdict getSFCdictInfo() {
            return SFC_dict_info;
        }

        public void setClassifierInfo(SFCCdict classifier_dict) {
            this.ClassifierDict = classifier_dict;
        }

        public SFCCdict getClassifierInfo() {
            return ClassifierDict;
        }


    }
}