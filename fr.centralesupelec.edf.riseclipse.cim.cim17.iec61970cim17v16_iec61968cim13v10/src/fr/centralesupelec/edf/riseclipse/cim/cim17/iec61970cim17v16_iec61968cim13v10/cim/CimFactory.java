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
package fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage
 * @generated
 */
public interface CimFactory extends EFactory {
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    CimFactory eINSTANCE = fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.CimFactoryImpl
            .init();

    /**
     * Returns a new object of class '<em>ISO Standard</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>ISO Standard</em>'.
     * @generated
     */
    ISOStandard createISOStandard();

    /**
     * Returns a new object of class '<em>Date Interval</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Date Interval</em>'.
     * @generated
     */
    DateInterval createDateInterval();

    /**
     * Returns a new object of class '<em>Date Time Interval</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Date Time Interval</em>'.
     * @generated
     */
    DateTimeInterval createDateTimeInterval();

    /**
     * Returns a new object of class '<em>Laborelec Standard</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Laborelec Standard</em>'.
     * @generated
     */
    LaborelecStandard createLaborelecStandard();

    /**
     * Returns a new object of class '<em>Deployment Date</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Deployment Date</em>'.
     * @generated
     */
    DeploymentDate createDeploymentDate();

    /**
     * Returns a new object of class '<em>Priority</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Priority</em>'.
     * @generated
     */
    Priority createPriority();

    /**
     * Returns a new object of class '<em>Street Detail</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Street Detail</em>'.
     * @generated
     */
    StreetDetail createStreetDetail();

    /**
     * Returns a new object of class '<em>Due</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Due</em>'.
     * @generated
     */
    Due createDue();

    /**
     * Returns a new object of class '<em>Rational Number</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Rational Number</em>'.
     * @generated
     */
    RationalNumber createRationalNumber();

    /**
     * Returns a new object of class '<em>DIN Standard</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>DIN Standard</em>'.
     * @generated
     */
    DINStandard createDINStandard();

    /**
     * Returns a new object of class '<em>String Quantity</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>String Quantity</em>'.
     * @generated
     */
    StringQuantity createStringQuantity();

    /**
     * Returns a new object of class '<em>Reading Interharmonic</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Reading Interharmonic</em>'.
     * @generated
     */
    ReadingInterharmonic createReadingInterharmonic();

    /**
     * Returns a new object of class '<em>WEP Standard</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>WEP Standard</em>'.
     * @generated
     */
    WEPStandard createWEPStandard();

    /**
     * Returns a new object of class '<em>Remote Connect Disconnect Info</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Remote Connect Disconnect Info</em>'.
     * @generated
     */
    RemoteConnectDisconnectInfo createRemoteConnectDisconnectInfo();

    /**
     * Returns a new object of class '<em>End Device Capability</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>End Device Capability</em>'.
     * @generated
     */
    EndDeviceCapability createEndDeviceCapability();

    /**
     * Returns a new object of class '<em>Decimal Quantity</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Decimal Quantity</em>'.
     * @generated
     */
    DecimalQuantity createDecimalQuantity();

    /**
     * Returns a new object of class '<em>Status</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Status</em>'.
     * @generated
     */
    Status createStatus();

    /**
     * Returns a new object of class '<em>Doble Standard</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Doble Standard</em>'.
     * @generated
     */
    DobleStandard createDobleStandard();

    /**
     * Returns a new object of class '<em>EPA Standard</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>EPA Standard</em>'.
     * @generated
     */
    EPAStandard createEPAStandard();

    /**
     * Returns a new object of class '<em>Month Day Interval</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Month Day Interval</em>'.
     * @generated
     */
    MonthDayInterval createMonthDayInterval();

    /**
     * Returns a new object of class '<em>UK Ministry Of Defence Standard</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>UK Ministry Of Defence Standard</em>'.
     * @generated
     */
    UKMinistryOfDefenceStandard createUKMinistryOfDefenceStandard();

    /**
     * Returns a new object of class '<em>Electronic Address</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Electronic Address</em>'.
     * @generated
     */
    ElectronicAddress createElectronicAddress();

    /**
     * Returns a new object of class '<em>Controlled Appliance</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Controlled Appliance</em>'.
     * @generated
     */
    ControlledAppliance createControlledAppliance();

    /**
     * Returns a new object of class '<em>Fault Impedance</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Fault Impedance</em>'.
     * @generated
     */
    FaultImpedance createFaultImpedance();

    /**
     * Returns a new object of class '<em>Lifecycle Date</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Lifecycle Date</em>'.
     * @generated
     */
    LifecycleDate createLifecycleDate();

    /**
     * Returns a new object of class '<em>TAPPI Standard</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>TAPPI Standard</em>'.
     * @generated
     */
    TAPPIStandard createTAPPIStandard();

    /**
     * Returns a new object of class '<em>Version</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Version</em>'.
     * @generated
     */
    Version createVersion();

    /**
     * Returns a new object of class '<em>Integer Quantity</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Integer Quantity</em>'.
     * @generated
     */
    IntegerQuantity createIntegerQuantity();

    /**
     * Returns a new object of class '<em>Telephone Number</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Telephone Number</em>'.
     * @generated
     */
    TelephoneNumber createTelephoneNumber();

    /**
     * Returns a new object of class '<em>Service Point Outage Summary</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Service Point Outage Summary</em>'.
     * @generated
     */
    ServicePointOutageSummary createServicePointOutageSummary();

    /**
     * Returns a new object of class '<em>Bank Account Detail</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Bank Account Detail</em>'.
     * @generated
     */
    BankAccountDetail createBankAccountDetail();

    /**
     * Returns a new object of class '<em>Town Detail</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Town Detail</em>'.
     * @generated
     */
    TownDetail createTownDetail();

    /**
     * Returns a new object of class '<em>IEC Standard</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>IEC Standard</em>'.
     * @generated
     */
    IECStandard createIECStandard();

    /**
     * Returns a new object of class '<em>Time Interval</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Time Interval</em>'.
     * @generated
     */
    TimeInterval createTimeInterval();

    /**
     * Returns a new object of class '<em>IEEE Standard</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>IEEE Standard</em>'.
     * @generated
     */
    IEEEStandard createIEEEStandard();

    /**
     * Returns a new object of class '<em>In Use Date</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>In Use Date</em>'.
     * @generated
     */
    InUseDate createInUseDate();

    /**
     * Returns a new object of class '<em>ASTM Standard</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>ASTM Standard</em>'.
     * @generated
     */
    ASTMStandard createASTMStandard();

    /**
     * Returns a new object of class '<em>Account Movement</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Account Movement</em>'.
     * @generated
     */
    AccountMovement createAccountMovement();

    /**
     * Returns a new object of class '<em>Accounting Unit</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Accounting Unit</em>'.
     * @generated
     */
    AccountingUnit createAccountingUnit();

    /**
     * Returns a new object of class '<em>CIGRE Standard</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>CIGRE Standard</em>'.
     * @generated
     */
    CIGREStandard createCIGREStandard();

    /**
     * Returns a new object of class '<em>Float Quantity</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Float Quantity</em>'.
     * @generated
     */
    FloatQuantity createFloatQuantity();

    /**
     * Returns a new object of class '<em>Acceptance Test</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Acceptance Test</em>'.
     * @generated
     */
    AcceptanceTest createAcceptanceTest();

    /**
     * Returns a new object of class '<em>Extension Item</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Extension Item</em>'.
     * @generated
     */
    ExtensionItem createExtensionItem();

    /**
     * Returns a new object of class '<em>Line Detail</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Line Detail</em>'.
     * @generated
     */
    LineDetail createLineDetail();

    /**
     * Returns a new object of class '<em>Street Address</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Street Address</em>'.
     * @generated
     */
    StreetAddress createStreetAddress();

    /**
     * Returns a new object of class '<em>Extensions List</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Extensions List</em>'.
     * @generated
     */
    ExtensionsList createExtensionsList();

    /**
     * Returns a new object of class '<em>End Device Timing</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>End Device Timing</em>'.
     * @generated
     */
    EndDeviceTiming createEndDeviceTiming();

    /**
     * Returns a new object of class '<em>Analytic Score</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Analytic Score</em>'.
     * @generated
     */
    AnalyticScore createAnalyticScore();

    /**
     * Returns a new object of class '<em>Service Location</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Service Location</em>'.
     * @generated
     */
    ServiceLocation createServiceLocation();

    /**
     * Returns a new object of class '<em>Hydro Pump Op Schedule</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Hydro Pump Op Schedule</em>'.
     * @generated
     */
    HydroPumpOpSchedule createHydroPumpOpSchedule();

    /**
     * Returns a new object of class '<em>Outage</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Outage</em>'.
     * @generated
     */
    Outage createOutage();

    /**
     * Returns a new object of class '<em>Regular Time Point</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Regular Time Point</em>'.
     * @generated
     */
    RegularTimePoint createRegularTimePoint();

    /**
     * Returns a new object of class '<em>Change Set Member</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Change Set Member</em>'.
     * @generated
     */
    ChangeSetMember createChangeSetMember();

    /**
     * Returns a new object of class '<em>Position Point</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Position Point</em>'.
     * @generated
     */
    PositionPoint createPositionPoint();

    /**
     * Returns a new object of class '<em>Nonlinear Shunt Compensator Point</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Nonlinear Shunt Compensator Point</em>'.
     * @generated
     */
    NonlinearShuntCompensatorPoint createNonlinearShuntCompensatorPoint();

    /**
     * Returns a new object of class '<em>Parent Organization</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Parent Organization</em>'.
     * @generated
     */
    ParentOrganization createParentOrganization();

    /**
     * Returns a new object of class '<em>Synchronous Machine User Defined</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Synchronous Machine User Defined</em>'.
     * @generated
     */
    SynchronousMachineUserDefined createSynchronousMachineUserDefined();

    /**
     * Returns a new object of class '<em>Sensor</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Sensor</em>'.
     * @generated
     */
    Sensor createSensor();

    /**
     * Returns a new object of class '<em>Sub Load Area</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Sub Load Area</em>'.
     * @generated
     */
    SubLoadArea createSubLoadArea();

    /**
     * Returns a new object of class '<em>Operating Share</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Operating Share</em>'.
     * @generated
     */
    OperatingShare createOperatingShare();

    /**
     * Returns a new object of class '<em>Synchronous Machine Equivalent Circuit</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Synchronous Machine Equivalent Circuit</em>'.
     * @generated
     */
    SynchronousMachineEquivalentCircuit createSynchronousMachineEquivalentCircuit();

    /**
     * Returns a new object of class '<em>Conform Load Schedule</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Conform Load Schedule</em>'.
     * @generated
     */
    ConformLoadSchedule createConformLoadSchedule();

    /**
     * Returns a new object of class '<em>Agreement</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Agreement</em>'.
     * @generated
     */
    Agreement createAgreement();

    /**
     * Returns a new object of class '<em>Power System Resource</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Power System Resource</em>'.
     * @generated
     */
    PowerSystemResource createPowerSystemResource();

    /**
     * Returns a new object of class '<em>Operating Participant</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Operating Participant</em>'.
     * @generated
     */
    OperatingParticipant createOperatingParticipant();

    /**
     * Returns a new object of class '<em>Limit Set</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Limit Set</em>'.
     * @generated
     */
    LimitSet createLimitSet();

    /**
     * Returns a new object of class '<em>No Load Test</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>No Load Test</em>'.
     * @generated
     */
    NoLoadTest createNoLoadTest();

    /**
     * Returns a new object of class '<em>Switch Schedule</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Switch Schedule</em>'.
     * @generated
     */
    SwitchSchedule createSwitchSchedule();

    /**
     * Returns a new object of class '<em>Jumper</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Jumper</em>'.
     * @generated
     */
    Jumper createJumper();

    /**
     * Returns a new object of class '<em>Exc ST6B</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Exc ST6B</em>'.
     * @generated
     */
    ExcST6B createExcST6B();

    /**
     * Returns a new object of class '<em>Exc IEEEAC5A</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Exc IEEEAC5A</em>'.
     * @generated
     */
    ExcIEEEAC5A createExcIEEEAC5A();

    /**
     * Returns a new object of class '<em>Overhead Wire Info</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Overhead Wire Info</em>'.
     * @generated
     */
    OverheadWireInfo createOverheadWireInfo();

    /**
     * Returns a new object of class '<em>Combined Cycle Plant</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Combined Cycle Plant</em>'.
     * @generated
     */
    CombinedCyclePlant createCombinedCyclePlant();

    /**
     * Returns a new object of class '<em>Control</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Control</em>'.
     * @generated
     */
    Control createControl();

    /**
     * Returns a new object of class '<em>Instance Set</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Instance Set</em>'.
     * @generated
     */
    InstanceSet createInstanceSet();

    /**
     * Returns a new object of class '<em>Open Circuit Test</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Open Circuit Test</em>'.
     * @generated
     */
    OpenCircuitTest createOpenCircuitTest();

    /**
     * Returns a new object of class '<em>Measurement</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Measurement</em>'.
     * @generated
     */
    Measurement createMeasurement();

    /**
     * Returns a new object of class '<em>End Device Action</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>End Device Action</em>'.
     * @generated
     */
    EndDeviceAction createEndDeviceAction();

    /**
     * Returns a new object of class '<em>Charge</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Charge</em>'.
     * @generated
     */
    Charge createCharge();

    /**
     * Returns a new object of class '<em>Lab Test Data Set</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Lab Test Data Set</em>'.
     * @generated
     */
    LabTestDataSet createLabTestDataSet();

    /**
     * Returns a new object of class '<em>Operation Person Role</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Operation Person Role</em>'.
     * @generated
     */
    OperationPersonRole createOperationPersonRole();

    /**
     * Returns a new object of class '<em>Heat Rate Curve</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Heat Rate Curve</em>'.
     * @generated
     */
    HeatRateCurve createHeatRateCurve();

    /**
     * Returns a new object of class '<em>Wind Gen Turbine Type1b IEC</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Wind Gen Turbine Type1b IEC</em>'.
     * @generated
     */
    WindGenTurbineType1bIEC createWindGenTurbineType1bIEC();

    /**
     * Returns a new object of class '<em>Asset Health Event</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Asset Health Event</em>'.
     * @generated
     */
    AssetHealthEvent createAssetHealthEvent();

    /**
     * Returns a new object of class '<em>Connectivity Node Container</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Connectivity Node Container</em>'.
     * @generated
     */
    ConnectivityNodeContainer createConnectivityNodeContainer();

    /**
     * Returns a new object of class '<em>Wire Info</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Wire Info</em>'.
     * @generated
     */
    WireInfo createWireInfo();

    /**
     * Returns a new object of class '<em>Turbine Governor User Defined</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Turbine Governor User Defined</em>'.
     * @generated
     */
    TurbineGovernorUserDefined createTurbineGovernorUserDefined();

    /**
     * Returns a new object of class '<em>Fault Indicator</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Fault Indicator</em>'.
     * @generated
     */
    FaultIndicator createFaultIndicator();

    /**
     * Returns a new object of class '<em>Gov Hydro IEEE0</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Gov Hydro IEEE0</em>'.
     * @generated
     */
    GovHydroIEEE0 createGovHydroIEEE0();

    /**
     * Returns a new object of class '<em>Phase Impedance Data</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Phase Impedance Data</em>'.
     * @generated
     */
    PhaseImpedanceData createPhaseImpedanceData();

    /**
     * Returns a new object of class '<em>Turbine Governor Dynamics</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Turbine Governor Dynamics</em>'.
     * @generated
     */
    TurbineGovernorDynamics createTurbineGovernorDynamics();

    /**
     * Returns a new object of class '<em>Maintenance Work Task</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Maintenance Work Task</em>'.
     * @generated
     */
    MaintenanceWorkTask createMaintenanceWorkTask();

    /**
     * Returns a new object of class '<em>IP Access Point</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>IP Access Point</em>'.
     * @generated
     */
    IPAccessPoint createIPAccessPoint();

    /**
     * Returns a new object of class '<em>Equivalent Branch</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Equivalent Branch</em>'.
     * @generated
     */
    EquivalentBranch createEquivalentBranch();

    /**
     * Returns a new object of class '<em>Battery Unit</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Battery Unit</em>'.
     * @generated
     */
    BatteryUnit createBatteryUnit();

    /**
     * Returns a new object of class '<em>Analog Limit</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Analog Limit</em>'.
     * @generated
     */
    AnalogLimit createAnalogLimit();

    /**
     * Returns a new object of class '<em>Name Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Name Type</em>'.
     * @generated
     */
    NameType createNameType();

    /**
     * Returns a new object of class '<em>Power Electronics Unit</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Power Electronics Unit</em>'.
     * @generated
     */
    PowerElectronicsUnit createPowerElectronicsUnit();

    /**
     * Returns a new object of class '<em>Exc IEEEDC2A</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Exc IEEEDC2A</em>'.
     * @generated
     */
    ExcIEEEDC2A createExcIEEEDC2A();

    /**
     * Returns a new object of class '<em>Analytic</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Analytic</em>'.
     * @generated
     */
    Analytic createAnalytic();

    /**
     * Returns a new object of class '<em>Name</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Name</em>'.
     * @generated
     */
    Name createName();

    /**
     * Returns a new object of class '<em>Rotating Machine Dynamics</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Rotating Machine Dynamics</em>'.
     * @generated
     */
    RotatingMachineDynamics createRotatingMachineDynamics();

    /**
     * Returns a new object of class '<em>Combustion Turbine</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Combustion Turbine</em>'.
     * @generated
     */
    CombustionTurbine createCombustionTurbine();

    /**
     * Returns a new object of class '<em>Register</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Register</em>'.
     * @generated
     */
    Register createRegister();

    /**
     * Returns a new object of class '<em>Oil Analysis Metals Analog</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Oil Analysis Metals Analog</em>'.
     * @generated
     */
    OilAnalysisMetalsAnalog createOilAnalysisMetalsAnalog();

