package org.coco.coco.model;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

@Entity
@Table(
        name = "system_settings",
        uniqueConstraints = {
                @UniqueConstraint(
                        name = "uk_setting_key",
                        columnNames = "setting_key"
                )
        }
)
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SystemSettings {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "setting_key", nullable = false, length = 100)
    private String settingKey;

    @Column(name = "setting_value", columnDefinition = "TEXT")
    private String settingValue;

    @Column(name = "setting_group", length = 100)
    private String settingGroup;

    @Column(name = "description", length = 500)
    private String description;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "status_id")
    private StatusMaster status;

    @Column(name = "created_at", updatable = false)
    private LocalDateTime createdAt;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    @PrePersist
    public void prePersist() {
        createdAt = LocalDateTime.now();
        updatedAt = LocalDateTime.now();
    }

    @PreUpdate
    public void preUpdate() {
        updatedAt = LocalDateTime.now();
    }
}
/*
| setting_key        | setting_value                         | setting_group |
| ------------------ | ------------------------------------- | ------------- |
| COMPANY_NAME       | My CRM                                | GENERAL       |
| COMPANY_EMAIL      | [admin@crm.com](mailto:admin@crm.com) | GENERAL       |
| COMPANY_PHONE      | 9999999999                            | GENERAL       |
| COMPANY_LOGO       | logo.png                              | GENERAL       |
| DEFAULT_CURRENCY   | INR                                   | FINANCE       |
| GST_PERCENTAGE     | 18                                    | FINANCE       |
| SMTP_HOST          | smtp.gmail.com                        | EMAIL         |
| SMTP_PORT          | 587                                   | EMAIL         |
| OTP_EXPIRY_MINUTES | 5                                     | SECURITY      |
| MAX_LOGIN_ATTEMPTS | 5                                     | SECURITY      |
| RAZORPAY_KEY       | xxxx                                  | PAYMENT       |

 */
