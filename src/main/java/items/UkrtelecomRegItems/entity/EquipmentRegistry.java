package items.UkrtelecomRegItems.entity;

import items.UkrtelecomRegItems.entity.ContractInfo;
import items.UkrtelecomRegItems.entity.CpeInfo;
import items.UkrtelecomRegItems.entity.OntInfo;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import java.util.UUID;

@Entity
@Table(name = "equipment_registry")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EquipmentRegistry {

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(updatable = false, nullable = false, unique = true)
    private UUID equipmentRegistryId;

    @OneToOne
    @JoinColumn(name = "contract_info_id", nullable = false)
    private ContractInfo contractInfo;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "cpe_info_id")
    private CpeInfo cpeInfo;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "ont_info_id")
    private OntInfo ontInfo;
}