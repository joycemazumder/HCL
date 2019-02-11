/**
 * 
 */
package com.passengerService.proxy;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.passengerService.domain.Ticket;


/**
 * @author joyce
 *
 */

@FeignClient(name="GatewayService")
@RibbonClient(name="ReservationService")
public interface ReservationServiceProxy {
	 
	@PostMapping("/ReservationService/bookTicket")
	public int bookTicket(@RequestBody Ticket ticket) throws Exception;

}
