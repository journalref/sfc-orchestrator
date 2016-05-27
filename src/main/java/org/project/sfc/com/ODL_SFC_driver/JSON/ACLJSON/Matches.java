
package org.project.sfc.com.ODL_SFC_driver.JSON.ACLJSON;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Matches {
    @SerializedName("source-port-range")
    @Expose
    private SourcePortRange sourcePortRange;
    @SerializedName("destination-port-range")
    @Expose
    private DestinationPortRange destinationPortRange;

    @SerializedName("protocol")
    @Expose
    private Integer protocol;
    @SerializedName("dest-port")
    @Expose
    private Integer destPort;

  /* Add later
    @SerializedName("source_ip_prefix")

    @Expose
    private String srcIp;

    @SerializedName("dest_ip_prefix")
    @Expose
    private String dstIp;
    /**
     * 
     * @return
     *     The dest-port
     */
    public Integer getDestPort() {
        return destPort;
    }

    /**
     * 
     * @param dest-port
     *     The protocol
     */
    public void setDestPort(Integer port) {
        this.destPort= port;
    }


    /**
     *
     * @return
     *     The protocol
     */
    public Integer getProtocol() {
        return protocol;
    }

    /**
     *
     * @param protocol
     *     The protocol
     */
    public void setProtocol(Integer protocol) {
        this.protocol = protocol;
    }

    /**
     * 
     * @return
     *     The destinationPortRange
     */
    public DestinationPortRange getDestinationPortRange() {
        return destinationPortRange;
    }
    /**
     *
     * @param destinationPortRange
     *     The destination-port-range
     */
    public void setDestinationPortRange(DestinationPortRange destinationPortRange) {
        this.destinationPortRange = destinationPortRange;
    }

    /**
     * 
     * @param sourcePortRange
     *     The source-port-range
     */
    public void setSourcePortRange(SourcePortRange sourcePortRange) {
        this.sourcePortRange = sourcePortRange;
    }
    /**
     *
     * @return
     *     The sourcePortRange
     */
    public SourcePortRange getSourcePortRange() {
        return sourcePortRange;
    }


    /**
     *
     * @return
     * The source_ip_prefix
     */
/*    public String getSrcIP() {
        return srcIp;
    }

    /**
     *
     * @param srcIP
     * The ssource_ip_prefix
     */
 /*   public void setSrcIp(String srcIP) {
        this.srcIp = srcIP;
    }

    /**
     *
     * @return
     * The source_ip_prefix
     */
 /*   public String getDstIP() {
        return dstIp;
    }

    /**
     *
     * @param srcIP
     * The ssource_ip_prefix
     */
/*    public void setDstIp(String dstIP) {
        this.dstIp = dstIP;
    }
    */
}