    /**
     * Returns a new object of class '<em>Operational Restriction</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Operational Restriction</em>'.
     * @generated
     */
    OperationalRestriction createOperationalRestriction();

    /**
     * Returns a new object of class '<em>Clamp</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Clamp</em>'.
     * @generated
     */
    Clamp createClamp();

    /**
     * Returns a new object of class '<em>Financial Info</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Financial Info</em>'.
     * @generated
     */
    FinancialInfo createFinancialInfo();

    /**
     * Returns a new object of class '<em>Ground</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Ground</em>'.
     * @generated
     */
    Ground createGround();

    /**
     * Returns a new object of class '<em>Day Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Day Type</em>'.
     * @generated
     */
    DayType createDayType();

    /**
     * Returns a new object of class '<em>Exc DC2A</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Exc DC2A</em>'.
     * @generated
     */
    ExcDC2A createExcDC2A();

    /**
     * Returns a new object of class '<em>Operating Mechanism</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Operating Mechanism</em>'.
     * @generated
     */
    OperatingMechanism createOperatingMechanism();

    /**
     * Returns a new object of class '<em>Generating Unit</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Generating Unit</em>'.
     * @generated
     */
    GeneratingUnit createGeneratingUnit();

    /**
     * Returns a new object of class '<em>Wind Type1or2 User Defined</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Wind Type1or2 User Defined</em>'.
     * @generated
     */
    WindType1or2UserDefined createWindType1or2UserDefined();

    /**
     * Returns a new object of class '<em>Health Score</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Health Score</em>'.
     * @generated
     */
    HealthScore createHealthScore();

    /**
     * Returns a new object of class '<em>Base Work</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Base Work</em>'.
     * @generated
     */
    BaseWork createBaseWork();

    /**
     * Returns a new object of class '<em>Receipt</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Receipt</em>'.
     * @generated
     */
    Receipt createReceipt();

    /**
     * Returns a new object of class '<em>Periodic Statistical Calculation</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Periodic Statistical Calculation</em>'.
     * @generated
     */
    PeriodicStatisticalCalculation createPeriodicStatisticalCalculation();

    /**
     * Returns a new object of class '<em>Line</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Line</em>'.
     * @generated
     */
    Line createLine();

    /**
     * Returns a new object of class '<em>Wind Turbine Type4a IEC</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Wind Turbine Type4a IEC</em>'.
     * @generated
     */
    WindTurbineType4aIEC createWindTurbineType4aIEC();

    /**
     * Returns a new object of class '<em>Oil Analysis PCB Discrete</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Oil Analysis PCB Discrete</em>'.
     * @generated
     */
    OilAnalysisPCBDiscrete createOilAnalysisPCBDiscrete();

    /**
     * Returns a new object of class '<em>Scheduled Event</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Scheduled Event</em>'.
     * @generated
     */
    ScheduledEvent createScheduledEvent();

    /**
     * Returns a new object of class '<em>Pss5</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Pss5</em>'.
     * @generated
     */
    Pss5 createPss5();

    /**
     * Returns a new object of class '<em>Short Circuit Test</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Short Circuit Test</em>'.
     * @generated
     */
    ShortCircuitTest createShortCircuitTest();

    /**
     * Returns a new object of class '<em>Risk Score</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Risk Score</em>'.
     * @generated
     */
    RiskScore createRiskScore();

    /**
     * Returns a new object of class '<em>Exc SCRX</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Exc SCRX</em>'.
     * @generated
     */
    ExcSCRX createExcSCRX();

    /**
     * Returns a new object of class '<em>Voltage Adjuster Dynamics</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Voltage Adjuster Dynamics</em>'.
     * @generated
     */
    VoltageAdjusterDynamics createVoltageAdjusterDynamics();

    /**
     * Returns a new object of class '<em>Time Point</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Time Point</em>'.
     * @generated
     */
    TimePoint createTimePoint();

    /**
     * Returns a new object of class '<em>Remote Source</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Remote Source</em>'.
     * @generated
     */
    RemoteSource createRemoteSource();

    /**
     * Returns a new object of class '<em>Gov Hydro WPID</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Gov Hydro WPID</em>'.
     * @generated
     */
    GovHydroWPID createGovHydroWPID();

    /**
     * Returns a new object of class '<em>Gov Hydro IEEE2</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Gov Hydro IEEE2</em>'.
     * @generated
     */
    GovHydroIEEE2 createGovHydroIEEE2();

    /**
     * Returns a new object of class '<em>Requested Capability</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Requested Capability</em>'.
     * @generated
     */
    RequestedCapability createRequestedCapability();

    /**
     * Returns a new object of class '<em>Failure Event</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Failure Event</em>'.
     * @generated
     */
    FailureEvent createFailureEvent();

    /**
     * Returns a new object of class '<em>AC Line Segment</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>AC Line Segment</em>'.
     * @generated
     */
    ACLineSegment createACLineSegment();

    /**
     * Returns a new object of class '<em>Active Power Limit</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Active Power Limit</em>'.
     * @generated
     */
    ActivePowerLimit createActivePowerLimit();

    /**
     * Returns a new object of class '<em>Tap Changer Info</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Tap Changer Info</em>'.
     * @generated
     */
    TapChangerInfo createTapChangerInfo();

    /**
     * Returns a new object of class '<em>Synchronous Machine Time Constant Reactance</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Synchronous Machine Time Constant Reactance</em>'.
     * @generated
     */
    SynchronousMachineTimeConstantReactance createSynchronousMachineTimeConstantReactance();

    /**
     * Returns a new object of class '<em>Point Of Sale</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Point Of Sale</em>'.
     * @generated
     */
    PointOfSale createPointOfSale();

    /**
     * Returns a new object of class '<em>DC Topological Node</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>DC Topological Node</em>'.
     * @generated
     */
    DCTopologicalNode createDCTopologicalNode();

    /**
     * Returns a new object of class '<em>Exc IEEEAC8B</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Exc IEEEAC8B</em>'.
     * @generated
     */
    ExcIEEEAC8B createExcIEEEAC8B();

    /**
     * Returns a new object of class '<em>Per Length DC Line Parameter</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Per Length DC Line Parameter</em>'.
     * @generated
     */
    PerLengthDCLineParameter createPerLengthDCLineParameter();

    /**
     * Returns a new object of class '<em>Discrete</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Discrete</em>'.
     * @generated
     */
    Discrete createDiscrete();

    /**
     * Returns a new object of class '<em>Ratio Tap Changer</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Ratio Tap Changer</em>'.
     * @generated
     */
    RatioTapChanger createRatioTapChanger();

    /**
     * Returns a new object of class '<em>Structure</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Structure</em>'.
     * @generated
     */
    Structure createStructure();

    /**
     * Returns a new object of class '<em>Product Asset Model</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Product Asset Model</em>'.
     * @generated
     */
    ProductAssetModel createProductAssetModel();

    /**
     * Returns a new object of class '<em>Exc DC3A1</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Exc DC3A1</em>'.
     * @generated
     */
    ExcDC3A1 createExcDC3A1();

    /**
     * Returns a new object of class '<em>Wind Gen Turbine Type1a IEC</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Wind Gen Turbine Type1a IEC</em>'.
     * @generated
     */
    WindGenTurbineType1aIEC createWindGenTurbineType1aIEC();

    /**
     * Returns a new object of class '<em>Exc IEEEST5B</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Exc IEEEST5B</em>'.
     * @generated
     */
    ExcIEEEST5B createExcIEEEST5B();

    /**
     * Returns a new object of class '<em>Load User Defined</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Load User Defined</em>'.
     * @generated
     */
    LoadUserDefined createLoadUserDefined();

    /**
     * Returns a new object of class '<em>Exc IEEEDC4B</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Exc IEEEDC4B</em>'.
     * @generated
     */
    ExcIEEEDC4B createExcIEEEDC4B();

    /**
     * Returns a new object of class '<em>Value Alias Set</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Value Alias Set</em>'.
     * @generated
     */
    ValueAliasSet createValueAliasSet();

    /**
     * Returns a new object of class '<em>Tariff Profile</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Tariff Profile</em>'.
     * @generated
     */
    TariffProfile createTariffProfile();

    /**
     * Returns a new object of class '<em>Terminal</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Terminal</em>'.
     * @generated
     */
    Terminal createTerminal();

    /**
     * Returns a new object of class '<em>Approver</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Approver</em>'.
     * @generated
     */
    Approver createApprover();

    /**
     * Returns a new object of class '<em>Generic Data Set Version</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Generic Data Set Version</em>'.
     * @generated
     */
    GenericDataSetVersion createGenericDataSetVersion();

    /**
     * Returns a new object of class '<em>Nonlinear Shunt Compensator</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Nonlinear Shunt Compensator</em>'.
     * @generated
     */
    NonlinearShuntCompensator createNonlinearShuntCompensator();

    /**
     * Returns a new object of class '<em>Pan Demand Response</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Pan Demand Response</em>'.
     * @generated
     */
    PanDemandResponse createPanDemandResponse();

    /**
     * Returns a new object of class '<em>Shunt Compensator</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Shunt Compensator</em>'.
     * @generated
     */
    ShuntCompensator createShuntCompensator();

    /**
     * Returns a new object of class '<em>Maintenance Data Set</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Maintenance Data Set</em>'.
     * @generated
     */
    MaintenanceDataSet createMaintenanceDataSet();

    /**
     * Returns a new object of class '<em>Underexc Lim X1</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Underexc Lim X1</em>'.
     * @generated
     */
    UnderexcLimX1 createUnderexcLimX1();

    /**
     * Returns a new object of class '<em>Organisation Role</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Organisation Role</em>'.
     * @generated
     */
    OrganisationRole createOrganisationRole();

    /**
     * Returns a new object of class '<em>Gov Steam IEEE1</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Gov Steam IEEE1</em>'.
     * @generated
     */
    GovSteamIEEE1 createGovSteamIEEE1();

    /**
     * Returns a new object of class '<em>DC Equipment Container</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>DC Equipment Container</em>'.
     * @generated
     */
    DCEquipmentContainer createDCEquipmentContainer();

    /**
     * Returns a new object of class '<em>Pss SH</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Pss SH</em>'.
     * @generated
     */
    PssSH createPssSH();

    /**
     * Returns a new object of class '<em>Reporting Super Group</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Reporting Super Group</em>'.
     * @generated
     */
    ReportingSuperGroup createReportingSuperGroup();

    /**
     * Returns a new object of class '<em>Vs Converter</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Vs Converter</em>'.
     * @generated
     */
    VsConverter createVsConverter();

    /**
     * Returns a new object of class '<em>Wind Cont Curr Lim IEC</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Wind Cont Curr Lim IEC</em>'.
     * @generated
     */
    WindContCurrLimIEC createWindContCurrLimIEC();

    /**
     * Returns a new object of class '<em>Exc DC3A</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Exc DC3A</em>'.
     * @generated
     */
    ExcDC3A createExcDC3A();

    /**
     * Returns a new object of class '<em>String Measurement</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>String Measurement</em>'.
     * @generated
     */
    StringMeasurement createStringMeasurement();

    /**
     * Returns a new object of class '<em>Gov Steam FV3</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Gov Steam FV3</em>'.
     * @generated
     */
    GovSteamFV3 createGovSteamFV3();

    /**
     * Returns a new object of class '<em>Merchant Agreement</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Merchant Agreement</em>'.
     * @generated
     */
    MerchantAgreement createMerchantAgreement();

    /**
     * Returns a new object of class '<em>Exc IEEEST4B</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Exc IEEEST4B</em>'.
     * @generated
     */
    ExcIEEEST4B createExcIEEEST4B();

    /**
     * Returns a new object of class '<em>End Device Info</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>End Device Info</em>'.
     * @generated
     */
    EndDeviceInfo createEndDeviceInfo();

    /**
     * Returns a new object of class '<em>Load Aggregate</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Load Aggregate</em>'.
     * @generated
     */
    LoadAggregate createLoadAggregate();

    /**
     * Returns a new object of class '<em>Inspection Analog</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Inspection Analog</em>'.
     * @generated
     */
    InspectionAnalog createInspectionAnalog();

    /**
     * Returns a new object of class '<em>Underexcitation Limiter Dynamics</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Underexcitation Limiter Dynamics</em>'.
     * @generated
     */
    UnderexcitationLimiterDynamics createUnderexcitationLimiterDynamics();

    /**
     * Returns a new object of class '<em>Nonlinear Shunt Compensator Phase Point</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Nonlinear Shunt Compensator Phase Point</em>'.
     * @generated
     */
    NonlinearShuntCompensatorPhasePoint createNonlinearShuntCompensatorPhasePoint();

    /**
     * Returns a new object of class '<em>Shunt Compensator Info</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Shunt Compensator Info</em>'.
     * @generated
     */
    ShuntCompensatorInfo createShuntCompensatorInfo();

    /**
     * Returns a new object of class '<em>Asset Location Hazard</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Asset Location Hazard</em>'.
     * @generated
     */
    AssetLocationHazard createAssetLocationHazard();

    /**
     * Returns a new object of class '<em>Asset String Measurement</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Asset String Measurement</em>'.
     * @generated
     */
    AssetStringMeasurement createAssetStringMeasurement();

    /**
     * Returns a new object of class '<em>VComp IEEE Type2</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>VComp IEEE Type2</em>'.
     * @generated
     */
    VCompIEEEType2 createVCompIEEEType2();

    /**
     * Returns a new object of class '<em>Exc IEEEST7B</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Exc IEEEST7B</em>'.
     * @generated
     */
    ExcIEEEST7B createExcIEEEST7B();

    /**
     * Returns a new object of class '<em>Transformer End</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Transformer End</em>'.
     * @generated
     */
    TransformerEnd createTransformerEnd();

    /**
     * Returns a new object of class '<em>Instance Set Member</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Instance Set Member</em>'.
     * @generated
     */
    InstanceSetMember createInstanceSetMember();

    /**
     * Returns a new object of class '<em>Exc IEEEAC6A</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Exc IEEEAC6A</em>'.
     * @generated
     */
    ExcIEEEAC6A createExcIEEEAC6A();

    /**
     * Returns a new object of class '<em>Inspection Discrete</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Inspection Discrete</em>'.
     * @generated
     */
    InspectionDiscrete createInspectionDiscrete();

    /**
     * Returns a new object of class '<em>Pricing Structure</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Pricing Structure</em>'.
     * @generated
     */
    PricingStructure createPricingStructure();

    /**
     * Returns a new object of class '<em>DER Group Dispatch</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>DER Group Dispatch</em>'.
     * @generated
     */
    DERGroupDispatch createDERGroupDispatch();

    /**
     * Returns a new object of class '<em>Material Item</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Material Item</em>'.
     * @generated
     */
    MaterialItem createMaterialItem();

    /**
     * Returns a new object of class '<em>Composite Switch</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Composite Switch</em>'.
     * @generated
     */
    CompositeSwitch createCompositeSwitch();

    /**
     * Returns a new object of class '<em>Asset Deployment</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Asset Deployment</em>'.
     * @generated
     */
    AssetDeployment createAssetDeployment();

    /**
     * Returns a new object of class '<em>Oil Analysis Particle Analog</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Oil Analysis Particle Analog</em>'.
     * @generated
     */
    OilAnalysisParticleAnalog createOilAnalysisParticleAnalog();

    /**
     * Returns a new object of class '<em>Calculation Method Order</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Calculation Method Order</em>'.
     * @generated
     */
    CalculationMethodOrder createCalculationMethodOrder();

    /**
     * Returns a new object of class '<em>Exc IEEEAC1A</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Exc IEEEAC1A</em>'.
     * @generated
     */
    ExcIEEEAC1A createExcIEEEAC1A();

    /**
     * Returns a new object of class '<em>Wind Gen Type3b IEC</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Wind Gen Type3b IEC</em>'.
     * @generated
     */
    WindGenType3bIEC createWindGenType3bIEC();

    /**
     * Returns a new object of class '<em>Incident</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Incident</em>'.
     * @generated
     */
    Incident createIncident();

    /**
     * Returns a new object of class '<em>Overexc Lim X1</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Overexc Lim X1</em>'.
     * @generated
     */
    OverexcLimX1 createOverexcLimX1();

    /**
     * Returns a new object of class '<em>Asset Organisation Role</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Asset Organisation Role</em>'.
     * @generated
     */
    AssetOrganisationRole createAssetOrganisationRole();

    /**
     * Returns a new object of class '<em>Location</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Location</em>'.
     * @generated
     */
    Location createLocation();

    /**
     * Returns a new object of class '<em>Work Task</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Work Task</em>'.
     * @generated
     */
    WorkTask createWorkTask();

    /**
     * Returns a new object of class '<em>Exc AC8B</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Exc AC8B</em>'.
     * @generated
     */
    ExcAC8B createExcAC8B();

    /**
     * Returns a new object of class '<em>Gov Steam FV2</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Gov Steam FV2</em>'.
     * @generated
     */
    GovSteamFV2 createGovSteamFV2();

    /**
     * Returns a new object of class '<em>DC Chopper</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>DC Chopper</em>'.
     * @generated
     */
    DCChopper createDCChopper();

    /**
     * Returns a new object of class '<em>Cheque</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Cheque</em>'.
     * @generated
     */
    Cheque createCheque();

    /**
     * Returns a new object of class '<em>VAdj IEEE</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>VAdj IEEE</em>'.
     * @generated
     */
    VAdjIEEE createVAdjIEEE();

    /**
     * Returns a new object of class '<em>Reading Quality</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Reading Quality</em>'.
     * @generated
     */
    ReadingQuality createReadingQuality();

    /**
     * Returns a new object of class '<em>Grounding Impedance</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Grounding Impedance</em>'.
     * @generated
     */
    GroundingImpedance createGroundingImpedance();

