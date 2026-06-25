package org.coco.coco;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.coco.coco.model.StatusMaster;
import org.coco.coco.service.StatusService;
import org.coco.coco.shared.dto.request.StatusRequest;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

@Component
@RequiredArgsConstructor
@AllArgsConstructor
public class DataInitializer implements CommandLineRunner {
    private StatusService statusService;
    @Override
    public void run(String... args) {
        List<StatusMaster> statusMasterslist=new ArrayList<>();

        String[] statuses = {
                "New",
                "Open",
                "Contacted",
                "Attempted Contact",
                "Interested",
                "Not Interested",
                "Qualified",
                "Unqualified",
                "Follow-up Required",
                "Demo Scheduled",
                "Proposal Sent",
                "Negotiation",
                "Won",
                "Lost",
                "Converted",
                "On Hold",
                "Closed",
                "Active",
                "Inactive",
                "New Customer",
                "Returning Customer",
                "VIP",
                "Blacklisted",
                "Suspended",
                "Pending",
                "Assigned",
                "In Progress",
                "Waiting",
                "Completed",
                "Cancelled",
                "Overdue",
                "Reopened",
                "Waiting for Customer",
                "Waiting for Internal Team",
                "Escalated",
                "Resolved",
                "Partially Paid",
                "Paid",
                "Failed",
                "Refunded",
                "Draft",
                "Sent",
                "Viewed",
                "Accepted",
                "Rejected",
                "Expired",
                "Confirmed",
                "Processing",
                "Packed",
                "Shipped",
                "Delivered",
                "Returned",
                "Planned",
                "Not Started",
                "Under Review",
                "Archived",
                "On Leave",
                "Resigned",
                "Terminated",
                "Retired",
                "Pending Verification",
                "Verified",
                "Locked",
                "Deleted",
                "Scheduled",
                "Missed",
                "Rescheduled",
                "Submitted",
                "Approved",
                "Success"
        };
        for(int i=0;i<statuses.length;i++){
            statusMasterslist.add(StatusMaster.builder()
                    .statusName(statuses[i].toUpperCase())
                    .active(true)
                    .build());
        }
        statusMasterslist.stream().forEach(stausMaster->{
            statusService.createStatus(StatusRequest.builder()
                            .statusName(stausMaster.getStatusName())
                            .active(stausMaster.isActive())
                    .build());
        });
    }
}
