/**
 *  Copyright (c) 2016 CentraleSupélec & EDF.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 *  This file is part of the RiseClipse tool
 *  
 *  Contributors:
 *      Computer Science Department, CentraleSupélec : initial implementation
 *  Contacts:
 *      Dominique.Marcadet@centralesupelec.fr
 * 
 */
package fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl;

import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AmiBillingReadyKind;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ConfigurationEvent;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CustomerAgreement;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDevice;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceControl;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceEvent;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Equipment;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.MeterReading;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.MeterWorkTask;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.MetrologyRequirement;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Outage;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PhaseCode;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PricingStructure;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ServiceCategory;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ServiceLocation;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ServiceMultiplier;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ServiceSupplier;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.UsagePoint;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.UsagePointConnectedKind;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.UsagePointGroup;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.UsagePointLocation;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Usage Point</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.UsagePointImpl#getAmiBillingReady <em>Ami Billing Ready</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.UsagePointImpl#getCheckBilling <em>Check Billing</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.UsagePointImpl#getConnectionState <em>Connection State</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.UsagePointImpl#getEstimatedLoad <em>Estimated Load</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.UsagePointImpl#getGrounded <em>Grounded</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.UsagePointImpl#getIsSdp <em>Is Sdp</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.UsagePointImpl#getIsVirtual <em>Is Virtual</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.UsagePointImpl#getMinimalUsageExpected <em>Minimal Usage Expected</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.UsagePointImpl#getNominalServiceVoltage <em>Nominal Service Voltage</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.UsagePointImpl#getOutageRegion <em>Outage Region</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.UsagePointImpl#getPhaseCode <em>Phase Code</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.UsagePointImpl#getRatedCurrent <em>Rated Current</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.UsagePointImpl#getRatedPower <em>Rated Power</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.UsagePointImpl#getReadCycle <em>Read Cycle</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.UsagePointImpl#getReadRoute <em>Read Route</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.UsagePointImpl#getServiceDeliveryRemark <em>Service Delivery Remark</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.UsagePointImpl#getServicePriority <em>Service Priority</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.UsagePointImpl#getUsagePointLocation <em>Usage Point Location</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.UsagePointImpl#getCustomerAgreement <em>Customer Agreement</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.UsagePointImpl#getMeterReadings <em>Meter Readings</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.UsagePointImpl#getEquipments <em>Equipments</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.UsagePointImpl#getPricingStructures <em>Pricing Structures</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.UsagePointImpl#getMeterServiceWorkTasks <em>Meter Service Work Tasks</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.UsagePointImpl#getServiceLocation <em>Service Location</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.UsagePointImpl#getServiceCategory <em>Service Category</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.UsagePointImpl#getServiceSupplier <em>Service Supplier</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.UsagePointImpl#getServiceMultipliers <em>Service Multipliers</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.UsagePointImpl#getEndDeviceControls <em>End Device Controls</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.UsagePointImpl#getOutages <em>Outages</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.UsagePointImpl#getEndDevices <em>End Devices</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.UsagePointImpl#getConfigurationEvents <em>Configuration Events</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.UsagePointImpl#getUsagePointGroups <em>Usage Point Groups</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.UsagePointImpl#getEndDeviceEvents <em>End Device Events</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.UsagePointImpl#getMetrologyRequirements <em>Metrology Requirements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UsagePointImpl extends IdentifiedObjectImpl implements UsagePoint {
    /**
     * The default value of the '{@link #getAmiBillingReady() <em>Ami Billing Ready</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAmiBillingReady()
     * @generated
     * @ordered
     */
    protected static final AmiBillingReadyKind AMI_BILLING_READY_EDEFAULT = AmiBillingReadyKind.ENABLED;

    /**
     * The cached value of the '{@link #getAmiBillingReady() <em>Ami Billing Ready</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAmiBillingReady()
     * @generated
     * @ordered
     */
    protected AmiBillingReadyKind amiBillingReady = AMI_BILLING_READY_EDEFAULT;

    /**
     * This is true if the Ami Billing Ready attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean amiBillingReadyESet;

    /**
     * The default value of the '{@link #getCheckBilling() <em>Check Billing</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCheckBilling()
     * @generated
     * @ordered
     */
    protected static final Boolean CHECK_BILLING_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getCheckBilling() <em>Check Billing</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCheckBilling()
     * @generated
     * @ordered
     */
    protected Boolean checkBilling = CHECK_BILLING_EDEFAULT;

    /**
     * This is true if the Check Billing attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean checkBillingESet;

    /**
     * The default value of the '{@link #getConnectionState() <em>Connection State</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getConnectionState()
     * @generated
     * @ordered
     */
    protected static final UsagePointConnectedKind CONNECTION_STATE_EDEFAULT = UsagePointConnectedKind.CONNECTED;

    /**
     * The cached value of the '{@link #getConnectionState() <em>Connection State</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getConnectionState()
     * @generated
     * @ordered
     */
    protected UsagePointConnectedKind connectionState = CONNECTION_STATE_EDEFAULT;

    /**
     * This is true if the Connection State attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean connectionStateESet;

    /**
     * The default value of the '{@link #getEstimatedLoad() <em>Estimated Load</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEstimatedLoad()
     * @generated
     * @ordered
     */
    protected static final Float ESTIMATED_LOAD_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getEstimatedLoad() <em>Estimated Load</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEstimatedLoad()
     * @generated
     * @ordered
     */
    protected Float estimatedLoad = ESTIMATED_LOAD_EDEFAULT;

    /**
     * This is true if the Estimated Load attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean estimatedLoadESet;

    /**
     * The default value of the '{@link #getGrounded() <em>Grounded</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getGrounded()
     * @generated
     * @ordered
     */
    protected static final Boolean GROUNDED_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getGrounded() <em>Grounded</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getGrounded()
     * @generated
     * @ordered
     */
    protected Boolean grounded = GROUNDED_EDEFAULT;

    /**
     * This is true if the Grounded attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean groundedESet;

    /**
     * The default value of the '{@link #getIsSdp() <em>Is Sdp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIsSdp()
     * @generated
     * @ordered
     */
    protected static final Boolean IS_SDP_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getIsSdp() <em>Is Sdp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIsSdp()
     * @generated
     * @ordered
     */
    protected Boolean isSdp = IS_SDP_EDEFAULT;

    /**
     * This is true if the Is Sdp attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean isSdpESet;

    /**
     * The default value of the '{@link #getIsVirtual() <em>Is Virtual</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIsVirtual()
     * @generated
     * @ordered
     */
    protected static final Boolean IS_VIRTUAL_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getIsVirtual() <em>Is Virtual</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIsVirtual()
     * @generated
     * @ordered
     */
    protected Boolean isVirtual = IS_VIRTUAL_EDEFAULT;

    /**
     * This is true if the Is Virtual attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean isVirtualESet;

    /**
     * The default value of the '{@link #getMinimalUsageExpected() <em>Minimal Usage Expected</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMinimalUsageExpected()
     * @generated
     * @ordered
     */
    protected static final Boolean MINIMAL_USAGE_EXPECTED_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getMinimalUsageExpected() <em>Minimal Usage Expected</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMinimalUsageExpected()
     * @generated
     * @ordered
     */
    protected Boolean minimalUsageExpected = MINIMAL_USAGE_EXPECTED_EDEFAULT;

    /**
     * This is true if the Minimal Usage Expected attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean minimalUsageExpectedESet;

    /**
     * The default value of the '{@link #getNominalServiceVoltage() <em>Nominal Service Voltage</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNominalServiceVoltage()
     * @generated
     * @ordered
     */
    protected static final Float NOMINAL_SERVICE_VOLTAGE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getNominalServiceVoltage() <em>Nominal Service Voltage</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNominalServiceVoltage()
     * @generated
     * @ordered
     */
    protected Float nominalServiceVoltage = NOMINAL_SERVICE_VOLTAGE_EDEFAULT;

    /**
     * This is true if the Nominal Service Voltage attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean nominalServiceVoltageESet;

    /**
     * The default value of the '{@link #getOutageRegion() <em>Outage Region</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOutageRegion()
     * @generated
     * @ordered
     */
    protected static final String OUTAGE_REGION_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getOutageRegion() <em>Outage Region</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOutageRegion()
     * @generated
     * @ordered
     */
    protected String outageRegion = OUTAGE_REGION_EDEFAULT;

    /**
     * This is true if the Outage Region attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean outageRegionESet;

    /**
     * The default value of the '{@link #getPhaseCode() <em>Phase Code</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPhaseCode()
     * @generated
     * @ordered
     */
    protected static final PhaseCode PHASE_CODE_EDEFAULT = PhaseCode.ABCN;

    /**
     * The cached value of the '{@link #getPhaseCode() <em>Phase Code</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPhaseCode()
     * @generated
     * @ordered
     */
    protected PhaseCode phaseCode = PHASE_CODE_EDEFAULT;

    /**
     * This is true if the Phase Code attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean phaseCodeESet;

    /**
     * The default value of the '{@link #getRatedCurrent() <em>Rated Current</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRatedCurrent()
     * @generated
     * @ordered
     */
    protected static final Float RATED_CURRENT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getRatedCurrent() <em>Rated Current</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRatedCurrent()
     * @generated
     * @ordered
     */
    protected Float ratedCurrent = RATED_CURRENT_EDEFAULT;

    /**
     * This is true if the Rated Current attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean ratedCurrentESet;

    /**
     * The default value of the '{@link #getRatedPower() <em>Rated Power</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRatedPower()
     * @generated
     * @ordered
     */
    protected static final Float RATED_POWER_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getRatedPower() <em>Rated Power</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRatedPower()
     * @generated
     * @ordered
     */
    protected Float ratedPower = RATED_POWER_EDEFAULT;

    /**
     * This is true if the Rated Power attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean ratedPowerESet;

    /**
     * The default value of the '{@link #getReadCycle() <em>Read Cycle</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReadCycle()
     * @generated
     * @ordered
     */
    protected static final String READ_CYCLE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getReadCycle() <em>Read Cycle</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReadCycle()
     * @generated
     * @ordered
     */
    protected String readCycle = READ_CYCLE_EDEFAULT;

    /**
     * This is true if the Read Cycle attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean readCycleESet;

    /**
     * The default value of the '{@link #getReadRoute() <em>Read Route</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReadRoute()
     * @generated
     * @ordered
     */
    protected static final String READ_ROUTE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getReadRoute() <em>Read Route</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReadRoute()
     * @generated
     * @ordered
     */
    protected String readRoute = READ_ROUTE_EDEFAULT;

    /**
     * This is true if the Read Route attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean readRouteESet;

    /**
     * The default value of the '{@link #getServiceDeliveryRemark() <em>Service Delivery Remark</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getServiceDeliveryRemark()
     * @generated
     * @ordered
     */
    protected static final String SERVICE_DELIVERY_REMARK_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getServiceDeliveryRemark() <em>Service Delivery Remark</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getServiceDeliveryRemark()
     * @generated
     * @ordered
     */
    protected String serviceDeliveryRemark = SERVICE_DELIVERY_REMARK_EDEFAULT;

    /**
     * This is true if the Service Delivery Remark attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean serviceDeliveryRemarkESet;

    /**
     * The default value of the '{@link #getServicePriority() <em>Service Priority</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getServicePriority()
     * @generated
     * @ordered
     */
    protected static final String SERVICE_PRIORITY_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getServicePriority() <em>Service Priority</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getServicePriority()
     * @generated
     * @ordered
     */
    protected String servicePriority = SERVICE_PRIORITY_EDEFAULT;

    /**
     * This is true if the Service Priority attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean servicePriorityESet;

    /**
     * The cached value of the '{@link #getUsagePointLocation() <em>Usage Point Location</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUsagePointLocation()
     * @generated
     * @ordered
     */
    protected UsagePointLocation usagePointLocation;

    /**
     * This is true if the Usage Point Location reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean usagePointLocationESet;

    /**
     * The cached value of the '{@link #getCustomerAgreement() <em>Customer Agreement</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCustomerAgreement()
     * @generated
     * @ordered
     */
    protected CustomerAgreement customerAgreement;

    /**
     * This is true if the Customer Agreement reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean customerAgreementESet;

    /**
     * The cached value of the '{@link #getMeterReadings() <em>Meter Readings</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMeterReadings()
     * @generated
     * @ordered
     */
    protected EList< MeterReading > meterReadings;

    /**
     * The cached value of the '{@link #getEquipments() <em>Equipments</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEquipments()
     * @generated
     * @ordered
     */
    protected EList< Equipment > equipments;

    /**
     * The cached value of the '{@link #getPricingStructures() <em>Pricing Structures</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPricingStructures()
     * @generated
     * @ordered
     */
    protected EList< PricingStructure > pricingStructures;

    /**
     * The cached value of the '{@link #getMeterServiceWorkTasks() <em>Meter Service Work Tasks</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMeterServiceWorkTasks()
     * @generated
     * @ordered
     */
    protected EList< MeterWorkTask > meterServiceWorkTasks;

    /**
     * The cached value of the '{@link #getServiceLocation() <em>Service Location</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getServiceLocation()
     * @generated
     * @ordered
     */
    protected ServiceLocation serviceLocation;

    /**
     * This is true if the Service Location reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean serviceLocationESet;

    /**
     * The cached value of the '{@link #getServiceCategory() <em>Service Category</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getServiceCategory()
     * @generated
     * @ordered
     */
    protected ServiceCategory serviceCategory;

    /**
     * This is true if the Service Category reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean serviceCategoryESet;

    /**
     * The cached value of the '{@link #getServiceSupplier() <em>Service Supplier</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getServiceSupplier()
     * @generated
     * @ordered
     */
    protected ServiceSupplier serviceSupplier;

    /**
     * This is true if the Service Supplier reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean serviceSupplierESet;

    /**
     * The cached value of the '{@link #getServiceMultipliers() <em>Service Multipliers</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getServiceMultipliers()
     * @generated
     * @ordered
     */
    protected EList< ServiceMultiplier > serviceMultipliers;

    /**
     * The cached value of the '{@link #getEndDeviceControls() <em>End Device Controls</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEndDeviceControls()
     * @generated
     * @ordered
     */
    protected EList< EndDeviceControl > endDeviceControls;

    /**
     * The cached value of the '{@link #getOutages() <em>Outages</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOutages()
     * @generated
     * @ordered
     */
    protected EList< Outage > outages;

    /**
     * The cached value of the '{@link #getEndDevices() <em>End Devices</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEndDevices()
     * @generated
     * @ordered
     */
    protected EList< EndDevice > endDevices;

    /**
     * The cached value of the '{@link #getConfigurationEvents() <em>Configuration Events</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getConfigurationEvents()
     * @generated
     * @ordered
     */
    protected EList< ConfigurationEvent > configurationEvents;

    /**
     * The cached value of the '{@link #getUsagePointGroups() <em>Usage Point Groups</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUsagePointGroups()
     * @generated
     * @ordered
     */
    protected EList< UsagePointGroup > usagePointGroups;

    /**
     * The cached value of the '{@link #getEndDeviceEvents() <em>End Device Events</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEndDeviceEvents()
     * @generated
     * @ordered
     */
    protected EList< EndDeviceEvent > endDeviceEvents;

    /**
     * The cached value of the '{@link #getMetrologyRequirements() <em>Metrology Requirements</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMetrologyRequirements()
     * @generated
     * @ordered
     */
    protected EList< MetrologyRequirement > metrologyRequirements;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected UsagePointImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getUsagePoint();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public AmiBillingReadyKind getAmiBillingReady() {
        return amiBillingReady;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setAmiBillingReady( AmiBillingReadyKind newAmiBillingReady ) {
        AmiBillingReadyKind oldAmiBillingReady = amiBillingReady;
        amiBillingReady = newAmiBillingReady == null ? AMI_BILLING_READY_EDEFAULT : newAmiBillingReady;
        boolean oldAmiBillingReadyESet = amiBillingReadyESet;
        amiBillingReadyESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.USAGE_POINT__AMI_BILLING_READY,
                    oldAmiBillingReady, amiBillingReady, !oldAmiBillingReadyESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetAmiBillingReady() {
        AmiBillingReadyKind oldAmiBillingReady = amiBillingReady;
        boolean oldAmiBillingReadyESet = amiBillingReadyESet;
        amiBillingReady = AMI_BILLING_READY_EDEFAULT;
        amiBillingReadyESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.USAGE_POINT__AMI_BILLING_READY,
                    oldAmiBillingReady, AMI_BILLING_READY_EDEFAULT, oldAmiBillingReadyESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetAmiBillingReady() {
        return amiBillingReadyESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getCheckBilling() {
        return checkBilling;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setCheckBilling( Boolean newCheckBilling ) {
        Boolean oldCheckBilling = checkBilling;
        checkBilling = newCheckBilling;
        boolean oldCheckBillingESet = checkBillingESet;
        checkBillingESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.USAGE_POINT__CHECK_BILLING, oldCheckBilling, checkBilling, !oldCheckBillingESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetCheckBilling() {
        Boolean oldCheckBilling = checkBilling;
        boolean oldCheckBillingESet = checkBillingESet;
        checkBilling = CHECK_BILLING_EDEFAULT;
        checkBillingESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.USAGE_POINT__CHECK_BILLING, oldCheckBilling, CHECK_BILLING_EDEFAULT, oldCheckBillingESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetCheckBilling() {
        return checkBillingESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public UsagePointConnectedKind getConnectionState() {
        return connectionState;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setConnectionState( UsagePointConnectedKind newConnectionState ) {
        UsagePointConnectedKind oldConnectionState = connectionState;
        connectionState = newConnectionState == null ? CONNECTION_STATE_EDEFAULT : newConnectionState;
        boolean oldConnectionStateESet = connectionStateESet;
        connectionStateESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.USAGE_POINT__CONNECTION_STATE,
                    oldConnectionState, connectionState, !oldConnectionStateESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetConnectionState() {
        UsagePointConnectedKind oldConnectionState = connectionState;
        boolean oldConnectionStateESet = connectionStateESet;
        connectionState = CONNECTION_STATE_EDEFAULT;
        connectionStateESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.USAGE_POINT__CONNECTION_STATE,
                    oldConnectionState, CONNECTION_STATE_EDEFAULT, oldConnectionStateESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetConnectionState() {
        return connectionStateESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getEstimatedLoad() {
        return estimatedLoad;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setEstimatedLoad( Float newEstimatedLoad ) {
        Float oldEstimatedLoad = estimatedLoad;
        estimatedLoad = newEstimatedLoad;
        boolean oldEstimatedLoadESet = estimatedLoadESet;
        estimatedLoadESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.USAGE_POINT__ESTIMATED_LOAD, oldEstimatedLoad, estimatedLoad, !oldEstimatedLoadESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetEstimatedLoad() {
        Float oldEstimatedLoad = estimatedLoad;
        boolean oldEstimatedLoadESet = estimatedLoadESet;
        estimatedLoad = ESTIMATED_LOAD_EDEFAULT;
        estimatedLoadESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.USAGE_POINT__ESTIMATED_LOAD,
                    oldEstimatedLoad, ESTIMATED_LOAD_EDEFAULT, oldEstimatedLoadESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetEstimatedLoad() {
        return estimatedLoadESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getGrounded() {
        return grounded;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setGrounded( Boolean newGrounded ) {
        Boolean oldGrounded = grounded;
        grounded = newGrounded;
        boolean oldGroundedESet = groundedESet;
        groundedESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.USAGE_POINT__GROUNDED, oldGrounded, grounded, !oldGroundedESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetGrounded() {
        Boolean oldGrounded = grounded;
        boolean oldGroundedESet = groundedESet;
        grounded = GROUNDED_EDEFAULT;
        groundedESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.USAGE_POINT__GROUNDED, oldGrounded, GROUNDED_EDEFAULT, oldGroundedESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetGrounded() {
        return groundedESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getIsSdp() {
        return isSdp;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setIsSdp( Boolean newIsSdp ) {
        Boolean oldIsSdp = isSdp;
        isSdp = newIsSdp;
        boolean oldIsSdpESet = isSdpESet;
        isSdpESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.USAGE_POINT__IS_SDP, oldIsSdp, isSdp, !oldIsSdpESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetIsSdp() {
        Boolean oldIsSdp = isSdp;
        boolean oldIsSdpESet = isSdpESet;
        isSdp = IS_SDP_EDEFAULT;
        isSdpESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.USAGE_POINT__IS_SDP, oldIsSdp, IS_SDP_EDEFAULT, oldIsSdpESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetIsSdp() {
        return isSdpESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getIsVirtual() {
        return isVirtual;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setIsVirtual( Boolean newIsVirtual ) {
        Boolean oldIsVirtual = isVirtual;
        isVirtual = newIsVirtual;
        boolean oldIsVirtualESet = isVirtualESet;
        isVirtualESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.USAGE_POINT__IS_VIRTUAL, oldIsVirtual, isVirtual, !oldIsVirtualESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetIsVirtual() {
        Boolean oldIsVirtual = isVirtual;
        boolean oldIsVirtualESet = isVirtualESet;
        isVirtual = IS_VIRTUAL_EDEFAULT;
        isVirtualESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.USAGE_POINT__IS_VIRTUAL, oldIsVirtual, IS_VIRTUAL_EDEFAULT, oldIsVirtualESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetIsVirtual() {
        return isVirtualESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getMinimalUsageExpected() {
        return minimalUsageExpected;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setMinimalUsageExpected( Boolean newMinimalUsageExpected ) {
        Boolean oldMinimalUsageExpected = minimalUsageExpected;
        minimalUsageExpected = newMinimalUsageExpected;
        boolean oldMinimalUsageExpectedESet = minimalUsageExpectedESet;
        minimalUsageExpectedESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.USAGE_POINT__MINIMAL_USAGE_EXPECTED,
                    oldMinimalUsageExpected, minimalUsageExpected, !oldMinimalUsageExpectedESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetMinimalUsageExpected() {
        Boolean oldMinimalUsageExpected = minimalUsageExpected;
        boolean oldMinimalUsageExpectedESet = minimalUsageExpectedESet;
        minimalUsageExpected = MINIMAL_USAGE_EXPECTED_EDEFAULT;
        minimalUsageExpectedESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.USAGE_POINT__MINIMAL_USAGE_EXPECTED,
                    oldMinimalUsageExpected, MINIMAL_USAGE_EXPECTED_EDEFAULT, oldMinimalUsageExpectedESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetMinimalUsageExpected() {
        return minimalUsageExpectedESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getNominalServiceVoltage() {
        return nominalServiceVoltage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setNominalServiceVoltage( Float newNominalServiceVoltage ) {
        Float oldNominalServiceVoltage = nominalServiceVoltage;
        nominalServiceVoltage = newNominalServiceVoltage;
        boolean oldNominalServiceVoltageESet = nominalServiceVoltageESet;
        nominalServiceVoltageESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.USAGE_POINT__NOMINAL_SERVICE_VOLTAGE,
                    oldNominalServiceVoltage, nominalServiceVoltage, !oldNominalServiceVoltageESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetNominalServiceVoltage() {
        Float oldNominalServiceVoltage = nominalServiceVoltage;
        boolean oldNominalServiceVoltageESet = nominalServiceVoltageESet;
        nominalServiceVoltage = NOMINAL_SERVICE_VOLTAGE_EDEFAULT;
        nominalServiceVoltageESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.USAGE_POINT__NOMINAL_SERVICE_VOLTAGE,
                    oldNominalServiceVoltage, NOMINAL_SERVICE_VOLTAGE_EDEFAULT, oldNominalServiceVoltageESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetNominalServiceVoltage() {
        return nominalServiceVoltageESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getOutageRegion() {
        return outageRegion;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setOutageRegion( String newOutageRegion ) {
        String oldOutageRegion = outageRegion;
        outageRegion = newOutageRegion;
        boolean oldOutageRegionESet = outageRegionESet;
        outageRegionESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.USAGE_POINT__OUTAGE_REGION, oldOutageRegion, outageRegion, !oldOutageRegionESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetOutageRegion() {
        String oldOutageRegion = outageRegion;
        boolean oldOutageRegionESet = outageRegionESet;
        outageRegion = OUTAGE_REGION_EDEFAULT;
        outageRegionESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.USAGE_POINT__OUTAGE_REGION, oldOutageRegion, OUTAGE_REGION_EDEFAULT, oldOutageRegionESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetOutageRegion() {
        return outageRegionESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public PhaseCode getPhaseCode() {
        return phaseCode;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setPhaseCode( PhaseCode newPhaseCode ) {
        PhaseCode oldPhaseCode = phaseCode;
        phaseCode = newPhaseCode == null ? PHASE_CODE_EDEFAULT : newPhaseCode;
        boolean oldPhaseCodeESet = phaseCodeESet;
        phaseCodeESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.USAGE_POINT__PHASE_CODE, oldPhaseCode, phaseCode, !oldPhaseCodeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetPhaseCode() {
        PhaseCode oldPhaseCode = phaseCode;
        boolean oldPhaseCodeESet = phaseCodeESet;
        phaseCode = PHASE_CODE_EDEFAULT;
        phaseCodeESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.USAGE_POINT__PHASE_CODE, oldPhaseCode, PHASE_CODE_EDEFAULT, oldPhaseCodeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPhaseCode() {
        return phaseCodeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getRatedCurrent() {
        return ratedCurrent;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setRatedCurrent( Float newRatedCurrent ) {
        Float oldRatedCurrent = ratedCurrent;
        ratedCurrent = newRatedCurrent;
        boolean oldRatedCurrentESet = ratedCurrentESet;
        ratedCurrentESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.USAGE_POINT__RATED_CURRENT, oldRatedCurrent, ratedCurrent, !oldRatedCurrentESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetRatedCurrent() {
        Float oldRatedCurrent = ratedCurrent;
        boolean oldRatedCurrentESet = ratedCurrentESet;
        ratedCurrent = RATED_CURRENT_EDEFAULT;
        ratedCurrentESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.USAGE_POINT__RATED_CURRENT, oldRatedCurrent, RATED_CURRENT_EDEFAULT, oldRatedCurrentESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRatedCurrent() {
        return ratedCurrentESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getRatedPower() {
        return ratedPower;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setRatedPower( Float newRatedPower ) {
        Float oldRatedPower = ratedPower;
        ratedPower = newRatedPower;
        boolean oldRatedPowerESet = ratedPowerESet;
        ratedPowerESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.USAGE_POINT__RATED_POWER, oldRatedPower, ratedPower, !oldRatedPowerESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetRatedPower() {
        Float oldRatedPower = ratedPower;
        boolean oldRatedPowerESet = ratedPowerESet;
        ratedPower = RATED_POWER_EDEFAULT;
        ratedPowerESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.USAGE_POINT__RATED_POWER, oldRatedPower, RATED_POWER_EDEFAULT, oldRatedPowerESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRatedPower() {
        return ratedPowerESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getReadCycle() {
        return readCycle;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setReadCycle( String newReadCycle ) {
        String oldReadCycle = readCycle;
        readCycle = newReadCycle;
        boolean oldReadCycleESet = readCycleESet;
        readCycleESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.USAGE_POINT__READ_CYCLE, oldReadCycle, readCycle, !oldReadCycleESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetReadCycle() {
        String oldReadCycle = readCycle;
        boolean oldReadCycleESet = readCycleESet;
        readCycle = READ_CYCLE_EDEFAULT;
        readCycleESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.USAGE_POINT__READ_CYCLE, oldReadCycle, READ_CYCLE_EDEFAULT, oldReadCycleESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetReadCycle() {
        return readCycleESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getReadRoute() {
        return readRoute;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setReadRoute( String newReadRoute ) {
        String oldReadRoute = readRoute;
        readRoute = newReadRoute;
        boolean oldReadRouteESet = readRouteESet;
        readRouteESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.USAGE_POINT__READ_ROUTE, oldReadRoute, readRoute, !oldReadRouteESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetReadRoute() {
        String oldReadRoute = readRoute;
        boolean oldReadRouteESet = readRouteESet;
        readRoute = READ_ROUTE_EDEFAULT;
        readRouteESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.USAGE_POINT__READ_ROUTE, oldReadRoute, READ_ROUTE_EDEFAULT, oldReadRouteESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetReadRoute() {
        return readRouteESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getServiceDeliveryRemark() {
        return serviceDeliveryRemark;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setServiceDeliveryRemark( String newServiceDeliveryRemark ) {
        String oldServiceDeliveryRemark = serviceDeliveryRemark;
        serviceDeliveryRemark = newServiceDeliveryRemark;
        boolean oldServiceDeliveryRemarkESet = serviceDeliveryRemarkESet;
        serviceDeliveryRemarkESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.USAGE_POINT__SERVICE_DELIVERY_REMARK,
                    oldServiceDeliveryRemark, serviceDeliveryRemark, !oldServiceDeliveryRemarkESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetServiceDeliveryRemark() {
        String oldServiceDeliveryRemark = serviceDeliveryRemark;
        boolean oldServiceDeliveryRemarkESet = serviceDeliveryRemarkESet;
        serviceDeliveryRemark = SERVICE_DELIVERY_REMARK_EDEFAULT;
        serviceDeliveryRemarkESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.USAGE_POINT__SERVICE_DELIVERY_REMARK,
                    oldServiceDeliveryRemark, SERVICE_DELIVERY_REMARK_EDEFAULT, oldServiceDeliveryRemarkESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetServiceDeliveryRemark() {
        return serviceDeliveryRemarkESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getServicePriority() {
        return servicePriority;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setServicePriority( String newServicePriority ) {
        String oldServicePriority = servicePriority;
        servicePriority = newServicePriority;
        boolean oldServicePriorityESet = servicePriorityESet;
        servicePriorityESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.USAGE_POINT__SERVICE_PRIORITY,
                    oldServicePriority, servicePriority, !oldServicePriorityESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetServicePriority() {
        String oldServicePriority = servicePriority;
        boolean oldServicePriorityESet = servicePriorityESet;
        servicePriority = SERVICE_PRIORITY_EDEFAULT;
        servicePriorityESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.USAGE_POINT__SERVICE_PRIORITY,
                    oldServicePriority, SERVICE_PRIORITY_EDEFAULT, oldServicePriorityESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetServicePriority() {
        return servicePriorityESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public UsagePointLocation getUsagePointLocation() {
        return usagePointLocation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetUsagePointLocation( UsagePointLocation newUsagePointLocation,
            NotificationChain msgs ) {
        UsagePointLocation oldUsagePointLocation = usagePointLocation;
        usagePointLocation = newUsagePointLocation;
        boolean oldUsagePointLocationESet = usagePointLocationESet;
        usagePointLocationESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.USAGE_POINT__USAGE_POINT_LOCATION, oldUsagePointLocation, newUsagePointLocation,
                    !oldUsagePointLocationESet );
            if( msgs == null )
                msgs = notification;
            else
                msgs.add( notification );
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setUsagePointLocation( UsagePointLocation newUsagePointLocation ) {
        if( newUsagePointLocation != usagePointLocation ) {
            NotificationChain msgs = null;
            if( usagePointLocation != null ) msgs = ( ( InternalEObject ) usagePointLocation ).eInverseRemove( this,
                    CimPackage.USAGE_POINT_LOCATION__USAGE_POINTS, UsagePointLocation.class, msgs );
            if( newUsagePointLocation != null ) msgs = ( ( InternalEObject ) newUsagePointLocation ).eInverseAdd( this,
                    CimPackage.USAGE_POINT_LOCATION__USAGE_POINTS, UsagePointLocation.class, msgs );
            msgs = basicSetUsagePointLocation( newUsagePointLocation, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldUsagePointLocationESet = usagePointLocationESet;
            usagePointLocationESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.USAGE_POINT__USAGE_POINT_LOCATION,
                        newUsagePointLocation, newUsagePointLocation, !oldUsagePointLocationESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetUsagePointLocation( NotificationChain msgs ) {
        UsagePointLocation oldUsagePointLocation = usagePointLocation;
        usagePointLocation = null;
        boolean oldUsagePointLocationESet = usagePointLocationESet;
        usagePointLocationESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.USAGE_POINT__USAGE_POINT_LOCATION, oldUsagePointLocation, null,
                    oldUsagePointLocationESet );
            if( msgs == null )
                msgs = notification;
            else
                msgs.add( notification );
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetUsagePointLocation() {
        if( usagePointLocation != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) usagePointLocation ).eInverseRemove( this,
                    CimPackage.USAGE_POINT_LOCATION__USAGE_POINTS, UsagePointLocation.class, msgs );
            msgs = basicUnsetUsagePointLocation( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldUsagePointLocationESet = usagePointLocationESet;
            usagePointLocationESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.USAGE_POINT__USAGE_POINT_LOCATION, null, null, oldUsagePointLocationESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetUsagePointLocation() {
        return usagePointLocationESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public CustomerAgreement getCustomerAgreement() {
        return customerAgreement;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetCustomerAgreement( CustomerAgreement newCustomerAgreement,
            NotificationChain msgs ) {
        CustomerAgreement oldCustomerAgreement = customerAgreement;
        customerAgreement = newCustomerAgreement;
        boolean oldCustomerAgreementESet = customerAgreementESet;
        customerAgreementESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.USAGE_POINT__CUSTOMER_AGREEMENT, oldCustomerAgreement, newCustomerAgreement,
                    !oldCustomerAgreementESet );
            if( msgs == null )
                msgs = notification;
            else
                msgs.add( notification );
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setCustomerAgreement( CustomerAgreement newCustomerAgreement ) {
        if( newCustomerAgreement != customerAgreement ) {
            NotificationChain msgs = null;
            if( customerAgreement != null ) msgs = ( ( InternalEObject ) customerAgreement ).eInverseRemove( this,
                    CimPackage.CUSTOMER_AGREEMENT__USAGE_POINTS, CustomerAgreement.class, msgs );
            if( newCustomerAgreement != null ) msgs = ( ( InternalEObject ) newCustomerAgreement ).eInverseAdd( this,
                    CimPackage.CUSTOMER_AGREEMENT__USAGE_POINTS, CustomerAgreement.class, msgs );
            msgs = basicSetCustomerAgreement( newCustomerAgreement, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldCustomerAgreementESet = customerAgreementESet;
            customerAgreementESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.USAGE_POINT__CUSTOMER_AGREEMENT,
                        newCustomerAgreement, newCustomerAgreement, !oldCustomerAgreementESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetCustomerAgreement( NotificationChain msgs ) {
        CustomerAgreement oldCustomerAgreement = customerAgreement;
        customerAgreement = null;
        boolean oldCustomerAgreementESet = customerAgreementESet;
        customerAgreementESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.USAGE_POINT__CUSTOMER_AGREEMENT, oldCustomerAgreement, null, oldCustomerAgreementESet );
            if( msgs == null )
                msgs = notification;
            else
                msgs.add( notification );
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetCustomerAgreement() {
        if( customerAgreement != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) customerAgreement ).eInverseRemove( this,
                    CimPackage.CUSTOMER_AGREEMENT__USAGE_POINTS, CustomerAgreement.class, msgs );
            msgs = basicUnsetCustomerAgreement( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldCustomerAgreementESet = customerAgreementESet;
            customerAgreementESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.USAGE_POINT__CUSTOMER_AGREEMENT, null, null, oldCustomerAgreementESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetCustomerAgreement() {
        return customerAgreementESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< MeterReading > getMeterReadings() {
        if( meterReadings == null ) {
            meterReadings = new EObjectWithInverseResolvingEList.Unsettable< MeterReading >( MeterReading.class, this,
                    CimPackage.USAGE_POINT__METER_READINGS, CimPackage.METER_READING__USAGE_POINT );
        }
        return meterReadings;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetMeterReadings() {
        if( meterReadings != null ) ( ( InternalEList.Unsettable< ? > ) meterReadings ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetMeterReadings() {
        return meterReadings != null && ( ( InternalEList.Unsettable< ? > ) meterReadings ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< Equipment > getEquipments() {
        if( equipments == null ) {
            equipments = new EObjectWithInverseEList.Unsettable.ManyInverse< Equipment >( Equipment.class, this,
                    CimPackage.USAGE_POINT__EQUIPMENTS, CimPackage.EQUIPMENT__USAGE_POINTS );
        }
        return equipments;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetEquipments() {
        if( equipments != null ) ( ( InternalEList.Unsettable< ? > ) equipments ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetEquipments() {
        return equipments != null && ( ( InternalEList.Unsettable< ? > ) equipments ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< PricingStructure > getPricingStructures() {
        if( pricingStructures == null ) {
            pricingStructures = new EObjectWithInverseEList.Unsettable.ManyInverse< PricingStructure >(
                    PricingStructure.class, this, CimPackage.USAGE_POINT__PRICING_STRUCTURES,
                    CimPackage.PRICING_STRUCTURE__USAGE_POINTS );
        }
        return pricingStructures;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetPricingStructures() {
        if( pricingStructures != null ) ( ( InternalEList.Unsettable< ? > ) pricingStructures ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPricingStructures() {
        return pricingStructures != null && ( ( InternalEList.Unsettable< ? > ) pricingStructures ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< MeterWorkTask > getMeterServiceWorkTasks() {
        if( meterServiceWorkTasks == null ) {
            meterServiceWorkTasks = new EObjectWithInverseResolvingEList.Unsettable< MeterWorkTask >(
                    MeterWorkTask.class, this, CimPackage.USAGE_POINT__METER_SERVICE_WORK_TASKS,
                    CimPackage.METER_WORK_TASK__USAGE_POINT );
        }
        return meterServiceWorkTasks;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetMeterServiceWorkTasks() {
        if( meterServiceWorkTasks != null ) ( ( InternalEList.Unsettable< ? > ) meterServiceWorkTasks ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetMeterServiceWorkTasks() {
        return meterServiceWorkTasks != null && ( ( InternalEList.Unsettable< ? > ) meterServiceWorkTasks ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ServiceLocation getServiceLocation() {
        return serviceLocation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetServiceLocation( ServiceLocation newServiceLocation, NotificationChain msgs ) {
        ServiceLocation oldServiceLocation = serviceLocation;
        serviceLocation = newServiceLocation;
        boolean oldServiceLocationESet = serviceLocationESet;
        serviceLocationESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.USAGE_POINT__SERVICE_LOCATION, oldServiceLocation, newServiceLocation,
                    !oldServiceLocationESet );
            if( msgs == null )
                msgs = notification;
            else
                msgs.add( notification );
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setServiceLocation( ServiceLocation newServiceLocation ) {
        if( newServiceLocation != serviceLocation ) {
            NotificationChain msgs = null;
            if( serviceLocation != null ) msgs = ( ( InternalEObject ) serviceLocation ).eInverseRemove( this,
                    CimPackage.SERVICE_LOCATION__USAGE_POINTS, ServiceLocation.class, msgs );
            if( newServiceLocation != null ) msgs = ( ( InternalEObject ) newServiceLocation ).eInverseAdd( this,
                    CimPackage.SERVICE_LOCATION__USAGE_POINTS, ServiceLocation.class, msgs );
            msgs = basicSetServiceLocation( newServiceLocation, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldServiceLocationESet = serviceLocationESet;
            serviceLocationESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.USAGE_POINT__SERVICE_LOCATION,
                        newServiceLocation, newServiceLocation, !oldServiceLocationESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetServiceLocation( NotificationChain msgs ) {
        ServiceLocation oldServiceLocation = serviceLocation;
        serviceLocation = null;
        boolean oldServiceLocationESet = serviceLocationESet;
        serviceLocationESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.USAGE_POINT__SERVICE_LOCATION, oldServiceLocation, null, oldServiceLocationESet );
            if( msgs == null )
                msgs = notification;
            else
                msgs.add( notification );
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetServiceLocation() {
        if( serviceLocation != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) serviceLocation ).eInverseRemove( this,
                    CimPackage.SERVICE_LOCATION__USAGE_POINTS, ServiceLocation.class, msgs );
            msgs = basicUnsetServiceLocation( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldServiceLocationESet = serviceLocationESet;
            serviceLocationESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.USAGE_POINT__SERVICE_LOCATION, null, null, oldServiceLocationESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetServiceLocation() {
        return serviceLocationESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ServiceCategory getServiceCategory() {
        return serviceCategory;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetServiceCategory( ServiceCategory newServiceCategory, NotificationChain msgs ) {
        ServiceCategory oldServiceCategory = serviceCategory;
        serviceCategory = newServiceCategory;
        boolean oldServiceCategoryESet = serviceCategoryESet;
        serviceCategoryESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.USAGE_POINT__SERVICE_CATEGORY, oldServiceCategory, newServiceCategory,
                    !oldServiceCategoryESet );
            if( msgs == null )
                msgs = notification;
            else
                msgs.add( notification );
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setServiceCategory( ServiceCategory newServiceCategory ) {
        if( newServiceCategory != serviceCategory ) {
            NotificationChain msgs = null;
            if( serviceCategory != null ) msgs = ( ( InternalEObject ) serviceCategory ).eInverseRemove( this,
                    CimPackage.SERVICE_CATEGORY__USAGE_POINTS, ServiceCategory.class, msgs );
            if( newServiceCategory != null ) msgs = ( ( InternalEObject ) newServiceCategory ).eInverseAdd( this,
                    CimPackage.SERVICE_CATEGORY__USAGE_POINTS, ServiceCategory.class, msgs );
            msgs = basicSetServiceCategory( newServiceCategory, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldServiceCategoryESet = serviceCategoryESet;
            serviceCategoryESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.USAGE_POINT__SERVICE_CATEGORY,
                        newServiceCategory, newServiceCategory, !oldServiceCategoryESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetServiceCategory( NotificationChain msgs ) {
        ServiceCategory oldServiceCategory = serviceCategory;
        serviceCategory = null;
        boolean oldServiceCategoryESet = serviceCategoryESet;
        serviceCategoryESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.USAGE_POINT__SERVICE_CATEGORY, oldServiceCategory, null, oldServiceCategoryESet );
            if( msgs == null )
                msgs = notification;
            else
                msgs.add( notification );
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetServiceCategory() {
        if( serviceCategory != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) serviceCategory ).eInverseRemove( this,
                    CimPackage.SERVICE_CATEGORY__USAGE_POINTS, ServiceCategory.class, msgs );
            msgs = basicUnsetServiceCategory( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldServiceCategoryESet = serviceCategoryESet;
            serviceCategoryESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.USAGE_POINT__SERVICE_CATEGORY, null, null, oldServiceCategoryESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetServiceCategory() {
        return serviceCategoryESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ServiceSupplier getServiceSupplier() {
        return serviceSupplier;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetServiceSupplier( ServiceSupplier newServiceSupplier, NotificationChain msgs ) {
        ServiceSupplier oldServiceSupplier = serviceSupplier;
        serviceSupplier = newServiceSupplier;
        boolean oldServiceSupplierESet = serviceSupplierESet;
        serviceSupplierESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.USAGE_POINT__SERVICE_SUPPLIER, oldServiceSupplier, newServiceSupplier,
                    !oldServiceSupplierESet );
            if( msgs == null )
                msgs = notification;
            else
                msgs.add( notification );
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setServiceSupplier( ServiceSupplier newServiceSupplier ) {
        if( newServiceSupplier != serviceSupplier ) {
            NotificationChain msgs = null;
            if( serviceSupplier != null ) msgs = ( ( InternalEObject ) serviceSupplier ).eInverseRemove( this,
                    CimPackage.SERVICE_SUPPLIER__USAGE_POINTS, ServiceSupplier.class, msgs );
            if( newServiceSupplier != null ) msgs = ( ( InternalEObject ) newServiceSupplier ).eInverseAdd( this,
                    CimPackage.SERVICE_SUPPLIER__USAGE_POINTS, ServiceSupplier.class, msgs );
            msgs = basicSetServiceSupplier( newServiceSupplier, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldServiceSupplierESet = serviceSupplierESet;
            serviceSupplierESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.USAGE_POINT__SERVICE_SUPPLIER,
                        newServiceSupplier, newServiceSupplier, !oldServiceSupplierESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetServiceSupplier( NotificationChain msgs ) {
        ServiceSupplier oldServiceSupplier = serviceSupplier;
        serviceSupplier = null;
        boolean oldServiceSupplierESet = serviceSupplierESet;
        serviceSupplierESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.USAGE_POINT__SERVICE_SUPPLIER, oldServiceSupplier, null, oldServiceSupplierESet );
            if( msgs == null )
                msgs = notification;
            else
                msgs.add( notification );
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetServiceSupplier() {
        if( serviceSupplier != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) serviceSupplier ).eInverseRemove( this,
                    CimPackage.SERVICE_SUPPLIER__USAGE_POINTS, ServiceSupplier.class, msgs );
            msgs = basicUnsetServiceSupplier( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldServiceSupplierESet = serviceSupplierESet;
            serviceSupplierESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.USAGE_POINT__SERVICE_SUPPLIER, null, null, oldServiceSupplierESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetServiceSupplier() {
        return serviceSupplierESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< ServiceMultiplier > getServiceMultipliers() {
        if( serviceMultipliers == null ) {
            serviceMultipliers = new EObjectWithInverseResolvingEList.Unsettable< ServiceMultiplier >(
                    ServiceMultiplier.class, this, CimPackage.USAGE_POINT__SERVICE_MULTIPLIERS,
                    CimPackage.SERVICE_MULTIPLIER__USAGE_POINT );
        }
        return serviceMultipliers;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetServiceMultipliers() {
        if( serviceMultipliers != null ) ( ( InternalEList.Unsettable< ? > ) serviceMultipliers ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetServiceMultipliers() {
        return serviceMultipliers != null && ( ( InternalEList.Unsettable< ? > ) serviceMultipliers ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< EndDeviceControl > getEndDeviceControls() {
        if( endDeviceControls == null ) {
            endDeviceControls = new EObjectWithInverseEList.Unsettable.ManyInverse< EndDeviceControl >(
                    EndDeviceControl.class, this, CimPackage.USAGE_POINT__END_DEVICE_CONTROLS,
                    CimPackage.END_DEVICE_CONTROL__USAGE_POINTS );
        }
        return endDeviceControls;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetEndDeviceControls() {
        if( endDeviceControls != null ) ( ( InternalEList.Unsettable< ? > ) endDeviceControls ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetEndDeviceControls() {
        return endDeviceControls != null && ( ( InternalEList.Unsettable< ? > ) endDeviceControls ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< Outage > getOutages() {
        if( outages == null ) {
            outages = new EObjectWithInverseEList.Unsettable.ManyInverse< Outage >( Outage.class, this,
                    CimPackage.USAGE_POINT__OUTAGES, CimPackage.OUTAGE__USAGE_POINTS );
        }
        return outages;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetOutages() {
        if( outages != null ) ( ( InternalEList.Unsettable< ? > ) outages ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetOutages() {
        return outages != null && ( ( InternalEList.Unsettable< ? > ) outages ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< EndDevice > getEndDevices() {
        if( endDevices == null ) {
            endDevices = new EObjectWithInverseResolvingEList.Unsettable< EndDevice >( EndDevice.class, this,
                    CimPackage.USAGE_POINT__END_DEVICES, CimPackage.END_DEVICE__USAGE_POINT );
        }
        return endDevices;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetEndDevices() {
        if( endDevices != null ) ( ( InternalEList.Unsettable< ? > ) endDevices ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetEndDevices() {
        return endDevices != null && ( ( InternalEList.Unsettable< ? > ) endDevices ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< ConfigurationEvent > getConfigurationEvents() {
        if( configurationEvents == null ) {
            configurationEvents = new EObjectWithInverseResolvingEList.Unsettable< ConfigurationEvent >(
                    ConfigurationEvent.class, this, CimPackage.USAGE_POINT__CONFIGURATION_EVENTS,
                    CimPackage.CONFIGURATION_EVENT__CHANGED_USAGE_POINT );
        }
        return configurationEvents;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetConfigurationEvents() {
        if( configurationEvents != null ) ( ( InternalEList.Unsettable< ? > ) configurationEvents ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetConfigurationEvents() {
        return configurationEvents != null && ( ( InternalEList.Unsettable< ? > ) configurationEvents ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< UsagePointGroup > getUsagePointGroups() {
        if( usagePointGroups == null ) {
            usagePointGroups = new EObjectWithInverseEList.Unsettable.ManyInverse< UsagePointGroup >(
                    UsagePointGroup.class, this, CimPackage.USAGE_POINT__USAGE_POINT_GROUPS,
                    CimPackage.USAGE_POINT_GROUP__USAGE_POINTS );
        }
        return usagePointGroups;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetUsagePointGroups() {
        if( usagePointGroups != null ) ( ( InternalEList.Unsettable< ? > ) usagePointGroups ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetUsagePointGroups() {
        return usagePointGroups != null && ( ( InternalEList.Unsettable< ? > ) usagePointGroups ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< EndDeviceEvent > getEndDeviceEvents() {
        if( endDeviceEvents == null ) {
            endDeviceEvents = new EObjectWithInverseResolvingEList.Unsettable< EndDeviceEvent >( EndDeviceEvent.class,
                    this, CimPackage.USAGE_POINT__END_DEVICE_EVENTS, CimPackage.END_DEVICE_EVENT__USAGE_POINT );
        }
        return endDeviceEvents;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetEndDeviceEvents() {
        if( endDeviceEvents != null ) ( ( InternalEList.Unsettable< ? > ) endDeviceEvents ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetEndDeviceEvents() {
        return endDeviceEvents != null && ( ( InternalEList.Unsettable< ? > ) endDeviceEvents ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< MetrologyRequirement > getMetrologyRequirements() {
        if( metrologyRequirements == null ) {
            metrologyRequirements = new EObjectWithInverseEList.Unsettable.ManyInverse< MetrologyRequirement >(
                    MetrologyRequirement.class, this, CimPackage.USAGE_POINT__METROLOGY_REQUIREMENTS,
                    CimPackage.METROLOGY_REQUIREMENT__USAGE_POINTS );
        }
        return metrologyRequirements;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetMetrologyRequirements() {
        if( metrologyRequirements != null ) ( ( InternalEList.Unsettable< ? > ) metrologyRequirements ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetMetrologyRequirements() {
        return metrologyRequirements != null && ( ( InternalEList.Unsettable< ? > ) metrologyRequirements ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings( "unchecked" )
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.USAGE_POINT__USAGE_POINT_LOCATION:
            if( usagePointLocation != null ) msgs = ( ( InternalEObject ) usagePointLocation ).eInverseRemove( this,
                    CimPackage.USAGE_POINT_LOCATION__USAGE_POINTS, UsagePointLocation.class, msgs );
            return basicSetUsagePointLocation( ( UsagePointLocation ) otherEnd, msgs );
        case CimPackage.USAGE_POINT__CUSTOMER_AGREEMENT:
            if( customerAgreement != null ) msgs = ( ( InternalEObject ) customerAgreement ).eInverseRemove( this,
                    CimPackage.CUSTOMER_AGREEMENT__USAGE_POINTS, CustomerAgreement.class, msgs );
            return basicSetCustomerAgreement( ( CustomerAgreement ) otherEnd, msgs );
        case CimPackage.USAGE_POINT__METER_READINGS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getMeterReadings() )
                    .basicAdd( otherEnd, msgs );
        case CimPackage.USAGE_POINT__EQUIPMENTS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getEquipments() ).basicAdd( otherEnd,
                    msgs );
        case CimPackage.USAGE_POINT__PRICING_STRUCTURES:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getPricingStructures() )
                    .basicAdd( otherEnd, msgs );
        case CimPackage.USAGE_POINT__METER_SERVICE_WORK_TASKS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getMeterServiceWorkTasks() )
                    .basicAdd( otherEnd, msgs );
        case CimPackage.USAGE_POINT__SERVICE_LOCATION:
            if( serviceLocation != null ) msgs = ( ( InternalEObject ) serviceLocation ).eInverseRemove( this,
                    CimPackage.SERVICE_LOCATION__USAGE_POINTS, ServiceLocation.class, msgs );
            return basicSetServiceLocation( ( ServiceLocation ) otherEnd, msgs );
        case CimPackage.USAGE_POINT__SERVICE_CATEGORY:
            if( serviceCategory != null ) msgs = ( ( InternalEObject ) serviceCategory ).eInverseRemove( this,
                    CimPackage.SERVICE_CATEGORY__USAGE_POINTS, ServiceCategory.class, msgs );
            return basicSetServiceCategory( ( ServiceCategory ) otherEnd, msgs );
        case CimPackage.USAGE_POINT__SERVICE_SUPPLIER:
            if( serviceSupplier != null ) msgs = ( ( InternalEObject ) serviceSupplier ).eInverseRemove( this,
                    CimPackage.SERVICE_SUPPLIER__USAGE_POINTS, ServiceSupplier.class, msgs );
            return basicSetServiceSupplier( ( ServiceSupplier ) otherEnd, msgs );
        case CimPackage.USAGE_POINT__SERVICE_MULTIPLIERS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getServiceMultipliers() )
                    .basicAdd( otherEnd, msgs );
        case CimPackage.USAGE_POINT__END_DEVICE_CONTROLS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getEndDeviceControls() )
                    .basicAdd( otherEnd, msgs );
        case CimPackage.USAGE_POINT__OUTAGES:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getOutages() ).basicAdd( otherEnd,
                    msgs );
        case CimPackage.USAGE_POINT__END_DEVICES:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getEndDevices() ).basicAdd( otherEnd,
                    msgs );
        case CimPackage.USAGE_POINT__CONFIGURATION_EVENTS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getConfigurationEvents() )
                    .basicAdd( otherEnd, msgs );
        case CimPackage.USAGE_POINT__USAGE_POINT_GROUPS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getUsagePointGroups() )
                    .basicAdd( otherEnd, msgs );
        case CimPackage.USAGE_POINT__END_DEVICE_EVENTS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getEndDeviceEvents() )
                    .basicAdd( otherEnd, msgs );
        case CimPackage.USAGE_POINT__METROLOGY_REQUIREMENTS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getMetrologyRequirements() )
                    .basicAdd( otherEnd, msgs );
        }
        return super.eInverseAdd( otherEnd, featureID, msgs );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.USAGE_POINT__USAGE_POINT_LOCATION:
            return basicUnsetUsagePointLocation( msgs );
        case CimPackage.USAGE_POINT__CUSTOMER_AGREEMENT:
            return basicUnsetCustomerAgreement( msgs );
        case CimPackage.USAGE_POINT__METER_READINGS:
            return ( ( InternalEList< ? > ) getMeterReadings() ).basicRemove( otherEnd, msgs );
        case CimPackage.USAGE_POINT__EQUIPMENTS:
            return ( ( InternalEList< ? > ) getEquipments() ).basicRemove( otherEnd, msgs );
        case CimPackage.USAGE_POINT__PRICING_STRUCTURES:
            return ( ( InternalEList< ? > ) getPricingStructures() ).basicRemove( otherEnd, msgs );
        case CimPackage.USAGE_POINT__METER_SERVICE_WORK_TASKS:
            return ( ( InternalEList< ? > ) getMeterServiceWorkTasks() ).basicRemove( otherEnd, msgs );
        case CimPackage.USAGE_POINT__SERVICE_LOCATION:
            return basicUnsetServiceLocation( msgs );
        case CimPackage.USAGE_POINT__SERVICE_CATEGORY:
            return basicUnsetServiceCategory( msgs );
        case CimPackage.USAGE_POINT__SERVICE_SUPPLIER:
            return basicUnsetServiceSupplier( msgs );
        case CimPackage.USAGE_POINT__SERVICE_MULTIPLIERS:
            return ( ( InternalEList< ? > ) getServiceMultipliers() ).basicRemove( otherEnd, msgs );
        case CimPackage.USAGE_POINT__END_DEVICE_CONTROLS:
            return ( ( InternalEList< ? > ) getEndDeviceControls() ).basicRemove( otherEnd, msgs );
        case CimPackage.USAGE_POINT__OUTAGES:
            return ( ( InternalEList< ? > ) getOutages() ).basicRemove( otherEnd, msgs );
        case CimPackage.USAGE_POINT__END_DEVICES:
            return ( ( InternalEList< ? > ) getEndDevices() ).basicRemove( otherEnd, msgs );
        case CimPackage.USAGE_POINT__CONFIGURATION_EVENTS:
            return ( ( InternalEList< ? > ) getConfigurationEvents() ).basicRemove( otherEnd, msgs );
        case CimPackage.USAGE_POINT__USAGE_POINT_GROUPS:
            return ( ( InternalEList< ? > ) getUsagePointGroups() ).basicRemove( otherEnd, msgs );
        case CimPackage.USAGE_POINT__END_DEVICE_EVENTS:
            return ( ( InternalEList< ? > ) getEndDeviceEvents() ).basicRemove( otherEnd, msgs );
        case CimPackage.USAGE_POINT__METROLOGY_REQUIREMENTS:
            return ( ( InternalEList< ? > ) getMetrologyRequirements() ).basicRemove( otherEnd, msgs );
        }
        return super.eInverseRemove( otherEnd, featureID, msgs );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch( featureID ) {
        case CimPackage.USAGE_POINT__AMI_BILLING_READY:
            return getAmiBillingReady();
        case CimPackage.USAGE_POINT__CHECK_BILLING:
            return getCheckBilling();
        case CimPackage.USAGE_POINT__CONNECTION_STATE:
            return getConnectionState();
        case CimPackage.USAGE_POINT__ESTIMATED_LOAD:
            return getEstimatedLoad();
        case CimPackage.USAGE_POINT__GROUNDED:
            return getGrounded();
        case CimPackage.USAGE_POINT__IS_SDP:
            return getIsSdp();
        case CimPackage.USAGE_POINT__IS_VIRTUAL:
            return getIsVirtual();
        case CimPackage.USAGE_POINT__MINIMAL_USAGE_EXPECTED:
            return getMinimalUsageExpected();
        case CimPackage.USAGE_POINT__NOMINAL_SERVICE_VOLTAGE:
            return getNominalServiceVoltage();
        case CimPackage.USAGE_POINT__OUTAGE_REGION:
            return getOutageRegion();
        case CimPackage.USAGE_POINT__PHASE_CODE:
            return getPhaseCode();
        case CimPackage.USAGE_POINT__RATED_CURRENT:
            return getRatedCurrent();
        case CimPackage.USAGE_POINT__RATED_POWER:
            return getRatedPower();
        case CimPackage.USAGE_POINT__READ_CYCLE:
            return getReadCycle();
        case CimPackage.USAGE_POINT__READ_ROUTE:
            return getReadRoute();
        case CimPackage.USAGE_POINT__SERVICE_DELIVERY_REMARK:
            return getServiceDeliveryRemark();
        case CimPackage.USAGE_POINT__SERVICE_PRIORITY:
            return getServicePriority();
        case CimPackage.USAGE_POINT__USAGE_POINT_LOCATION:
            return getUsagePointLocation();
        case CimPackage.USAGE_POINT__CUSTOMER_AGREEMENT:
            return getCustomerAgreement();
        case CimPackage.USAGE_POINT__METER_READINGS:
            return getMeterReadings();
        case CimPackage.USAGE_POINT__EQUIPMENTS:
            return getEquipments();
        case CimPackage.USAGE_POINT__PRICING_STRUCTURES:
            return getPricingStructures();
        case CimPackage.USAGE_POINT__METER_SERVICE_WORK_TASKS:
            return getMeterServiceWorkTasks();
        case CimPackage.USAGE_POINT__SERVICE_LOCATION:
            return getServiceLocation();
        case CimPackage.USAGE_POINT__SERVICE_CATEGORY:
            return getServiceCategory();
        case CimPackage.USAGE_POINT__SERVICE_SUPPLIER:
            return getServiceSupplier();
        case CimPackage.USAGE_POINT__SERVICE_MULTIPLIERS:
            return getServiceMultipliers();
        case CimPackage.USAGE_POINT__END_DEVICE_CONTROLS:
            return getEndDeviceControls();
        case CimPackage.USAGE_POINT__OUTAGES:
            return getOutages();
        case CimPackage.USAGE_POINT__END_DEVICES:
            return getEndDevices();
        case CimPackage.USAGE_POINT__CONFIGURATION_EVENTS:
            return getConfigurationEvents();
        case CimPackage.USAGE_POINT__USAGE_POINT_GROUPS:
            return getUsagePointGroups();
        case CimPackage.USAGE_POINT__END_DEVICE_EVENTS:
            return getEndDeviceEvents();
        case CimPackage.USAGE_POINT__METROLOGY_REQUIREMENTS:
            return getMetrologyRequirements();
        }
        return super.eGet( featureID, resolve, coreType );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings( "unchecked" )
    @Override
    public void eSet( int featureID, Object newValue ) {
        switch( featureID ) {
        case CimPackage.USAGE_POINT__AMI_BILLING_READY:
            setAmiBillingReady( ( AmiBillingReadyKind ) newValue );
            return;
        case CimPackage.USAGE_POINT__CHECK_BILLING:
            setCheckBilling( ( Boolean ) newValue );
            return;
        case CimPackage.USAGE_POINT__CONNECTION_STATE:
            setConnectionState( ( UsagePointConnectedKind ) newValue );
            return;
        case CimPackage.USAGE_POINT__ESTIMATED_LOAD:
            setEstimatedLoad( ( Float ) newValue );
            return;
        case CimPackage.USAGE_POINT__GROUNDED:
            setGrounded( ( Boolean ) newValue );
            return;
        case CimPackage.USAGE_POINT__IS_SDP:
            setIsSdp( ( Boolean ) newValue );
            return;
        case CimPackage.USAGE_POINT__IS_VIRTUAL:
            setIsVirtual( ( Boolean ) newValue );
            return;
        case CimPackage.USAGE_POINT__MINIMAL_USAGE_EXPECTED:
            setMinimalUsageExpected( ( Boolean ) newValue );
            return;
        case CimPackage.USAGE_POINT__NOMINAL_SERVICE_VOLTAGE:
            setNominalServiceVoltage( ( Float ) newValue );
            return;
        case CimPackage.USAGE_POINT__OUTAGE_REGION:
            setOutageRegion( ( String ) newValue );
            return;
        case CimPackage.USAGE_POINT__PHASE_CODE:
            setPhaseCode( ( PhaseCode ) newValue );
            return;
        case CimPackage.USAGE_POINT__RATED_CURRENT:
            setRatedCurrent( ( Float ) newValue );
            return;
        case CimPackage.USAGE_POINT__RATED_POWER:
            setRatedPower( ( Float ) newValue );
            return;
        case CimPackage.USAGE_POINT__READ_CYCLE:
            setReadCycle( ( String ) newValue );
            return;
        case CimPackage.USAGE_POINT__READ_ROUTE:
            setReadRoute( ( String ) newValue );
            return;
        case CimPackage.USAGE_POINT__SERVICE_DELIVERY_REMARK:
            setServiceDeliveryRemark( ( String ) newValue );
            return;
        case CimPackage.USAGE_POINT__SERVICE_PRIORITY:
            setServicePriority( ( String ) newValue );
            return;
        case CimPackage.USAGE_POINT__USAGE_POINT_LOCATION:
            setUsagePointLocation( ( UsagePointLocation ) newValue );
            return;
        case CimPackage.USAGE_POINT__CUSTOMER_AGREEMENT:
            setCustomerAgreement( ( CustomerAgreement ) newValue );
            return;
        case CimPackage.USAGE_POINT__METER_READINGS:
            getMeterReadings().clear();
            getMeterReadings().addAll( ( Collection< ? extends MeterReading > ) newValue );
            return;
        case CimPackage.USAGE_POINT__EQUIPMENTS:
            getEquipments().clear();
            getEquipments().addAll( ( Collection< ? extends Equipment > ) newValue );
            return;
        case CimPackage.USAGE_POINT__PRICING_STRUCTURES:
            getPricingStructures().clear();
            getPricingStructures().addAll( ( Collection< ? extends PricingStructure > ) newValue );
            return;
        case CimPackage.USAGE_POINT__METER_SERVICE_WORK_TASKS:
            getMeterServiceWorkTasks().clear();
            getMeterServiceWorkTasks().addAll( ( Collection< ? extends MeterWorkTask > ) newValue );
            return;
        case CimPackage.USAGE_POINT__SERVICE_LOCATION:
            setServiceLocation( ( ServiceLocation ) newValue );
            return;
        case CimPackage.USAGE_POINT__SERVICE_CATEGORY:
            setServiceCategory( ( ServiceCategory ) newValue );
            return;
        case CimPackage.USAGE_POINT__SERVICE_SUPPLIER:
            setServiceSupplier( ( ServiceSupplier ) newValue );
            return;
        case CimPackage.USAGE_POINT__SERVICE_MULTIPLIERS:
            getServiceMultipliers().clear();
            getServiceMultipliers().addAll( ( Collection< ? extends ServiceMultiplier > ) newValue );
            return;
        case CimPackage.USAGE_POINT__END_DEVICE_CONTROLS:
            getEndDeviceControls().clear();
            getEndDeviceControls().addAll( ( Collection< ? extends EndDeviceControl > ) newValue );
            return;
        case CimPackage.USAGE_POINT__OUTAGES:
            getOutages().clear();
            getOutages().addAll( ( Collection< ? extends Outage > ) newValue );
            return;
        case CimPackage.USAGE_POINT__END_DEVICES:
            getEndDevices().clear();
            getEndDevices().addAll( ( Collection< ? extends EndDevice > ) newValue );
            return;
        case CimPackage.USAGE_POINT__CONFIGURATION_EVENTS:
            getConfigurationEvents().clear();
            getConfigurationEvents().addAll( ( Collection< ? extends ConfigurationEvent > ) newValue );
            return;
        case CimPackage.USAGE_POINT__USAGE_POINT_GROUPS:
            getUsagePointGroups().clear();
            getUsagePointGroups().addAll( ( Collection< ? extends UsagePointGroup > ) newValue );
            return;
        case CimPackage.USAGE_POINT__END_DEVICE_EVENTS:
            getEndDeviceEvents().clear();
            getEndDeviceEvents().addAll( ( Collection< ? extends EndDeviceEvent > ) newValue );
            return;
        case CimPackage.USAGE_POINT__METROLOGY_REQUIREMENTS:
            getMetrologyRequirements().clear();
            getMetrologyRequirements().addAll( ( Collection< ? extends MetrologyRequirement > ) newValue );
            return;
        }
        super.eSet( featureID, newValue );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eUnset( int featureID ) {
        switch( featureID ) {
        case CimPackage.USAGE_POINT__AMI_BILLING_READY:
            unsetAmiBillingReady();
            return;
        case CimPackage.USAGE_POINT__CHECK_BILLING:
            unsetCheckBilling();
            return;
        case CimPackage.USAGE_POINT__CONNECTION_STATE:
            unsetConnectionState();
            return;
        case CimPackage.USAGE_POINT__ESTIMATED_LOAD:
            unsetEstimatedLoad();
            return;
        case CimPackage.USAGE_POINT__GROUNDED:
            unsetGrounded();
            return;
        case CimPackage.USAGE_POINT__IS_SDP:
            unsetIsSdp();
            return;
        case CimPackage.USAGE_POINT__IS_VIRTUAL:
            unsetIsVirtual();
            return;
        case CimPackage.USAGE_POINT__MINIMAL_USAGE_EXPECTED:
            unsetMinimalUsageExpected();
            return;
        case CimPackage.USAGE_POINT__NOMINAL_SERVICE_VOLTAGE:
            unsetNominalServiceVoltage();
            return;
        case CimPackage.USAGE_POINT__OUTAGE_REGION:
            unsetOutageRegion();
            return;
        case CimPackage.USAGE_POINT__PHASE_CODE:
            unsetPhaseCode();
            return;
        case CimPackage.USAGE_POINT__RATED_CURRENT:
            unsetRatedCurrent();
            return;
        case CimPackage.USAGE_POINT__RATED_POWER:
            unsetRatedPower();
            return;
        case CimPackage.USAGE_POINT__READ_CYCLE:
            unsetReadCycle();
            return;
        case CimPackage.USAGE_POINT__READ_ROUTE:
            unsetReadRoute();
            return;
        case CimPackage.USAGE_POINT__SERVICE_DELIVERY_REMARK:
            unsetServiceDeliveryRemark();
            return;
        case CimPackage.USAGE_POINT__SERVICE_PRIORITY:
            unsetServicePriority();
            return;
        case CimPackage.USAGE_POINT__USAGE_POINT_LOCATION:
            unsetUsagePointLocation();
            return;
        case CimPackage.USAGE_POINT__CUSTOMER_AGREEMENT:
            unsetCustomerAgreement();
            return;
        case CimPackage.USAGE_POINT__METER_READINGS:
            unsetMeterReadings();
            return;
        case CimPackage.USAGE_POINT__EQUIPMENTS:
            unsetEquipments();
            return;
        case CimPackage.USAGE_POINT__PRICING_STRUCTURES:
            unsetPricingStructures();
            return;
        case CimPackage.USAGE_POINT__METER_SERVICE_WORK_TASKS:
            unsetMeterServiceWorkTasks();
            return;
        case CimPackage.USAGE_POINT__SERVICE_LOCATION:
            unsetServiceLocation();
            return;
        case CimPackage.USAGE_POINT__SERVICE_CATEGORY:
            unsetServiceCategory();
            return;
        case CimPackage.USAGE_POINT__SERVICE_SUPPLIER:
            unsetServiceSupplier();
            return;
        case CimPackage.USAGE_POINT__SERVICE_MULTIPLIERS:
            unsetServiceMultipliers();
            return;
        case CimPackage.USAGE_POINT__END_DEVICE_CONTROLS:
            unsetEndDeviceControls();
            return;
        case CimPackage.USAGE_POINT__OUTAGES:
            unsetOutages();
            return;
        case CimPackage.USAGE_POINT__END_DEVICES:
            unsetEndDevices();
            return;
        case CimPackage.USAGE_POINT__CONFIGURATION_EVENTS:
            unsetConfigurationEvents();
            return;
        case CimPackage.USAGE_POINT__USAGE_POINT_GROUPS:
            unsetUsagePointGroups();
            return;
        case CimPackage.USAGE_POINT__END_DEVICE_EVENTS:
            unsetEndDeviceEvents();
            return;
        case CimPackage.USAGE_POINT__METROLOGY_REQUIREMENTS:
            unsetMetrologyRequirements();
            return;
        }
        super.eUnset( featureID );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean eIsSet( int featureID ) {
        switch( featureID ) {
        case CimPackage.USAGE_POINT__AMI_BILLING_READY:
            return isSetAmiBillingReady();
        case CimPackage.USAGE_POINT__CHECK_BILLING:
            return isSetCheckBilling();
        case CimPackage.USAGE_POINT__CONNECTION_STATE:
            return isSetConnectionState();
        case CimPackage.USAGE_POINT__ESTIMATED_LOAD:
            return isSetEstimatedLoad();
        case CimPackage.USAGE_POINT__GROUNDED:
            return isSetGrounded();
        case CimPackage.USAGE_POINT__IS_SDP:
            return isSetIsSdp();
        case CimPackage.USAGE_POINT__IS_VIRTUAL:
            return isSetIsVirtual();
        case CimPackage.USAGE_POINT__MINIMAL_USAGE_EXPECTED:
            return isSetMinimalUsageExpected();
        case CimPackage.USAGE_POINT__NOMINAL_SERVICE_VOLTAGE:
            return isSetNominalServiceVoltage();
        case CimPackage.USAGE_POINT__OUTAGE_REGION:
            return isSetOutageRegion();
        case CimPackage.USAGE_POINT__PHASE_CODE:
            return isSetPhaseCode();
        case CimPackage.USAGE_POINT__RATED_CURRENT:
            return isSetRatedCurrent();
        case CimPackage.USAGE_POINT__RATED_POWER:
            return isSetRatedPower();
        case CimPackage.USAGE_POINT__READ_CYCLE:
            return isSetReadCycle();
        case CimPackage.USAGE_POINT__READ_ROUTE:
            return isSetReadRoute();
        case CimPackage.USAGE_POINT__SERVICE_DELIVERY_REMARK:
            return isSetServiceDeliveryRemark();
        case CimPackage.USAGE_POINT__SERVICE_PRIORITY:
            return isSetServicePriority();
        case CimPackage.USAGE_POINT__USAGE_POINT_LOCATION:
            return isSetUsagePointLocation();
        case CimPackage.USAGE_POINT__CUSTOMER_AGREEMENT:
            return isSetCustomerAgreement();
        case CimPackage.USAGE_POINT__METER_READINGS:
            return isSetMeterReadings();
        case CimPackage.USAGE_POINT__EQUIPMENTS:
            return isSetEquipments();
        case CimPackage.USAGE_POINT__PRICING_STRUCTURES:
            return isSetPricingStructures();
        case CimPackage.USAGE_POINT__METER_SERVICE_WORK_TASKS:
            return isSetMeterServiceWorkTasks();
        case CimPackage.USAGE_POINT__SERVICE_LOCATION:
            return isSetServiceLocation();
        case CimPackage.USAGE_POINT__SERVICE_CATEGORY:
            return isSetServiceCategory();
        case CimPackage.USAGE_POINT__SERVICE_SUPPLIER:
            return isSetServiceSupplier();
        case CimPackage.USAGE_POINT__SERVICE_MULTIPLIERS:
            return isSetServiceMultipliers();
        case CimPackage.USAGE_POINT__END_DEVICE_CONTROLS:
            return isSetEndDeviceControls();
        case CimPackage.USAGE_POINT__OUTAGES:
            return isSetOutages();
        case CimPackage.USAGE_POINT__END_DEVICES:
            return isSetEndDevices();
        case CimPackage.USAGE_POINT__CONFIGURATION_EVENTS:
            return isSetConfigurationEvents();
        case CimPackage.USAGE_POINT__USAGE_POINT_GROUPS:
            return isSetUsagePointGroups();
        case CimPackage.USAGE_POINT__END_DEVICE_EVENTS:
            return isSetEndDeviceEvents();
        case CimPackage.USAGE_POINT__METROLOGY_REQUIREMENTS:
            return isSetMetrologyRequirements();
        }
        return super.eIsSet( featureID );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
        if( eIsProxy() ) return super.toString();

        StringBuilder result = new StringBuilder( super.toString() );
        result.append( " (amiBillingReady: " );
        if( amiBillingReadyESet )
            result.append( amiBillingReady );
        else
            result.append( "<unset>" );
        result.append( ", checkBilling: " );
        if( checkBillingESet )
            result.append( checkBilling );
        else
            result.append( "<unset>" );
        result.append( ", connectionState: " );
        if( connectionStateESet )
            result.append( connectionState );
        else
            result.append( "<unset>" );
        result.append( ", estimatedLoad: " );
        if( estimatedLoadESet )
            result.append( estimatedLoad );
        else
            result.append( "<unset>" );
        result.append( ", grounded: " );
        if( groundedESet )
            result.append( grounded );
        else
            result.append( "<unset>" );
        result.append( ", isSdp: " );
        if( isSdpESet )
            result.append( isSdp );
        else
            result.append( "<unset>" );
        result.append( ", isVirtual: " );
        if( isVirtualESet )
            result.append( isVirtual );
        else
            result.append( "<unset>" );
        result.append( ", minimalUsageExpected: " );
        if( minimalUsageExpectedESet )
            result.append( minimalUsageExpected );
        else
            result.append( "<unset>" );
        result.append( ", nominalServiceVoltage: " );
        if( nominalServiceVoltageESet )
            result.append( nominalServiceVoltage );
        else
            result.append( "<unset>" );
        result.append( ", outageRegion: " );
        if( outageRegionESet )
            result.append( outageRegion );
        else
            result.append( "<unset>" );
        result.append( ", phaseCode: " );
        if( phaseCodeESet )
            result.append( phaseCode );
        else
            result.append( "<unset>" );
        result.append( ", ratedCurrent: " );
        if( ratedCurrentESet )
            result.append( ratedCurrent );
        else
            result.append( "<unset>" );
        result.append( ", ratedPower: " );
        if( ratedPowerESet )
            result.append( ratedPower );
        else
            result.append( "<unset>" );
        result.append( ", readCycle: " );
        if( readCycleESet )
            result.append( readCycle );
        else
            result.append( "<unset>" );
        result.append( ", readRoute: " );
        if( readRouteESet )
            result.append( readRoute );
        else
            result.append( "<unset>" );
        result.append( ", serviceDeliveryRemark: " );
        if( serviceDeliveryRemarkESet )
            result.append( serviceDeliveryRemark );
        else
            result.append( "<unset>" );
        result.append( ", servicePriority: " );
        if( servicePriorityESet )
            result.append( servicePriority );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //UsagePointImpl
