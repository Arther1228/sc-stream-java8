package top.ss007.scstream.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * @author yangliangchuang
 * @date 2024/8/8 15:49
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DkMonitorDevice {

    @JsonProperty("deviceType")
    private int deviceType;

    @JsonProperty("callsign")
    private String callsign;

    @JsonProperty("radarId")
    private int radarId;

    @JsonProperty("radarType")
    private String radarType;

    @JsonProperty("uasId")
    private String uasId;

    @JsonProperty("uaType")
    private int uaType;

    @JsonProperty("targetId")
    private int targetId;

    @JsonProperty("latitude")
    private double latitude;

    @JsonProperty("longitude")
    private double longitude;

    @JsonProperty("altitude")
    private float altitude;

    @JsonProperty("groundSpeed")
    private float groundSpeed;

    @JsonProperty("heading")
    private float heading;

    @JsonProperty("createTime")
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    private LocalDateTime createTime;

    @JsonProperty("extensionField1")
    private String extensionField1;

    @JsonProperty("extensionField2")
    private String extensionField2;

}
