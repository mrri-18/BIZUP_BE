package com.likelion.bizup.module.user.entity;
import com.likelion.bizup.global.common.BaseTime;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "user")
@Getter
@NoArgsConstructor
public class User extends BaseTime {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    public String userid;
    private String password;
    private String phone;
    private String businessName;
    private String description;
    private String businessNum;
    private String businessAddress;
    private String itemSendLocation;
    private String accountNum;
    private String nickname;

    @OneToOne
    @JoinColumn(name = "validate_user_id")
    private ValidateUser validateUser;

    @Builder
    public User(@NotNull ValidateUser validateUser, String userid, String password, String phone, String businessName, String businessNum,
                String businessAddress, String description,
                String itemSendLocation, String accountNum, String nickname) {
        this.validateUser = validateUser;
        this.userid = userid;
        this.password = password;
        this.phone = phone;
        this.businessName = businessName;
        this.businessNum=businessNum;
        this.businessAddress = businessAddress;
        this.description = description;
        this.itemSendLocation = itemSendLocation;
        this.accountNum = accountNum;
        this.nickname=nickname;
    }
}