    /**
     * Returns a new object of class '<em>Interval Block</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Interval Block</em>'.
     * @generated
     */
    IntervalBlock createIntervalBlock();

    /**
     * Returns a new object of class '<em>Energy Connection</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Energy Connection</em>'.
     * @generated
     */
    EnergyConnection createEnergyConnection();

    /**
     * Returns a new object of class '<em>Streetlight</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Streetlight</em>'.
     * @generated
     */
    Streetlight createStreetlight();

    /**
     * Returns a new object of class '<em>Wind Gen Type3 IEC</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Wind Gen Type3 IEC</em>'.
     * @generated
     */
    WindGenType3IEC createWindGenType3IEC();

    /**
     * Returns a new object of class '<em>DC Conducting Equipment</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>DC Conducting Equipment</em>'.
     * @generated
     */
    DCConductingEquipment createDCConductingEquipment();

    /**
     * Returns a new object of class '<em>Asynchronous Machine User Defined</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Asynchronous Machine User Defined</em>'.
     * @generated
     */
    AsynchronousMachineUserDefined createAsynchronousMachineUserDefined();

    /**
     * Returns a new object of class '<em>Predictions</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Predictions</em>'.
     * @generated
     */
    Predictions createPredictions();

    /**
     * Returns a new object of class '<em>Pss IEEE1A</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Pss IEEE1A</em>'.
     * @generated
     */
    PssIEEE1A createPssIEEE1A();

    /**
     * Returns a new object of class '<em>End Device Control Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>End Device Control Type</em>'.
     * @generated
     */
    EndDeviceControlType createEndDeviceControlType();

    /**
     * Returns a new object of class '<em>Operating Mechanism Info</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Operating Mechanism Info</em>'.
     * @generated
     */
    OperatingMechanismInfo createOperatingMechanismInfo();

    /**
     * Returns a new object of class '<em>Oil Analysis Gas Analog</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Oil Analysis Gas Analog</em>'.
     * @generated
     */
    OilAnalysisGasAnalog createOilAnalysisGasAnalog();

    /**
     * Returns a new object of class '<em>Oil Analysis PCB Analog</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Oil Analysis PCB Analog</em>'.
     * @generated
     */
    OilAnalysisPCBAnalog createOilAnalysisPCBAnalog();

    /**
     * Returns a new object of class '<em>Mutual Coupling</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Mutual Coupling</em>'.
     * @generated
     */
    MutualCoupling createMutualCoupling();

    /**
     * Returns a new object of class '<em>Other Capability</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Other Capability</em>'.
     * @generated
     */
    OtherCapability createOtherCapability();

    /**
     * Returns a new object of class '<em>Accumulator</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Accumulator</em>'.
     * @generated
     */
    Accumulator createAccumulator();

    /**
     * Returns a new object of class '<em>Gov CT1</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Gov CT1</em>'.
     * @generated
     */
    GovCT1 createGovCT1();

    /**
     * Returns a new object of class '<em>Wire Spacing</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Wire Spacing</em>'.
     * @generated
     */
    WireSpacing createWireSpacing();

    /**
     * Returns a new object of class '<em>Wind Mech IEC</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Wind Mech IEC</em>'.
     * @generated
     */
    WindMechIEC createWindMechIEC();

    /**
     * Returns a new object of class '<em>Wind Cont PType4a IEC</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Wind Cont PType4a IEC</em>'.
     * @generated
     */
    WindContPType4aIEC createWindContPType4aIEC();

    /**
     * Returns a new object of class '<em>ACDC Converter DC Terminal</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>ACDC Converter DC Terminal</em>'.
     * @generated
     */
    ACDCConverterDCTerminal createACDCConverterDCTerminal();

    /**
     * Returns a new object of class '<em>Customer Notification</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Customer Notification</em>'.
     * @generated
     */
    CustomerNotification createCustomerNotification();

    /**
     * Returns a new object of class '<em>Communication Link</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Communication Link</em>'.
     * @generated
     */
    CommunicationLink createCommunicationLink();

    /**
     * Returns a new object of class '<em>Asset Owner</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Asset Owner</em>'.
     * @generated
     */
    AssetOwner createAssetOwner();

    /**
     * Returns a new object of class '<em>Gov Hydro Pelton</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Gov Hydro Pelton</em>'.
     * @generated
     */
    GovHydroPelton createGovHydroPelton();

    /**
     * Returns a new object of class '<em>Wind Turbine Type1or2 IEC</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Wind Turbine Type1or2 IEC</em>'.
     * @generated
     */
    WindTurbineType1or2IEC createWindTurbineType1or2IEC();

    /**
     * Returns a new object of class '<em>Maintainer</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Maintainer</em>'.
     * @generated
     */
    Maintainer createMaintainer();

    /**
     * Returns a new object of class '<em>Overexcitation Limiter User Defined</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Overexcitation Limiter User Defined</em>'.
     * @generated
     */
    OverexcitationLimiterUserDefined createOverexcitationLimiterUserDefined();

    /**
     * Returns a new object of class '<em>PFV Ar Controller Type2 Dynamics</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>PFV Ar Controller Type2 Dynamics</em>'.
     * @generated
     */
    PFVArControllerType2Dynamics createPFVArControllerType2Dynamics();

    /**
     * Returns a new object of class '<em>Regular Interval Schedule</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Regular Interval Schedule</em>'.
     * @generated
     */
    RegularIntervalSchedule createRegularIntervalSchedule();

    /**
     * Returns a new object of class '<em>Exc IEEEDC3A</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Exc IEEEDC3A</em>'.
     * @generated
     */
    ExcIEEEDC3A createExcIEEEDC3A();

    /**
     * Returns a new object of class '<em>Load Area</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Load Area</em>'.
     * @generated
     */
    LoadArea createLoadArea();

    /**
     * Returns a new object of class '<em>Disc Exc Cont IEEEDEC3A</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Disc Exc Cont IEEEDEC3A</em>'.
     * @generated
     */
    DiscExcContIEEEDEC3A createDiscExcContIEEEDEC3A();

    /**
     * Returns a new object of class '<em>Account Notification</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Account Notification</em>'.
     * @generated
     */
    AccountNotification createAccountNotification();

    /**
     * Returns a new object of class '<em>Exc CZ</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Exc CZ</em>'.
     * @generated
     */
    ExcCZ createExcCZ();

    /**
     * Returns a new object of class '<em>Operational Limit Set</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Operational Limit Set</em>'.
     * @generated
     */
    OperationalLimitSet createOperationalLimitSet();

    /**
     * Returns a new object of class '<em>Dynamics Function Block</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Dynamics Function Block</em>'.
     * @generated
     */
    DynamicsFunctionBlock createDynamicsFunctionBlock();

    /**
     * Returns a new object of class '<em>Seal</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Seal</em>'.
     * @generated
     */
    Seal createSeal();

    /**
     * Returns a new object of class '<em>Safety Document</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Safety Document</em>'.
     * @generated
     */
    SafetyDocument createSafetyDocument();

    /**
     * Returns a new object of class '<em>Gov CT2</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Gov CT2</em>'.
     * @generated
     */
    GovCT2 createGovCT2();

    /**
     * Returns a new object of class '<em>Wind Cont Pitch Angle IEC</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Wind Cont Pitch Angle IEC</em>'.
     * @generated
     */
    WindContPitchAngleIEC createWindContPitchAngleIEC();

    /**
     * Returns a new object of class '<em>Wind Plant Reactive Control IEC</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Wind Plant Reactive Control IEC</em>'.
     * @generated
     */
    WindPlantReactiveControlIEC createWindPlantReactiveControlIEC();

    /**
     * Returns a new object of class '<em>Tap Changer Table Point</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Tap Changer Table Point</em>'.
     * @generated
     */
    TapChangerTablePoint createTapChangerTablePoint();

    /**
     * Returns a new object of class '<em>Contingency Equipment</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Contingency Equipment</em>'.
     * @generated
     */
    ContingencyEquipment createContingencyEquipment();

    /**
     * Returns a new object of class '<em>Wind Gen Turbine Type2 IEC</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Wind Gen Turbine Type2 IEC</em>'.
     * @generated
     */
    WindGenTurbineType2IEC createWindGenTurbineType2IEC();

    /**
     * Returns a new object of class '<em>Provided Bilateral Point</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Provided Bilateral Point</em>'.
     * @generated
     */
    ProvidedBilateralPoint createProvidedBilateralPoint();

    /**
     * Returns a new object of class '<em>Per Length Line Parameter</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Per Length Line Parameter</em>'.
     * @generated
     */
    PerLengthLineParameter createPerLengthLineParameter();

    /**
     * Returns a new object of class '<em>Earth Fault Compensator</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Earth Fault Compensator</em>'.
     * @generated
     */
    EarthFaultCompensator createEarthFaultCompensator();

    /**
     * Returns a new object of class '<em>Equipment Container</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Equipment Container</em>'.
     * @generated
     */
    EquipmentContainer createEquipmentContainer();

    /**
     * Returns a new object of class '<em>Hazard</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Hazard</em>'.
     * @generated
     */
    Hazard createHazard();

    /**
     * Returns a new object of class '<em>Asset Info</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Asset Info</em>'.
     * @generated
     */
    AssetInfo createAssetInfo();

    /**
     * Returns a new object of class '<em>ACDC Terminal</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>ACDC Terminal</em>'.
     * @generated
     */
    ACDCTerminal createACDCTerminal();

    /**
     * Returns a new object of class '<em>Pss IEEE2B</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Pss IEEE2B</em>'.
     * @generated
     */
    PssIEEE2B createPssIEEE2B();

    /**
     * Returns a new object of class '<em>Steam Turbine</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Steam Turbine</em>'.
     * @generated
     */
    SteamTurbine createSteamTurbine();

    /**
     * Returns a new object of class '<em>Wind Cont PType3 IEC</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Wind Cont PType3 IEC</em>'.
     * @generated
     */
    WindContPType3IEC createWindContPType3IEC();

    /**
     * Returns a new object of class '<em>Petersen Coil</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Petersen Coil</em>'.
     * @generated
     */
    PetersenCoil createPetersenCoil();

    /**
     * Returns a new object of class '<em>Estimated Restoration Time</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Estimated Restoration Time</em>'.
     * @generated
     */
    EstimatedRestorationTime createEstimatedRestorationTime();

    /**
     * Returns a new object of class '<em>Asynchronous Machine Dynamics</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Asynchronous Machine Dynamics</em>'.
     * @generated
     */
    AsynchronousMachineDynamics createAsynchronousMachineDynamics();

    /**
     * Returns a new object of class '<em>Joint</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Joint</em>'.
     * @generated
     */
    Joint createJoint();

    /**
     * Returns a new object of class '<em>Steam Sendout Schedule</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Steam Sendout Schedule</em>'.
     * @generated
     */
    SteamSendoutSchedule createSteamSendoutSchedule();

    /**
     * Returns a new object of class '<em>Exc IEEEST1A</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Exc IEEEST1A</em>'.
     * @generated
     */
    ExcIEEEST1A createExcIEEEST1A();

    /**
     * Returns a new object of class '<em>Trouble Ticket</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Trouble Ticket</em>'.
     * @generated
     */
    TroubleTicket createTroubleTicket();

    /**
     * Returns a new object of class '<em>Regulating Control</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Regulating Control</em>'.
     * @generated
     */
    RegulatingControl createRegulatingControl();

    /**
     * Returns a new object of class '<em>Gov Steam0</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Gov Steam0</em>'.
     * @generated
     */
    GovSteam0 createGovSteam0();

    /**
     * Returns a new object of class '<em>TASE2 Bilateral Table</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>TASE2 Bilateral Table</em>'.
     * @generated
     */
    TASE2BilateralTable createTASE2BilateralTable();

    /**
     * Returns a new object of class '<em>Ground Disconnector</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Ground Disconnector</em>'.
     * @generated
     */
    GroundDisconnector createGroundDisconnector();

    /**
     * Returns a new object of class '<em>Pss1 A</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Pss1 A</em>'.
     * @generated
     */
    Pss1A createPss1A();

    /**
     * Returns a new object of class '<em>Gen Unit Op Cost Curve</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Gen Unit Op Cost Curve</em>'.
     * @generated
     */
    GenUnitOpCostCurve createGenUnitOpCostCurve();

    /**
     * Returns a new object of class '<em>Power Electronics Connection</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Power Electronics Connection</em>'.
     * @generated
     */
    PowerElectronicsConnection createPowerElectronicsConnection();

    /**
     * Returns a new object of class '<em>Person</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Person</em>'.
     * @generated
     */
    Person createPerson();

    /**
     * Returns a new object of class '<em>Pss IEEE4B</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Pss IEEE4B</em>'.
     * @generated
     */
    PssIEEE4B createPssIEEE4B();

    /**
     * Returns a new object of class '<em>Sourcing Actor</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Sourcing Actor</em>'.
     * @generated
     */
    SourcingActor createSourcingActor();

    /**
     * Returns a new object of class '<em>Gov Hydro1</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Gov Hydro1</em>'.
     * @generated
     */
    GovHydro1 createGovHydro1();

    /**
     * Returns a new object of class '<em>Wind Gen Type4 IEC</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Wind Gen Type4 IEC</em>'.
     * @generated
     */
    WindGenType4IEC createWindGenType4IEC();

    /**
     * Returns a new object of class '<em>Synchronous Machine Detailed</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Synchronous Machine Detailed</em>'.
     * @generated
     */
    SynchronousMachineDetailed createSynchronousMachineDetailed();

    /**
     * Returns a new object of class '<em>Voltage Control Zone</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Voltage Control Zone</em>'.
     * @generated
     */
    VoltageControlZone createVoltageControlZone();

    /**
     * Returns a new object of class '<em>Discrete Command</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Discrete Command</em>'.
     * @generated
     */
    DiscreteCommand createDiscreteCommand();

    /**
     * Returns a new object of class '<em>Base Voltage</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Base Voltage</em>'.
     * @generated
     */
    BaseVoltage createBaseVoltage();

    /**
     * Returns a new object of class '<em>End Device Control</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>End Device Control</em>'.
     * @generated
     */
    EndDeviceControl createEndDeviceControl();

    /**
     * Returns a new object of class '<em>Conform Load Group</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Conform Load Group</em>'.
     * @generated
     */
    ConformLoadGroup createConformLoadGroup();

    /**
     * Returns a new object of class '<em>Underexc Lim IEEE1</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Underexc Lim IEEE1</em>'.
     * @generated
     */
    UnderexcLimIEEE1 createUnderexcLimIEEE1();

    /**
     * Returns a new object of class '<em>Energy Consumer</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Energy Consumer</em>'.
     * @generated
     */
    EnergyConsumer createEnergyConsumer();

    /**
     * Returns a new object of class '<em>Measurement Value Source</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Measurement Value Source</em>'.
     * @generated
     */
    MeasurementValueSource createMeasurementValueSource();

    /**
     * Returns a new object of class '<em>Power Cut Zone</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Power Cut Zone</em>'.
     * @generated
     */
    PowerCutZone createPowerCutZone();

    /**
     * Returns a new object of class '<em>Conform Load</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Conform Load</em>'.
     * @generated
     */
    ConformLoad createConformLoad();

    /**
     * Returns a new object of class '<em>Overexc Lim2</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Overexc Lim2</em>'.
     * @generated
     */
    OverexcLim2 createOverexcLim2();

    /**
     * Returns a new object of class '<em>End Device</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>End Device</em>'.
     * @generated
     */
    EndDevice createEndDevice();

    /**
     * Returns a new object of class '<em>Basic Interval Schedule</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Basic Interval Schedule</em>'.
     * @generated
     */
    BasicIntervalSchedule createBasicIntervalSchedule();

    /**
     * Returns a new object of class '<em>Oil Specimen</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Oil Specimen</em>'.
     * @generated
     */
    OilSpecimen createOilSpecimen();

    /**
     * Returns a new object of class '<em>Substation</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Substation</em>'.
     * @generated
     */
    Substation createSubstation();

    /**
     * Returns a new object of class '<em>Gov Hydro PID2</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Gov Hydro PID2</em>'.
     * @generated
     */
    GovHydroPID2 createGovHydroPID2();

    /**
     * Returns a new object of class '<em>Com Function</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Com Function</em>'.
     * @generated
     */
    ComFunction createComFunction();

    /**
     * Returns a new object of class '<em>Pan Pricing Detail</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Pan Pricing Detail</em>'.
     * @generated
     */
    PanPricingDetail createPanPricingDetail();

    /**
     * Returns a new object of class '<em>Linear Shunt Compensator Phase</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Linear Shunt Compensator Phase</em>'.
     * @generated
     */
    LinearShuntCompensatorPhase createLinearShuntCompensatorPhase();

    /**
     * Returns a new object of class '<em>Gross To Net Active Power Curve</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Gross To Net Active Power Curve</em>'.
     * @generated
     */
    GrossToNetActivePowerCurve createGrossToNetActivePowerCurve();

    /**
     * Returns a new object of class '<em>DC Node</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>DC Node</em>'.
     * @generated
     */
    DCNode createDCNode();

    /**
     * Returns a new object of class '<em>Wind Turbine Type1or2 Dynamics</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Wind Turbine Type1or2 Dynamics</em>'.
     * @generated
     */
    WindTurbineType1or2Dynamics createWindTurbineType1or2Dynamics();

    /**
     * Returns a new object of class '<em>State Variable</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>State Variable</em>'.
     * @generated
     */
    StateVariable createStateVariable();

    /**
     * Returns a new object of class '<em>Work Activity Record</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Work Activity Record</em>'.
     * @generated
     */
    WorkActivityRecord createWorkActivityRecord();

