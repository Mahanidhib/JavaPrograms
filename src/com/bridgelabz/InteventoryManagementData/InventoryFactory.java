package com.bridgelabz.InteventoryManagementData;

import java.util.List;

import com.bridgelabz.Inventory.InventoryManagementData;

public class InventoryFactory {
	private List<InventoryManagementData> rice;
	private List<InventoryManagementData> wheat;
	private List<InventoryManagementData> pulses;

	public InventoryFactory() {
	}

	public InventoryFactory(List<InventoryManagementData> rice, List<InventoryManagementData> wheat,
			List<InventoryManagementData> pulses) {
		this.rice = rice;
		this.wheat = wheat;
		this.pulses = pulses;
	}

	public List<InventoryManagementData> getRice() {
		return rice;
	}

	public void setRice(List<InventoryManagementData> rice) {
		this.rice = rice;
	}

	public List<InventoryManagementData> getWheat() {
		return wheat;
	}

	public void setWheat(List<InventoryManagementData> wheat) {
		this.wheat = wheat;
	}

	public List<InventoryManagementData> getPulses() {
		return pulses;
	}

	public void setPulses(List<InventoryManagementData> pulses) {
		this.pulses = pulses;
	}
}
