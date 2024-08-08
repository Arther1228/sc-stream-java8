package top.ss007.scstream.model;

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

    private int deviceType;

    private String callsign;

    private int radarId;

    private String radarType;

    private String uasId;

    private int uaType;

    private int targetId;

    private double latitude;

    private double longitude;

    private float altitude;

    private float groundSpeed;

    private float heading;

    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    private LocalDateTime createTime;

    private String extensionField1;

    private String extensionField2;

}