    /**
     * Returns a new object of class '<em>Oil Analysis Paper Analog</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Oil Analysis Paper Analog</em>'.
     * @generated
     */
    OilAnalysisPaperAnalog createOilAnalysisPaperAnalog();

    /**
     * Returns a new object of class '<em>DC Switch</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>DC Switch</em>'.
     * @generated
     */
    DCSwitch createDCSwitch();

    /**
     * Returns a new object of class '<em>PFV Ar Type1 IEEEV Ar Controller</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>PFV Ar Type1 IEEEV Ar Controller</em>'.
     * @generated
     */
    PFVArType1IEEEVArController createPFVArType1IEEEVArController();

    /**
     * Returns a new object of class '<em>Procedure Data Set</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Procedure Data Set</em>'.
     * @generated
     */
    ProcedureDataSet createProcedureDataSet();

    /**
     * Returns a new object of class '<em>Visibility Layer</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Visibility Layer</em>'.
     * @generated
     */
    VisibilityLayer createVisibilityLayer();

    /**
     * Returns a new object of class '<em>Diagram Object Glue Point</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Diagram Object Glue Point</em>'.
     * @generated
     */
    DiagramObjectGluePoint createDiagramObjectGluePoint();

    /**
     * Returns a new object of class '<em>Diagram Object</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Diagram Object</em>'.
     * @generated
     */
    DiagramObject createDiagramObject();

    /**
     * Returns a new object of class '<em>Heat Recovery Boiler</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Heat Recovery Boiler</em>'.
     * @generated
     */
    HeatRecoveryBoiler createHeatRecoveryBoiler();

    /**
     * Returns a new object of class '<em>Interrupter Unit Info</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Interrupter Unit Info</em>'.
     * @generated
     */
    InterrupterUnitInfo createInterrupterUnitInfo();

    /**
     * Returns a new object of class '<em>Gov GAST</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Gov GAST</em>'.
     * @generated
     */
    GovGAST createGovGAST();

    /**
     * Returns a new object of class '<em>Customer</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Customer</em>'.
     * @generated
     */
    Customer createCustomer();

    /**
     * Returns a new object of class '<em>Exc SEXS</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Exc SEXS</em>'.
     * @generated
     */
    ExcSEXS createExcSEXS();

    /**
     * Returns a new object of class '<em>Excitation System User Defined</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Excitation System User Defined</em>'.
     * @generated
     */
    ExcitationSystemUserDefined createExcitationSystemUserDefined();

    /**
     * Returns a new object of class '<em>Switching Plan</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Switching Plan</em>'.
     * @generated
     */
    SwitchingPlan createSwitchingPlan();

    /**
     * Returns a new object of class '<em>Work Location</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Work Location</em>'.
     * @generated
     */
    WorkLocation createWorkLocation();

    /**
     * Returns a new object of class '<em>Switching Step</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Switching Step</em>'.
     * @generated
     */
    SwitchingStep createSwitchingStep();

    /**
     * Returns a new object of class '<em>Consumption Tariff Interval</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Consumption Tariff Interval</em>'.
     * @generated
     */
    ConsumptionTariffInterval createConsumptionTariffInterval();

    /**
     * Returns a new object of class '<em>Wind Protection IEC</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Wind Protection IEC</em>'.
     * @generated
     */
    WindProtectionIEC createWindProtectionIEC();

    /**
     * Returns a new object of class '<em>Underexc Lim2 Simplified</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Underexc Lim2 Simplified</em>'.
     * @generated
     */
    UnderexcLim2Simplified createUnderexcLim2Simplified();

    /**
     * Returns a new object of class '<em>Simple End Device Function</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Simple End Device Function</em>'.
     * @generated
     */
    SimpleEndDeviceFunction createSimpleEndDeviceFunction();

    /**
     * Returns a new object of class '<em>Disc Exc Cont IEEEDEC1A</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Disc Exc Cont IEEEDEC1A</em>'.
     * @generated
     */
    DiscExcContIEEEDEC1A createDiscExcContIEEEDEC1A();

    /**
     * Returns a new object of class '<em>Jumper Action</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Jumper Action</em>'.
     * @generated
     */
    JumperAction createJumperAction();

    /**
     * Returns a new object of class '<em>Service Multiplier</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Service Multiplier</em>'.
     * @generated
     */
    ServiceMultiplier createServiceMultiplier();

    /**
     * Returns a new object of class '<em>Document</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Document</em>'.
     * @generated
     */
    Document createDocument();

    /**
     * Returns a new object of class '<em>Inspection Data Set</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Inspection Data Set</em>'.
     * @generated
     */
    InspectionDataSet createInspectionDataSet();

    /**
     * Returns a new object of class '<em>Load Static</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Load Static</em>'.
     * @generated
     */
    LoadStatic createLoadStatic();

    /**
     * Returns a new object of class '<em>FACTS Device</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>FACTS Device</em>'.
     * @generated
     */
    FACTSDevice createFACTSDevice();

    /**
     * Returns a new object of class '<em>Asset Function</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Asset Function</em>'.
     * @generated
     */
    AssetFunction createAssetFunction();

    /**
     * Returns a new object of class '<em>Discontinuous Excitation Control Dynamics</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Discontinuous Excitation Control Dynamics</em>'.
     * @generated
     */
    DiscontinuousExcitationControlDynamics createDiscontinuousExcitationControlDynamics();

    /**
     * Returns a new object of class '<em>Current Limit</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Current Limit</em>'.
     * @generated
     */
    CurrentLimit createCurrentLimit();

    /**
     * Returns a new object of class '<em>Phase Tap Changer Symmetrical</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Phase Tap Changer Symmetrical</em>'.
     * @generated
     */
    PhaseTapChangerSymmetrical createPhaseTapChangerSymmetrical();

    /**
     * Returns a new object of class '<em>Time Tariff Interval</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Time Tariff Interval</em>'.
     * @generated
     */
    TimeTariffInterval createTimeTariffInterval();

    /**
     * Returns a new object of class '<em>Exc IEEEAC4A</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Exc IEEEAC4A</em>'.
     * @generated
     */
    ExcIEEEAC4A createExcIEEEAC4A();

    /**
     * Returns a new object of class '<em>Wind Turbine Type4 IEC</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Wind Turbine Type4 IEC</em>'.
     * @generated
     */
    WindTurbineType4IEC createWindTurbineType4IEC();

    /**
     * Returns a new object of class '<em>Base Reading</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Base Reading</em>'.
     * @generated
     */
    BaseReading createBaseReading();

    /**
     * Returns a new object of class '<em>Underexcitation Limiter User Defined</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Underexcitation Limiter User Defined</em>'.
     * @generated
     */
    UnderexcitationLimiterUserDefined createUnderexcitationLimiterUserDefined();

    /**
     * Returns a new object of class '<em>Hydro Pump</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Hydro Pump</em>'.
     * @generated
     */
    HydroPump createHydroPump();

    /**
     * Returns a new object of class '<em>Power Transformer Info</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Power Transformer Info</em>'.
     * @generated
     */
    PowerTransformerInfo createPowerTransformerInfo();

    /**
     * Returns a new object of class '<em>Plant</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Plant</em>'.
     * @generated
     */
    Plant createPlant();

    /**
     * Returns a new object of class '<em>Mechanical Load Dynamics</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Mechanical Load Dynamics</em>'.
     * @generated
     */
    MechanicalLoadDynamics createMechanicalLoadDynamics();

    /**
     * Returns a new object of class '<em>Busbar Section Info</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Busbar Section Info</em>'.
     * @generated
     */
    BusbarSectionInfo createBusbarSectionInfo();

    /**
     * Returns a new object of class '<em>Cut Action</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Cut Action</em>'.
     * @generated
     */
    CutAction createCutAction();

    /**
     * Returns a new object of class '<em>Auxiliary Agreement</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Auxiliary Agreement</em>'.
     * @generated
     */
    AuxiliaryAgreement createAuxiliaryAgreement();

    /**
     * Returns a new object of class '<em>Wind Cont QLim IEC</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Wind Cont QLim IEC</em>'.
     * @generated
     */
    WindContQLimIEC createWindContQLimIEC();

    /**
     * Returns a new object of class '<em>Current Transformer</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Current Transformer</em>'.
     * @generated
     */
    CurrentTransformer createCurrentTransformer();

    /**
     * Returns a new object of class '<em>Structure Support</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Structure Support</em>'.
     * @generated
     */
    StructureSupport createStructureSupport();

    /**
     * Returns a new object of class '<em>Synchrocheck Relay</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Synchrocheck Relay</em>'.
     * @generated
     */
    SynchrocheckRelay createSynchrocheckRelay();

    /**
     * Returns a new object of class '<em>Analog Value</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Analog Value</em>'.
     * @generated
     */
    AnalogValue createAnalogValue();

    /**
     * Returns a new object of class '<em>ISO Upper Layer</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>ISO Upper Layer</em>'.
     * @generated
     */
    ISOUpperLayer createISOUpperLayer();

    /**
     * Returns a new object of class '<em>Wind Turbine Type4b IEC</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Wind Turbine Type4b IEC</em>'.
     * @generated
     */
    WindTurbineType4bIEC createWindTurbineType4bIEC();

    /**
     * Returns a new object of class '<em>Crew Member</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Crew Member</em>'.
     * @generated
     */
    CrewMember createCrewMember();

    /**
     * Returns a new object of class '<em>Object Deletion</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Object Deletion</em>'.
     * @generated
     */
    ObjectDeletion createObjectDeletion();

    /**
     * Returns a new object of class '<em>Steam Supply</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Steam Supply</em>'.
     * @generated
     */
    SteamSupply createSteamSupply();

    /**
     * Returns a new object of class '<em>Topological Island</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Topological Island</em>'.
     * @generated
     */
    TopologicalIsland createTopologicalIsland();

    /**
     * Returns a new object of class '<em>Limit</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Limit</em>'.
     * @generated
     */
    Limit createLimit();

    /**
     * Returns a new object of class '<em>Usage Point</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Usage Point</em>'.
     * @generated
     */
    UsagePoint createUsagePoint();

    /**
     * Returns a new object of class '<em>Concentric Neutral Cable Info</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Concentric Neutral Cable Info</em>'.
     * @generated
     */
    ConcentricNeutralCableInfo createConcentricNeutralCableInfo();

    /**
     * Returns a new object of class '<em>Control Area</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Control Area</em>'.
     * @generated
     */
    ControlArea createControlArea();

    /**
     * Returns a new object of class '<em>Nuclear Generating Unit</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Nuclear Generating Unit</em>'.
     * @generated
     */
    NuclearGeneratingUnit createNuclearGeneratingUnit();

    /**
     * Returns a new object of class '<em>Disconnector</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Disconnector</em>'.
     * @generated
     */
    Disconnector createDisconnector();

    /**
     * Returns a new object of class '<em>Wind Turbine Type3or4 Dynamics</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Wind Turbine Type3or4 Dynamics</em>'.
     * @generated
     */
    WindTurbineType3or4Dynamics createWindTurbineType3or4Dynamics();

    /**
     * Returns a new object of class '<em>Operations Safety Supervisor</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Operations Safety Supervisor</em>'.
     * @generated
     */
    OperationsSafetySupervisor createOperationsSafetySupervisor();

    /**
     * Returns a new object of class '<em>Tailbay Loss Curve</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Tailbay Loss Curve</em>'.
     * @generated
     */
    TailbayLossCurve createTailbayLossCurve();

    /**
     * Returns a new object of class '<em>Transformer Mesh Impedance</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Transformer Mesh Impedance</em>'.
     * @generated
     */
    TransformerMeshImpedance createTransformerMeshImpedance();

    /**
     * Returns a new object of class '<em>DC Series Device</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>DC Series Device</em>'.
     * @generated
     */
    DCSeriesDevice createDCSeriesDevice();

    /**
     * Returns a new object of class '<em>Alt Generating Unit Meas</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Alt Generating Unit Meas</em>'.
     * @generated
     */
    AltGeneratingUnitMeas createAltGeneratingUnitMeas();

    /**
     * Returns a new object of class '<em>Activity Record</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Activity Record</em>'.
     * @generated
     */
    ActivityRecord createActivityRecord();

    /**
     * Returns a new object of class '<em>Time Schedule</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Time Schedule</em>'.
     * @generated
     */
    TimeSchedule createTimeSchedule();

    /**
     * Returns a new object of class '<em>Fossil Fuel</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Fossil Fuel</em>'.
     * @generated
     */
    FossilFuel createFossilFuel();

    /**
     * Returns a new object of class '<em>Per Length Sequence Impedance</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Per Length Sequence Impedance</em>'.
     * @generated
     */
    PerLengthSequenceImpedance createPerLengthSequenceImpedance();

    /**
     * Returns a new object of class '<em>Start Ramp Curve</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Start Ramp Curve</em>'.
     * @generated
     */
    StartRampCurve createStartRampCurve();

    /**
     * Returns a new object of class '<em>Power Transformer End</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Power Transformer End</em>'.
     * @generated
     */
    PowerTransformerEnd createPowerTransformerEnd();

    /**
     * Returns a new object of class '<em>DER Capabilities</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>DER Capabilities</em>'.
     * @generated
     */
    DERCapabilities createDERCapabilities();

    /**
     * Returns a new object of class '<em>Switch Phase</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Switch Phase</em>'.
     * @generated
     */
    SwitchPhase createSwitchPhase();

    /**
     * Returns a new object of class '<em>Editor</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Editor</em>'.
     * @generated
     */
    Editor createEditor();

    /**
     * Returns a new object of class '<em>Data Set</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Data Set</em>'.
     * @generated
     */
    DataSet createDataSet();

    /**
     * Returns a new object of class '<em>Transformer Tank Info</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Transformer Tank Info</em>'.
     * @generated
     */
    TransformerTankInfo createTransformerTankInfo();

    /**
     * Returns a new object of class '<em>Exc AVR4</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Exc AVR4</em>'.
     * @generated
     */
    ExcAVR4 createExcAVR4();

    /**
     * Returns a new object of class '<em>Flow Sensor</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Flow Sensor</em>'.
     * @generated
     */
    FlowSensor createFlowSensor();

    /**
     * Returns a new object of class '<em>Emission Curve</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Emission Curve</em>'.
     * @generated
     */
    EmissionCurve createEmissionCurve();

    /**
     * Returns a new object of class '<em>Exc REXS</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Exc REXS</em>'.
     * @generated
     */
    ExcREXS createExcREXS();

    /**
     * Returns a new object of class '<em>Dispatchable Power Capability</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Dispatchable Power Capability</em>'.
     * @generated
     */
    DispatchablePowerCapability createDispatchablePowerCapability();

    /**
     * Returns a new object of class '<em>Exc AC2A</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Exc AC2A</em>'.
     * @generated
     */
    ExcAC2A createExcAC2A();

    /**
     * Returns a new object of class '<em>Irregular Interval Schedule</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Irregular Interval Schedule</em>'.
     * @generated
     */
    IrregularIntervalSchedule createIrregularIntervalSchedule();

    /**
     * Returns a new object of class '<em>Outage Area</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Outage Area</em>'.
     * @generated
     */
    OutageArea createOutageArea();

    /**
     * Returns a new object of class '<em>Hydro Generating Unit</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Hydro Generating Unit</em>'.
     * @generated
     */
    HydroGeneratingUnit createHydroGeneratingUnit();

    /**
     * Returns a new object of class '<em>Reading</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Reading</em>'.
     * @generated
     */
    Reading createReading();

    /**
     * Returns a new object of class '<em>ICCP Information Message</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>ICCP Information Message</em>'.
     * @generated
     */
    ICCPInformationMessage createICCPInformationMessage();

    /**
     * Returns a new object of class '<em>Equivalent Shunt</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Equivalent Shunt</em>'.
     * @generated
     */
    EquivalentShunt createEquivalentShunt();

    /**
     * Returns a new object of class '<em>Wind Aero Const IEC</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Wind Aero Const IEC</em>'.
     * @generated
     */
    WindAeroConstIEC createWindAeroConstIEC();

    /**
     * Returns a new object of class '<em>Asset Group</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Asset Group</em>'.
     * @generated
     */
    AssetGroup createAssetGroup();

    /**
     * Returns a new object of class '<em>Conducting Equipment</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Conducting Equipment</em>'.
     * @generated
     */
    ConductingEquipment createConductingEquipment();

    /**
     * Returns a new object of class '<em>Work Time Schedule</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Work Time Schedule</em>'.
     * @generated
     */
    WorkTimeSchedule createWorkTimeSchedule();

    /**
     * Returns a new object of class '<em>Operational Tag</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Operational Tag</em>'.
     * @generated
     */
    OperationalTag createOperationalTag();

    /**
     * Returns a new object of class '<em>Energy Source</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Energy Source</em>'.
     * @generated
     */
    EnergySource createEnergySource();

    /**
     * Returns a new object of class '<em>Cs Converter</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Cs Converter</em>'.
     * @generated
     */
    CsConverter createCsConverter();

    /**
     * Returns a new object of class '<em>Quality61850</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Quality61850</em>'.
     * @generated
     */
    Quality61850 createQuality61850();

    /**
     * Returns a new object of class '<em>Pss PTIST1</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Pss PTIST1</em>'.
     * @generated
     */
    PssPTIST1 createPssPTIST1();

    /**
     * Returns a new object of class '<em>Switch Info</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Switch Info</em>'.
     * @generated
     */
    SwitchInfo createSwitchInfo();

    /**
     * Returns a new object of class '<em>Oil Analysis Fluid Discrete</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Oil Analysis Fluid Discrete</em>'.
     * @generated
     */
    OilAnalysisFluidDiscrete createOilAnalysisFluidDiscrete();

    /**
     * Returns a new object of class '<em>Season</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Season</em>'.
     * @generated
     */
    Season createSeason();

    /**
     * Returns a new object of class '<em>Sectionaliser</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Sectionaliser</em>'.
     * @generated
     */
    Sectionaliser createSectionaliser();

    /**
     * Returns a new object of class '<em>Power System Stabilizer User Defined</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Power System Stabilizer User Defined</em>'.
     * @generated
     */
    PowerSystemStabilizerUserDefined createPowerSystemStabilizerUserDefined();

    /**
     * Returns a new object of class '<em>Sub Geographical Region</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Sub Geographical Region</em>'.
     * @generated
     */
    SubGeographicalRegion createSubGeographicalRegion();

    /**
     * Returns a new object of class '<em>Tap Changer</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Tap Changer</em>'.
     * @generated
     */
    TapChanger createTapChanger();

    /**
     * Returns a new object of class '<em>Tie Flow</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Tie Flow</em>'.
     * @generated
     */
    TieFlow createTieFlow();

    /**
     * Returns a new object of class '<em>Pan Pricing</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Pan Pricing</em>'.
     * @generated
     */
    PanPricing createPanPricing();

    /**
     * Returns a new object of class '<em>Asset User</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Asset User</em>'.
     * @generated
     */
    AssetUser createAssetUser();

    /**
     * Returns a new object of class '<em>Meter</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Meter</em>'.
     * @generated
     */
    Meter createMeter();

    /**
     * Returns a new object of class '<em>Regulation Schedule</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Regulation Schedule</em>'.
     * @generated
     */
    RegulationSchedule createRegulationSchedule();

    /**
     * Returns a new object of class '<em>Coordinate System</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Coordinate System</em>'.
     * @generated
     */
    CoordinateSystem createCoordinateSystem();

    /**
     * Returns a new object of class '<em>Aggregate Score</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Aggregate Score</em>'.
     * @generated
     */
    AggregateScore createAggregateScore();

    /**
     * Returns a new object of class '<em>Catalog Asset Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Catalog Asset Type</em>'.
     * @generated
     */
    CatalogAssetType createCatalogAssetType();

    /**
     * Returns a new object of class '<em>Pss2 B</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Pss2 B</em>'.
     * @generated
     */
    Pss2B createPss2B();

    /**
     * Returns a new object of class '<em>Channel</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Channel</em>'.
     * @generated
     */
    Channel createChannel();

    /**
     * Returns a new object of class '<em>Card</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Card</em>'.
     * @generated
     */
    Card createCard();

    /**
     * Returns a new object of class '<em>Nonlinear Shunt Compensator Phase</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Nonlinear Shunt Compensator Phase</em>'.
     * @generated
     */
    NonlinearShuntCompensatorPhase createNonlinearShuntCompensatorPhase();

    /**
     * Returns a new object of class '<em>Gov GAST3</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Gov GAST3</em>'.
     * @generated
     */
    GovGAST3 createGovGAST3();

    /**
     * Returns a new object of class '<em>PFV Ar Type1 IEEEPF Controller</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>PFV Ar Type1 IEEEPF Controller</em>'.
     * @generated
     */
    PFVArType1IEEEPFController createPFVArType1IEEEPFController();

    /**
     * Returns a new object of class '<em>Power Transformer</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Power Transformer</em>'.
     * @generated
     */
    PowerTransformer createPowerTransformer();

    /**
     * Returns a new object of class '<em>Tariff</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Tariff</em>'.
     * @generated
     */
    Tariff createTariff();

    /**
     * Returns a new object of class '<em>Accumulator Value</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Accumulator Value</em>'.
     * @generated
     */
    AccumulatorValue createAccumulatorValue();

    /**
     * Returns a new object of class '<em>Gov Hydro R</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Gov Hydro R</em>'.
     * @generated
     */
    GovHydroR createGovHydroR();

    /**
     * Returns a new object of class '<em>Medium</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Medium</em>'.
     * @generated
     */
    Medium createMedium();

    /**
     * Returns a new object of class '<em>Prime Mover</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Prime Mover</em>'.
     * @generated
     */
    PrimeMover createPrimeMover();

    /**
     * Returns a new object of class '<em>Phase Tap Changer Table Point</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Phase Tap Changer Table Point</em>'.
     * @generated
     */
    PhaseTapChangerTablePoint createPhaseTapChangerTablePoint();

    /**
     * Returns a new object of class '<em>Reading Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Reading Type</em>'.
     * @generated
     */
    ReadingType createReadingType();

    /**
     * Returns a new object of class '<em>End Device Event Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>End Device Event Type</em>'.
     * @generated
     */
    EndDeviceEventType createEndDeviceEventType();

    /**
     * Returns a new object of class '<em>Gov Hydro WEH</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Gov Hydro WEH</em>'.
     * @generated
     */
    GovHydroWEH createGovHydroWEH();

    /**
     * Returns a new object of class '<em>Name Type Authority</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Name Type Authority</em>'.
     * @generated
     */
    NameTypeAuthority createNameTypeAuthority();

    /**
     * Returns a new object of class '<em>Base Power</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Base Power</em>'.
     * @generated
     */
    BasePower createBasePower();

    /**
     * Returns a new object of class '<em>Exc IEEEAC3A</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Exc IEEEAC3A</em>'.
     * @generated
     */
    ExcIEEEAC3A createExcIEEEAC3A();

    /**
     * Returns a new object of class '<em>Ownership</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Ownership</em>'.
     * @generated
     */
    Ownership createOwnership();

    /**
     * Returns a new object of class '<em>Reclose Sequence</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Reclose Sequence</em>'.
     * @generated
     */
    RecloseSequence createRecloseSequence();

    /**
     * Returns a new object of class '<em>Emission Account</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Emission Account</em>'.
     * @generated
     */
    EmissionAccount createEmissionAccount();

    /**
     * Returns a new object of class '<em>Irregular Time Point</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Irregular Time Point</em>'.
     * @generated
     */
    IrregularTimePoint createIrregularTimePoint();

    /**
     * Returns a new object of class '<em>Wind Plant IEC</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Wind Plant IEC</em>'.
     * @generated
     */
    WindPlantIEC createWindPlantIEC();

    /**
     * Returns a new object of class '<em>Outage Schedule</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Outage Schedule</em>'.
     * @generated
     */
    OutageSchedule createOutageSchedule();

    /**
     * Returns a new object of class '<em>Post Line Sensor</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Post Line Sensor</em>'.
     * @generated
     */
    PostLineSensor createPostLineSensor();

    /**
     * Returns a new object of class '<em>Ratio Tap Changer Table</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Ratio Tap Changer Table</em>'.
     * @generated
     */
    RatioTapChangerTable createRatioTapChangerTable();

    /**
     * Returns a new object of class '<em>Exc ST3A</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Exc ST3A</em>'.
     * @generated
     */
    ExcST3A createExcST3A();

    /**
     * Returns a new object of class '<em>Gov GAST2</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Gov GAST2</em>'.
     * @generated
     */
    GovGAST2 createGovGAST2();

    /**
     * Returns a new object of class '<em>Exc ST1A</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Exc ST1A</em>'.
     * @generated
     */
    ExcST1A createExcST1A();

    /**
     * Returns a new object of class '<em>End Device Group</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>End Device Group</em>'.
     * @generated
     */
    EndDeviceGroup createEndDeviceGroup();

    /**
     * Returns a new object of class '<em>Vs Capability Curve</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Vs Capability Curve</em>'.
     * @generated
     */
    VsCapabilityCurve createVsCapabilityCurve();

    /**
     * Returns a new object of class '<em>Auxiliary Equipment</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Auxiliary Equipment</em>'.
     * @generated
     */
    AuxiliaryEquipment createAuxiliaryEquipment();

    /**
     * Returns a new object of class '<em>Wind Ref Frame Rot IEC</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Wind Ref Frame Rot IEC</em>'.
     * @generated
     */
    WindRefFrameRotIEC createWindRefFrameRotIEC();

    /**
     * Returns a new object of class '<em>Wind Aero Two Dim IEC</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Wind Aero Two Dim IEC</em>'.
     * @generated
     */
    WindAeroTwoDimIEC createWindAeroTwoDimIEC();

    /**
     * Returns a new object of class '<em>Asynchronous Machine Time Constant Reactance</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Asynchronous Machine Time Constant Reactance</em>'.
     * @generated
     */
    AsynchronousMachineTimeConstantReactance createAsynchronousMachineTimeConstantReactance();

    /**
     * Returns a new object of class '<em>Diagnosis Data Set</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Diagnosis Data Set</em>'.
     * @generated
     */
    DiagnosisDataSet createDiagnosisDataSet();

    /**
     * Returns a new object of class '<em>Duct Bank</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Duct Bank</em>'.
     * @generated
     */
    DuctBank createDuctBank();

    /**
     * Returns a new object of class '<em>Set Point</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Set Point</em>'.
     * @generated
     */
    SetPoint createSetPoint();

    /**
     * Returns a new object of class '<em>Pan Display</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Pan Display</em>'.
     * @generated
     */
    PanDisplay createPanDisplay();

    /**
     * Returns a new object of class '<em>Gov Hydro4</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Gov Hydro4</em>'.
     * @generated
     */
    GovHydro4 createGovHydro4();

    /**
     * Returns a new object of class '<em>Customer Agreement</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Customer Agreement</em>'.
     * @generated
     */
    CustomerAgreement createCustomerAgreement();

    /**
     * Returns a new object of class '<em>Gov Steam EU</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Gov Steam EU</em>'.
     * @generated
     */
    GovSteamEU createGovSteamEU();

    /**
     * Returns a new object of class '<em>Potential Transformer</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Potential Transformer</em>'.
     * @generated
     */
    PotentialTransformer createPotentialTransformer();

    /**
     * Returns a new object of class '<em>Cable Info</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Cable Info</em>'.
     * @generated
     */
    CableInfo createCableInfo();

    /**
     * Returns a new object of class '<em>Vendor Shift</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Vendor Shift</em>'.
     * @generated
     */
    VendorShift createVendorShift();

    /**
     * Returns a new object of class '<em>Oil Analysis Fluid Analog</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Oil Analysis Fluid Analog</em>'.
     * @generated
     */
    OilAnalysisFluidAnalog createOilAnalysisFluidAnalog();

    /**
     * Returns a new object of class '<em>Phase Tap Changer Asymmetrical</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Phase Tap Changer Asymmetrical</em>'.
     * @generated
     */
    PhaseTapChangerAsymmetrical createPhaseTapChangerAsymmetrical();

    /**
     * Returns a new object of class '<em>Overexc Lim IEEE</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Overexc Lim IEEE</em>'.
     * @generated
     */
    OverexcLimIEEE createOverexcLimIEEE();

    /**
     * Returns a new object of class '<em>Diagram Object Point</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Diagram Object Point</em>'.
     * @generated
     */
    DiagramObjectPoint createDiagramObjectPoint();

    /**
     * Returns a new object of class '<em>IEC61970CIM Version</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>IEC61970CIM Version</em>'.
     * @generated
     */
    IEC61970CIMVersion createIEC61970CIMVersion();

    /**
     * Returns a new object of class '<em>End Device Function</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>End Device Function</em>'.
     * @generated
     */
    EndDeviceFunction createEndDeviceFunction();

    /**
     * Returns a new object of class '<em>Generic Action</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Generic Action</em>'.
     * @generated
     */
    GenericAction createGenericAction();

    /**
     * Returns a new object of class '<em>Asset Container</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Asset Container</em>'.
     * @generated
     */
    AssetContainer createAssetContainer();

    /**
     * Returns a new object of class '<em>Clearance Document</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Clearance Document</em>'.
     * @generated
     */
    ClearanceDocument createClearanceDocument();

    /**
     * Returns a new object of class '<em>Exc AVR5</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Exc AVR5</em>'.
     * @generated
     */
    ExcAVR5 createExcAVR5();

    /**
     * Returns a new object of class '<em>Operational Limit Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Operational Limit Type</em>'.
     * @generated
     */
    OperationalLimitType createOperationalLimitType();

    /**
     * Returns a new object of class '<em>Exc IEEEST6B</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Exc IEEEST6B</em>'.
     * @generated
     */
    ExcIEEEST6B createExcIEEEST6B();

    /**
     * Returns a new object of class '<em>Exc IEEEST2A</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Exc IEEEST2A</em>'.
     * @generated
     */
    ExcIEEEST2A createExcIEEEST2A();

    /**
     * Returns a new object of class '<em>Asset</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Asset</em>'.
     * @generated
     */
    Asset createAsset();

    /**
     * Returns a new object of class '<em>Wind Turbine Type3or4 IEC</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Wind Turbine Type3or4 IEC</em>'.
     * @generated
     */
    WindTurbineType3or4IEC createWindTurbineType3or4IEC();

    /**
     * Returns a new object of class '<em>Usage Point Group</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Usage Point Group</em>'.
     * @generated
     */
    UsagePointGroup createUsagePointGroup();

    /**
     * Returns a new object of class '<em>Diagram Object Style</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Diagram Object Style</em>'.
     * @generated
     */
    DiagramObjectStyle createDiagramObjectStyle();

    /**
     * Returns a new object of class '<em>Interrupter Unit</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Interrupter Unit</em>'.
     * @generated
     */
    InterrupterUnit createInterrupterUnit();

    /**
     * Returns a new object of class '<em>Crew Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Crew Type</em>'.
     * @generated
     */
    CrewType createCrewType();

    /**
     * Returns a new object of class '<em>Wind Dynamics Lookup Table</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Wind Dynamics Lookup Table</em>'.
     * @generated
     */
    WindDynamicsLookupTable createWindDynamicsLookupTable();

    /**
     * Returns a new object of class '<em>Fossil Steam Supply</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Fossil Steam Supply</em>'.
     * @generated
     */
    FossilSteamSupply createFossilSteamSupply();

    /**
     * Returns a new object of class '<em>Exc AVR3</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Exc AVR3</em>'.
     * @generated
     */
    ExcAVR3 createExcAVR3();

    /**
     * Returns a new object of class '<em>DC Busbar</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>DC Busbar</em>'.
     * @generated
     */
    DCBusbar createDCBusbar();

    /**
     * Returns a new object of class '<em>Exc SK</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Exc SK</em>'.
     * @generated
     */
    ExcSK createExcSK();

    /**
     * Returns a new object of class '<em>Breaker</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Breaker</em>'.
     * @generated
     */
    Breaker createBreaker();

    /**
     * Returns a new object of class '<em>Excitation System Dynamics</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Excitation System Dynamics</em>'.
     * @generated
     */
    ExcitationSystemDynamics createExcitationSystemDynamics();

    /**
     * Returns a new object of class '<em>Operational Updated Rating</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Operational Updated Rating</em>'.
     * @generated
     */
    OperationalUpdatedRating createOperationalUpdatedRating();

    /**
     * Returns a new object of class '<em>Exc HU</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Exc HU</em>'.
     * @generated
     */
    ExcHU createExcHU();

    /**
     * Returns a new object of class '<em>Incremental Heat Rate Curve</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Incremental Heat Rate Curve</em>'.
     * @generated
     */
    IncrementalHeatRateCurve createIncrementalHeatRateCurve();

    /**
     * Returns a new object of class '<em>Diagram Style</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Diagram Style</em>'.
     * @generated
     */
    DiagramStyle createDiagramStyle();

    /**
     * Returns a new object of class '<em>Vendor</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Vendor</em>'.
     * @generated
     */
    Vendor createVendor();

    /**
     * Returns a new object of class '<em>Gov GAST1</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Gov GAST1</em>'.
     * @generated
     */
    GovGAST1 createGovGAST1();

    /**
     * Returns a new object of class '<em>Regulating Cond Eq</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Regulating Cond Eq</em>'.
     * @generated
     */
    RegulatingCondEq createRegulatingCondEq();

    /**
     * Returns a new object of class '<em>Ratio Tap Changer Table Point</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Ratio Tap Changer Table Point</em>'.
     * @generated
     */
    RatioTapChangerTablePoint createRatioTapChangerTablePoint();

    /**
     * Returns a new object of class '<em>Transformer Tank End</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Transformer Tank End</em>'.
     * @generated
     */
    TransformerTankEnd createTransformerTankEnd();

    /**
     * Returns a new object of class '<em>Disc Exc Cont IEEEDEC2A</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Disc Exc Cont IEEEDEC2A</em>'.
     * @generated
     */
    DiscExcContIEEEDEC2A createDiscExcContIEEEDEC2A();

    /**
     * Returns a new object of class '<em>Current Relay</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Current Relay</em>'.
     * @generated
     */
    CurrentRelay createCurrentRelay();

    /**
     * Returns a new object of class '<em>Operational Limit</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Operational Limit</em>'.
     * @generated
     */
    OperationalLimit createOperationalLimit();

    /**
     * Returns a new object of class '<em>Contingency Element</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Contingency Element</em>'.
     * @generated
     */
    ContingencyElement createContingencyElement();

    /**
     * Returns a new object of class '<em>PFV Ar Controller Type1 Dynamics</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>PFV Ar Controller Type1 Dynamics</em>'.
     * @generated
     */
    PFVArControllerType1Dynamics createPFVArControllerType1Dynamics();

    /**
     * Returns a new object of class '<em>Switch</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Switch</em>'.
     * @generated
     */
    Switch createSwitch();

    /**
     * Returns a new object of class '<em>Bilateral Exchange Actor</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Bilateral Exchange Actor</em>'.
     * @generated
     */
    BilateralExchangeActor createBilateralExchangeActor();

    /**
     * Returns a new object of class '<em>Test Data Set</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Test Data Set</em>'.
     * @generated
     */
    TestDataSet createTestDataSet();

    /**
     * Returns a new object of class '<em>VComp IEEE Type1</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>VComp IEEE Type1</em>'.
     * @generated
     */
    VCompIEEEType1 createVCompIEEEType1();

    /**
     * Returns a new object of class '<em>Usage Point Location</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Usage Point Location</em>'.
     * @generated
     */
    UsagePointLocation createUsagePointLocation();

    /**
     * Returns a new object of class '<em>Per Length Impedance</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Per Length Impedance</em>'.
     * @generated
     */
    PerLengthImpedance createPerLengthImpedance();

    /**
     * Returns a new object of class '<em>IEC61968CIM Version</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>IEC61968CIM Version</em>'.
     * @generated
     */
    IEC61968CIMVersion createIEC61968CIMVersion();

    /**
     * Returns a new object of class '<em>User Attribute</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>User Attribute</em>'.
     * @generated
     */
    UserAttribute createUserAttribute();

    /**
     * Returns a new object of class '<em>Service Category</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Service Category</em>'.
     * @generated
     */
    ServiceCategory createServiceCategory();

    /**
     * Returns a new object of class '<em>Alt Tie Meas</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Alt Tie Meas</em>'.
     * @generated
     */
    AltTieMeas createAltTieMeas();

    /**
     * Returns a new object of class '<em>DC Terminal</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>DC Terminal</em>'.
     * @generated
     */
    DCTerminal createDCTerminal();

    /**
     * Returns a new object of class '<em>Static Var Compensator</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Static Var Compensator</em>'.
     * @generated
     */
    StaticVarCompensator createStaticVarCompensator();

    /**
     * Returns a new object of class '<em>Gov Hydro PID</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Gov Hydro PID</em>'.
     * @generated
     */
    GovHydroPID createGovHydroPID();

    /**
     * Returns a new object of class '<em>Asset Analog</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Asset Analog</em>'.
     * @generated
     */
    AssetAnalog createAssetAnalog();

    /**
     * Returns a new object of class '<em>ACDC Converter</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>ACDC Converter</em>'.
     * @generated
     */
    ACDCConverter createACDCConverter();

    /**
     * Returns a new object of class '<em>Junction</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Junction</em>'.
     * @generated
     */
    Junction createJunction();

    /**
     * Returns a new object of class '<em>Gov Hydro2</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Gov Hydro2</em>'.
     * @generated
     */
    GovHydro2 createGovHydro2();

    /**
     * Returns a new object of class '<em>Gen ICompensation For Gen J</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Gen ICompensation For Gen J</em>'.
     * @generated
     */
    GenICompensationForGenJ createGenICompensationForGenJ();

    /**
     * Returns a new object of class '<em>Meter Reading</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Meter Reading</em>'.
     * @generated
     */
    MeterReading createMeterReading();

    /**
     * Returns a new object of class '<em>Voltage Level</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Voltage Level</em>'.
     * @generated
     */
    VoltageLevel createVoltageLevel();

    /**
     * Returns a new object of class '<em>Auxiliary Account</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Auxiliary Account</em>'.
     * @generated
     */
    AuxiliaryAccount createAuxiliaryAccount();

    /**
     * Returns a new object of class '<em>Bay</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Bay</em>'.
     * @generated
     */
    Bay createBay();

    /**
     * Returns a new object of class '<em>PSR Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>PSR Type</em>'.
     * @generated
     */
    PSRType createPSRType();

    /**
     * Returns a new object of class '<em>Load Generic Non Linear</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Load Generic Non Linear</em>'.
     * @generated
     */
    LoadGenericNonLinear createLoadGenericNonLinear();

    /**
     * Returns a new object of class '<em>Turbine Load Controller Dynamics</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Turbine Load Controller Dynamics</em>'.
     * @generated
     */
    TurbineLoadControllerDynamics createTurbineLoadControllerDynamics();

    /**
     * Returns a new object of class '<em>PFV Ar Controller Type1 User Defined</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>PFV Ar Controller Type1 User Defined</em>'.
     * @generated
     */
    PFVArControllerType1UserDefined createPFVArControllerType1UserDefined();

    /**
     * Returns a new object of class '<em>Exc AC3A</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Exc AC3A</em>'.
     * @generated
     */
    ExcAC3A createExcAC3A();

    /**
     * Returns a new object of class '<em>End Device Event Detail</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>End Device Event Detail</em>'.
     * @generated
     */
    EndDeviceEventDetail createEndDeviceEventDetail();

    /**
     * Returns a new object of class '<em>Asset Discrete</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Asset Discrete</em>'.
     * @generated
     */
    AssetDiscrete createAssetDiscrete();

    /**
     * Returns a new object of class '<em>Pss PTIST3</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Pss PTIST3</em>'.
     * @generated
     */
    PssPTIST3 createPssPTIST3();

    /**
     * Returns a new object of class '<em>Wind Plant Dynamics</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Wind Plant Dynamics</em>'.
     * @generated
     */
    WindPlantDynamics createWindPlantDynamics();

    /**
     * Returns a new object of class '<em>Exc IEEEDC1A</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Exc IEEEDC1A</em>'.
     * @generated
     */
    ExcIEEEDC1A createExcIEEEDC1A();

    /**
     * Returns a new object of class '<em>Operator</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Operator</em>'.
     * @generated
     */
    Operator createOperator();

    /**
     * Returns a new object of class '<em>Organisation</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Organisation</em>'.
     * @generated
     */
    Organisation createOrganisation();

    /**
     * Returns a new object of class '<em>Underexc Lim X2</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Underexc Lim X2</em>'.
     * @generated
     */
    UnderexcLimX2 createUnderexcLimX2();

    /**
     * Returns a new object of class '<em>Load Break Switch</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Load Break Switch</em>'.
     * @generated
     */
    LoadBreakSwitch createLoadBreakSwitch();

    /**
     * Returns a new object of class '<em>Phase Tap Changer Tabular</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Phase Tap Changer Tabular</em>'.
     * @generated
     */
    PhaseTapChangerTabular createPhaseTapChangerTabular();

    /**
     * Returns a new object of class '<em>ICCP Virtual Control Center</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>ICCP Virtual Control Center</em>'.
     * @generated
     */
    ICCPVirtualControlCenter createICCPVirtualControlCenter();

    /**
     * Returns a new object of class '<em>Equipment Fault</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Equipment Fault</em>'.
     * @generated
     */
    EquipmentFault createEquipmentFault();

    /**
     * Returns a new object of class '<em>Oil Analysis Moisture Analog</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Oil Analysis Moisture Analog</em>'.
     * @generated
     */
    OilAnalysisMoistureAnalog createOilAnalysisMoistureAnalog();

    /**
     * Returns a new object of class '<em>Connector</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Connector</em>'.
     * @generated
     */
    Connector createConnector();

    /**
     * Returns a new object of class '<em>Exc ST2A</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Exc ST2A</em>'.
     * @generated
     */
    ExcST2A createExcST2A();

    /**
     * Returns a new object of class '<em>Gov Steam1</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Gov Steam1</em>'.
     * @generated
     */
    GovSteam1 createGovSteam1();

    /**
     * Returns a new object of class '<em>Gov GASTWD</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Gov GASTWD</em>'.
     * @generated
     */
    GovGASTWD createGovGASTWD();

    /**
     * Returns a new object of class '<em>Transformer Test</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Transformer Test</em>'.
     * @generated
     */
    TransformerTest createTransformerTest();

    /**
     * Returns a new object of class '<em>Configuration Event</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Configuration Event</em>'.
     * @generated
     */
    ConfigurationEvent createConfigurationEvent();

    /**
     * Returns a new object of class '<em>Busbar Section</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Busbar Section</em>'.
     * @generated
     */
    BusbarSection createBusbarSection();

    /**
     * Returns a new object of class '<em>Wind Generating Unit</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Wind Generating Unit</em>'.
     * @generated
     */
    WindGeneratingUnit createWindGeneratingUnit();

    /**
     * Returns a new object of class '<em>Wire Position</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Wire Position</em>'.
     * @generated
     */
    WirePosition createWirePosition();

    /**
     * Returns a new object of class '<em>Contingency</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Contingency</em>'.
     * @generated
     */
    Contingency createContingency();

    /**
     * Returns a new object of class '<em>Non Conform Load</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Non Conform Load</em>'.
     * @generated
     */
    NonConformLoad createNonConformLoad();

    /**
     * Returns a new object of class '<em>Connectivity Node</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Connectivity Node</em>'.
     * @generated
     */
    ConnectivityNode createConnectivityNode();

    /**
     * Returns a new object of class '<em>Sv Status</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Sv Status</em>'.
     * @generated
     */
    SvStatus createSvStatus();

    /**
     * Returns a new object of class '<em>Work Asset</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Work Asset</em>'.
     * @generated
     */
    WorkAsset createWorkAsset();

    /**
     * Returns a new object of class '<em>Sv Shunt Compensator Sections</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Sv Shunt Compensator Sections</em>'.
     * @generated
     */
    SvShuntCompensatorSections createSvShuntCompensatorSections();

    /**
     * Returns a new object of class '<em>Vehicle</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Vehicle</em>'.
     * @generated
     */
    Vehicle createVehicle();

    /**
     * Returns a new object of class '<em>Exc AC4A</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Exc AC4A</em>'.
     * @generated
     */
    ExcAC4A createExcAC4A();

    /**
     * Returns a new object of class '<em>Topological Node</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Topological Node</em>'.
     * @generated
     */
    TopologicalNode createTopologicalNode();

    /**
     * Returns a new object of class '<em>Exc AC5A</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Exc AC5A</em>'.
     * @generated
     */
    ExcAC5A createExcAC5A();

    /**
     * Returns a new object of class '<em>Solar Generating Unit</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Solar Generating Unit</em>'.
     * @generated
     */
    SolarGeneratingUnit createSolarGeneratingUnit();

    /**
     * Returns a new object of class '<em>Power Electronics Wind Unit</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Power Electronics Wind Unit</em>'.
     * @generated
     */
    PowerElectronicsWindUnit createPowerElectronicsWindUnit();

    /**
     * Returns a new object of class '<em>Incident Hazard</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Incident Hazard</em>'.
     * @generated
     */
    IncidentHazard createIncidentHazard();

    /**
     * Returns a new object of class '<em>Series Compensator</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Series Compensator</em>'.
     * @generated
     */
    SeriesCompensator createSeriesCompensator();

    /**
     * Returns a new object of class '<em>Text Diagram Object</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Text Diagram Object</em>'.
     * @generated
     */
    TextDiagramObject createTextDiagramObject();

    /**
     * Returns a new object of class '<em>Wind Cont QPQU Lim IEC</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Wind Cont QPQU Lim IEC</em>'.
     * @generated
     */
    WindContQPQULimIEC createWindContQPQULimIEC();

    /**
     * Returns a new object of class '<em>Analog Control</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Analog Control</em>'.
     * @generated
     */
    AnalogControl createAnalogControl();

    /**
     * Returns a new object of class '<em>Gov Steam2</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Gov Steam2</em>'.
     * @generated
     */
    GovSteam2 createGovSteam2();

    /**
     * Returns a new object of class '<em>Remote Input Signal</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Remote Input Signal</em>'.
     * @generated
     */
    RemoteInputSignal createRemoteInputSignal();

    /**
     * Returns a new object of class '<em>Transformer Tank</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Transformer Tank</em>'.
     * @generated
     */
    TransformerTank createTransformerTank();

    /**
     * Returns a new object of class '<em>Accumulator Limit Set</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Accumulator Limit Set</em>'.
     * @generated
     */
    AccumulatorLimitSet createAccumulatorLimitSet();

    /**
     * Returns a new object of class '<em>Synchronous Machine</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Synchronous Machine</em>'.
     * @generated
     */
    SynchronousMachine createSynchronousMachine();

    /**
     * Returns a new object of class '<em>Protection Equipment</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Protection Equipment</em>'.
     * @generated
     */
    ProtectionEquipment createProtectionEquipment();

    /**
     * Returns a new object of class '<em>Exc AC1A</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Exc AC1A</em>'.
     * @generated
     */
    ExcAC1A createExcAC1A();

    /**
     * Returns a new object of class '<em>PFV Ar Type2 Common1</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>PFV Ar Type2 Common1</em>'.
     * @generated
     */
    PFVArType2Common1 createPFVArType2Common1();

    /**
     * Returns a new object of class '<em>Mech Load1</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Mech Load1</em>'.
     * @generated
     */
    MechLoad1 createMechLoad1();

    /**
     * Returns a new object of class '<em>Synchronous Machine Dynamics</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Synchronous Machine Dynamics</em>'.
     * @generated
     */
    SynchronousMachineDynamics createSynchronousMachineDynamics();

    /**
     * Returns a new object of class '<em>Curve</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Curve</em>'.
     * @generated
     */
    Curve createCurve();

    /**
     * Returns a new object of class '<em>Power System Stabilizer Dynamics</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Power System Stabilizer Dynamics</em>'.
     * @generated
     */
    PowerSystemStabilizerDynamics createPowerSystemStabilizerDynamics();

    /**
     * Returns a new object of class '<em>Reporting Group</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Reporting Group</em>'.
     * @generated
     */
    ReportingGroup createReportingGroup();

    /**
     * Returns a new object of class '<em>Change Set</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Change Set</em>'.
     * @generated
     */
    ChangeSet createChangeSet();

    /**
     * Returns a new object of class '<em>Fuel Allocation Schedule</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Fuel Allocation Schedule</em>'.
     * @generated
     */
    FuelAllocationSchedule createFuelAllocationSchedule();

    /**
     * Returns a new object of class '<em>Tape Shield Cable Info</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Tape Shield Cable Info</em>'.
     * @generated
     */
    TapeShieldCableInfo createTapeShieldCableInfo();

    /**
     * Returns a new object of class '<em>Voltage Adjuster User Defined</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Voltage Adjuster User Defined</em>'.
     * @generated
     */
    VoltageAdjusterUserDefined createVoltageAdjusterUserDefined();

    /**
     * Returns a new object of class '<em>IO Point</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>IO Point</em>'.
     * @generated
     */
    IOPoint createIOPoint();

    /**
     * Returns a new object of class '<em>Hydro Turbine</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Hydro Turbine</em>'.
     * @generated
     */
    HydroTurbine createHydroTurbine();

    /**
     * Returns a new object of class '<em>Transformer End Info</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Transformer End Info</em>'.
     * @generated
     */
    TransformerEndInfo createTransformerEndInfo();

    /**
     * Returns a new object of class '<em>Overexcitation Limiter Dynamics</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Overexcitation Limiter Dynamics</em>'.
     * @generated
     */
    OverexcitationLimiterDynamics createOverexcitationLimiterDynamics();

    /**
     * Returns a new object of class '<em>Wind Cont Rotor RIEC</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Wind Cont Rotor RIEC</em>'.
     * @generated
     */
    WindContRotorRIEC createWindContRotorRIEC();

    /**
     * Returns a new object of class '<em>Repair Item</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Repair Item</em>'.
     * @generated
     */
    RepairItem createRepairItem();

    /**
     * Returns a new object of class '<em>Per Length Phase Impedance</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Per Length Phase Impedance</em>'.
     * @generated
     */
    PerLengthPhaseImpedance createPerLengthPhaseImpedance();

    /**
     * Returns a new object of class '<em>Inflow Forecast</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Inflow Forecast</em>'.
     * @generated
     */
    InflowForecast createInflowForecast();

    /**
     * Returns a new object of class '<em>Ground Action</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Ground Action</em>'.
     * @generated
     */
    GroundAction createGroundAction();

    /**
     * Returns a new object of class '<em>Reservoir</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Reservoir</em>'.
     * @generated
     */
    Reservoir createReservoir();

    /**
     * Returns a new object of class '<em>Object Modification</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Object Modification</em>'.
     * @generated
     */
    ObjectModification createObjectModification();

    /**
     * Returns a new object of class '<em>Customer Account</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Customer Account</em>'.
     * @generated
     */
    CustomerAccount createCustomerAccount();

    /**
     * Returns a new object of class '<em>ICCPVCC</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>ICCPVCC</em>'.
     * @generated
     */
    ICCPVCC createICCPVCC();

    /**
     * Returns a new object of class '<em>Underexc Lim IEEE2</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Underexc Lim IEEE2</em>'.
     * @generated
     */
    UnderexcLimIEEE2 createUnderexcLimIEEE2();

    /**
     * Returns a new object of class '<em>BWR Steam Supply</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>BWR Steam Supply</em>'.
     * @generated
     */
    BWRSteamSupply createBWRSteamSupply();

    /**
     * Returns a new object of class '<em>Work</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Work</em>'.
     * @generated
     */
    Work createWork();

    /**
     * Returns a new object of class '<em>Repair Work Task</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Repair Work Task</em>'.
     * @generated
     */
    RepairWorkTask createRepairWorkTask();

    /**
     * Returns a new object of class '<em>Surge Arrester</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Surge Arrester</em>'.
     * @generated
     */
    SurgeArrester createSurgeArrester();

    /**
     * Returns a new object of class '<em>Exc PIC</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Exc PIC</em>'.
     * @generated
     */
    ExcPIC createExcPIC();

    /**
     * Returns a new object of class '<em>Field Safety Supervisor</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Field Safety Supervisor</em>'.
     * @generated
     */
    FieldSafetySupervisor createFieldSafetySupervisor();

    /**
     * Returns a new object of class '<em>Energy Source Phase</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Energy Source Phase</em>'.
     * @generated
     */
    EnergySourcePhase createEnergySourcePhase();

    /**
     * Returns a new object of class '<em>Author</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Author</em>'.
     * @generated
     */
    Author createAuthor();

    /**
     * Returns a new object of class '<em>Branch Group</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Branch Group</em>'.
     * @generated
     */
    BranchGroup createBranchGroup();

    /**
     * Returns a new object of class '<em>DC Topological Island</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>DC Topological Island</em>'.
     * @generated
     */
    DCTopologicalIsland createDCTopologicalIsland();

    /**
     * Returns a new object of class '<em>Apparent Power Limit</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Apparent Power Limit</em>'.
     * @generated
     */
    ApparentPowerLimit createApparentPowerLimit();

    /**
     * Returns a new object of class '<em>Fault</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Fault</em>'.
     * @generated
     */
    Fault createFault();

    /**
     * Returns a new object of class '<em>Recloser</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Recloser</em>'.
     * @generated
     */
    Recloser createRecloser();

    /**
     * Returns a new object of class '<em>Control Area Generating Unit</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Control Area Generating Unit</em>'.
     * @generated
     */
    ControlAreaGeneratingUnit createControlAreaGeneratingUnit();

    /**
     * Returns a new object of class '<em>Exc AVR2</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Exc AVR2</em>'.
     * @generated
     */
    ExcAVR2 createExcAVR2();

    /**
     * Returns a new object of class '<em>Turb LCFB1</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Turb LCFB1</em>'.
     * @generated
     */
    TurbLCFB1 createTurbLCFB1();

    /**
     * Returns a new object of class '<em>DC Line</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>DC Line</em>'.
     * @generated
     */
    DCLine createDCLine();

    /**
     * Returns a new object of class '<em>Equipment</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Equipment</em>'.
     * @generated
     */
    Equipment createEquipment();

    /**
     * Returns a new object of class '<em>Start Main Fuel Curve</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Start Main Fuel Curve</em>'.
     * @generated
     */
    StartMainFuelCurve createStartMainFuelCurve();

    /**
     * Returns a new object of class '<em>Cut</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Cut</em>'.
     * @generated
     */
    Cut createCut();

    /**
     * Returns a new object of class '<em>Rotating Machine</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Rotating Machine</em>'.
     * @generated
     */
    RotatingMachine createRotatingMachine();

    /**
     * Returns a new object of class '<em>Exc ELIN1</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Exc ELIN1</em>'.
     * @generated
     */
    ExcELIN1 createExcELIN1();

    /**
     * Returns a new object of class '<em>Procedure</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Procedure</em>'.
     * @generated
     */
    Procedure createProcedure();

    /**
     * Returns a new object of class '<em>Non Conform Load Schedule</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Non Conform Load Schedule</em>'.
     * @generated
     */
    NonConformLoadSchedule createNonConformLoadSchedule();

    /**
     * Returns a new object of class '<em>PWR Steam Supply</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>PWR Steam Supply</em>'.
     * @generated
     */
    PWRSteamSupply createPWRSteamSupply();

    /**
     * Returns a new object of class '<em>Target Level Schedule</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Target Level Schedule</em>'.
     * @generated
     */
    TargetLevelSchedule createTargetLevelSchedule();

    /**
     * Returns a new object of class '<em>CAES Plant</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>CAES Plant</em>'.
     * @generated
     */
    CAESPlant createCAESPlant();

    /**
     * Returns a new object of class '<em>Wind Plant Freq Pcontrol IEC</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Wind Plant Freq Pcontrol IEC</em>'.
     * @generated
     */
    WindPlantFreqPcontrolIEC createWindPlantFreqPcontrolIEC();

    /**
     * Returns a new object of class '<em>Wire Phase Info</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Wire Phase Info</em>'.
     * @generated
     */
    WirePhaseInfo createWirePhaseInfo();

    /**
     * Returns a new object of class '<em>Pss WECC</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Pss WECC</em>'.
     * @generated
     */
    PssWECC createPssWECC();

    /**
     * Returns a new object of class '<em>Season Day Type Schedule</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Season Day Type Schedule</em>'.
     * @generated
     */
    SeasonDayTypeSchedule createSeasonDayTypeSchedule();

    /**
     * Returns a new object of class '<em>Pss SK</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Pss SK</em>'.
     * @generated
     */
    PssSK createPssSK();

    /**
     * Returns a new object of class '<em>Value To Alias</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Value To Alias</em>'.
     * @generated
     */
    ValueToAlias createValueToAlias();

    /**
     * Returns a new object of class '<em>End Device Event</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>End Device Event</em>'.
     * @generated
     */
    EndDeviceEvent createEndDeviceEvent();

    /**
     * Returns a new object of class '<em>Wind Type3or4 User Defined</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Wind Type3or4 User Defined</em>'.
     * @generated
     */
    WindType3or4UserDefined createWindType3or4UserDefined();

    /**
     * Returns a new object of class '<em>Thermal Generating Unit</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Thermal Generating Unit</em>'.
     * @generated
     */
    ThermalGeneratingUnit createThermalGeneratingUnit();

    /**
     * Returns a new object of class '<em>Profile</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Profile</em>'.
     * @generated
     */
    Profile createProfile();

    /**
     * Returns a new object of class '<em>Appointment</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Appointment</em>'.
     * @generated
     */
    Appointment createAppointment();

    /**
     * Returns a new object of class '<em>Specimen</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Specimen</em>'.
     * @generated
     */
    Specimen createSpecimen();

    /**
     * Returns a new object of class '<em>String Measurement Value</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>String Measurement Value</em>'.
     * @generated
     */
    StringMeasurementValue createStringMeasurementValue();

    /**
     * Returns a new object of class '<em>Wind Turbine Type3 IEC</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Wind Turbine Type3 IEC</em>'.
     * @generated
     */
    WindTurbineType3IEC createWindTurbineType3IEC();

    /**
     * Returns a new object of class '<em>Remote Unit</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Remote Unit</em>'.
     * @generated
     */
    RemoteUnit createRemoteUnit();

    /**
     * Returns a new object of class '<em>Gen Unit Op Schedule</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Gen Unit Op Schedule</em>'.
     * @generated
     */
    GenUnitOpSchedule createGenUnitOpSchedule();

    /**
     * Returns a new object of class '<em>Sv Voltage</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Sv Voltage</em>'.
     * @generated
     */
    SvVoltage createSvVoltage();

    /**
     * Returns a new object of class '<em>Cogeneration Plant</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Cogeneration Plant</em>'.
     * @generated
     */
    CogenerationPlant createCogenerationPlant();

    /**
     * Returns a new object of class '<em>Discrete Value</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Discrete Value</em>'.
     * @generated
     */
    DiscreteValue createDiscreteValue();

    /**
     * Returns a new object of class '<em>CT Temp Active Power Curve</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>CT Temp Active Power Curve</em>'.
     * @generated
     */
    CTTempActivePowerCurve createCTTempActivePowerCurve();

    /**
     * Returns a new object of class '<em>Energy Consumer Phase</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Energy Consumer Phase</em>'.
     * @generated
     */
    EnergyConsumerPhase createEnergyConsumerPhase();

    /**
     * Returns a new object of class '<em>Exc AVR1</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Exc AVR1</em>'.
     * @generated
     */
    ExcAVR1 createExcAVR1();

    /**
     * Returns a new object of class '<em>Crew</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Crew</em>'.
     * @generated
     */
    Crew createCrew();

    /**
     * Returns a new object of class '<em>Wind Pitch Cont Power IEC</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Wind Pitch Cont Power IEC</em>'.
     * @generated
     */
    WindPitchContPowerIEC createWindPitchContPowerIEC();

    /**
     * Returns a new object of class '<em>Heat Input Curve</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Heat Input Curve</em>'.
     * @generated
     */
    HeatInputCurve createHeatInputCurve();

    /**
     * Returns a new object of class '<em>Tender</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Tender</em>'.
     * @generated
     */
    Tender createTender();

    /**
     * Returns a new object of class '<em>Air Compressor</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Air Compressor</em>'.
     * @generated
     */
    AirCompressor createAirCompressor();

    /**
     * Returns a new object of class '<em>Metrology Requirement</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Metrology Requirement</em>'.
     * @generated
     */
    MetrologyRequirement createMetrologyRequirement();

    /**
     * Returns a new object of class '<em>Linear Shunt Compensator</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Linear Shunt Compensator</em>'.
     * @generated
     */
    LinearShuntCompensator createLinearShuntCompensator();

    /**
     * Returns a new object of class '<em>Issuer</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Issuer</em>'.
     * @generated
     */
    Issuer createIssuer();

    /**
     * Returns a new object of class '<em>Clearance Action</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Clearance Action</em>'.
     * @generated
     */
    ClearanceAction createClearanceAction();

    /**
     * Returns a new object of class '<em>IO Point Source</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>IO Point Source</em>'.
     * @generated
     */
    IOPointSource createIOPointSource();

    /**
     * Returns a new object of class '<em>Reactive Capability Curve</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Reactive Capability Curve</em>'.
     * @generated
     */
    ReactiveCapabilityCurve createReactiveCapabilityCurve();

    /**
     * Returns a new object of class '<em>Sv Tap Step</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Sv Tap Step</em>'.
     * @generated
     */
    SvTapStep createSvTapStep();

    /**
     * Returns a new object of class '<em>Gov Steam CC</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Gov Steam CC</em>'.
     * @generated
     */
    GovSteamCC createGovSteamCC();

    /**
     * Returns a new object of class '<em>Switch Operation Summary</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Switch Operation Summary</em>'.
     * @generated
     */
    SwitchOperationSummary createSwitchOperationSummary();

    /**
     * Returns a new object of class '<em>Scheduled Event Data</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Scheduled Event Data</em>'.
     * @generated
     */
    ScheduledEventData createScheduledEventData();

    /**
     * Returns a new object of class '<em>DER Group Forecast</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>DER Group Forecast</em>'.
     * @generated
     */
    DERGroupForecast createDERGroupForecast();

    /**
     * Returns a new object of class '<em>Branch Group Terminal</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Branch Group Terminal</em>'.
     * @generated
     */
    BranchGroupTerminal createBranchGroupTerminal();

    /**
     * Returns a new object of class '<em>Shift</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Shift</em>'.
     * @generated
     */
    Shift createShift();

    /**
     * Returns a new object of class '<em>Phase Tap Changer Table</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Phase Tap Changer Table</em>'.
     * @generated
     */
    PhaseTapChangerTable createPhaseTapChangerTable();

    /**
     * Returns a new object of class '<em>Overexc Lim X2</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Overexc Lim X2</em>'.
     * @generated
     */
    OverexcLimX2 createOverexcLimX2();

    /**
     * Returns a new object of class '<em>Demand Response Program</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Demand Response Program</em>'.
     * @generated
     */
    DemandResponseProgram createDemandResponseProgram();

    /**
     * Returns a new object of class '<em>Person Role</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Person Role</em>'.
     * @generated
     */
    PersonRole createPersonRole();

    /**
     * Returns a new object of class '<em>Oil Analysis Particle Discrete</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Oil Analysis Particle Discrete</em>'.
     * @generated
     */
    OilAnalysisParticleDiscrete createOilAnalysisParticleDiscrete();

    /**
     * Returns a new object of class '<em>Gov GAST4</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Gov GAST4</em>'.
     * @generated
     */
    GovGAST4 createGovGAST4();

    /**
     * Returns a new object of class '<em>Load Composite</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Load Composite</em>'.
     * @generated
     */
    LoadComposite createLoadComposite();

    /**
     * Returns a new object of class '<em>Equivalent Injection</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Equivalent Injection</em>'.
     * @generated
     */
    EquivalentInjection createEquivalentInjection();

    /**
     * Returns a new object of class '<em>Document Person Role</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Document Person Role</em>'.
     * @generated
     */
    DocumentPersonRole createDocumentPersonRole();

    /**
     * Returns a new object of class '<em>Identified Object</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Identified Object</em>'.
     * @generated
     */
    IdentifiedObject createIdentifiedObject();

    /**
     * Returns a new object of class '<em>Pss IEEE3B</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Pss IEEE3B</em>'.
     * @generated
     */
    PssIEEE3B createPssIEEE3B();

    /**
     * Returns a new object of class '<em>Transaction</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Transaction</em>'.
     * @generated
     */
    Transaction createTransaction();

    /**
     * Returns a new object of class '<em>Statistical Calculation</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Statistical Calculation</em>'.
     * @generated
     */
    StatisticalCalculation createStatisticalCalculation();

    /**
     * Returns a new object of class '<em>Meter Multiplier</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Meter Multiplier</em>'.
     * @generated
     */
    MeterMultiplier createMeterMultiplier();

    /**
     * Returns a new object of class '<em>Internal Location</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Internal Location</em>'.
     * @generated
     */
    InternalLocation createInternalLocation();

    /**
     * Returns a new object of class '<em>Bus Name Marker</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Bus Name Marker</em>'.
     * @generated
     */
    BusNameMarker createBusNameMarker();

    /**
     * Returns a new object of class '<em>Shunt Compensator Phase</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Shunt Compensator Phase</em>'.
     * @generated
     */
    ShuntCompensatorPhase createShuntCompensatorPhase();

    /**
     * Returns a new object of class '<em>Sv Power Flow</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Sv Power Flow</em>'.
     * @generated
     */
    SvPowerFlow createSvPowerFlow();

    /**
     * Returns a new object of class '<em>Drum Boiler</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Drum Boiler</em>'.
     * @generated
     */
    DrumBoiler createDrumBoiler();

    /**
     * Returns a new object of class '<em>Asynchronous Machine Equivalent Circuit</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Asynchronous Machine Equivalent Circuit</em>'.
     * @generated
     */
    AsynchronousMachineEquivalentCircuit createAsynchronousMachineEquivalentCircuit();

    /**
     * Returns a new object of class '<em>Wind Cont QIEC</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Wind Cont QIEC</em>'.
     * @generated
     */
    WindContQIEC createWindContQIEC();

    /**
     * Returns a new object of class '<em>PSR Event</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>PSR Event</em>'.
     * @generated
     */
    PSREvent createPSREvent();

    /**
     * Returns a new object of class '<em>DER Group Forecast Request</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>DER Group Forecast Request</em>'.
     * @generated
     */
    DERGroupForecastRequest createDERGroupForecastRequest();

    /**
     * Returns a new object of class '<em>Transformer Core Admittance</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Transformer Core Admittance</em>'.
     * @generated
     */
    TransformerCoreAdmittance createTransformerCoreAdmittance();

    /**
     * Returns a new object of class '<em>Remote Control</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Remote Control</em>'.
     * @generated
     */
    RemoteControl createRemoteControl();

    /**
     * Returns a new object of class '<em>Mechanical Load User Defined</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Mechanical Load User Defined</em>'.
     * @generated
     */
    MechanicalLoadUserDefined createMechanicalLoadUserDefined();

    /**
     * Returns a new object of class '<em>Sv Injection</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Sv Injection</em>'.
     * @generated
     */
    SvInjection createSvInjection();

    /**
     * Returns a new object of class '<em>Fault Cause Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Fault Cause Type</em>'.
     * @generated
     */
    FaultCauseType createFaultCauseType();

    /**
     * Returns a new object of class '<em>Photo Voltaic Unit</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Photo Voltaic Unit</em>'.
     * @generated
     */
    PhotoVoltaicUnit createPhotoVoltaicUnit();

    /**
     * Returns a new object of class '<em>Gov Steam SGO</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Gov Steam SGO</em>'.
     * @generated
     */
    GovSteamSGO createGovSteamSGO();

    /**
     * Returns a new object of class '<em>Interval Reading</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Interval Reading</em>'.
     * @generated
     */
    IntervalReading createIntervalReading();

    /**
     * Returns a new object of class '<em>Switching Step Group</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Switching Step Group</em>'.
     * @generated
     */
    SwitchingStepGroup createSwitchingStepGroup();

    /**
     * Returns a new object of class '<em>Exc IEEEAC7B</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Exc IEEEAC7B</em>'.
     * @generated
     */
    ExcIEEEAC7B createExcIEEEAC7B();

    /**
     * Returns a new object of class '<em>Pss2 ST</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Pss2 ST</em>'.
     * @generated
     */
    Pss2ST createPss2ST();

    /**
     * Returns a new object of class '<em>Accumulator Limit</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Accumulator Limit</em>'.
     * @generated
     */
    AccumulatorLimit createAccumulatorLimit();

    /**
     * Returns a new object of class '<em>Exc AC6A</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Exc AC6A</em>'.
     * @generated
     */
    ExcAC6A createExcAC6A();

    /**
     * Returns a new object of class '<em>Switch Action</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Switch Action</em>'.
     * @generated
     */
    SwitchAction createSwitchAction();

    /**
     * Returns a new object of class '<em>Wire Assembly Info</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Wire Assembly Info</em>'.
     * @generated
     */
    WireAssemblyInfo createWireAssemblyInfo();

    /**
     * Returns a new object of class '<em>Measurement Value</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Measurement Value</em>'.
     * @generated
     */
    MeasurementValue createMeasurementValue();

    /**
     * Returns a new object of class '<em>Calculation Method Hierarchy</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Calculation Method Hierarchy</em>'.
     * @generated
     */
    CalculationMethodHierarchy createCalculationMethodHierarchy();

    /**
     * Returns a new object of class '<em>DC Base Terminal</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>DC Base Terminal</em>'.
     * @generated
     */
    DCBaseTerminal createDCBaseTerminal();

    /**
     * Returns a new object of class '<em>Voltage Compensator Dynamics</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Voltage Compensator Dynamics</em>'.
     * @generated
     */
    VoltageCompensatorDynamics createVoltageCompensatorDynamics();

    /**
     * Returns a new object of class '<em>Transformer Star Impedance</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Transformer Star Impedance</em>'.
     * @generated
     */
    TransformerStarImpedance createTransformerStarImpedance();

    /**
     * Returns a new object of class '<em>TCP Access Point</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>TCP Access Point</em>'.
     * @generated
     */
    TCPAccessPoint createTCPAccessPoint();

    /**
     * Returns a new object of class '<em>Connect Disconnect Function</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Connect Disconnect Function</em>'.
     * @generated
     */
    ConnectDisconnectFunction createConnectDisconnectFunction();

    /**
     * Returns a new object of class '<em>ICCP Provided Point</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>ICCP Provided Point</em>'.
     * @generated
     */
    ICCPProvidedPoint createICCPProvidedPoint();

    /**
     * Returns a new object of class '<em>Protected Switch</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Protected Switch</em>'.
     * @generated
     */
    ProtectedSwitch createProtectedSwitch();

    /**
     * Returns a new object of class '<em>Load Response Characteristic</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Load Response Characteristic</em>'.
     * @generated
     */
    LoadResponseCharacteristic createLoadResponseCharacteristic();

    /**
     * Returns a new object of class '<em>Service Supplier</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Service Supplier</em>'.
     * @generated
     */
    ServiceSupplier createServiceSupplier();

    /**
     * Returns a new object of class '<em>Cashier</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Cashier</em>'.
     * @generated
     */
    Cashier createCashier();

    /**
     * Returns a new object of class '<em>Fuse</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Fuse</em>'.
     * @generated
     */
    Fuse createFuse();

    /**
     * Returns a new object of class '<em>Wind Aero One Dim IEC</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Wind Aero One Dim IEC</em>'.
     * @generated
     */
    WindAeroOneDimIEC createWindAeroOneDimIEC();

    /**
     * Returns a new object of class '<em>Gov Hydro3</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Gov Hydro3</em>'.
     * @generated
     */
    GovHydro3 createGovHydro3();

    /**
     * Returns a new object of class '<em>Exc AVR7</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Exc AVR7</em>'.
     * @generated
     */
    ExcAVR7 createExcAVR7();

    /**
     * Returns a new object of class '<em>Start Ign Fuel Curve</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Start Ign Fuel Curve</em>'.
     * @generated
     */
    StartIgnFuelCurve createStartIgnFuelCurve();

    /**
     * Returns a new object of class '<em>Station Supply</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Station Supply</em>'.
     * @generated
     */
    StationSupply createStationSupply();

    /**
     * Returns a new object of class '<em>Non Conform Load Group</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Non Conform Load Group</em>'.
     * @generated
     */
    NonConformLoadGroup createNonConformLoadGroup();

    /**
     * Returns a new object of class '<em>Data Set Member</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Data Set Member</em>'.
     * @generated
     */
    DataSetMember createDataSetMember();

    /**
     * Returns a new object of class '<em>DC Disconnector</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>DC Disconnector</em>'.
     * @generated
     */
    DCDisconnector createDCDisconnector();

    /**
     * Returns a new object of class '<em>Exc OEX3T</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Exc OEX3T</em>'.
     * @generated
     */
    ExcOEX3T createExcOEX3T();

    /**
     * Returns a new object of class '<em>Exc DC1A</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Exc DC1A</em>'.
     * @generated
     */
    ExcDC1A createExcDC1A();

    /**
     * Returns a new object of class '<em>Shutdown Curve</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Shutdown Curve</em>'.
     * @generated
     */
    ShutdownCurve createShutdownCurve();

    /**
     * Returns a new object of class '<em>Wind Gen Type3a IEC</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Wind Gen Type3a IEC</em>'.
     * @generated
     */
    WindGenType3aIEC createWindGenType3aIEC();

    /**
     * Returns a new object of class '<em>Test Standard</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Test Standard</em>'.
     * @generated
     */
    TestStandard createTestStandard();

    /**
     * Returns a new object of class '<em>Curve Data</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Curve Data</em>'.
     * @generated
     */
    CurveData createCurveData();

    /**
     * Returns a new object of class '<em>Subcritical</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Subcritical</em>'.
     * @generated
     */
    Subcritical createSubcritical();

    /**
     * Returns a new object of class '<em>Phase Tap Changer</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Phase Tap Changer</em>'.
     * @generated
     */
    PhaseTapChanger createPhaseTapChanger();

    /**
     * Returns a new object of class '<em>PFV Ar Controller Type2 User Defined</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>PFV Ar Controller Type2 User Defined</em>'.
     * @generated
     */
    PFVArControllerType2UserDefined createPFVArControllerType2UserDefined();

    /**
     * Returns a new object of class '<em>Phase Tap Changer Non Linear</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Phase Tap Changer Non Linear</em>'.
     * @generated
     */
    PhaseTapChangerNonLinear createPhaseTapChangerNonLinear();

    /**
     * Returns a new object of class '<em>DC Ground</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>DC Ground</em>'.
     * @generated
     */
    DCGround createDCGround();

    /**
     * Returns a new object of class '<em>Line Fault</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Line Fault</em>'.
     * @generated
     */
    LineFault createLineFault();

    /**
     * Returns a new object of class '<em>Voltage Compensator User Defined</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Voltage Compensator User Defined</em>'.
     * @generated
     */
    VoltageCompensatorUserDefined createVoltageCompensatorUserDefined();

    /**
     * Returns a new object of class '<em>External Network Injection</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>External Network Injection</em>'.
     * @generated
     */
    ExternalNetworkInjection createExternalNetworkInjection();

    /**
     * Returns a new object of class '<em>Wave Trap</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Wave Trap</em>'.
     * @generated
     */
    WaveTrap createWaveTrap();

    /**
     * Returns a new object of class '<em>Equivalent Equipment</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Equivalent Equipment</em>'.
     * @generated
     */
    EquivalentEquipment createEquivalentEquipment();

    /**
     * Returns a new object of class '<em>Object Reverse Modification</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Object Reverse Modification</em>'.
     * @generated
     */
    ObjectReverseModification createObjectReverseModification();

    /**
     * Returns a new object of class '<em>Tap Schedule</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Tap Schedule</em>'.
     * @generated
     */
    TapSchedule createTapSchedule();

    /**
     * Returns a new object of class '<em>Exc ANS</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Exc ANS</em>'.
     * @generated
     */
    ExcANS createExcANS();

    /**
     * Returns a new object of class '<em>Tap Changer Control</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Tap Changer Control</em>'.
     * @generated
     */
    TapChangerControl createTapChangerControl();

    /**
     * Returns a new object of class '<em>Gov Hydro DD</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Gov Hydro DD</em>'.
     * @generated
     */
    GovHydroDD createGovHydroDD();

    /**
     * Returns a new object of class '<em>Load Dynamics</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Load Dynamics</em>'.
     * @generated
     */
    LoadDynamics createLoadDynamics();

    /**
     * Returns a new object of class '<em>Exc ST7B</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Exc ST7B</em>'.
     * @generated
     */
    ExcST7B createExcST7B();

    /**
     * Returns a new object of class '<em>Hydro Generating Efficiency Curve</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Hydro Generating Efficiency Curve</em>'.
     * @generated
     */
    HydroGeneratingEfficiencyCurve createHydroGeneratingEfficiencyCurve();

    /**
     * Returns a new object of class '<em>Penstock Loss Curve</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Penstock Loss Curve</em>'.
     * @generated
     */
    PenstockLossCurve createPenstockLossCurve();

    /**
     * Returns a new object of class '<em>Energy Source Action</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Energy Source Action</em>'.
     * @generated
     */
    EnergySourceAction createEnergySourceAction();

    /**
     * Returns a new object of class '<em>Hydro Power Plant</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Hydro Power Plant</em>'.
     * @generated
     */
    HydroPowerPlant createHydroPowerPlant();

    /**
     * Returns a new object of class '<em>Manufacturer</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Manufacturer</em>'.
     * @generated
     */
    Manufacturer createManufacturer();

    /**
     * Returns a new object of class '<em>Turbine Load Controller User Defined</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Turbine Load Controller User Defined</em>'.
     * @generated
     */
    TurbineLoadControllerUserDefined createTurbineLoadControllerUserDefined();

    /**
     * Returns a new object of class '<em>Pending Calculation</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Pending Calculation</em>'.
     * @generated
     */
    PendingCalculation createPendingCalculation();

    /**
     * Returns a new object of class '<em>Bushing Info</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Bushing Info</em>'.
     * @generated
     */
    BushingInfo createBushingInfo();

    /**
     * Returns a new object of class '<em>Exc ST4B</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Exc ST4B</em>'.
     * @generated
     */
    ExcST4B createExcST4B();

    /**
     * Returns a new object of class '<em>Asset Test Sample Taker</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Asset Test Sample Taker</em>'.
     * @generated
     */
    AssetTestSampleTaker createAssetTestSampleTaker();

    /**
     * Returns a new object of class '<em>Level Vs Volume Curve</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Level Vs Volume Curve</em>'.
     * @generated
     */
    LevelVsVolumeCurve createLevelVsVolumeCurve();

    /**
     * Returns a new object of class '<em>Phase Tap Changer Linear</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Phase Tap Changer Linear</em>'.
     * @generated
     */
    PhaseTapChangerLinear createPhaseTapChangerLinear();

    /**
     * Returns a new object of class '<em>Diagram</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Diagram</em>'.
     * @generated
     */
    Diagram createDiagram();

    /**
     * Returns a new object of class '<em>Reading Quality Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Reading Quality Type</em>'.
     * @generated
     */
    ReadingQualityType createReadingQualityType();

    /**
     * Returns a new object of class '<em>Com Module</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Com Module</em>'.
     * @generated
     */
    ComModule createComModule();

    /**
     * Returns a new object of class '<em>Accumulator Reset</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Accumulator Reset</em>'.
     * @generated
     */
    AccumulatorReset createAccumulatorReset();

    /**
     * Returns a new object of class '<em>Tool</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Tool</em>'.
     * @generated
     */
    Tool createTool();

    /**
     * Returns a new object of class '<em>Command</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Command</em>'.
     * @generated
     */
    Command createCommand();

    /**
     * Returns a new object of class '<em>Exc BBC</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Exc BBC</em>'.
     * @generated
     */
    ExcBBC createExcBBC();

    /**
     * Returns a new object of class '<em>Discontinuous Excitation Control User Defined</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Discontinuous Excitation Control User Defined</em>'.
     * @generated
     */
    DiscontinuousExcitationControlUserDefined createDiscontinuousExcitationControlUserDefined();

    /**
     * Returns a new object of class '<em>Meter Work Task</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Meter Work Task</em>'.
     * @generated
     */
    MeterWorkTask createMeterWorkTask();

    /**
     * Returns a new object of class '<em>Geographical Region</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Geographical Region</em>'.
     * @generated
     */
    GeographicalRegion createGeographicalRegion();

    /**
     * Returns a new object of class '<em>Pss SB4</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Pss SB4</em>'.
     * @generated
     */
    PssSB4 createPssSB4();

    /**
     * Returns a new object of class '<em>Load Motor</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Load Motor</em>'.
     * @generated
     */
    LoadMotor createLoadMotor();

    /**
     * Returns a new object of class '<em>DC Line Segment</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>DC Line Segment</em>'.
     * @generated
     */
    DCLineSegment createDCLineSegment();

    /**
     * Returns a new object of class '<em>PFV Ar Type2 IEEEPF Controller</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>PFV Ar Type2 IEEEPF Controller</em>'.
     * @generated
     */
    PFVArType2IEEEPFController createPFVArType2IEEEPFController();

    /**
     * Returns a new object of class '<em>PFV Ar Type2 IEEEV Ar Controller</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>PFV Ar Type2 IEEEV Ar Controller</em>'.
     * @generated
     */
    PFVArType2IEEEVArController createPFVArType2IEEEVArController();

    /**
     * Returns a new object of class '<em>Cashier Shift</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Cashier Shift</em>'.
     * @generated
     */
    CashierShift createCashierShift();

    /**
     * Returns a new object of class '<em>Startup Model</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Startup Model</em>'.
     * @generated
     */
    StartupModel createStartupModel();

    /**
     * Returns a new object of class '<em>Analog</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Analog</em>'.
     * @generated
     */
    Analog createAnalog();

    /**
     * Returns a new object of class '<em>Remote Point</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Remote Point</em>'.
     * @generated
     */
    RemotePoint createRemotePoint();

    /**
     * Returns a new object of class '<em>DC Shunt</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>DC Shunt</em>'.
     * @generated
     */
    DCShunt createDCShunt();

    /**
     * Returns a new object of class '<em>Voltage Limit</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Voltage Limit</em>'.
     * @generated
     */
    VoltageLimit createVoltageLimit();

    /**
     * Returns a new object of class '<em>DC Converter Unit</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>DC Converter Unit</em>'.
     * @generated
     */
    DCConverterUnit createDCConverterUnit();

    /**
     * Returns a new object of class '<em>DC Breaker</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>DC Breaker</em>'.
     * @generated
     */
    DCBreaker createDCBreaker();

    /**
     * Returns a new object of class '<em>Cabinet</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Cabinet</em>'.
     * @generated
     */
    Cabinet createCabinet();

    /**
     * Returns a new object of class '<em>Synchronous Machine Simplified</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Synchronous Machine Simplified</em>'.
     * @generated
     */
    SynchronousMachineSimplified createSynchronousMachineSimplified();

    /**
     * Returns a new object of class '<em>Pss ELIN2</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Pss ELIN2</em>'.
     * @generated
     */
    PssELIN2 createPssELIN2();

    /**
     * Returns a new object of class '<em>Gov Steam FV4</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Gov Steam FV4</em>'.
     * @generated
     */
    GovSteamFV4 createGovSteamFV4();

    /**
     * Returns a new object of class '<em>Asset Test Lab</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Asset Test Lab</em>'.
     * @generated
     */
    AssetTestLab createAssetTestLab();

    /**
     * Returns a new object of class '<em>Asset Temperature Pressure Analog</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Asset Temperature Pressure Analog</em>'.
     * @generated
     */
    AssetTemperaturePressureAnalog createAssetTemperaturePressureAnalog();

    /**
     * Returns a new object of class '<em>Proprietary Parameter Dynamics</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Proprietary Parameter Dynamics</em>'.
     * @generated
     */
    ProprietaryParameterDynamics createProprietaryParameterDynamics();

    /**
     * Returns a new object of class '<em>Base Frequency</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Base Frequency</em>'.
     * @generated
     */
    BaseFrequency createBaseFrequency();

    /**
     * Returns a new object of class '<em>Maintenance Location</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Maintenance Location</em>'.
     * @generated
     */
    MaintenanceLocation createMaintenanceLocation();

    /**
     * Returns a new object of class '<em>Raise Lower Command</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Raise Lower Command</em>'.
     * @generated
     */
    RaiseLowerCommand createRaiseLowerCommand();

    /**
     * Returns a new object of class '<em>Exc ELIN2</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Exc ELIN2</em>'.
     * @generated
     */
    ExcELIN2 createExcELIN2();

    /**
     * Returns a new object of class '<em>Bilateral Exchange Agreement</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Bilateral Exchange Agreement</em>'.
     * @generated
     */
    BilateralExchangeAgreement createBilateralExchangeAgreement();

    /**
     * Returns a new object of class '<em>Wind Plant User Defined</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Wind Plant User Defined</em>'.
     * @generated
     */
    WindPlantUserDefined createWindPlantUserDefined();

    /**
     * Returns a new object of class '<em>Gov Hydro Francis</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Gov Hydro Francis</em>'.
     * @generated
     */
    GovHydroFrancis createGovHydroFrancis();

    /**
     * Returns a new object of class '<em>Wind Cont PType4b IEC</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Wind Cont PType4b IEC</em>'.
     * @generated
     */
    WindContPType4bIEC createWindContPType4bIEC();

    /**
     * Returns a new object of class '<em>Conductor</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Conductor</em>'.
     * @generated
     */
    Conductor createConductor();

    /**
     * Returns a new object of class '<em>Frequency Converter</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Frequency Converter</em>'.
     * @generated
     */
    FrequencyConverter createFrequencyConverter();

    /**
     * Returns a new object of class '<em>Exc IEEEAC2A</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Exc IEEEAC2A</em>'.
     * @generated
     */
    ExcIEEEAC2A createExcIEEEAC2A();

    /**
     * Returns a new object of class '<em>Exc IEEEST3A</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Exc IEEEST3A</em>'.
     * @generated
     */
    ExcIEEEST3A createExcIEEEST3A();

    /**
     * Returns a new object of class '<em>Pss1</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Pss1</em>'.
     * @generated
     */
    Pss1 createPss1();

    /**
     * Returns a new object of class '<em>Tag Action</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Tag Action</em>'.
     * @generated
     */
    TagAction createTagAction();

    /**
     * Returns a new object of class '<em>Measurement Value Quality</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Measurement Value Quality</em>'.
     * @generated
     */
    MeasurementValueQuality createMeasurementValueQuality();

    /**
     * Returns a new object of class '<em>Transactor</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Transactor</em>'.
     * @generated
     */
    Transactor createTransactor();

    /**
     * Returns a new object of class '<em>Analog Limit Set</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Analog Limit Set</em>'.
     * @generated
     */
    AnalogLimitSet createAnalogLimitSet();

    /**
     * Returns a new object of class '<em>Merchant Account</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Merchant Account</em>'.
     * @generated
     */
    MerchantAccount createMerchantAccount();

    /**
     * Returns a new object of class '<em>Object Creation</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Object Creation</em>'.
     * @generated
     */
    ObjectCreation createObjectCreation();

    /**
     * Returns a new object of class '<em>Supercritical</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Supercritical</em>'.
     * @generated
     */
    Supercritical createSupercritical();

    /**
     * Returns a new object of class '<em>Com Media</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Com Media</em>'.
     * @generated
     */
    ComMedia createComMedia();

    /**
     * Returns a new object of class '<em>Asynchronous Machine</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Asynchronous Machine</em>'.
     * @generated
     */
    AsynchronousMachine createAsynchronousMachine();

    /**
     * Returns a new object of class '<em>Load Group</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Load Group</em>'.
     * @generated
     */
    LoadGroup createLoadGroup();

    /**
     * Returns a new object of class '<em>Equivalent Network</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Equivalent Network</em>'.
     * @generated
     */
    EquivalentNetwork createEquivalentNetwork();

    /**
     * Returns a new object of class '<em>Energy Area</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Energy Area</em>'.
     * @generated
     */
    EnergyArea createEnergyArea();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    CimPackage getCimPackage();

} //CimFactory
