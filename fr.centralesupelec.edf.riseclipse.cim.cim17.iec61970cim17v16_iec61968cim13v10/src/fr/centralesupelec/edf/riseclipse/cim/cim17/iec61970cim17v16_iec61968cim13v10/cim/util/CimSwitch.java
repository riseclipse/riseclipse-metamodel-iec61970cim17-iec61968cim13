/*
*************************************************************************
**  Copyright (c) 2019 CentraleSupélec & EDF.
**  All rights reserved. This program and the accompanying materials
**  are made available under the terms of the Eclipse Public License v2.0
**  which accompanies this distribution, and is available at
**  https://www.eclipse.org/legal/epl-v20.html
** 
**  This file is part of the RiseClipse tool
**  
**  Contributors:
**      Computer Science Department, CentraleSupélec
**      EDF R&D
**  Contacts:
**      dominique.marcadet@centralesupelec.fr
**      aurelie.dehouck-neveu@edf.fr
**  Web site:
**      http://wdi.supelec.fr/software/RiseClipse/
*************************************************************************
*/
package fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.util;

import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage
 * @generated
 */
public class CimSwitch< T > extends Switch< T > {
    /**
     * The cached model package
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static CimPackage modelPackage;

    /**
     * Creates an instance of the switch.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CimSwitch() {
        if( modelPackage == null ) {
            modelPackage = CimPackage.eINSTANCE;
        }
    }

    /**
     * Checks whether this is a switch for the given package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param ePackage the package in question.
     * @return whether this is a switch for the given package.
     * @generated
     */
    @Override
    protected boolean isSwitchFor( EPackage ePackage ) {
        return ePackage == modelPackage;
    }

    /**
     * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the first non-null result returned by a <code>caseXXX</code> call.
     * @generated
     */
    @Override
    protected T doSwitch( int classifierID, EObject theEObject ) {
        switch( classifierID ) {
        case CimPackage.CIM_OBJECT_WITH_ID: {
            CimObjectWithID cimObjectWithID = ( CimObjectWithID ) theEObject;
            T result = caseCimObjectWithID( cimObjectWithID );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.ISO_STANDARD: {
            ISOStandard isoStandard = ( ISOStandard ) theEObject;
            T result = caseISOStandard( isoStandard );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.DATE_INTERVAL: {
            DateInterval dateInterval = ( DateInterval ) theEObject;
            T result = caseDateInterval( dateInterval );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.DATE_TIME_INTERVAL: {
            DateTimeInterval dateTimeInterval = ( DateTimeInterval ) theEObject;
            T result = caseDateTimeInterval( dateTimeInterval );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.LABORELEC_STANDARD: {
            LaborelecStandard laborelecStandard = ( LaborelecStandard ) theEObject;
            T result = caseLaborelecStandard( laborelecStandard );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.DEPLOYMENT_DATE: {
            DeploymentDate deploymentDate = ( DeploymentDate ) theEObject;
            T result = caseDeploymentDate( deploymentDate );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.PRIORITY: {
            Priority priority = ( Priority ) theEObject;
            T result = casePriority( priority );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.STREET_DETAIL: {
            StreetDetail streetDetail = ( StreetDetail ) theEObject;
            T result = caseStreetDetail( streetDetail );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.DUE: {
            Due due = ( Due ) theEObject;
            T result = caseDue( due );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.RATIONAL_NUMBER: {
            RationalNumber rationalNumber = ( RationalNumber ) theEObject;
            T result = caseRationalNumber( rationalNumber );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.DIN_STANDARD: {
            DINStandard dinStandard = ( DINStandard ) theEObject;
            T result = caseDINStandard( dinStandard );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.STRING_QUANTITY: {
            StringQuantity stringQuantity = ( StringQuantity ) theEObject;
            T result = caseStringQuantity( stringQuantity );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.READING_INTERHARMONIC: {
            ReadingInterharmonic readingInterharmonic = ( ReadingInterharmonic ) theEObject;
            T result = caseReadingInterharmonic( readingInterharmonic );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.WEP_STANDARD: {
            WEPStandard wepStandard = ( WEPStandard ) theEObject;
            T result = caseWEPStandard( wepStandard );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.REMOTE_CONNECT_DISCONNECT_INFO: {
            RemoteConnectDisconnectInfo remoteConnectDisconnectInfo = ( RemoteConnectDisconnectInfo ) theEObject;
            T result = caseRemoteConnectDisconnectInfo( remoteConnectDisconnectInfo );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.END_DEVICE_CAPABILITY: {
            EndDeviceCapability endDeviceCapability = ( EndDeviceCapability ) theEObject;
            T result = caseEndDeviceCapability( endDeviceCapability );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.DECIMAL_QUANTITY: {
            DecimalQuantity decimalQuantity = ( DecimalQuantity ) theEObject;
            T result = caseDecimalQuantity( decimalQuantity );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.STATUS: {
            Status status = ( Status ) theEObject;
            T result = caseStatus( status );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.DOBLE_STANDARD: {
            DobleStandard dobleStandard = ( DobleStandard ) theEObject;
            T result = caseDobleStandard( dobleStandard );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.EPA_STANDARD: {
            EPAStandard epaStandard = ( EPAStandard ) theEObject;
            T result = caseEPAStandard( epaStandard );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.MONTH_DAY_INTERVAL: {
            MonthDayInterval monthDayInterval = ( MonthDayInterval ) theEObject;
            T result = caseMonthDayInterval( monthDayInterval );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.UK_MINISTRY_OF_DEFENCE_STANDARD: {
            UKMinistryOfDefenceStandard ukMinistryOfDefenceStandard = ( UKMinistryOfDefenceStandard ) theEObject;
            T result = caseUKMinistryOfDefenceStandard( ukMinistryOfDefenceStandard );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.ELECTRONIC_ADDRESS: {
            ElectronicAddress electronicAddress = ( ElectronicAddress ) theEObject;
            T result = caseElectronicAddress( electronicAddress );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.CONTROLLED_APPLIANCE: {
            ControlledAppliance controlledAppliance = ( ControlledAppliance ) theEObject;
            T result = caseControlledAppliance( controlledAppliance );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.FAULT_IMPEDANCE: {
            FaultImpedance faultImpedance = ( FaultImpedance ) theEObject;
            T result = caseFaultImpedance( faultImpedance );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.LIFECYCLE_DATE: {
            LifecycleDate lifecycleDate = ( LifecycleDate ) theEObject;
            T result = caseLifecycleDate( lifecycleDate );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.TAPPI_STANDARD: {
            TAPPIStandard tappiStandard = ( TAPPIStandard ) theEObject;
            T result = caseTAPPIStandard( tappiStandard );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.VERSION: {
            Version version = ( Version ) theEObject;
            T result = caseVersion( version );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.INTEGER_QUANTITY: {
            IntegerQuantity integerQuantity = ( IntegerQuantity ) theEObject;
            T result = caseIntegerQuantity( integerQuantity );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.TELEPHONE_NUMBER: {
            TelephoneNumber telephoneNumber = ( TelephoneNumber ) theEObject;
            T result = caseTelephoneNumber( telephoneNumber );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.SERVICE_POINT_OUTAGE_SUMMARY: {
            ServicePointOutageSummary servicePointOutageSummary = ( ServicePointOutageSummary ) theEObject;
            T result = caseServicePointOutageSummary( servicePointOutageSummary );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.BANK_ACCOUNT_DETAIL: {
            BankAccountDetail bankAccountDetail = ( BankAccountDetail ) theEObject;
            T result = caseBankAccountDetail( bankAccountDetail );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.TOWN_DETAIL: {
            TownDetail townDetail = ( TownDetail ) theEObject;
            T result = caseTownDetail( townDetail );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.IEC_STANDARD: {
            IECStandard iecStandard = ( IECStandard ) theEObject;
            T result = caseIECStandard( iecStandard );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.TIME_INTERVAL: {
            TimeInterval timeInterval = ( TimeInterval ) theEObject;
            T result = caseTimeInterval( timeInterval );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.IEEE_STANDARD: {
            IEEEStandard ieeeStandard = ( IEEEStandard ) theEObject;
            T result = caseIEEEStandard( ieeeStandard );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.IN_USE_DATE: {
            InUseDate inUseDate = ( InUseDate ) theEObject;
            T result = caseInUseDate( inUseDate );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.ASTM_STANDARD: {
            ASTMStandard astmStandard = ( ASTMStandard ) theEObject;
            T result = caseASTMStandard( astmStandard );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.ACCOUNT_MOVEMENT: {
            AccountMovement accountMovement = ( AccountMovement ) theEObject;
            T result = caseAccountMovement( accountMovement );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.ACCOUNTING_UNIT: {
            AccountingUnit accountingUnit = ( AccountingUnit ) theEObject;
            T result = caseAccountingUnit( accountingUnit );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.CIGRE_STANDARD: {
            CIGREStandard cigreStandard = ( CIGREStandard ) theEObject;
            T result = caseCIGREStandard( cigreStandard );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.FLOAT_QUANTITY: {
            FloatQuantity floatQuantity = ( FloatQuantity ) theEObject;
            T result = caseFloatQuantity( floatQuantity );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.ACCEPTANCE_TEST: {
            AcceptanceTest acceptanceTest = ( AcceptanceTest ) theEObject;
            T result = caseAcceptanceTest( acceptanceTest );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.EXTENSION_ITEM: {
            ExtensionItem extensionItem = ( ExtensionItem ) theEObject;
            T result = caseExtensionItem( extensionItem );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.LINE_DETAIL: {
            LineDetail lineDetail = ( LineDetail ) theEObject;
            T result = caseLineDetail( lineDetail );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.STREET_ADDRESS: {
            StreetAddress streetAddress = ( StreetAddress ) theEObject;
            T result = caseStreetAddress( streetAddress );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.EXTENSIONS_LIST: {
            ExtensionsList extensionsList = ( ExtensionsList ) theEObject;
            T result = caseExtensionsList( extensionsList );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.END_DEVICE_TIMING: {
            EndDeviceTiming endDeviceTiming = ( EndDeviceTiming ) theEObject;
            T result = caseEndDeviceTiming( endDeviceTiming );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.ANALYTIC_SCORE: {
            AnalyticScore analyticScore = ( AnalyticScore ) theEObject;
            T result = caseAnalyticScore( analyticScore );
            if( result == null ) result = caseIdentifiedObject( analyticScore );
            if( result == null ) result = caseCimObjectWithID( analyticScore );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.SERVICE_LOCATION: {
            ServiceLocation serviceLocation = ( ServiceLocation ) theEObject;
            T result = caseServiceLocation( serviceLocation );
            if( result == null ) result = caseWorkLocation( serviceLocation );
            if( result == null ) result = caseLocation( serviceLocation );
            if( result == null ) result = caseIdentifiedObject( serviceLocation );
            if( result == null ) result = caseCimObjectWithID( serviceLocation );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.HYDRO_PUMP_OP_SCHEDULE: {
            HydroPumpOpSchedule hydroPumpOpSchedule = ( HydroPumpOpSchedule ) theEObject;
            T result = caseHydroPumpOpSchedule( hydroPumpOpSchedule );
            if( result == null ) result = caseRegularIntervalSchedule( hydroPumpOpSchedule );
            if( result == null ) result = caseBasicIntervalSchedule( hydroPumpOpSchedule );
            if( result == null ) result = caseIdentifiedObject( hydroPumpOpSchedule );
            if( result == null ) result = caseCimObjectWithID( hydroPumpOpSchedule );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.OUTAGE: {
            Outage outage = ( Outage ) theEObject;
            T result = caseOutage( outage );
            if( result == null ) result = caseDocument( outage );
            if( result == null ) result = caseIdentifiedObject( outage );
            if( result == null ) result = caseCimObjectWithID( outage );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.REGULAR_TIME_POINT: {
            RegularTimePoint regularTimePoint = ( RegularTimePoint ) theEObject;
            T result = caseRegularTimePoint( regularTimePoint );
            if( result == null ) result = caseCimObjectWithID( regularTimePoint );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.CHANGE_SET_MEMBER: {
            ChangeSetMember changeSetMember = ( ChangeSetMember ) theEObject;
            T result = caseChangeSetMember( changeSetMember );
            if( result == null ) result = caseDataSetMember( changeSetMember );
            if( result == null ) result = caseIdentifiedObject( changeSetMember );
            if( result == null ) result = caseCimObjectWithID( changeSetMember );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.POSITION_POINT: {
            PositionPoint positionPoint = ( PositionPoint ) theEObject;
            T result = casePositionPoint( positionPoint );
            if( result == null ) result = caseCimObjectWithID( positionPoint );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.NONLINEAR_SHUNT_COMPENSATOR_POINT: {
            NonlinearShuntCompensatorPoint nonlinearShuntCompensatorPoint = ( NonlinearShuntCompensatorPoint ) theEObject;
            T result = caseNonlinearShuntCompensatorPoint( nonlinearShuntCompensatorPoint );
            if( result == null ) result = caseCimObjectWithID( nonlinearShuntCompensatorPoint );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.PARENT_ORGANIZATION: {
            ParentOrganization parentOrganization = ( ParentOrganization ) theEObject;
            T result = caseParentOrganization( parentOrganization );
            if( result == null ) result = caseOrganisation( parentOrganization );
            if( result == null ) result = caseIdentifiedObject( parentOrganization );
            if( result == null ) result = caseCimObjectWithID( parentOrganization );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.SYNCHRONOUS_MACHINE_USER_DEFINED: {
            SynchronousMachineUserDefined synchronousMachineUserDefined = ( SynchronousMachineUserDefined ) theEObject;
            T result = caseSynchronousMachineUserDefined( synchronousMachineUserDefined );
            if( result == null ) result = caseSynchronousMachineDynamics( synchronousMachineUserDefined );
            if( result == null ) result = caseRotatingMachineDynamics( synchronousMachineUserDefined );
            if( result == null ) result = caseDynamicsFunctionBlock( synchronousMachineUserDefined );
            if( result == null ) result = caseIdentifiedObject( synchronousMachineUserDefined );
            if( result == null ) result = caseCimObjectWithID( synchronousMachineUserDefined );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.SENSOR: {
            Sensor sensor = ( Sensor ) theEObject;
            T result = caseSensor( sensor );
            if( result == null ) result = caseAuxiliaryEquipment( sensor );
            if( result == null ) result = caseEquipment( sensor );
            if( result == null ) result = casePowerSystemResource( sensor );
            if( result == null ) result = caseIdentifiedObject( sensor );
            if( result == null ) result = caseCimObjectWithID( sensor );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.SUB_LOAD_AREA: {
            SubLoadArea subLoadArea = ( SubLoadArea ) theEObject;
            T result = caseSubLoadArea( subLoadArea );
            if( result == null ) result = caseEnergyArea( subLoadArea );
            if( result == null ) result = caseIdentifiedObject( subLoadArea );
            if( result == null ) result = caseCimObjectWithID( subLoadArea );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.OPERATING_SHARE: {
            OperatingShare operatingShare = ( OperatingShare ) theEObject;
            T result = caseOperatingShare( operatingShare );
            if( result == null ) result = caseCimObjectWithID( operatingShare );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.SYNCHRONOUS_MACHINE_EQUIVALENT_CIRCUIT: {
            SynchronousMachineEquivalentCircuit synchronousMachineEquivalentCircuit = ( SynchronousMachineEquivalentCircuit ) theEObject;
            T result = caseSynchronousMachineEquivalentCircuit( synchronousMachineEquivalentCircuit );
            if( result == null ) result = caseSynchronousMachineDetailed( synchronousMachineEquivalentCircuit );
            if( result == null ) result = caseSynchronousMachineDynamics( synchronousMachineEquivalentCircuit );
            if( result == null ) result = caseRotatingMachineDynamics( synchronousMachineEquivalentCircuit );
            if( result == null ) result = caseDynamicsFunctionBlock( synchronousMachineEquivalentCircuit );
            if( result == null ) result = caseIdentifiedObject( synchronousMachineEquivalentCircuit );
            if( result == null ) result = caseCimObjectWithID( synchronousMachineEquivalentCircuit );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.CONFORM_LOAD_SCHEDULE: {
            ConformLoadSchedule conformLoadSchedule = ( ConformLoadSchedule ) theEObject;
            T result = caseConformLoadSchedule( conformLoadSchedule );
            if( result == null ) result = caseSeasonDayTypeSchedule( conformLoadSchedule );
            if( result == null ) result = caseRegularIntervalSchedule( conformLoadSchedule );
            if( result == null ) result = caseBasicIntervalSchedule( conformLoadSchedule );
            if( result == null ) result = caseIdentifiedObject( conformLoadSchedule );
            if( result == null ) result = caseCimObjectWithID( conformLoadSchedule );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.AGREEMENT: {
            Agreement agreement = ( Agreement ) theEObject;
            T result = caseAgreement( agreement );
            if( result == null ) result = caseDocument( agreement );
            if( result == null ) result = caseIdentifiedObject( agreement );
            if( result == null ) result = caseCimObjectWithID( agreement );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.POWER_SYSTEM_RESOURCE: {
            PowerSystemResource powerSystemResource = ( PowerSystemResource ) theEObject;
            T result = casePowerSystemResource( powerSystemResource );
            if( result == null ) result = caseIdentifiedObject( powerSystemResource );
            if( result == null ) result = caseCimObjectWithID( powerSystemResource );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.OPERATING_PARTICIPANT: {
            OperatingParticipant operatingParticipant = ( OperatingParticipant ) theEObject;
            T result = caseOperatingParticipant( operatingParticipant );
            if( result == null ) result = caseIdentifiedObject( operatingParticipant );
            if( result == null ) result = caseCimObjectWithID( operatingParticipant );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.LIMIT_SET: {
            LimitSet limitSet = ( LimitSet ) theEObject;
            T result = caseLimitSet( limitSet );
            if( result == null ) result = caseIdentifiedObject( limitSet );
            if( result == null ) result = caseCimObjectWithID( limitSet );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.NO_LOAD_TEST: {
            NoLoadTest noLoadTest = ( NoLoadTest ) theEObject;
            T result = caseNoLoadTest( noLoadTest );
            if( result == null ) result = caseTransformerTest( noLoadTest );
            if( result == null ) result = caseIdentifiedObject( noLoadTest );
            if( result == null ) result = caseCimObjectWithID( noLoadTest );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.SWITCH_SCHEDULE: {
            SwitchSchedule switchSchedule = ( SwitchSchedule ) theEObject;
            T result = caseSwitchSchedule( switchSchedule );
            if( result == null ) result = caseSeasonDayTypeSchedule( switchSchedule );
            if( result == null ) result = caseRegularIntervalSchedule( switchSchedule );
            if( result == null ) result = caseBasicIntervalSchedule( switchSchedule );
            if( result == null ) result = caseIdentifiedObject( switchSchedule );
            if( result == null ) result = caseCimObjectWithID( switchSchedule );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.JUMPER: {
            Jumper jumper = ( Jumper ) theEObject;
            T result = caseJumper( jumper );
            if( result == null ) result = caseSwitch( jumper );
            if( result == null ) result = caseConductingEquipment( jumper );
            if( result == null ) result = caseEquipment( jumper );
            if( result == null ) result = casePowerSystemResource( jumper );
            if( result == null ) result = caseIdentifiedObject( jumper );
            if( result == null ) result = caseCimObjectWithID( jumper );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.EXC_ST6B: {
            ExcST6B excST6B = ( ExcST6B ) theEObject;
            T result = caseExcST6B( excST6B );
            if( result == null ) result = caseExcitationSystemDynamics( excST6B );
            if( result == null ) result = caseDynamicsFunctionBlock( excST6B );
            if( result == null ) result = caseIdentifiedObject( excST6B );
            if( result == null ) result = caseCimObjectWithID( excST6B );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.EXC_IEEEAC5A: {
            ExcIEEEAC5A excIEEEAC5A = ( ExcIEEEAC5A ) theEObject;
            T result = caseExcIEEEAC5A( excIEEEAC5A );
            if( result == null ) result = caseExcitationSystemDynamics( excIEEEAC5A );
            if( result == null ) result = caseDynamicsFunctionBlock( excIEEEAC5A );
            if( result == null ) result = caseIdentifiedObject( excIEEEAC5A );
            if( result == null ) result = caseCimObjectWithID( excIEEEAC5A );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.OVERHEAD_WIRE_INFO: {
            OverheadWireInfo overheadWireInfo = ( OverheadWireInfo ) theEObject;
            T result = caseOverheadWireInfo( overheadWireInfo );
            if( result == null ) result = caseWireInfo( overheadWireInfo );
            if( result == null ) result = caseAssetInfo( overheadWireInfo );
            if( result == null ) result = caseIdentifiedObject( overheadWireInfo );
            if( result == null ) result = caseCimObjectWithID( overheadWireInfo );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.COMBINED_CYCLE_PLANT: {
            CombinedCyclePlant combinedCyclePlant = ( CombinedCyclePlant ) theEObject;
            T result = caseCombinedCyclePlant( combinedCyclePlant );
            if( result == null ) result = casePowerSystemResource( combinedCyclePlant );
            if( result == null ) result = caseIdentifiedObject( combinedCyclePlant );
            if( result == null ) result = caseCimObjectWithID( combinedCyclePlant );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.CONTROL: {
            Control control = ( Control ) theEObject;
            T result = caseControl( control );
            if( result == null ) result = caseIOPoint( control );
            if( result == null ) result = caseIdentifiedObject( control );
            if( result == null ) result = caseCimObjectWithID( control );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.INSTANCE_SET: {
            InstanceSet instanceSet = ( InstanceSet ) theEObject;
            T result = caseInstanceSet( instanceSet );
            if( result == null ) result = caseDataSet( instanceSet );
            if( result == null ) result = caseIdentifiedObject( instanceSet );
            if( result == null ) result = caseCimObjectWithID( instanceSet );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.OPEN_CIRCUIT_TEST: {
            OpenCircuitTest openCircuitTest = ( OpenCircuitTest ) theEObject;
            T result = caseOpenCircuitTest( openCircuitTest );
            if( result == null ) result = caseTransformerTest( openCircuitTest );
            if( result == null ) result = caseIdentifiedObject( openCircuitTest );
            if( result == null ) result = caseCimObjectWithID( openCircuitTest );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.MEASUREMENT: {
            Measurement measurement = ( Measurement ) theEObject;
            T result = caseMeasurement( measurement );
            if( result == null ) result = caseIdentifiedObject( measurement );
            if( result == null ) result = caseCimObjectWithID( measurement );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.END_DEVICE_ACTION: {
            EndDeviceAction endDeviceAction = ( EndDeviceAction ) theEObject;
            T result = caseEndDeviceAction( endDeviceAction );
            if( result == null ) result = caseCimObjectWithID( endDeviceAction );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.CHARGE: {
            Charge charge = ( Charge ) theEObject;
            T result = caseCharge( charge );
            if( result == null ) result = caseIdentifiedObject( charge );
            if( result == null ) result = caseCimObjectWithID( charge );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.LAB_TEST_DATA_SET: {
            LabTestDataSet labTestDataSet = ( LabTestDataSet ) theEObject;
            T result = caseLabTestDataSet( labTestDataSet );
            if( result == null ) result = caseProcedureDataSet( labTestDataSet );
            if( result == null ) result = caseDocument( labTestDataSet );
            if( result == null ) result = caseIdentifiedObject( labTestDataSet );
            if( result == null ) result = caseCimObjectWithID( labTestDataSet );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.OPERATION_PERSON_ROLE: {
            OperationPersonRole operationPersonRole = ( OperationPersonRole ) theEObject;
            T result = caseOperationPersonRole( operationPersonRole );
            if( result == null ) result = casePersonRole( operationPersonRole );
            if( result == null ) result = caseIdentifiedObject( operationPersonRole );
            if( result == null ) result = caseCimObjectWithID( operationPersonRole );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.HEAT_RATE_CURVE: {
            HeatRateCurve heatRateCurve = ( HeatRateCurve ) theEObject;
            T result = caseHeatRateCurve( heatRateCurve );
            if( result == null ) result = caseCurve( heatRateCurve );
            if( result == null ) result = caseIdentifiedObject( heatRateCurve );
            if( result == null ) result = caseCimObjectWithID( heatRateCurve );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.WIND_GEN_TURBINE_TYPE1B_IEC: {
            WindGenTurbineType1bIEC windGenTurbineType1bIEC = ( WindGenTurbineType1bIEC ) theEObject;
            T result = caseWindGenTurbineType1bIEC( windGenTurbineType1bIEC );
            if( result == null ) result = caseWindTurbineType1or2IEC( windGenTurbineType1bIEC );
            if( result == null ) result = caseWindTurbineType1or2Dynamics( windGenTurbineType1bIEC );
            if( result == null ) result = caseDynamicsFunctionBlock( windGenTurbineType1bIEC );
            if( result == null ) result = caseIdentifiedObject( windGenTurbineType1bIEC );
            if( result == null ) result = caseCimObjectWithID( windGenTurbineType1bIEC );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.ASSET_HEALTH_EVENT: {
            AssetHealthEvent assetHealthEvent = ( AssetHealthEvent ) theEObject;
            T result = caseAssetHealthEvent( assetHealthEvent );
            if( result == null ) result = caseActivityRecord( assetHealthEvent );
            if( result == null ) result = caseIdentifiedObject( assetHealthEvent );
            if( result == null ) result = caseCimObjectWithID( assetHealthEvent );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.CONNECTIVITY_NODE_CONTAINER: {
            ConnectivityNodeContainer connectivityNodeContainer = ( ConnectivityNodeContainer ) theEObject;
            T result = caseConnectivityNodeContainer( connectivityNodeContainer );
            if( result == null ) result = casePowerSystemResource( connectivityNodeContainer );
            if( result == null ) result = caseIdentifiedObject( connectivityNodeContainer );
            if( result == null ) result = caseCimObjectWithID( connectivityNodeContainer );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.WIRE_INFO: {
            WireInfo wireInfo = ( WireInfo ) theEObject;
            T result = caseWireInfo( wireInfo );
            if( result == null ) result = caseAssetInfo( wireInfo );
            if( result == null ) result = caseIdentifiedObject( wireInfo );
            if( result == null ) result = caseCimObjectWithID( wireInfo );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.TURBINE_GOVERNOR_USER_DEFINED: {
            TurbineGovernorUserDefined turbineGovernorUserDefined = ( TurbineGovernorUserDefined ) theEObject;
            T result = caseTurbineGovernorUserDefined( turbineGovernorUserDefined );
            if( result == null ) result = caseTurbineGovernorDynamics( turbineGovernorUserDefined );
            if( result == null ) result = caseDynamicsFunctionBlock( turbineGovernorUserDefined );
            if( result == null ) result = caseIdentifiedObject( turbineGovernorUserDefined );
            if( result == null ) result = caseCimObjectWithID( turbineGovernorUserDefined );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.FAULT_INDICATOR: {
            FaultIndicator faultIndicator = ( FaultIndicator ) theEObject;
            T result = caseFaultIndicator( faultIndicator );
            if( result == null ) result = caseAuxiliaryEquipment( faultIndicator );
            if( result == null ) result = caseEquipment( faultIndicator );
            if( result == null ) result = casePowerSystemResource( faultIndicator );
            if( result == null ) result = caseIdentifiedObject( faultIndicator );
            if( result == null ) result = caseCimObjectWithID( faultIndicator );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.GOV_HYDRO_IEEE0: {
            GovHydroIEEE0 govHydroIEEE0 = ( GovHydroIEEE0 ) theEObject;
            T result = caseGovHydroIEEE0( govHydroIEEE0 );
            if( result == null ) result = caseTurbineGovernorDynamics( govHydroIEEE0 );
            if( result == null ) result = caseDynamicsFunctionBlock( govHydroIEEE0 );
            if( result == null ) result = caseIdentifiedObject( govHydroIEEE0 );
            if( result == null ) result = caseCimObjectWithID( govHydroIEEE0 );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.PHASE_IMPEDANCE_DATA: {
            PhaseImpedanceData phaseImpedanceData = ( PhaseImpedanceData ) theEObject;
            T result = casePhaseImpedanceData( phaseImpedanceData );
            if( result == null ) result = caseCimObjectWithID( phaseImpedanceData );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.TURBINE_GOVERNOR_DYNAMICS: {
            TurbineGovernorDynamics turbineGovernorDynamics = ( TurbineGovernorDynamics ) theEObject;
            T result = caseTurbineGovernorDynamics( turbineGovernorDynamics );
            if( result == null ) result = caseDynamicsFunctionBlock( turbineGovernorDynamics );
            if( result == null ) result = caseIdentifiedObject( turbineGovernorDynamics );
            if( result == null ) result = caseCimObjectWithID( turbineGovernorDynamics );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.MAINTENANCE_WORK_TASK: {
            MaintenanceWorkTask maintenanceWorkTask = ( MaintenanceWorkTask ) theEObject;
            T result = caseMaintenanceWorkTask( maintenanceWorkTask );
            if( result == null ) result = caseWorkTask( maintenanceWorkTask );
            if( result == null ) result = caseBaseWork( maintenanceWorkTask );
            if( result == null ) result = caseDocument( maintenanceWorkTask );
            if( result == null ) result = caseIdentifiedObject( maintenanceWorkTask );
            if( result == null ) result = caseCimObjectWithID( maintenanceWorkTask );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.IP_ACCESS_POINT: {
            IPAccessPoint ipAccessPoint = ( IPAccessPoint ) theEObject;
            T result = caseIPAccessPoint( ipAccessPoint );
            if( result == null ) result = caseCommunicationLink( ipAccessPoint );
            if( result == null ) result = casePowerSystemResource( ipAccessPoint );
            if( result == null ) result = caseIdentifiedObject( ipAccessPoint );
            if( result == null ) result = caseCimObjectWithID( ipAccessPoint );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.EQUIVALENT_BRANCH: {
            EquivalentBranch equivalentBranch = ( EquivalentBranch ) theEObject;
            T result = caseEquivalentBranch( equivalentBranch );
            if( result == null ) result = caseEquivalentEquipment( equivalentBranch );
            if( result == null ) result = caseConductingEquipment( equivalentBranch );
            if( result == null ) result = caseEquipment( equivalentBranch );
            if( result == null ) result = casePowerSystemResource( equivalentBranch );
            if( result == null ) result = caseIdentifiedObject( equivalentBranch );
            if( result == null ) result = caseCimObjectWithID( equivalentBranch );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.BATTERY_UNIT: {
            BatteryUnit batteryUnit = ( BatteryUnit ) theEObject;
            T result = caseBatteryUnit( batteryUnit );
            if( result == null ) result = casePowerElectronicsUnit( batteryUnit );
            if( result == null ) result = caseEquipment( batteryUnit );
            if( result == null ) result = casePowerSystemResource( batteryUnit );
            if( result == null ) result = caseIdentifiedObject( batteryUnit );
            if( result == null ) result = caseCimObjectWithID( batteryUnit );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.ANALOG_LIMIT: {
            AnalogLimit analogLimit = ( AnalogLimit ) theEObject;
            T result = caseAnalogLimit( analogLimit );
            if( result == null ) result = caseLimit( analogLimit );
            if( result == null ) result = caseIdentifiedObject( analogLimit );
            if( result == null ) result = caseCimObjectWithID( analogLimit );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.NAME_TYPE: {
            NameType nameType = ( NameType ) theEObject;
            T result = caseNameType( nameType );
            if( result == null ) result = caseCimObjectWithID( nameType );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.POWER_ELECTRONICS_UNIT: {
            PowerElectronicsUnit powerElectronicsUnit = ( PowerElectronicsUnit ) theEObject;
            T result = casePowerElectronicsUnit( powerElectronicsUnit );
            if( result == null ) result = caseEquipment( powerElectronicsUnit );
            if( result == null ) result = casePowerSystemResource( powerElectronicsUnit );
            if( result == null ) result = caseIdentifiedObject( powerElectronicsUnit );
            if( result == null ) result = caseCimObjectWithID( powerElectronicsUnit );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.EXC_IEEEDC2A: {
            ExcIEEEDC2A excIEEEDC2A = ( ExcIEEEDC2A ) theEObject;
            T result = caseExcIEEEDC2A( excIEEEDC2A );
            if( result == null ) result = caseExcitationSystemDynamics( excIEEEDC2A );
            if( result == null ) result = caseDynamicsFunctionBlock( excIEEEDC2A );
            if( result == null ) result = caseIdentifiedObject( excIEEEDC2A );
            if( result == null ) result = caseCimObjectWithID( excIEEEDC2A );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.ANALYTIC: {
            Analytic analytic = ( Analytic ) theEObject;
            T result = caseAnalytic( analytic );
            if( result == null ) result = caseDocument( analytic );
            if( result == null ) result = caseIdentifiedObject( analytic );
            if( result == null ) result = caseCimObjectWithID( analytic );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.NAME: {
            Name name = ( Name ) theEObject;
            T result = caseName( name );
            if( result == null ) result = caseCimObjectWithID( name );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.ROTATING_MACHINE_DYNAMICS: {
            RotatingMachineDynamics rotatingMachineDynamics = ( RotatingMachineDynamics ) theEObject;
            T result = caseRotatingMachineDynamics( rotatingMachineDynamics );
            if( result == null ) result = caseDynamicsFunctionBlock( rotatingMachineDynamics );
            if( result == null ) result = caseIdentifiedObject( rotatingMachineDynamics );
            if( result == null ) result = caseCimObjectWithID( rotatingMachineDynamics );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.COMBUSTION_TURBINE: {
            CombustionTurbine combustionTurbine = ( CombustionTurbine ) theEObject;
            T result = caseCombustionTurbine( combustionTurbine );
            if( result == null ) result = casePrimeMover( combustionTurbine );
            if( result == null ) result = casePowerSystemResource( combustionTurbine );
            if( result == null ) result = caseIdentifiedObject( combustionTurbine );
            if( result == null ) result = caseCimObjectWithID( combustionTurbine );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.REGISTER: {
            Register register = ( Register ) theEObject;
            T result = caseRegister( register );
            if( result == null ) result = caseIdentifiedObject( register );
            if( result == null ) result = caseCimObjectWithID( register );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.OIL_ANALYSIS_METALS_ANALOG: {
            OilAnalysisMetalsAnalog oilAnalysisMetalsAnalog = ( OilAnalysisMetalsAnalog ) theEObject;
            T result = caseOilAnalysisMetalsAnalog( oilAnalysisMetalsAnalog );
            if( result == null ) result = caseAssetAnalog( oilAnalysisMetalsAnalog );
            if( result == null ) result = caseAnalog( oilAnalysisMetalsAnalog );
            if( result == null ) result = caseMeasurement( oilAnalysisMetalsAnalog );
            if( result == null ) result = caseIdentifiedObject( oilAnalysisMetalsAnalog );
            if( result == null ) result = caseCimObjectWithID( oilAnalysisMetalsAnalog );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.OPERATIONAL_RESTRICTION: {
            OperationalRestriction operationalRestriction = ( OperationalRestriction ) theEObject;
            T result = caseOperationalRestriction( operationalRestriction );
            if( result == null ) result = caseDocument( operationalRestriction );
            if( result == null ) result = caseIdentifiedObject( operationalRestriction );
            if( result == null ) result = caseCimObjectWithID( operationalRestriction );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.CLAMP: {
            Clamp clamp = ( Clamp ) theEObject;
            T result = caseClamp( clamp );
            if( result == null ) result = caseConductingEquipment( clamp );
            if( result == null ) result = caseEquipment( clamp );
            if( result == null ) result = casePowerSystemResource( clamp );
            if( result == null ) result = caseIdentifiedObject( clamp );
            if( result == null ) result = caseCimObjectWithID( clamp );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.FINANCIAL_INFO: {
            FinancialInfo financialInfo = ( FinancialInfo ) theEObject;
            T result = caseFinancialInfo( financialInfo );
            if( result == null ) result = caseIdentifiedObject( financialInfo );
            if( result == null ) result = caseCimObjectWithID( financialInfo );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.GROUND: {
            Ground ground = ( Ground ) theEObject;
            T result = caseGround( ground );
            if( result == null ) result = caseConductingEquipment( ground );
            if( result == null ) result = caseEquipment( ground );
            if( result == null ) result = casePowerSystemResource( ground );
            if( result == null ) result = caseIdentifiedObject( ground );
            if( result == null ) result = caseCimObjectWithID( ground );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.DAY_TYPE: {
            DayType dayType = ( DayType ) theEObject;
            T result = caseDayType( dayType );
            if( result == null ) result = caseIdentifiedObject( dayType );
            if( result == null ) result = caseCimObjectWithID( dayType );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.EXC_DC2A: {
            ExcDC2A excDC2A = ( ExcDC2A ) theEObject;
            T result = caseExcDC2A( excDC2A );
            if( result == null ) result = caseExcitationSystemDynamics( excDC2A );
            if( result == null ) result = caseDynamicsFunctionBlock( excDC2A );
            if( result == null ) result = caseIdentifiedObject( excDC2A );
            if( result == null ) result = caseCimObjectWithID( excDC2A );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.OPERATING_MECHANISM: {
            OperatingMechanism operatingMechanism = ( OperatingMechanism ) theEObject;
            T result = caseOperatingMechanism( operatingMechanism );
            if( result == null ) result = caseAsset( operatingMechanism );
            if( result == null ) result = caseIdentifiedObject( operatingMechanism );
            if( result == null ) result = caseCimObjectWithID( operatingMechanism );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.GENERATING_UNIT: {
            GeneratingUnit generatingUnit = ( GeneratingUnit ) theEObject;
            T result = caseGeneratingUnit( generatingUnit );
            if( result == null ) result = caseEquipment( generatingUnit );
            if( result == null ) result = casePowerSystemResource( generatingUnit );
            if( result == null ) result = caseIdentifiedObject( generatingUnit );
            if( result == null ) result = caseCimObjectWithID( generatingUnit );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.WIND_TYPE1OR2_USER_DEFINED: {
            WindType1or2UserDefined windType1or2UserDefined = ( WindType1or2UserDefined ) theEObject;
            T result = caseWindType1or2UserDefined( windType1or2UserDefined );
            if( result == null ) result = caseWindTurbineType1or2Dynamics( windType1or2UserDefined );
            if( result == null ) result = caseDynamicsFunctionBlock( windType1or2UserDefined );
            if( result == null ) result = caseIdentifiedObject( windType1or2UserDefined );
            if( result == null ) result = caseCimObjectWithID( windType1or2UserDefined );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.HEALTH_SCORE: {
            HealthScore healthScore = ( HealthScore ) theEObject;
            T result = caseHealthScore( healthScore );
            if( result == null ) result = caseAggregateScore( healthScore );
            if( result == null ) result = caseAnalyticScore( healthScore );
            if( result == null ) result = caseIdentifiedObject( healthScore );
            if( result == null ) result = caseCimObjectWithID( healthScore );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.BASE_WORK: {
            BaseWork baseWork = ( BaseWork ) theEObject;
            T result = caseBaseWork( baseWork );
            if( result == null ) result = caseDocument( baseWork );
            if( result == null ) result = caseIdentifiedObject( baseWork );
            if( result == null ) result = caseCimObjectWithID( baseWork );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.RECEIPT: {
            Receipt receipt = ( Receipt ) theEObject;
            T result = caseReceipt( receipt );
            if( result == null ) result = caseIdentifiedObject( receipt );
            if( result == null ) result = caseCimObjectWithID( receipt );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.PERIODIC_STATISTICAL_CALCULATION: {
            PeriodicStatisticalCalculation periodicStatisticalCalculation = ( PeriodicStatisticalCalculation ) theEObject;
            T result = casePeriodicStatisticalCalculation( periodicStatisticalCalculation );
            if( result == null ) result = caseStatisticalCalculation( periodicStatisticalCalculation );
            if( result == null ) result = caseIdentifiedObject( periodicStatisticalCalculation );
            if( result == null ) result = caseCimObjectWithID( periodicStatisticalCalculation );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.LINE: {
            Line line = ( Line ) theEObject;
            T result = caseLine( line );
            if( result == null ) result = caseEquipmentContainer( line );
            if( result == null ) result = caseConnectivityNodeContainer( line );
            if( result == null ) result = casePowerSystemResource( line );
            if( result == null ) result = caseIdentifiedObject( line );
            if( result == null ) result = caseCimObjectWithID( line );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.WIND_TURBINE_TYPE4A_IEC: {
            WindTurbineType4aIEC windTurbineType4aIEC = ( WindTurbineType4aIEC ) theEObject;
            T result = caseWindTurbineType4aIEC( windTurbineType4aIEC );
            if( result == null ) result = caseWindTurbineType4IEC( windTurbineType4aIEC );
            if( result == null ) result = caseWindTurbineType3or4IEC( windTurbineType4aIEC );
            if( result == null ) result = caseWindTurbineType3or4Dynamics( windTurbineType4aIEC );
            if( result == null ) result = caseDynamicsFunctionBlock( windTurbineType4aIEC );
            if( result == null ) result = caseIdentifiedObject( windTurbineType4aIEC );
            if( result == null ) result = caseCimObjectWithID( windTurbineType4aIEC );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.OIL_ANALYSIS_PCB_DISCRETE: {
            OilAnalysisPCBDiscrete oilAnalysisPCBDiscrete = ( OilAnalysisPCBDiscrete ) theEObject;
            T result = caseOilAnalysisPCBDiscrete( oilAnalysisPCBDiscrete );
            if( result == null ) result = caseAssetDiscrete( oilAnalysisPCBDiscrete );
            if( result == null ) result = caseDiscrete( oilAnalysisPCBDiscrete );
            if( result == null ) result = caseMeasurement( oilAnalysisPCBDiscrete );
            if( result == null ) result = caseIdentifiedObject( oilAnalysisPCBDiscrete );
            if( result == null ) result = caseCimObjectWithID( oilAnalysisPCBDiscrete );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.SCHEDULED_EVENT: {
            ScheduledEvent scheduledEvent = ( ScheduledEvent ) theEObject;
            T result = caseScheduledEvent( scheduledEvent );
            if( result == null ) result = caseIdentifiedObject( scheduledEvent );
            if( result == null ) result = caseCimObjectWithID( scheduledEvent );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.PSS5: {
            Pss5 pss5 = ( Pss5 ) theEObject;
            T result = casePss5( pss5 );
            if( result == null ) result = casePowerSystemStabilizerDynamics( pss5 );
            if( result == null ) result = caseDynamicsFunctionBlock( pss5 );
            if( result == null ) result = caseIdentifiedObject( pss5 );
            if( result == null ) result = caseCimObjectWithID( pss5 );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.SHORT_CIRCUIT_TEST: {
            ShortCircuitTest shortCircuitTest = ( ShortCircuitTest ) theEObject;
            T result = caseShortCircuitTest( shortCircuitTest );
            if( result == null ) result = caseTransformerTest( shortCircuitTest );
            if( result == null ) result = caseIdentifiedObject( shortCircuitTest );
            if( result == null ) result = caseCimObjectWithID( shortCircuitTest );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.RISK_SCORE: {
            RiskScore riskScore = ( RiskScore ) theEObject;
            T result = caseRiskScore( riskScore );
            if( result == null ) result = caseAggregateScore( riskScore );
            if( result == null ) result = caseAnalyticScore( riskScore );
            if( result == null ) result = caseIdentifiedObject( riskScore );
            if( result == null ) result = caseCimObjectWithID( riskScore );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.EXC_SCRX: {
            ExcSCRX excSCRX = ( ExcSCRX ) theEObject;
            T result = caseExcSCRX( excSCRX );
            if( result == null ) result = caseExcitationSystemDynamics( excSCRX );
            if( result == null ) result = caseDynamicsFunctionBlock( excSCRX );
            if( result == null ) result = caseIdentifiedObject( excSCRX );
            if( result == null ) result = caseCimObjectWithID( excSCRX );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.VOLTAGE_ADJUSTER_DYNAMICS: {
            VoltageAdjusterDynamics voltageAdjusterDynamics = ( VoltageAdjusterDynamics ) theEObject;
            T result = caseVoltageAdjusterDynamics( voltageAdjusterDynamics );
            if( result == null ) result = caseDynamicsFunctionBlock( voltageAdjusterDynamics );
            if( result == null ) result = caseIdentifiedObject( voltageAdjusterDynamics );
            if( result == null ) result = caseCimObjectWithID( voltageAdjusterDynamics );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.TIME_POINT: {
            TimePoint timePoint = ( TimePoint ) theEObject;
            T result = caseTimePoint( timePoint );
            if( result == null ) result = caseIdentifiedObject( timePoint );
            if( result == null ) result = caseCimObjectWithID( timePoint );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.REMOTE_SOURCE: {
            RemoteSource remoteSource = ( RemoteSource ) theEObject;
            T result = caseRemoteSource( remoteSource );
            if( result == null ) result = caseRemotePoint( remoteSource );
            if( result == null ) result = caseIdentifiedObject( remoteSource );
            if( result == null ) result = caseCimObjectWithID( remoteSource );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.GOV_HYDRO_WPID: {
            GovHydroWPID govHydroWPID = ( GovHydroWPID ) theEObject;
            T result = caseGovHydroWPID( govHydroWPID );
            if( result == null ) result = caseTurbineGovernorDynamics( govHydroWPID );
            if( result == null ) result = caseDynamicsFunctionBlock( govHydroWPID );
            if( result == null ) result = caseIdentifiedObject( govHydroWPID );
            if( result == null ) result = caseCimObjectWithID( govHydroWPID );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.GOV_HYDRO_IEEE2: {
            GovHydroIEEE2 govHydroIEEE2 = ( GovHydroIEEE2 ) theEObject;
            T result = caseGovHydroIEEE2( govHydroIEEE2 );
            if( result == null ) result = caseTurbineGovernorDynamics( govHydroIEEE2 );
            if( result == null ) result = caseDynamicsFunctionBlock( govHydroIEEE2 );
            if( result == null ) result = caseIdentifiedObject( govHydroIEEE2 );
            if( result == null ) result = caseCimObjectWithID( govHydroIEEE2 );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.REQUESTED_CAPABILITY: {
            RequestedCapability requestedCapability = ( RequestedCapability ) theEObject;
            T result = caseRequestedCapability( requestedCapability );
            if( result == null ) result = caseDERCapabilities( requestedCapability );
            if( result == null ) result = caseCimObjectWithID( requestedCapability );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.FAILURE_EVENT: {
            FailureEvent failureEvent = ( FailureEvent ) theEObject;
            T result = caseFailureEvent( failureEvent );
            if( result == null ) result = caseActivityRecord( failureEvent );
            if( result == null ) result = caseIdentifiedObject( failureEvent );
            if( result == null ) result = caseCimObjectWithID( failureEvent );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.AC_LINE_SEGMENT: {
            ACLineSegment acLineSegment = ( ACLineSegment ) theEObject;
            T result = caseACLineSegment( acLineSegment );
            if( result == null ) result = caseConductor( acLineSegment );
            if( result == null ) result = caseConductingEquipment( acLineSegment );
            if( result == null ) result = caseEquipment( acLineSegment );
            if( result == null ) result = casePowerSystemResource( acLineSegment );
            if( result == null ) result = caseIdentifiedObject( acLineSegment );
            if( result == null ) result = caseCimObjectWithID( acLineSegment );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.ACTIVE_POWER_LIMIT: {
            ActivePowerLimit activePowerLimit = ( ActivePowerLimit ) theEObject;
            T result = caseActivePowerLimit( activePowerLimit );
            if( result == null ) result = caseOperationalLimit( activePowerLimit );
            if( result == null ) result = caseIdentifiedObject( activePowerLimit );
            if( result == null ) result = caseCimObjectWithID( activePowerLimit );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.TAP_CHANGER_INFO: {
            TapChangerInfo tapChangerInfo = ( TapChangerInfo ) theEObject;
            T result = caseTapChangerInfo( tapChangerInfo );
            if( result == null ) result = caseAssetInfo( tapChangerInfo );
            if( result == null ) result = caseIdentifiedObject( tapChangerInfo );
            if( result == null ) result = caseCimObjectWithID( tapChangerInfo );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.SYNCHRONOUS_MACHINE_TIME_CONSTANT_REACTANCE: {
            SynchronousMachineTimeConstantReactance synchronousMachineTimeConstantReactance = ( SynchronousMachineTimeConstantReactance ) theEObject;
            T result = caseSynchronousMachineTimeConstantReactance( synchronousMachineTimeConstantReactance );
            if( result == null ) result = caseSynchronousMachineDetailed( synchronousMachineTimeConstantReactance );
            if( result == null ) result = caseSynchronousMachineDynamics( synchronousMachineTimeConstantReactance );
            if( result == null ) result = caseRotatingMachineDynamics( synchronousMachineTimeConstantReactance );
            if( result == null ) result = caseDynamicsFunctionBlock( synchronousMachineTimeConstantReactance );
            if( result == null ) result = caseIdentifiedObject( synchronousMachineTimeConstantReactance );
            if( result == null ) result = caseCimObjectWithID( synchronousMachineTimeConstantReactance );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.POINT_OF_SALE: {
            PointOfSale pointOfSale = ( PointOfSale ) theEObject;
            T result = casePointOfSale( pointOfSale );
            if( result == null ) result = caseIdentifiedObject( pointOfSale );
            if( result == null ) result = caseCimObjectWithID( pointOfSale );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.DC_TOPOLOGICAL_NODE: {
            DCTopologicalNode dcTopologicalNode = ( DCTopologicalNode ) theEObject;
            T result = caseDCTopologicalNode( dcTopologicalNode );
            if( result == null ) result = caseIdentifiedObject( dcTopologicalNode );
            if( result == null ) result = caseCimObjectWithID( dcTopologicalNode );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.EXC_IEEEAC8B: {
            ExcIEEEAC8B excIEEEAC8B = ( ExcIEEEAC8B ) theEObject;
            T result = caseExcIEEEAC8B( excIEEEAC8B );
            if( result == null ) result = caseExcitationSystemDynamics( excIEEEAC8B );
            if( result == null ) result = caseDynamicsFunctionBlock( excIEEEAC8B );
            if( result == null ) result = caseIdentifiedObject( excIEEEAC8B );
            if( result == null ) result = caseCimObjectWithID( excIEEEAC8B );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.PER_LENGTH_DC_LINE_PARAMETER: {
            PerLengthDCLineParameter perLengthDCLineParameter = ( PerLengthDCLineParameter ) theEObject;
            T result = casePerLengthDCLineParameter( perLengthDCLineParameter );
            if( result == null ) result = casePerLengthLineParameter( perLengthDCLineParameter );
            if( result == null ) result = caseIdentifiedObject( perLengthDCLineParameter );
            if( result == null ) result = caseCimObjectWithID( perLengthDCLineParameter );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.DISCRETE: {
            Discrete discrete = ( Discrete ) theEObject;
            T result = caseDiscrete( discrete );
            if( result == null ) result = caseMeasurement( discrete );
            if( result == null ) result = caseIdentifiedObject( discrete );
            if( result == null ) result = caseCimObjectWithID( discrete );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.RATIO_TAP_CHANGER: {
            RatioTapChanger ratioTapChanger = ( RatioTapChanger ) theEObject;
            T result = caseRatioTapChanger( ratioTapChanger );
            if( result == null ) result = caseTapChanger( ratioTapChanger );
            if( result == null ) result = casePowerSystemResource( ratioTapChanger );
            if( result == null ) result = caseIdentifiedObject( ratioTapChanger );
            if( result == null ) result = caseCimObjectWithID( ratioTapChanger );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.STRUCTURE: {
            Structure structure = ( Structure ) theEObject;
            T result = caseStructure( structure );
            if( result == null ) result = caseAssetContainer( structure );
            if( result == null ) result = caseAsset( structure );
            if( result == null ) result = caseIdentifiedObject( structure );
            if( result == null ) result = caseCimObjectWithID( structure );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.PRODUCT_ASSET_MODEL: {
            ProductAssetModel productAssetModel = ( ProductAssetModel ) theEObject;
            T result = caseProductAssetModel( productAssetModel );
            if( result == null ) result = caseIdentifiedObject( productAssetModel );
            if( result == null ) result = caseCimObjectWithID( productAssetModel );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.EXC_DC3A1: {
            ExcDC3A1 excDC3A1 = ( ExcDC3A1 ) theEObject;
            T result = caseExcDC3A1( excDC3A1 );
            if( result == null ) result = caseExcitationSystemDynamics( excDC3A1 );
            if( result == null ) result = caseDynamicsFunctionBlock( excDC3A1 );
            if( result == null ) result = caseIdentifiedObject( excDC3A1 );
            if( result == null ) result = caseCimObjectWithID( excDC3A1 );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.WIND_GEN_TURBINE_TYPE1A_IEC: {
            WindGenTurbineType1aIEC windGenTurbineType1aIEC = ( WindGenTurbineType1aIEC ) theEObject;
            T result = caseWindGenTurbineType1aIEC( windGenTurbineType1aIEC );
            if( result == null ) result = caseWindTurbineType1or2IEC( windGenTurbineType1aIEC );
            if( result == null ) result = caseWindTurbineType1or2Dynamics( windGenTurbineType1aIEC );
            if( result == null ) result = caseDynamicsFunctionBlock( windGenTurbineType1aIEC );
            if( result == null ) result = caseIdentifiedObject( windGenTurbineType1aIEC );
            if( result == null ) result = caseCimObjectWithID( windGenTurbineType1aIEC );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.EXC_IEEEST5B: {
            ExcIEEEST5B excIEEEST5B = ( ExcIEEEST5B ) theEObject;
            T result = caseExcIEEEST5B( excIEEEST5B );
            if( result == null ) result = caseExcitationSystemDynamics( excIEEEST5B );
            if( result == null ) result = caseDynamicsFunctionBlock( excIEEEST5B );
            if( result == null ) result = caseIdentifiedObject( excIEEEST5B );
            if( result == null ) result = caseCimObjectWithID( excIEEEST5B );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.LOAD_USER_DEFINED: {
            LoadUserDefined loadUserDefined = ( LoadUserDefined ) theEObject;
            T result = caseLoadUserDefined( loadUserDefined );
            if( result == null ) result = caseLoadDynamics( loadUserDefined );
            if( result == null ) result = caseIdentifiedObject( loadUserDefined );
            if( result == null ) result = caseCimObjectWithID( loadUserDefined );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.EXC_IEEEDC4B: {
            ExcIEEEDC4B excIEEEDC4B = ( ExcIEEEDC4B ) theEObject;
            T result = caseExcIEEEDC4B( excIEEEDC4B );
            if( result == null ) result = caseExcitationSystemDynamics( excIEEEDC4B );
            if( result == null ) result = caseDynamicsFunctionBlock( excIEEEDC4B );
            if( result == null ) result = caseIdentifiedObject( excIEEEDC4B );
            if( result == null ) result = caseCimObjectWithID( excIEEEDC4B );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.VALUE_ALIAS_SET: {
            ValueAliasSet valueAliasSet = ( ValueAliasSet ) theEObject;
            T result = caseValueAliasSet( valueAliasSet );
            if( result == null ) result = caseIdentifiedObject( valueAliasSet );
            if( result == null ) result = caseCimObjectWithID( valueAliasSet );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.TARIFF_PROFILE: {
            TariffProfile tariffProfile = ( TariffProfile ) theEObject;
            T result = caseTariffProfile( tariffProfile );
            if( result == null ) result = caseDocument( tariffProfile );
            if( result == null ) result = caseIdentifiedObject( tariffProfile );
            if( result == null ) result = caseCimObjectWithID( tariffProfile );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.TERMINAL: {
            Terminal terminal = ( Terminal ) theEObject;
            T result = caseTerminal( terminal );
            if( result == null ) result = caseACDCTerminal( terminal );
            if( result == null ) result = caseIdentifiedObject( terminal );
            if( result == null ) result = caseCimObjectWithID( terminal );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.APPROVER: {
            Approver approver = ( Approver ) theEObject;
            T result = caseApprover( approver );
            if( result == null ) result = caseDocumentPersonRole( approver );
            if( result == null ) result = casePersonRole( approver );
            if( result == null ) result = caseIdentifiedObject( approver );
            if( result == null ) result = caseCimObjectWithID( approver );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.GENERIC_DATA_SET_VERSION: {
            GenericDataSetVersion genericDataSetVersion = ( GenericDataSetVersion ) theEObject;
            T result = caseGenericDataSetVersion( genericDataSetVersion );
            if( result == null ) result = caseCimObjectWithID( genericDataSetVersion );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.NONLINEAR_SHUNT_COMPENSATOR: {
            NonlinearShuntCompensator nonlinearShuntCompensator = ( NonlinearShuntCompensator ) theEObject;
            T result = caseNonlinearShuntCompensator( nonlinearShuntCompensator );
            if( result == null ) result = caseShuntCompensator( nonlinearShuntCompensator );
            if( result == null ) result = caseRegulatingCondEq( nonlinearShuntCompensator );
            if( result == null ) result = caseEnergyConnection( nonlinearShuntCompensator );
            if( result == null ) result = caseConductingEquipment( nonlinearShuntCompensator );
            if( result == null ) result = caseEquipment( nonlinearShuntCompensator );
            if( result == null ) result = casePowerSystemResource( nonlinearShuntCompensator );
            if( result == null ) result = caseIdentifiedObject( nonlinearShuntCompensator );
            if( result == null ) result = caseCimObjectWithID( nonlinearShuntCompensator );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.PAN_DEMAND_RESPONSE: {
            PanDemandResponse panDemandResponse = ( PanDemandResponse ) theEObject;
            T result = casePanDemandResponse( panDemandResponse );
            if( result == null ) result = caseEndDeviceAction( panDemandResponse );
            if( result == null ) result = caseCimObjectWithID( panDemandResponse );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.SHUNT_COMPENSATOR: {
            ShuntCompensator shuntCompensator = ( ShuntCompensator ) theEObject;
            T result = caseShuntCompensator( shuntCompensator );
            if( result == null ) result = caseRegulatingCondEq( shuntCompensator );
            if( result == null ) result = caseEnergyConnection( shuntCompensator );
            if( result == null ) result = caseConductingEquipment( shuntCompensator );
            if( result == null ) result = caseEquipment( shuntCompensator );
            if( result == null ) result = casePowerSystemResource( shuntCompensator );
            if( result == null ) result = caseIdentifiedObject( shuntCompensator );
            if( result == null ) result = caseCimObjectWithID( shuntCompensator );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.MAINTENANCE_DATA_SET: {
            MaintenanceDataSet maintenanceDataSet = ( MaintenanceDataSet ) theEObject;
            T result = caseMaintenanceDataSet( maintenanceDataSet );
            if( result == null ) result = caseProcedureDataSet( maintenanceDataSet );
            if( result == null ) result = caseDocument( maintenanceDataSet );
            if( result == null ) result = caseIdentifiedObject( maintenanceDataSet );
            if( result == null ) result = caseCimObjectWithID( maintenanceDataSet );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.UNDEREXC_LIM_X1: {
            UnderexcLimX1 underexcLimX1 = ( UnderexcLimX1 ) theEObject;
            T result = caseUnderexcLimX1( underexcLimX1 );
            if( result == null ) result = caseUnderexcitationLimiterDynamics( underexcLimX1 );
            if( result == null ) result = caseDynamicsFunctionBlock( underexcLimX1 );
            if( result == null ) result = caseIdentifiedObject( underexcLimX1 );
            if( result == null ) result = caseCimObjectWithID( underexcLimX1 );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.ORGANISATION_ROLE: {
            OrganisationRole organisationRole = ( OrganisationRole ) theEObject;
            T result = caseOrganisationRole( organisationRole );
            if( result == null ) result = caseIdentifiedObject( organisationRole );
            if( result == null ) result = caseCimObjectWithID( organisationRole );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.GOV_STEAM_IEEE1: {
            GovSteamIEEE1 govSteamIEEE1 = ( GovSteamIEEE1 ) theEObject;
            T result = caseGovSteamIEEE1( govSteamIEEE1 );
            if( result == null ) result = caseTurbineGovernorDynamics( govSteamIEEE1 );
            if( result == null ) result = caseDynamicsFunctionBlock( govSteamIEEE1 );
            if( result == null ) result = caseIdentifiedObject( govSteamIEEE1 );
            if( result == null ) result = caseCimObjectWithID( govSteamIEEE1 );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.DC_EQUIPMENT_CONTAINER: {
            DCEquipmentContainer dcEquipmentContainer = ( DCEquipmentContainer ) theEObject;
            T result = caseDCEquipmentContainer( dcEquipmentContainer );
            if( result == null ) result = caseEquipmentContainer( dcEquipmentContainer );
            if( result == null ) result = caseConnectivityNodeContainer( dcEquipmentContainer );
            if( result == null ) result = casePowerSystemResource( dcEquipmentContainer );
            if( result == null ) result = caseIdentifiedObject( dcEquipmentContainer );
            if( result == null ) result = caseCimObjectWithID( dcEquipmentContainer );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.PSS_SH: {
            PssSH pssSH = ( PssSH ) theEObject;
            T result = casePssSH( pssSH );
            if( result == null ) result = casePowerSystemStabilizerDynamics( pssSH );
            if( result == null ) result = caseDynamicsFunctionBlock( pssSH );
            if( result == null ) result = caseIdentifiedObject( pssSH );
            if( result == null ) result = caseCimObjectWithID( pssSH );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.REPORTING_SUPER_GROUP: {
            ReportingSuperGroup reportingSuperGroup = ( ReportingSuperGroup ) theEObject;
            T result = caseReportingSuperGroup( reportingSuperGroup );
            if( result == null ) result = caseIdentifiedObject( reportingSuperGroup );
            if( result == null ) result = caseCimObjectWithID( reportingSuperGroup );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.VS_CONVERTER: {
            VsConverter vsConverter = ( VsConverter ) theEObject;
            T result = caseVsConverter( vsConverter );
            if( result == null ) result = caseACDCConverter( vsConverter );
            if( result == null ) result = caseConductingEquipment( vsConverter );
            if( result == null ) result = caseEquipment( vsConverter );
            if( result == null ) result = casePowerSystemResource( vsConverter );
            if( result == null ) result = caseIdentifiedObject( vsConverter );
            if( result == null ) result = caseCimObjectWithID( vsConverter );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.WIND_CONT_CURR_LIM_IEC: {
            WindContCurrLimIEC windContCurrLimIEC = ( WindContCurrLimIEC ) theEObject;
            T result = caseWindContCurrLimIEC( windContCurrLimIEC );
            if( result == null ) result = caseIdentifiedObject( windContCurrLimIEC );
            if( result == null ) result = caseCimObjectWithID( windContCurrLimIEC );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.EXC_DC3A: {
            ExcDC3A excDC3A = ( ExcDC3A ) theEObject;
            T result = caseExcDC3A( excDC3A );
            if( result == null ) result = caseExcitationSystemDynamics( excDC3A );
            if( result == null ) result = caseDynamicsFunctionBlock( excDC3A );
            if( result == null ) result = caseIdentifiedObject( excDC3A );
            if( result == null ) result = caseCimObjectWithID( excDC3A );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.STRING_MEASUREMENT: {
            StringMeasurement stringMeasurement = ( StringMeasurement ) theEObject;
            T result = caseStringMeasurement( stringMeasurement );
            if( result == null ) result = caseMeasurement( stringMeasurement );
            if( result == null ) result = caseIdentifiedObject( stringMeasurement );
            if( result == null ) result = caseCimObjectWithID( stringMeasurement );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.GOV_STEAM_FV3: {
            GovSteamFV3 govSteamFV3 = ( GovSteamFV3 ) theEObject;
            T result = caseGovSteamFV3( govSteamFV3 );
            if( result == null ) result = caseTurbineGovernorDynamics( govSteamFV3 );
            if( result == null ) result = caseDynamicsFunctionBlock( govSteamFV3 );
            if( result == null ) result = caseIdentifiedObject( govSteamFV3 );
            if( result == null ) result = caseCimObjectWithID( govSteamFV3 );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.MERCHANT_AGREEMENT: {
            MerchantAgreement merchantAgreement = ( MerchantAgreement ) theEObject;
            T result = caseMerchantAgreement( merchantAgreement );
            if( result == null ) result = caseAgreement( merchantAgreement );
            if( result == null ) result = caseDocument( merchantAgreement );
            if( result == null ) result = caseIdentifiedObject( merchantAgreement );
            if( result == null ) result = caseCimObjectWithID( merchantAgreement );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.EXC_IEEEST4B: {
            ExcIEEEST4B excIEEEST4B = ( ExcIEEEST4B ) theEObject;
            T result = caseExcIEEEST4B( excIEEEST4B );
            if( result == null ) result = caseExcitationSystemDynamics( excIEEEST4B );
            if( result == null ) result = caseDynamicsFunctionBlock( excIEEEST4B );
            if( result == null ) result = caseIdentifiedObject( excIEEEST4B );
            if( result == null ) result = caseCimObjectWithID( excIEEEST4B );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.END_DEVICE_INFO: {
            EndDeviceInfo endDeviceInfo = ( EndDeviceInfo ) theEObject;
            T result = caseEndDeviceInfo( endDeviceInfo );
            if( result == null ) result = caseAssetInfo( endDeviceInfo );
            if( result == null ) result = caseIdentifiedObject( endDeviceInfo );
            if( result == null ) result = caseCimObjectWithID( endDeviceInfo );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.LOAD_AGGREGATE: {
            LoadAggregate loadAggregate = ( LoadAggregate ) theEObject;
            T result = caseLoadAggregate( loadAggregate );
            if( result == null ) result = caseLoadDynamics( loadAggregate );
            if( result == null ) result = caseIdentifiedObject( loadAggregate );
            if( result == null ) result = caseCimObjectWithID( loadAggregate );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.INSPECTION_ANALOG: {
            InspectionAnalog inspectionAnalog = ( InspectionAnalog ) theEObject;
            T result = caseInspectionAnalog( inspectionAnalog );
            if( result == null ) result = caseAssetAnalog( inspectionAnalog );
            if( result == null ) result = caseAnalog( inspectionAnalog );
            if( result == null ) result = caseMeasurement( inspectionAnalog );
            if( result == null ) result = caseIdentifiedObject( inspectionAnalog );
            if( result == null ) result = caseCimObjectWithID( inspectionAnalog );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.UNDEREXCITATION_LIMITER_DYNAMICS: {
            UnderexcitationLimiterDynamics underexcitationLimiterDynamics = ( UnderexcitationLimiterDynamics ) theEObject;
            T result = caseUnderexcitationLimiterDynamics( underexcitationLimiterDynamics );
            if( result == null ) result = caseDynamicsFunctionBlock( underexcitationLimiterDynamics );
            if( result == null ) result = caseIdentifiedObject( underexcitationLimiterDynamics );
            if( result == null ) result = caseCimObjectWithID( underexcitationLimiterDynamics );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.NONLINEAR_SHUNT_COMPENSATOR_PHASE_POINT: {
            NonlinearShuntCompensatorPhasePoint nonlinearShuntCompensatorPhasePoint = ( NonlinearShuntCompensatorPhasePoint ) theEObject;
            T result = caseNonlinearShuntCompensatorPhasePoint( nonlinearShuntCompensatorPhasePoint );
            if( result == null ) result = caseCimObjectWithID( nonlinearShuntCompensatorPhasePoint );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.SHUNT_COMPENSATOR_INFO: {
            ShuntCompensatorInfo shuntCompensatorInfo = ( ShuntCompensatorInfo ) theEObject;
            T result = caseShuntCompensatorInfo( shuntCompensatorInfo );
            if( result == null ) result = caseAssetInfo( shuntCompensatorInfo );
            if( result == null ) result = caseIdentifiedObject( shuntCompensatorInfo );
            if( result == null ) result = caseCimObjectWithID( shuntCompensatorInfo );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.ASSET_LOCATION_HAZARD: {
            AssetLocationHazard assetLocationHazard = ( AssetLocationHazard ) theEObject;
            T result = caseAssetLocationHazard( assetLocationHazard );
            if( result == null ) result = caseHazard( assetLocationHazard );
            if( result == null ) result = caseIdentifiedObject( assetLocationHazard );
            if( result == null ) result = caseCimObjectWithID( assetLocationHazard );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.ASSET_STRING_MEASUREMENT: {
            AssetStringMeasurement assetStringMeasurement = ( AssetStringMeasurement ) theEObject;
            T result = caseAssetStringMeasurement( assetStringMeasurement );
            if( result == null ) result = caseStringMeasurement( assetStringMeasurement );
            if( result == null ) result = caseMeasurement( assetStringMeasurement );
            if( result == null ) result = caseIdentifiedObject( assetStringMeasurement );
            if( result == null ) result = caseCimObjectWithID( assetStringMeasurement );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.VCOMP_IEEE_TYPE2: {
            VCompIEEEType2 vCompIEEEType2 = ( VCompIEEEType2 ) theEObject;
            T result = caseVCompIEEEType2( vCompIEEEType2 );
            if( result == null ) result = caseVoltageCompensatorDynamics( vCompIEEEType2 );
            if( result == null ) result = caseDynamicsFunctionBlock( vCompIEEEType2 );
            if( result == null ) result = caseIdentifiedObject( vCompIEEEType2 );
            if( result == null ) result = caseCimObjectWithID( vCompIEEEType2 );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.EXC_IEEEST7B: {
            ExcIEEEST7B excIEEEST7B = ( ExcIEEEST7B ) theEObject;
            T result = caseExcIEEEST7B( excIEEEST7B );
            if( result == null ) result = caseExcitationSystemDynamics( excIEEEST7B );
            if( result == null ) result = caseDynamicsFunctionBlock( excIEEEST7B );
            if( result == null ) result = caseIdentifiedObject( excIEEEST7B );
            if( result == null ) result = caseCimObjectWithID( excIEEEST7B );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.TRANSFORMER_END: {
            TransformerEnd transformerEnd = ( TransformerEnd ) theEObject;
            T result = caseTransformerEnd( transformerEnd );
            if( result == null ) result = caseIdentifiedObject( transformerEnd );
            if( result == null ) result = caseCimObjectWithID( transformerEnd );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.INSTANCE_SET_MEMBER: {
            InstanceSetMember instanceSetMember = ( InstanceSetMember ) theEObject;
            T result = caseInstanceSetMember( instanceSetMember );
            if( result == null ) result = caseDataSetMember( instanceSetMember );
            if( result == null ) result = caseIdentifiedObject( instanceSetMember );
            if( result == null ) result = caseCimObjectWithID( instanceSetMember );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.EXC_IEEEAC6A: {
            ExcIEEEAC6A excIEEEAC6A = ( ExcIEEEAC6A ) theEObject;
            T result = caseExcIEEEAC6A( excIEEEAC6A );
            if( result == null ) result = caseExcitationSystemDynamics( excIEEEAC6A );
            if( result == null ) result = caseDynamicsFunctionBlock( excIEEEAC6A );
            if( result == null ) result = caseIdentifiedObject( excIEEEAC6A );
            if( result == null ) result = caseCimObjectWithID( excIEEEAC6A );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.INSPECTION_DISCRETE: {
            InspectionDiscrete inspectionDiscrete = ( InspectionDiscrete ) theEObject;
            T result = caseInspectionDiscrete( inspectionDiscrete );
            if( result == null ) result = caseAssetDiscrete( inspectionDiscrete );
            if( result == null ) result = caseDiscrete( inspectionDiscrete );
            if( result == null ) result = caseMeasurement( inspectionDiscrete );
            if( result == null ) result = caseIdentifiedObject( inspectionDiscrete );
            if( result == null ) result = caseCimObjectWithID( inspectionDiscrete );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.PRICING_STRUCTURE: {
            PricingStructure pricingStructure = ( PricingStructure ) theEObject;
            T result = casePricingStructure( pricingStructure );
            if( result == null ) result = caseDocument( pricingStructure );
            if( result == null ) result = caseIdentifiedObject( pricingStructure );
            if( result == null ) result = caseCimObjectWithID( pricingStructure );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.DER_GROUP_DISPATCH: {
            DERGroupDispatch derGroupDispatch = ( DERGroupDispatch ) theEObject;
            T result = caseDERGroupDispatch( derGroupDispatch );
            if( result == null ) result = caseIdentifiedObject( derGroupDispatch );
            if( result == null ) result = caseCimObjectWithID( derGroupDispatch );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.MATERIAL_ITEM: {
            MaterialItem materialItem = ( MaterialItem ) theEObject;
            T result = caseMaterialItem( materialItem );
            if( result == null ) result = caseIdentifiedObject( materialItem );
            if( result == null ) result = caseCimObjectWithID( materialItem );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.COMPOSITE_SWITCH: {
            CompositeSwitch compositeSwitch = ( CompositeSwitch ) theEObject;
            T result = caseCompositeSwitch( compositeSwitch );
            if( result == null ) result = caseEquipment( compositeSwitch );
            if( result == null ) result = casePowerSystemResource( compositeSwitch );
            if( result == null ) result = caseIdentifiedObject( compositeSwitch );
            if( result == null ) result = caseCimObjectWithID( compositeSwitch );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.ASSET_DEPLOYMENT: {
            AssetDeployment assetDeployment = ( AssetDeployment ) theEObject;
            T result = caseAssetDeployment( assetDeployment );
            if( result == null ) result = caseIdentifiedObject( assetDeployment );
            if( result == null ) result = caseCimObjectWithID( assetDeployment );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.OIL_ANALYSIS_PARTICLE_ANALOG: {
            OilAnalysisParticleAnalog oilAnalysisParticleAnalog = ( OilAnalysisParticleAnalog ) theEObject;
            T result = caseOilAnalysisParticleAnalog( oilAnalysisParticleAnalog );
            if( result == null ) result = caseAssetAnalog( oilAnalysisParticleAnalog );
            if( result == null ) result = caseAnalog( oilAnalysisParticleAnalog );
            if( result == null ) result = caseMeasurement( oilAnalysisParticleAnalog );
            if( result == null ) result = caseIdentifiedObject( oilAnalysisParticleAnalog );
            if( result == null ) result = caseCimObjectWithID( oilAnalysisParticleAnalog );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.CALCULATION_METHOD_ORDER: {
            CalculationMethodOrder calculationMethodOrder = ( CalculationMethodOrder ) theEObject;
            T result = caseCalculationMethodOrder( calculationMethodOrder );
            if( result == null ) result = caseCimObjectWithID( calculationMethodOrder );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.EXC_IEEEAC1A: {
            ExcIEEEAC1A excIEEEAC1A = ( ExcIEEEAC1A ) theEObject;
            T result = caseExcIEEEAC1A( excIEEEAC1A );
            if( result == null ) result = caseExcitationSystemDynamics( excIEEEAC1A );
            if( result == null ) result = caseDynamicsFunctionBlock( excIEEEAC1A );
            if( result == null ) result = caseIdentifiedObject( excIEEEAC1A );
            if( result == null ) result = caseCimObjectWithID( excIEEEAC1A );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.WIND_GEN_TYPE3B_IEC: {
            WindGenType3bIEC windGenType3bIEC = ( WindGenType3bIEC ) theEObject;
            T result = caseWindGenType3bIEC( windGenType3bIEC );
            if( result == null ) result = caseWindGenType3IEC( windGenType3bIEC );
            if( result == null ) result = caseIdentifiedObject( windGenType3bIEC );
            if( result == null ) result = caseCimObjectWithID( windGenType3bIEC );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.INCIDENT: {
            Incident incident = ( Incident ) theEObject;
            T result = caseIncident( incident );
            if( result == null ) result = caseDocument( incident );
            if( result == null ) result = caseIdentifiedObject( incident );
            if( result == null ) result = caseCimObjectWithID( incident );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.OVEREXC_LIM_X1: {
            OverexcLimX1 overexcLimX1 = ( OverexcLimX1 ) theEObject;
            T result = caseOverexcLimX1( overexcLimX1 );
            if( result == null ) result = caseOverexcitationLimiterDynamics( overexcLimX1 );
            if( result == null ) result = caseDynamicsFunctionBlock( overexcLimX1 );
            if( result == null ) result = caseIdentifiedObject( overexcLimX1 );
            if( result == null ) result = caseCimObjectWithID( overexcLimX1 );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.ASSET_ORGANISATION_ROLE: {
            AssetOrganisationRole assetOrganisationRole = ( AssetOrganisationRole ) theEObject;
            T result = caseAssetOrganisationRole( assetOrganisationRole );
            if( result == null ) result = caseOrganisationRole( assetOrganisationRole );
            if( result == null ) result = caseIdentifiedObject( assetOrganisationRole );
            if( result == null ) result = caseCimObjectWithID( assetOrganisationRole );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.LOCATION: {
            Location location = ( Location ) theEObject;
            T result = caseLocation( location );
            if( result == null ) result = caseIdentifiedObject( location );
            if( result == null ) result = caseCimObjectWithID( location );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.WORK_TASK: {
            WorkTask workTask = ( WorkTask ) theEObject;
            T result = caseWorkTask( workTask );
            if( result == null ) result = caseBaseWork( workTask );
            if( result == null ) result = caseDocument( workTask );
            if( result == null ) result = caseIdentifiedObject( workTask );
            if( result == null ) result = caseCimObjectWithID( workTask );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.EXC_AC8B: {
            ExcAC8B excAC8B = ( ExcAC8B ) theEObject;
            T result = caseExcAC8B( excAC8B );
            if( result == null ) result = caseExcitationSystemDynamics( excAC8B );
            if( result == null ) result = caseDynamicsFunctionBlock( excAC8B );
            if( result == null ) result = caseIdentifiedObject( excAC8B );
            if( result == null ) result = caseCimObjectWithID( excAC8B );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.GOV_STEAM_FV2: {
            GovSteamFV2 govSteamFV2 = ( GovSteamFV2 ) theEObject;
            T result = caseGovSteamFV2( govSteamFV2 );
            if( result == null ) result = caseTurbineGovernorDynamics( govSteamFV2 );
            if( result == null ) result = caseDynamicsFunctionBlock( govSteamFV2 );
            if( result == null ) result = caseIdentifiedObject( govSteamFV2 );
            if( result == null ) result = caseCimObjectWithID( govSteamFV2 );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.DC_CHOPPER: {
            DCChopper dcChopper = ( DCChopper ) theEObject;
            T result = caseDCChopper( dcChopper );
            if( result == null ) result = caseDCConductingEquipment( dcChopper );
            if( result == null ) result = caseEquipment( dcChopper );
            if( result == null ) result = casePowerSystemResource( dcChopper );
            if( result == null ) result = caseIdentifiedObject( dcChopper );
            if( result == null ) result = caseCimObjectWithID( dcChopper );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.CHEQUE: {
            Cheque cheque = ( Cheque ) theEObject;
            T result = caseCheque( cheque );
            if( result == null ) result = caseCimObjectWithID( cheque );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.VADJ_IEEE: {
            VAdjIEEE vAdjIEEE = ( VAdjIEEE ) theEObject;
            T result = caseVAdjIEEE( vAdjIEEE );
            if( result == null ) result = caseVoltageAdjusterDynamics( vAdjIEEE );
            if( result == null ) result = caseDynamicsFunctionBlock( vAdjIEEE );
            if( result == null ) result = caseIdentifiedObject( vAdjIEEE );
            if( result == null ) result = caseCimObjectWithID( vAdjIEEE );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.READING_QUALITY: {
            ReadingQuality readingQuality = ( ReadingQuality ) theEObject;
            T result = caseReadingQuality( readingQuality );
            if( result == null ) result = caseCimObjectWithID( readingQuality );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.GROUNDING_IMPEDANCE: {
            GroundingImpedance groundingImpedance = ( GroundingImpedance ) theEObject;
            T result = caseGroundingImpedance( groundingImpedance );
            if( result == null ) result = caseEarthFaultCompensator( groundingImpedance );
            if( result == null ) result = caseConductingEquipment( groundingImpedance );
            if( result == null ) result = caseEquipment( groundingImpedance );
            if( result == null ) result = casePowerSystemResource( groundingImpedance );
            if( result == null ) result = caseIdentifiedObject( groundingImpedance );
            if( result == null ) result = caseCimObjectWithID( groundingImpedance );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.INTERVAL_BLOCK: {
            IntervalBlock intervalBlock = ( IntervalBlock ) theEObject;
            T result = caseIntervalBlock( intervalBlock );
            if( result == null ) result = caseCimObjectWithID( intervalBlock );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.ENERGY_CONNECTION: {
            EnergyConnection energyConnection = ( EnergyConnection ) theEObject;
            T result = caseEnergyConnection( energyConnection );
            if( result == null ) result = caseConductingEquipment( energyConnection );
            if( result == null ) result = caseEquipment( energyConnection );
            if( result == null ) result = casePowerSystemResource( energyConnection );
            if( result == null ) result = caseIdentifiedObject( energyConnection );
            if( result == null ) result = caseCimObjectWithID( energyConnection );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.STREETLIGHT: {
            Streetlight streetlight = ( Streetlight ) theEObject;
            T result = caseStreetlight( streetlight );
            if( result == null ) result = caseAsset( streetlight );
            if( result == null ) result = caseIdentifiedObject( streetlight );
            if( result == null ) result = caseCimObjectWithID( streetlight );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.WIND_GEN_TYPE3_IEC: {
            WindGenType3IEC windGenType3IEC = ( WindGenType3IEC ) theEObject;
            T result = caseWindGenType3IEC( windGenType3IEC );
            if( result == null ) result = caseIdentifiedObject( windGenType3IEC );
            if( result == null ) result = caseCimObjectWithID( windGenType3IEC );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.DC_CONDUCTING_EQUIPMENT: {
            DCConductingEquipment dcConductingEquipment = ( DCConductingEquipment ) theEObject;
            T result = caseDCConductingEquipment( dcConductingEquipment );
            if( result == null ) result = caseEquipment( dcConductingEquipment );
            if( result == null ) result = casePowerSystemResource( dcConductingEquipment );
            if( result == null ) result = caseIdentifiedObject( dcConductingEquipment );
            if( result == null ) result = caseCimObjectWithID( dcConductingEquipment );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.ASYNCHRONOUS_MACHINE_USER_DEFINED: {
            AsynchronousMachineUserDefined asynchronousMachineUserDefined = ( AsynchronousMachineUserDefined ) theEObject;
            T result = caseAsynchronousMachineUserDefined( asynchronousMachineUserDefined );
            if( result == null ) result = caseAsynchronousMachineDynamics( asynchronousMachineUserDefined );
            if( result == null ) result = caseRotatingMachineDynamics( asynchronousMachineUserDefined );
            if( result == null ) result = caseDynamicsFunctionBlock( asynchronousMachineUserDefined );
            if( result == null ) result = caseIdentifiedObject( asynchronousMachineUserDefined );
            if( result == null ) result = caseCimObjectWithID( asynchronousMachineUserDefined );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.PREDICTIONS: {
            Predictions predictions = ( Predictions ) theEObject;
            T result = casePredictions( predictions );
            if( result == null ) result = caseCimObjectWithID( predictions );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.PSS_IEEE1A: {
            PssIEEE1A pssIEEE1A = ( PssIEEE1A ) theEObject;
            T result = casePssIEEE1A( pssIEEE1A );
            if( result == null ) result = casePowerSystemStabilizerDynamics( pssIEEE1A );
            if( result == null ) result = caseDynamicsFunctionBlock( pssIEEE1A );
            if( result == null ) result = caseIdentifiedObject( pssIEEE1A );
            if( result == null ) result = caseCimObjectWithID( pssIEEE1A );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.END_DEVICE_CONTROL_TYPE: {
            EndDeviceControlType endDeviceControlType = ( EndDeviceControlType ) theEObject;
            T result = caseEndDeviceControlType( endDeviceControlType );
            if( result == null ) result = caseIdentifiedObject( endDeviceControlType );
            if( result == null ) result = caseCimObjectWithID( endDeviceControlType );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.OPERATING_MECHANISM_INFO: {
            OperatingMechanismInfo operatingMechanismInfo = ( OperatingMechanismInfo ) theEObject;
            T result = caseOperatingMechanismInfo( operatingMechanismInfo );
            if( result == null ) result = caseAssetInfo( operatingMechanismInfo );
            if( result == null ) result = caseIdentifiedObject( operatingMechanismInfo );
            if( result == null ) result = caseCimObjectWithID( operatingMechanismInfo );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.OIL_ANALYSIS_GAS_ANALOG: {
            OilAnalysisGasAnalog oilAnalysisGasAnalog = ( OilAnalysisGasAnalog ) theEObject;
            T result = caseOilAnalysisGasAnalog( oilAnalysisGasAnalog );
            if( result == null ) result = caseAssetAnalog( oilAnalysisGasAnalog );
            if( result == null ) result = caseAnalog( oilAnalysisGasAnalog );
            if( result == null ) result = caseMeasurement( oilAnalysisGasAnalog );
            if( result == null ) result = caseIdentifiedObject( oilAnalysisGasAnalog );
            if( result == null ) result = caseCimObjectWithID( oilAnalysisGasAnalog );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.OIL_ANALYSIS_PCB_ANALOG: {
            OilAnalysisPCBAnalog oilAnalysisPCBAnalog = ( OilAnalysisPCBAnalog ) theEObject;
            T result = caseOilAnalysisPCBAnalog( oilAnalysisPCBAnalog );
            if( result == null ) result = caseAssetAnalog( oilAnalysisPCBAnalog );
            if( result == null ) result = caseAnalog( oilAnalysisPCBAnalog );
            if( result == null ) result = caseMeasurement( oilAnalysisPCBAnalog );
            if( result == null ) result = caseIdentifiedObject( oilAnalysisPCBAnalog );
            if( result == null ) result = caseCimObjectWithID( oilAnalysisPCBAnalog );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.MUTUAL_COUPLING: {
            MutualCoupling mutualCoupling = ( MutualCoupling ) theEObject;
            T result = caseMutualCoupling( mutualCoupling );
            if( result == null ) result = caseIdentifiedObject( mutualCoupling );
            if( result == null ) result = caseCimObjectWithID( mutualCoupling );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.OTHER_CAPABILITY: {
            OtherCapability otherCapability = ( OtherCapability ) theEObject;
            T result = caseOtherCapability( otherCapability );
            if( result == null ) result = caseDERCapabilities( otherCapability );
            if( result == null ) result = caseCimObjectWithID( otherCapability );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.ACCUMULATOR: {
            Accumulator accumulator = ( Accumulator ) theEObject;
            T result = caseAccumulator( accumulator );
            if( result == null ) result = caseMeasurement( accumulator );
            if( result == null ) result = caseIdentifiedObject( accumulator );
            if( result == null ) result = caseCimObjectWithID( accumulator );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.GOV_CT1: {
            GovCT1 govCT1 = ( GovCT1 ) theEObject;
            T result = caseGovCT1( govCT1 );
            if( result == null ) result = caseTurbineGovernorDynamics( govCT1 );
            if( result == null ) result = caseDynamicsFunctionBlock( govCT1 );
            if( result == null ) result = caseIdentifiedObject( govCT1 );
            if( result == null ) result = caseCimObjectWithID( govCT1 );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.WIRE_SPACING: {
            WireSpacing wireSpacing = ( WireSpacing ) theEObject;
            T result = caseWireSpacing( wireSpacing );
            if( result == null ) result = caseIdentifiedObject( wireSpacing );
            if( result == null ) result = caseCimObjectWithID( wireSpacing );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.WIND_MECH_IEC: {
            WindMechIEC windMechIEC = ( WindMechIEC ) theEObject;
            T result = caseWindMechIEC( windMechIEC );
            if( result == null ) result = caseIdentifiedObject( windMechIEC );
            if( result == null ) result = caseCimObjectWithID( windMechIEC );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.WIND_CONT_PTYPE4A_IEC: {
            WindContPType4aIEC windContPType4aIEC = ( WindContPType4aIEC ) theEObject;
            T result = caseWindContPType4aIEC( windContPType4aIEC );
            if( result == null ) result = caseIdentifiedObject( windContPType4aIEC );
            if( result == null ) result = caseCimObjectWithID( windContPType4aIEC );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.ACDC_CONVERTER_DC_TERMINAL: {
            ACDCConverterDCTerminal acdcConverterDCTerminal = ( ACDCConverterDCTerminal ) theEObject;
            T result = caseACDCConverterDCTerminal( acdcConverterDCTerminal );
            if( result == null ) result = caseDCBaseTerminal( acdcConverterDCTerminal );
            if( result == null ) result = caseACDCTerminal( acdcConverterDCTerminal );
            if( result == null ) result = caseIdentifiedObject( acdcConverterDCTerminal );
            if( result == null ) result = caseCimObjectWithID( acdcConverterDCTerminal );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.CUSTOMER_NOTIFICATION: {
            CustomerNotification customerNotification = ( CustomerNotification ) theEObject;
            T result = caseCustomerNotification( customerNotification );
            if( result == null ) result = caseCimObjectWithID( customerNotification );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.COMMUNICATION_LINK: {
            CommunicationLink communicationLink = ( CommunicationLink ) theEObject;
            T result = caseCommunicationLink( communicationLink );
            if( result == null ) result = casePowerSystemResource( communicationLink );
            if( result == null ) result = caseIdentifiedObject( communicationLink );
            if( result == null ) result = caseCimObjectWithID( communicationLink );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.ASSET_OWNER: {
            AssetOwner assetOwner = ( AssetOwner ) theEObject;
            T result = caseAssetOwner( assetOwner );
            if( result == null ) result = caseAssetOrganisationRole( assetOwner );
            if( result == null ) result = caseOrganisationRole( assetOwner );
            if( result == null ) result = caseIdentifiedObject( assetOwner );
            if( result == null ) result = caseCimObjectWithID( assetOwner );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.GOV_HYDRO_PELTON: {
            GovHydroPelton govHydroPelton = ( GovHydroPelton ) theEObject;
            T result = caseGovHydroPelton( govHydroPelton );
            if( result == null ) result = caseTurbineGovernorDynamics( govHydroPelton );
            if( result == null ) result = caseDynamicsFunctionBlock( govHydroPelton );
            if( result == null ) result = caseIdentifiedObject( govHydroPelton );
            if( result == null ) result = caseCimObjectWithID( govHydroPelton );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.WIND_TURBINE_TYPE1OR2_IEC: {
            WindTurbineType1or2IEC windTurbineType1or2IEC = ( WindTurbineType1or2IEC ) theEObject;
            T result = caseWindTurbineType1or2IEC( windTurbineType1or2IEC );
            if( result == null ) result = caseWindTurbineType1or2Dynamics( windTurbineType1or2IEC );
            if( result == null ) result = caseDynamicsFunctionBlock( windTurbineType1or2IEC );
            if( result == null ) result = caseIdentifiedObject( windTurbineType1or2IEC );
            if( result == null ) result = caseCimObjectWithID( windTurbineType1or2IEC );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.MAINTAINER: {
            Maintainer maintainer = ( Maintainer ) theEObject;
            T result = caseMaintainer( maintainer );
            if( result == null ) result = caseAssetOrganisationRole( maintainer );
            if( result == null ) result = caseOrganisationRole( maintainer );
            if( result == null ) result = caseIdentifiedObject( maintainer );
            if( result == null ) result = caseCimObjectWithID( maintainer );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.OVEREXCITATION_LIMITER_USER_DEFINED: {
            OverexcitationLimiterUserDefined overexcitationLimiterUserDefined = ( OverexcitationLimiterUserDefined ) theEObject;
            T result = caseOverexcitationLimiterUserDefined( overexcitationLimiterUserDefined );
            if( result == null ) result = caseOverexcitationLimiterDynamics( overexcitationLimiterUserDefined );
            if( result == null ) result = caseDynamicsFunctionBlock( overexcitationLimiterUserDefined );
            if( result == null ) result = caseIdentifiedObject( overexcitationLimiterUserDefined );
            if( result == null ) result = caseCimObjectWithID( overexcitationLimiterUserDefined );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.PFV_AR_CONTROLLER_TYPE2_DYNAMICS: {
            PFVArControllerType2Dynamics pfvArControllerType2Dynamics = ( PFVArControllerType2Dynamics ) theEObject;
            T result = casePFVArControllerType2Dynamics( pfvArControllerType2Dynamics );
            if( result == null ) result = caseDynamicsFunctionBlock( pfvArControllerType2Dynamics );
            if( result == null ) result = caseIdentifiedObject( pfvArControllerType2Dynamics );
            if( result == null ) result = caseCimObjectWithID( pfvArControllerType2Dynamics );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.REGULAR_INTERVAL_SCHEDULE: {
            RegularIntervalSchedule regularIntervalSchedule = ( RegularIntervalSchedule ) theEObject;
            T result = caseRegularIntervalSchedule( regularIntervalSchedule );
            if( result == null ) result = caseBasicIntervalSchedule( regularIntervalSchedule );
            if( result == null ) result = caseIdentifiedObject( regularIntervalSchedule );
            if( result == null ) result = caseCimObjectWithID( regularIntervalSchedule );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.EXC_IEEEDC3A: {
            ExcIEEEDC3A excIEEEDC3A = ( ExcIEEEDC3A ) theEObject;
            T result = caseExcIEEEDC3A( excIEEEDC3A );
            if( result == null ) result = caseExcitationSystemDynamics( excIEEEDC3A );
            if( result == null ) result = caseDynamicsFunctionBlock( excIEEEDC3A );
            if( result == null ) result = caseIdentifiedObject( excIEEEDC3A );
            if( result == null ) result = caseCimObjectWithID( excIEEEDC3A );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.LOAD_AREA: {
            LoadArea loadArea = ( LoadArea ) theEObject;
            T result = caseLoadArea( loadArea );
            if( result == null ) result = caseEnergyArea( loadArea );
            if( result == null ) result = caseIdentifiedObject( loadArea );
            if( result == null ) result = caseCimObjectWithID( loadArea );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.DISC_EXC_CONT_IEEEDEC3A: {
            DiscExcContIEEEDEC3A discExcContIEEEDEC3A = ( DiscExcContIEEEDEC3A ) theEObject;
            T result = caseDiscExcContIEEEDEC3A( discExcContIEEEDEC3A );
            if( result == null ) result = caseDiscontinuousExcitationControlDynamics( discExcContIEEEDEC3A );
            if( result == null ) result = caseDynamicsFunctionBlock( discExcContIEEEDEC3A );
            if( result == null ) result = caseIdentifiedObject( discExcContIEEEDEC3A );
            if( result == null ) result = caseCimObjectWithID( discExcContIEEEDEC3A );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.ACCOUNT_NOTIFICATION: {
            AccountNotification accountNotification = ( AccountNotification ) theEObject;
            T result = caseAccountNotification( accountNotification );
            if( result == null ) result = caseCimObjectWithID( accountNotification );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.EXC_CZ: {
            ExcCZ excCZ = ( ExcCZ ) theEObject;
            T result = caseExcCZ( excCZ );
            if( result == null ) result = caseExcitationSystemDynamics( excCZ );
            if( result == null ) result = caseDynamicsFunctionBlock( excCZ );
            if( result == null ) result = caseIdentifiedObject( excCZ );
            if( result == null ) result = caseCimObjectWithID( excCZ );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.OPERATIONAL_LIMIT_SET: {
            OperationalLimitSet operationalLimitSet = ( OperationalLimitSet ) theEObject;
            T result = caseOperationalLimitSet( operationalLimitSet );
            if( result == null ) result = caseIdentifiedObject( operationalLimitSet );
            if( result == null ) result = caseCimObjectWithID( operationalLimitSet );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.DYNAMICS_FUNCTION_BLOCK: {
            DynamicsFunctionBlock dynamicsFunctionBlock = ( DynamicsFunctionBlock ) theEObject;
            T result = caseDynamicsFunctionBlock( dynamicsFunctionBlock );
            if( result == null ) result = caseIdentifiedObject( dynamicsFunctionBlock );
            if( result == null ) result = caseCimObjectWithID( dynamicsFunctionBlock );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.SEAL: {
            Seal seal = ( Seal ) theEObject;
            T result = caseSeal( seal );
            if( result == null ) result = caseIdentifiedObject( seal );
            if( result == null ) result = caseCimObjectWithID( seal );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.SAFETY_DOCUMENT: {
            SafetyDocument safetyDocument = ( SafetyDocument ) theEObject;
            T result = caseSafetyDocument( safetyDocument );
            if( result == null ) result = caseDocument( safetyDocument );
            if( result == null ) result = caseIdentifiedObject( safetyDocument );
            if( result == null ) result = caseCimObjectWithID( safetyDocument );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.GOV_CT2: {
            GovCT2 govCT2 = ( GovCT2 ) theEObject;
            T result = caseGovCT2( govCT2 );
            if( result == null ) result = caseTurbineGovernorDynamics( govCT2 );
            if( result == null ) result = caseDynamicsFunctionBlock( govCT2 );
            if( result == null ) result = caseIdentifiedObject( govCT2 );
            if( result == null ) result = caseCimObjectWithID( govCT2 );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.WIND_CONT_PITCH_ANGLE_IEC: {
            WindContPitchAngleIEC windContPitchAngleIEC = ( WindContPitchAngleIEC ) theEObject;
            T result = caseWindContPitchAngleIEC( windContPitchAngleIEC );
            if( result == null ) result = caseIdentifiedObject( windContPitchAngleIEC );
            if( result == null ) result = caseCimObjectWithID( windContPitchAngleIEC );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.WIND_PLANT_REACTIVE_CONTROL_IEC: {
            WindPlantReactiveControlIEC windPlantReactiveControlIEC = ( WindPlantReactiveControlIEC ) theEObject;
            T result = caseWindPlantReactiveControlIEC( windPlantReactiveControlIEC );
            if( result == null ) result = caseIdentifiedObject( windPlantReactiveControlIEC );
            if( result == null ) result = caseCimObjectWithID( windPlantReactiveControlIEC );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.TAP_CHANGER_TABLE_POINT: {
            TapChangerTablePoint tapChangerTablePoint = ( TapChangerTablePoint ) theEObject;
            T result = caseTapChangerTablePoint( tapChangerTablePoint );
            if( result == null ) result = caseCimObjectWithID( tapChangerTablePoint );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.CONTINGENCY_EQUIPMENT: {
            ContingencyEquipment contingencyEquipment = ( ContingencyEquipment ) theEObject;
            T result = caseContingencyEquipment( contingencyEquipment );
            if( result == null ) result = caseContingencyElement( contingencyEquipment );
            if( result == null ) result = caseIdentifiedObject( contingencyEquipment );
            if( result == null ) result = caseCimObjectWithID( contingencyEquipment );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.WIND_GEN_TURBINE_TYPE2_IEC: {
            WindGenTurbineType2IEC windGenTurbineType2IEC = ( WindGenTurbineType2IEC ) theEObject;
            T result = caseWindGenTurbineType2IEC( windGenTurbineType2IEC );
            if( result == null ) result = caseWindTurbineType1or2IEC( windGenTurbineType2IEC );
            if( result == null ) result = caseWindTurbineType1or2Dynamics( windGenTurbineType2IEC );
            if( result == null ) result = caseDynamicsFunctionBlock( windGenTurbineType2IEC );
            if( result == null ) result = caseIdentifiedObject( windGenTurbineType2IEC );
            if( result == null ) result = caseCimObjectWithID( windGenTurbineType2IEC );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.PROVIDED_BILATERAL_POINT: {
            ProvidedBilateralPoint providedBilateralPoint = ( ProvidedBilateralPoint ) theEObject;
            T result = caseProvidedBilateralPoint( providedBilateralPoint );
            if( result == null ) result = caseIdentifiedObject( providedBilateralPoint );
            if( result == null ) result = caseCimObjectWithID( providedBilateralPoint );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.PER_LENGTH_LINE_PARAMETER: {
            PerLengthLineParameter perLengthLineParameter = ( PerLengthLineParameter ) theEObject;
            T result = casePerLengthLineParameter( perLengthLineParameter );
            if( result == null ) result = caseIdentifiedObject( perLengthLineParameter );
            if( result == null ) result = caseCimObjectWithID( perLengthLineParameter );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.EARTH_FAULT_COMPENSATOR: {
            EarthFaultCompensator earthFaultCompensator = ( EarthFaultCompensator ) theEObject;
            T result = caseEarthFaultCompensator( earthFaultCompensator );
            if( result == null ) result = caseConductingEquipment( earthFaultCompensator );
            if( result == null ) result = caseEquipment( earthFaultCompensator );
            if( result == null ) result = casePowerSystemResource( earthFaultCompensator );
            if( result == null ) result = caseIdentifiedObject( earthFaultCompensator );
            if( result == null ) result = caseCimObjectWithID( earthFaultCompensator );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.EQUIPMENT_CONTAINER: {
            EquipmentContainer equipmentContainer = ( EquipmentContainer ) theEObject;
            T result = caseEquipmentContainer( equipmentContainer );
            if( result == null ) result = caseConnectivityNodeContainer( equipmentContainer );
            if( result == null ) result = casePowerSystemResource( equipmentContainer );
            if( result == null ) result = caseIdentifiedObject( equipmentContainer );
            if( result == null ) result = caseCimObjectWithID( equipmentContainer );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.HAZARD: {
            Hazard hazard = ( Hazard ) theEObject;
            T result = caseHazard( hazard );
            if( result == null ) result = caseIdentifiedObject( hazard );
            if( result == null ) result = caseCimObjectWithID( hazard );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.ASSET_INFO: {
            AssetInfo assetInfo = ( AssetInfo ) theEObject;
            T result = caseAssetInfo( assetInfo );
            if( result == null ) result = caseIdentifiedObject( assetInfo );
            if( result == null ) result = caseCimObjectWithID( assetInfo );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.ACDC_TERMINAL: {
            ACDCTerminal acdcTerminal = ( ACDCTerminal ) theEObject;
            T result = caseACDCTerminal( acdcTerminal );
            if( result == null ) result = caseIdentifiedObject( acdcTerminal );
            if( result == null ) result = caseCimObjectWithID( acdcTerminal );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.PSS_IEEE2B: {
            PssIEEE2B pssIEEE2B = ( PssIEEE2B ) theEObject;
            T result = casePssIEEE2B( pssIEEE2B );
            if( result == null ) result = casePowerSystemStabilizerDynamics( pssIEEE2B );
            if( result == null ) result = caseDynamicsFunctionBlock( pssIEEE2B );
            if( result == null ) result = caseIdentifiedObject( pssIEEE2B );
            if( result == null ) result = caseCimObjectWithID( pssIEEE2B );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.STEAM_TURBINE: {
            SteamTurbine steamTurbine = ( SteamTurbine ) theEObject;
            T result = caseSteamTurbine( steamTurbine );
            if( result == null ) result = casePrimeMover( steamTurbine );
            if( result == null ) result = casePowerSystemResource( steamTurbine );
            if( result == null ) result = caseIdentifiedObject( steamTurbine );
            if( result == null ) result = caseCimObjectWithID( steamTurbine );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.WIND_CONT_PTYPE3_IEC: {
            WindContPType3IEC windContPType3IEC = ( WindContPType3IEC ) theEObject;
            T result = caseWindContPType3IEC( windContPType3IEC );
            if( result == null ) result = caseIdentifiedObject( windContPType3IEC );
            if( result == null ) result = caseCimObjectWithID( windContPType3IEC );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.PETERSEN_COIL: {
            PetersenCoil petersenCoil = ( PetersenCoil ) theEObject;
            T result = casePetersenCoil( petersenCoil );
            if( result == null ) result = caseEarthFaultCompensator( petersenCoil );
            if( result == null ) result = caseConductingEquipment( petersenCoil );
            if( result == null ) result = caseEquipment( petersenCoil );
            if( result == null ) result = casePowerSystemResource( petersenCoil );
            if( result == null ) result = caseIdentifiedObject( petersenCoil );
            if( result == null ) result = caseCimObjectWithID( petersenCoil );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.ESTIMATED_RESTORATION_TIME: {
            EstimatedRestorationTime estimatedRestorationTime = ( EstimatedRestorationTime ) theEObject;
            T result = caseEstimatedRestorationTime( estimatedRestorationTime );
            if( result == null ) result = caseCimObjectWithID( estimatedRestorationTime );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.ASYNCHRONOUS_MACHINE_DYNAMICS: {
            AsynchronousMachineDynamics asynchronousMachineDynamics = ( AsynchronousMachineDynamics ) theEObject;
            T result = caseAsynchronousMachineDynamics( asynchronousMachineDynamics );
            if( result == null ) result = caseRotatingMachineDynamics( asynchronousMachineDynamics );
            if( result == null ) result = caseDynamicsFunctionBlock( asynchronousMachineDynamics );
            if( result == null ) result = caseIdentifiedObject( asynchronousMachineDynamics );
            if( result == null ) result = caseCimObjectWithID( asynchronousMachineDynamics );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.JOINT: {
            Joint joint = ( Joint ) theEObject;
            T result = caseJoint( joint );
            if( result == null ) result = caseAsset( joint );
            if( result == null ) result = caseIdentifiedObject( joint );
            if( result == null ) result = caseCimObjectWithID( joint );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.STEAM_SENDOUT_SCHEDULE: {
            SteamSendoutSchedule steamSendoutSchedule = ( SteamSendoutSchedule ) theEObject;
            T result = caseSteamSendoutSchedule( steamSendoutSchedule );
            if( result == null ) result = caseRegularIntervalSchedule( steamSendoutSchedule );
            if( result == null ) result = caseBasicIntervalSchedule( steamSendoutSchedule );
            if( result == null ) result = caseIdentifiedObject( steamSendoutSchedule );
            if( result == null ) result = caseCimObjectWithID( steamSendoutSchedule );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.EXC_IEEEST1A: {
            ExcIEEEST1A excIEEEST1A = ( ExcIEEEST1A ) theEObject;
            T result = caseExcIEEEST1A( excIEEEST1A );
            if( result == null ) result = caseExcitationSystemDynamics( excIEEEST1A );
            if( result == null ) result = caseDynamicsFunctionBlock( excIEEEST1A );
            if( result == null ) result = caseIdentifiedObject( excIEEEST1A );
            if( result == null ) result = caseCimObjectWithID( excIEEEST1A );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.TROUBLE_TICKET: {
            TroubleTicket troubleTicket = ( TroubleTicket ) theEObject;
            T result = caseTroubleTicket( troubleTicket );
            if( result == null ) result = caseDocument( troubleTicket );
            if( result == null ) result = caseIdentifiedObject( troubleTicket );
            if( result == null ) result = caseCimObjectWithID( troubleTicket );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.REGULATING_CONTROL: {
            RegulatingControl regulatingControl = ( RegulatingControl ) theEObject;
            T result = caseRegulatingControl( regulatingControl );
            if( result == null ) result = casePowerSystemResource( regulatingControl );
            if( result == null ) result = caseIdentifiedObject( regulatingControl );
            if( result == null ) result = caseCimObjectWithID( regulatingControl );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.GOV_STEAM0: {
            GovSteam0 govSteam0 = ( GovSteam0 ) theEObject;
            T result = caseGovSteam0( govSteam0 );
            if( result == null ) result = caseTurbineGovernorDynamics( govSteam0 );
            if( result == null ) result = caseDynamicsFunctionBlock( govSteam0 );
            if( result == null ) result = caseIdentifiedObject( govSteam0 );
            if( result == null ) result = caseCimObjectWithID( govSteam0 );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.TASE2_BILATERAL_TABLE: {
            TASE2BilateralTable tase2BilateralTable = ( TASE2BilateralTable ) theEObject;
            T result = caseTASE2BilateralTable( tase2BilateralTable );
            if( result == null ) result = caseBilateralExchangeAgreement( tase2BilateralTable );
            if( result == null ) result = caseIdentifiedObject( tase2BilateralTable );
            if( result == null ) result = caseCimObjectWithID( tase2BilateralTable );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.GROUND_DISCONNECTOR: {
            GroundDisconnector groundDisconnector = ( GroundDisconnector ) theEObject;
            T result = caseGroundDisconnector( groundDisconnector );
            if( result == null ) result = caseSwitch( groundDisconnector );
            if( result == null ) result = caseConductingEquipment( groundDisconnector );
            if( result == null ) result = caseEquipment( groundDisconnector );
            if( result == null ) result = casePowerSystemResource( groundDisconnector );
            if( result == null ) result = caseIdentifiedObject( groundDisconnector );
            if( result == null ) result = caseCimObjectWithID( groundDisconnector );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.PSS1_A: {
            Pss1A pss1A = ( Pss1A ) theEObject;
            T result = casePss1A( pss1A );
            if( result == null ) result = casePowerSystemStabilizerDynamics( pss1A );
            if( result == null ) result = caseDynamicsFunctionBlock( pss1A );
            if( result == null ) result = caseIdentifiedObject( pss1A );
            if( result == null ) result = caseCimObjectWithID( pss1A );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.GEN_UNIT_OP_COST_CURVE: {
            GenUnitOpCostCurve genUnitOpCostCurve = ( GenUnitOpCostCurve ) theEObject;
            T result = caseGenUnitOpCostCurve( genUnitOpCostCurve );
            if( result == null ) result = caseCurve( genUnitOpCostCurve );
            if( result == null ) result = caseIdentifiedObject( genUnitOpCostCurve );
            if( result == null ) result = caseCimObjectWithID( genUnitOpCostCurve );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.POWER_ELECTRONICS_CONNECTION: {
            PowerElectronicsConnection powerElectronicsConnection = ( PowerElectronicsConnection ) theEObject;
            T result = casePowerElectronicsConnection( powerElectronicsConnection );
            if( result == null ) result = caseRegulatingCondEq( powerElectronicsConnection );
            if( result == null ) result = caseEnergyConnection( powerElectronicsConnection );
            if( result == null ) result = caseConductingEquipment( powerElectronicsConnection );
            if( result == null ) result = caseEquipment( powerElectronicsConnection );
            if( result == null ) result = casePowerSystemResource( powerElectronicsConnection );
            if( result == null ) result = caseIdentifiedObject( powerElectronicsConnection );
            if( result == null ) result = caseCimObjectWithID( powerElectronicsConnection );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.PERSON: {
            Person person = ( Person ) theEObject;
            T result = casePerson( person );
            if( result == null ) result = caseIdentifiedObject( person );
            if( result == null ) result = caseCimObjectWithID( person );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.PSS_IEEE4B: {
            PssIEEE4B pssIEEE4B = ( PssIEEE4B ) theEObject;
            T result = casePssIEEE4B( pssIEEE4B );
            if( result == null ) result = casePowerSystemStabilizerDynamics( pssIEEE4B );
            if( result == null ) result = caseDynamicsFunctionBlock( pssIEEE4B );
            if( result == null ) result = caseIdentifiedObject( pssIEEE4B );
            if( result == null ) result = caseCimObjectWithID( pssIEEE4B );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.SOURCING_ACTOR: {
            SourcingActor sourcingActor = ( SourcingActor ) theEObject;
            T result = caseSourcingActor( sourcingActor );
            if( result == null ) result = caseCimObjectWithID( sourcingActor );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.GOV_HYDRO1: {
            GovHydro1 govHydro1 = ( GovHydro1 ) theEObject;
            T result = caseGovHydro1( govHydro1 );
            if( result == null ) result = caseTurbineGovernorDynamics( govHydro1 );
            if( result == null ) result = caseDynamicsFunctionBlock( govHydro1 );
            if( result == null ) result = caseIdentifiedObject( govHydro1 );
            if( result == null ) result = caseCimObjectWithID( govHydro1 );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.WIND_GEN_TYPE4_IEC: {
            WindGenType4IEC windGenType4IEC = ( WindGenType4IEC ) theEObject;
            T result = caseWindGenType4IEC( windGenType4IEC );
            if( result == null ) result = caseIdentifiedObject( windGenType4IEC );
            if( result == null ) result = caseCimObjectWithID( windGenType4IEC );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.SYNCHRONOUS_MACHINE_DETAILED: {
            SynchronousMachineDetailed synchronousMachineDetailed = ( SynchronousMachineDetailed ) theEObject;
            T result = caseSynchronousMachineDetailed( synchronousMachineDetailed );
            if( result == null ) result = caseSynchronousMachineDynamics( synchronousMachineDetailed );
            if( result == null ) result = caseRotatingMachineDynamics( synchronousMachineDetailed );
            if( result == null ) result = caseDynamicsFunctionBlock( synchronousMachineDetailed );
            if( result == null ) result = caseIdentifiedObject( synchronousMachineDetailed );
            if( result == null ) result = caseCimObjectWithID( synchronousMachineDetailed );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.VOLTAGE_CONTROL_ZONE: {
            VoltageControlZone voltageControlZone = ( VoltageControlZone ) theEObject;
            T result = caseVoltageControlZone( voltageControlZone );
            if( result == null ) result = casePowerSystemResource( voltageControlZone );
            if( result == null ) result = caseIdentifiedObject( voltageControlZone );
            if( result == null ) result = caseCimObjectWithID( voltageControlZone );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.DISCRETE_COMMAND: {
            DiscreteCommand discreteCommand = ( DiscreteCommand ) theEObject;
            T result = caseDiscreteCommand( discreteCommand );
            if( result == null ) result = caseCommand( discreteCommand );
            if( result == null ) result = caseControl( discreteCommand );
            if( result == null ) result = caseIOPoint( discreteCommand );
            if( result == null ) result = caseIdentifiedObject( discreteCommand );
            if( result == null ) result = caseCimObjectWithID( discreteCommand );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.BASE_VOLTAGE: {
            BaseVoltage baseVoltage = ( BaseVoltage ) theEObject;
            T result = caseBaseVoltage( baseVoltage );
            if( result == null ) result = caseIdentifiedObject( baseVoltage );
            if( result == null ) result = caseCimObjectWithID( baseVoltage );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.END_DEVICE_CONTROL: {
            EndDeviceControl endDeviceControl = ( EndDeviceControl ) theEObject;
            T result = caseEndDeviceControl( endDeviceControl );
            if( result == null ) result = caseIdentifiedObject( endDeviceControl );
            if( result == null ) result = caseCimObjectWithID( endDeviceControl );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.CONFORM_LOAD_GROUP: {
            ConformLoadGroup conformLoadGroup = ( ConformLoadGroup ) theEObject;
            T result = caseConformLoadGroup( conformLoadGroup );
            if( result == null ) result = caseLoadGroup( conformLoadGroup );
            if( result == null ) result = caseIdentifiedObject( conformLoadGroup );
            if( result == null ) result = caseCimObjectWithID( conformLoadGroup );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.UNDEREXC_LIM_IEEE1: {
            UnderexcLimIEEE1 underexcLimIEEE1 = ( UnderexcLimIEEE1 ) theEObject;
            T result = caseUnderexcLimIEEE1( underexcLimIEEE1 );
            if( result == null ) result = caseUnderexcitationLimiterDynamics( underexcLimIEEE1 );
            if( result == null ) result = caseDynamicsFunctionBlock( underexcLimIEEE1 );
            if( result == null ) result = caseIdentifiedObject( underexcLimIEEE1 );
            if( result == null ) result = caseCimObjectWithID( underexcLimIEEE1 );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.ENERGY_CONSUMER: {
            EnergyConsumer energyConsumer = ( EnergyConsumer ) theEObject;
            T result = caseEnergyConsumer( energyConsumer );
            if( result == null ) result = caseEnergyConnection( energyConsumer );
            if( result == null ) result = caseConductingEquipment( energyConsumer );
            if( result == null ) result = caseEquipment( energyConsumer );
            if( result == null ) result = casePowerSystemResource( energyConsumer );
            if( result == null ) result = caseIdentifiedObject( energyConsumer );
            if( result == null ) result = caseCimObjectWithID( energyConsumer );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.MEASUREMENT_VALUE_SOURCE: {
            MeasurementValueSource measurementValueSource = ( MeasurementValueSource ) theEObject;
            T result = caseMeasurementValueSource( measurementValueSource );
            if( result == null ) result = caseIdentifiedObject( measurementValueSource );
            if( result == null ) result = caseCimObjectWithID( measurementValueSource );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.POWER_CUT_ZONE: {
            PowerCutZone powerCutZone = ( PowerCutZone ) theEObject;
            T result = casePowerCutZone( powerCutZone );
            if( result == null ) result = casePowerSystemResource( powerCutZone );
            if( result == null ) result = caseIdentifiedObject( powerCutZone );
            if( result == null ) result = caseCimObjectWithID( powerCutZone );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.CONFORM_LOAD: {
            ConformLoad conformLoad = ( ConformLoad ) theEObject;
            T result = caseConformLoad( conformLoad );
            if( result == null ) result = caseEnergyConsumer( conformLoad );
            if( result == null ) result = caseEnergyConnection( conformLoad );
            if( result == null ) result = caseConductingEquipment( conformLoad );
            if( result == null ) result = caseEquipment( conformLoad );
            if( result == null ) result = casePowerSystemResource( conformLoad );
            if( result == null ) result = caseIdentifiedObject( conformLoad );
            if( result == null ) result = caseCimObjectWithID( conformLoad );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.OVEREXC_LIM2: {
            OverexcLim2 overexcLim2 = ( OverexcLim2 ) theEObject;
            T result = caseOverexcLim2( overexcLim2 );
            if( result == null ) result = caseOverexcitationLimiterDynamics( overexcLim2 );
            if( result == null ) result = caseDynamicsFunctionBlock( overexcLim2 );
            if( result == null ) result = caseIdentifiedObject( overexcLim2 );
            if( result == null ) result = caseCimObjectWithID( overexcLim2 );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.END_DEVICE: {
            EndDevice endDevice = ( EndDevice ) theEObject;
            T result = caseEndDevice( endDevice );
            if( result == null ) result = caseAssetContainer( endDevice );
            if( result == null ) result = caseAsset( endDevice );
            if( result == null ) result = caseIdentifiedObject( endDevice );
            if( result == null ) result = caseCimObjectWithID( endDevice );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.BASIC_INTERVAL_SCHEDULE: {
            BasicIntervalSchedule basicIntervalSchedule = ( BasicIntervalSchedule ) theEObject;
            T result = caseBasicIntervalSchedule( basicIntervalSchedule );
            if( result == null ) result = caseIdentifiedObject( basicIntervalSchedule );
            if( result == null ) result = caseCimObjectWithID( basicIntervalSchedule );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.OIL_SPECIMEN: {
            OilSpecimen oilSpecimen = ( OilSpecimen ) theEObject;
            T result = caseOilSpecimen( oilSpecimen );
            if( result == null ) result = caseSpecimen( oilSpecimen );
            if( result == null ) result = caseIdentifiedObject( oilSpecimen );
            if( result == null ) result = caseCimObjectWithID( oilSpecimen );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.SUBSTATION: {
            Substation substation = ( Substation ) theEObject;
            T result = caseSubstation( substation );
            if( result == null ) result = caseEquipmentContainer( substation );
            if( result == null ) result = caseConnectivityNodeContainer( substation );
            if( result == null ) result = casePowerSystemResource( substation );
            if( result == null ) result = caseIdentifiedObject( substation );
            if( result == null ) result = caseCimObjectWithID( substation );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.GOV_HYDRO_PID2: {
            GovHydroPID2 govHydroPID2 = ( GovHydroPID2 ) theEObject;
            T result = caseGovHydroPID2( govHydroPID2 );
            if( result == null ) result = caseTurbineGovernorDynamics( govHydroPID2 );
            if( result == null ) result = caseDynamicsFunctionBlock( govHydroPID2 );
            if( result == null ) result = caseIdentifiedObject( govHydroPID2 );
            if( result == null ) result = caseCimObjectWithID( govHydroPID2 );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.COM_FUNCTION: {
            ComFunction comFunction = ( ComFunction ) theEObject;
            T result = caseComFunction( comFunction );
            if( result == null ) result = caseEndDeviceFunction( comFunction );
            if( result == null ) result = caseAssetFunction( comFunction );
            if( result == null ) result = caseIdentifiedObject( comFunction );
            if( result == null ) result = caseCimObjectWithID( comFunction );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.PAN_PRICING_DETAIL: {
            PanPricingDetail panPricingDetail = ( PanPricingDetail ) theEObject;
            T result = casePanPricingDetail( panPricingDetail );
            if( result == null ) result = caseCimObjectWithID( panPricingDetail );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.LINEAR_SHUNT_COMPENSATOR_PHASE: {
            LinearShuntCompensatorPhase linearShuntCompensatorPhase = ( LinearShuntCompensatorPhase ) theEObject;
            T result = caseLinearShuntCompensatorPhase( linearShuntCompensatorPhase );
            if( result == null ) result = caseShuntCompensatorPhase( linearShuntCompensatorPhase );
            if( result == null ) result = casePowerSystemResource( linearShuntCompensatorPhase );
            if( result == null ) result = caseIdentifiedObject( linearShuntCompensatorPhase );
            if( result == null ) result = caseCimObjectWithID( linearShuntCompensatorPhase );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.GROSS_TO_NET_ACTIVE_POWER_CURVE: {
            GrossToNetActivePowerCurve grossToNetActivePowerCurve = ( GrossToNetActivePowerCurve ) theEObject;
            T result = caseGrossToNetActivePowerCurve( grossToNetActivePowerCurve );
            if( result == null ) result = caseCurve( grossToNetActivePowerCurve );
            if( result == null ) result = caseIdentifiedObject( grossToNetActivePowerCurve );
            if( result == null ) result = caseCimObjectWithID( grossToNetActivePowerCurve );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.DC_NODE: {
            DCNode dcNode = ( DCNode ) theEObject;
            T result = caseDCNode( dcNode );
            if( result == null ) result = caseIdentifiedObject( dcNode );
            if( result == null ) result = caseCimObjectWithID( dcNode );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.WIND_TURBINE_TYPE1OR2_DYNAMICS: {
            WindTurbineType1or2Dynamics windTurbineType1or2Dynamics = ( WindTurbineType1or2Dynamics ) theEObject;
            T result = caseWindTurbineType1or2Dynamics( windTurbineType1or2Dynamics );
            if( result == null ) result = caseDynamicsFunctionBlock( windTurbineType1or2Dynamics );
            if( result == null ) result = caseIdentifiedObject( windTurbineType1or2Dynamics );
            if( result == null ) result = caseCimObjectWithID( windTurbineType1or2Dynamics );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.STATE_VARIABLE: {
            StateVariable stateVariable = ( StateVariable ) theEObject;
            T result = caseStateVariable( stateVariable );
            if( result == null ) result = caseCimObjectWithID( stateVariable );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.WORK_ACTIVITY_RECORD: {
            WorkActivityRecord workActivityRecord = ( WorkActivityRecord ) theEObject;
            T result = caseWorkActivityRecord( workActivityRecord );
            if( result == null ) result = caseActivityRecord( workActivityRecord );
            if( result == null ) result = caseIdentifiedObject( workActivityRecord );
            if( result == null ) result = caseCimObjectWithID( workActivityRecord );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.OIL_ANALYSIS_PAPER_ANALOG: {
            OilAnalysisPaperAnalog oilAnalysisPaperAnalog = ( OilAnalysisPaperAnalog ) theEObject;
            T result = caseOilAnalysisPaperAnalog( oilAnalysisPaperAnalog );
            if( result == null ) result = caseAssetAnalog( oilAnalysisPaperAnalog );
            if( result == null ) result = caseAnalog( oilAnalysisPaperAnalog );
            if( result == null ) result = caseMeasurement( oilAnalysisPaperAnalog );
            if( result == null ) result = caseIdentifiedObject( oilAnalysisPaperAnalog );
            if( result == null ) result = caseCimObjectWithID( oilAnalysisPaperAnalog );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.DC_SWITCH: {
            DCSwitch dcSwitch = ( DCSwitch ) theEObject;
            T result = caseDCSwitch( dcSwitch );
            if( result == null ) result = caseDCConductingEquipment( dcSwitch );
            if( result == null ) result = caseEquipment( dcSwitch );
            if( result == null ) result = casePowerSystemResource( dcSwitch );
            if( result == null ) result = caseIdentifiedObject( dcSwitch );
            if( result == null ) result = caseCimObjectWithID( dcSwitch );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.PFV_AR_TYPE1_IEEEV_AR_CONTROLLER: {
            PFVArType1IEEEVArController pfvArType1IEEEVArController = ( PFVArType1IEEEVArController ) theEObject;
            T result = casePFVArType1IEEEVArController( pfvArType1IEEEVArController );
            if( result == null ) result = casePFVArControllerType1Dynamics( pfvArType1IEEEVArController );
            if( result == null ) result = caseDynamicsFunctionBlock( pfvArType1IEEEVArController );
            if( result == null ) result = caseIdentifiedObject( pfvArType1IEEEVArController );
            if( result == null ) result = caseCimObjectWithID( pfvArType1IEEEVArController );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.PROCEDURE_DATA_SET: {
            ProcedureDataSet procedureDataSet = ( ProcedureDataSet ) theEObject;
            T result = caseProcedureDataSet( procedureDataSet );
            if( result == null ) result = caseDocument( procedureDataSet );
            if( result == null ) result = caseIdentifiedObject( procedureDataSet );
            if( result == null ) result = caseCimObjectWithID( procedureDataSet );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.VISIBILITY_LAYER: {
            VisibilityLayer visibilityLayer = ( VisibilityLayer ) theEObject;
            T result = caseVisibilityLayer( visibilityLayer );
            if( result == null ) result = caseIdentifiedObject( visibilityLayer );
            if( result == null ) result = caseCimObjectWithID( visibilityLayer );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.DIAGRAM_OBJECT_GLUE_POINT: {
            DiagramObjectGluePoint diagramObjectGluePoint = ( DiagramObjectGluePoint ) theEObject;
            T result = caseDiagramObjectGluePoint( diagramObjectGluePoint );
            if( result == null ) result = caseCimObjectWithID( diagramObjectGluePoint );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.DIAGRAM_OBJECT: {
            DiagramObject diagramObject = ( DiagramObject ) theEObject;
            T result = caseDiagramObject( diagramObject );
            if( result == null ) result = caseIdentifiedObject( diagramObject );
            if( result == null ) result = caseCimObjectWithID( diagramObject );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.HEAT_RECOVERY_BOILER: {
            HeatRecoveryBoiler heatRecoveryBoiler = ( HeatRecoveryBoiler ) theEObject;
            T result = caseHeatRecoveryBoiler( heatRecoveryBoiler );
            if( result == null ) result = caseFossilSteamSupply( heatRecoveryBoiler );
            if( result == null ) result = caseSteamSupply( heatRecoveryBoiler );
            if( result == null ) result = casePowerSystemResource( heatRecoveryBoiler );
            if( result == null ) result = caseIdentifiedObject( heatRecoveryBoiler );
            if( result == null ) result = caseCimObjectWithID( heatRecoveryBoiler );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.INTERRUPTER_UNIT_INFO: {
            InterrupterUnitInfo interrupterUnitInfo = ( InterrupterUnitInfo ) theEObject;
            T result = caseInterrupterUnitInfo( interrupterUnitInfo );
            if( result == null ) result = caseAssetInfo( interrupterUnitInfo );
            if( result == null ) result = caseIdentifiedObject( interrupterUnitInfo );
            if( result == null ) result = caseCimObjectWithID( interrupterUnitInfo );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.GOV_GAST: {
            GovGAST govGAST = ( GovGAST ) theEObject;
            T result = caseGovGAST( govGAST );
            if( result == null ) result = caseTurbineGovernorDynamics( govGAST );
            if( result == null ) result = caseDynamicsFunctionBlock( govGAST );
            if( result == null ) result = caseIdentifiedObject( govGAST );
            if( result == null ) result = caseCimObjectWithID( govGAST );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.CUSTOMER: {
            Customer customer = ( Customer ) theEObject;
            T result = caseCustomer( customer );
            if( result == null ) result = caseOrganisationRole( customer );
            if( result == null ) result = caseIdentifiedObject( customer );
            if( result == null ) result = caseCimObjectWithID( customer );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.EXC_SEXS: {
            ExcSEXS excSEXS = ( ExcSEXS ) theEObject;
            T result = caseExcSEXS( excSEXS );
            if( result == null ) result = caseExcitationSystemDynamics( excSEXS );
            if( result == null ) result = caseDynamicsFunctionBlock( excSEXS );
            if( result == null ) result = caseIdentifiedObject( excSEXS );
            if( result == null ) result = caseCimObjectWithID( excSEXS );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.EXCITATION_SYSTEM_USER_DEFINED: {
            ExcitationSystemUserDefined excitationSystemUserDefined = ( ExcitationSystemUserDefined ) theEObject;
            T result = caseExcitationSystemUserDefined( excitationSystemUserDefined );
            if( result == null ) result = caseExcitationSystemDynamics( excitationSystemUserDefined );
            if( result == null ) result = caseDynamicsFunctionBlock( excitationSystemUserDefined );
            if( result == null ) result = caseIdentifiedObject( excitationSystemUserDefined );
            if( result == null ) result = caseCimObjectWithID( excitationSystemUserDefined );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.SWITCHING_PLAN: {
            SwitchingPlan switchingPlan = ( SwitchingPlan ) theEObject;
            T result = caseSwitchingPlan( switchingPlan );
            if( result == null ) result = caseSwitchingStepGroup( switchingPlan );
            if( result == null ) result = caseDocument( switchingPlan );
            if( result == null ) result = caseIdentifiedObject( switchingPlan );
            if( result == null ) result = caseCimObjectWithID( switchingPlan );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.WORK_LOCATION: {
            WorkLocation workLocation = ( WorkLocation ) theEObject;
            T result = caseWorkLocation( workLocation );
            if( result == null ) result = caseLocation( workLocation );
            if( result == null ) result = caseIdentifiedObject( workLocation );
            if( result == null ) result = caseCimObjectWithID( workLocation );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.SWITCHING_STEP: {
            SwitchingStep switchingStep = ( SwitchingStep ) theEObject;
            T result = caseSwitchingStep( switchingStep );
            if( result == null ) result = caseCimObjectWithID( switchingStep );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.CONSUMPTION_TARIFF_INTERVAL: {
            ConsumptionTariffInterval consumptionTariffInterval = ( ConsumptionTariffInterval ) theEObject;
            T result = caseConsumptionTariffInterval( consumptionTariffInterval );
            if( result == null ) result = caseCimObjectWithID( consumptionTariffInterval );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.WIND_PROTECTION_IEC: {
            WindProtectionIEC windProtectionIEC = ( WindProtectionIEC ) theEObject;
            T result = caseWindProtectionIEC( windProtectionIEC );
            if( result == null ) result = caseIdentifiedObject( windProtectionIEC );
            if( result == null ) result = caseCimObjectWithID( windProtectionIEC );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.UNDEREXC_LIM2_SIMPLIFIED: {
            UnderexcLim2Simplified underexcLim2Simplified = ( UnderexcLim2Simplified ) theEObject;
            T result = caseUnderexcLim2Simplified( underexcLim2Simplified );
            if( result == null ) result = caseUnderexcitationLimiterDynamics( underexcLim2Simplified );
            if( result == null ) result = caseDynamicsFunctionBlock( underexcLim2Simplified );
            if( result == null ) result = caseIdentifiedObject( underexcLim2Simplified );
            if( result == null ) result = caseCimObjectWithID( underexcLim2Simplified );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.SIMPLE_END_DEVICE_FUNCTION: {
            SimpleEndDeviceFunction simpleEndDeviceFunction = ( SimpleEndDeviceFunction ) theEObject;
            T result = caseSimpleEndDeviceFunction( simpleEndDeviceFunction );
            if( result == null ) result = caseEndDeviceFunction( simpleEndDeviceFunction );
            if( result == null ) result = caseAssetFunction( simpleEndDeviceFunction );
            if( result == null ) result = caseIdentifiedObject( simpleEndDeviceFunction );
            if( result == null ) result = caseCimObjectWithID( simpleEndDeviceFunction );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.DISC_EXC_CONT_IEEEDEC1A: {
            DiscExcContIEEEDEC1A discExcContIEEEDEC1A = ( DiscExcContIEEEDEC1A ) theEObject;
            T result = caseDiscExcContIEEEDEC1A( discExcContIEEEDEC1A );
            if( result == null ) result = caseDiscontinuousExcitationControlDynamics( discExcContIEEEDEC1A );
            if( result == null ) result = caseDynamicsFunctionBlock( discExcContIEEEDEC1A );
            if( result == null ) result = caseIdentifiedObject( discExcContIEEEDEC1A );
            if( result == null ) result = caseCimObjectWithID( discExcContIEEEDEC1A );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.JUMPER_ACTION: {
            JumperAction jumperAction = ( JumperAction ) theEObject;
            T result = caseJumperAction( jumperAction );
            if( result == null ) result = caseSwitchingStep( jumperAction );
            if( result == null ) result = caseCimObjectWithID( jumperAction );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.SERVICE_MULTIPLIER: {
            ServiceMultiplier serviceMultiplier = ( ServiceMultiplier ) theEObject;
            T result = caseServiceMultiplier( serviceMultiplier );
            if( result == null ) result = caseIdentifiedObject( serviceMultiplier );
            if( result == null ) result = caseCimObjectWithID( serviceMultiplier );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.DOCUMENT: {
            Document document = ( Document ) theEObject;
            T result = caseDocument( document );
            if( result == null ) result = caseIdentifiedObject( document );
            if( result == null ) result = caseCimObjectWithID( document );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.INSPECTION_DATA_SET: {
            InspectionDataSet inspectionDataSet = ( InspectionDataSet ) theEObject;
            T result = caseInspectionDataSet( inspectionDataSet );
            if( result == null ) result = caseProcedureDataSet( inspectionDataSet );
            if( result == null ) result = caseDocument( inspectionDataSet );
            if( result == null ) result = caseIdentifiedObject( inspectionDataSet );
            if( result == null ) result = caseCimObjectWithID( inspectionDataSet );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.LOAD_STATIC: {
            LoadStatic loadStatic = ( LoadStatic ) theEObject;
            T result = caseLoadStatic( loadStatic );
            if( result == null ) result = caseIdentifiedObject( loadStatic );
            if( result == null ) result = caseCimObjectWithID( loadStatic );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.FACTS_DEVICE: {
            FACTSDevice factsDevice = ( FACTSDevice ) theEObject;
            T result = caseFACTSDevice( factsDevice );
            if( result == null ) result = caseAsset( factsDevice );
            if( result == null ) result = caseIdentifiedObject( factsDevice );
            if( result == null ) result = caseCimObjectWithID( factsDevice );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.ASSET_FUNCTION: {
            AssetFunction assetFunction = ( AssetFunction ) theEObject;
            T result = caseAssetFunction( assetFunction );
            if( result == null ) result = caseIdentifiedObject( assetFunction );
            if( result == null ) result = caseCimObjectWithID( assetFunction );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.DISCONTINUOUS_EXCITATION_CONTROL_DYNAMICS: {
            DiscontinuousExcitationControlDynamics discontinuousExcitationControlDynamics = ( DiscontinuousExcitationControlDynamics ) theEObject;
            T result = caseDiscontinuousExcitationControlDynamics( discontinuousExcitationControlDynamics );
            if( result == null ) result = caseDynamicsFunctionBlock( discontinuousExcitationControlDynamics );
            if( result == null ) result = caseIdentifiedObject( discontinuousExcitationControlDynamics );
            if( result == null ) result = caseCimObjectWithID( discontinuousExcitationControlDynamics );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.CURRENT_LIMIT: {
            CurrentLimit currentLimit = ( CurrentLimit ) theEObject;
            T result = caseCurrentLimit( currentLimit );
            if( result == null ) result = caseOperationalLimit( currentLimit );
            if( result == null ) result = caseIdentifiedObject( currentLimit );
            if( result == null ) result = caseCimObjectWithID( currentLimit );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.PHASE_TAP_CHANGER_SYMMETRICAL: {
            PhaseTapChangerSymmetrical phaseTapChangerSymmetrical = ( PhaseTapChangerSymmetrical ) theEObject;
            T result = casePhaseTapChangerSymmetrical( phaseTapChangerSymmetrical );
            if( result == null ) result = casePhaseTapChangerNonLinear( phaseTapChangerSymmetrical );
            if( result == null ) result = casePhaseTapChanger( phaseTapChangerSymmetrical );
            if( result == null ) result = caseTapChanger( phaseTapChangerSymmetrical );
            if( result == null ) result = casePowerSystemResource( phaseTapChangerSymmetrical );
            if( result == null ) result = caseIdentifiedObject( phaseTapChangerSymmetrical );
            if( result == null ) result = caseCimObjectWithID( phaseTapChangerSymmetrical );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.TIME_TARIFF_INTERVAL: {
            TimeTariffInterval timeTariffInterval = ( TimeTariffInterval ) theEObject;
            T result = caseTimeTariffInterval( timeTariffInterval );
            if( result == null ) result = caseCimObjectWithID( timeTariffInterval );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.EXC_IEEEAC4A: {
            ExcIEEEAC4A excIEEEAC4A = ( ExcIEEEAC4A ) theEObject;
            T result = caseExcIEEEAC4A( excIEEEAC4A );
            if( result == null ) result = caseExcitationSystemDynamics( excIEEEAC4A );
            if( result == null ) result = caseDynamicsFunctionBlock( excIEEEAC4A );
            if( result == null ) result = caseIdentifiedObject( excIEEEAC4A );
            if( result == null ) result = caseCimObjectWithID( excIEEEAC4A );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.WIND_TURBINE_TYPE4_IEC: {
            WindTurbineType4IEC windTurbineType4IEC = ( WindTurbineType4IEC ) theEObject;
            T result = caseWindTurbineType4IEC( windTurbineType4IEC );
            if( result == null ) result = caseWindTurbineType3or4IEC( windTurbineType4IEC );
            if( result == null ) result = caseWindTurbineType3or4Dynamics( windTurbineType4IEC );
            if( result == null ) result = caseDynamicsFunctionBlock( windTurbineType4IEC );
            if( result == null ) result = caseIdentifiedObject( windTurbineType4IEC );
            if( result == null ) result = caseCimObjectWithID( windTurbineType4IEC );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.BASE_READING: {
            BaseReading baseReading = ( BaseReading ) theEObject;
            T result = caseBaseReading( baseReading );
            if( result == null ) result = caseMeasurementValue( baseReading );
            if( result == null ) result = caseIOPoint( baseReading );
            if( result == null ) result = caseIdentifiedObject( baseReading );
            if( result == null ) result = caseCimObjectWithID( baseReading );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.UNDEREXCITATION_LIMITER_USER_DEFINED: {
            UnderexcitationLimiterUserDefined underexcitationLimiterUserDefined = ( UnderexcitationLimiterUserDefined ) theEObject;
            T result = caseUnderexcitationLimiterUserDefined( underexcitationLimiterUserDefined );
            if( result == null ) result = caseUnderexcitationLimiterDynamics( underexcitationLimiterUserDefined );
            if( result == null ) result = caseDynamicsFunctionBlock( underexcitationLimiterUserDefined );
            if( result == null ) result = caseIdentifiedObject( underexcitationLimiterUserDefined );
            if( result == null ) result = caseCimObjectWithID( underexcitationLimiterUserDefined );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.HYDRO_PUMP: {
            HydroPump hydroPump = ( HydroPump ) theEObject;
            T result = caseHydroPump( hydroPump );
            if( result == null ) result = caseEquipment( hydroPump );
            if( result == null ) result = casePowerSystemResource( hydroPump );
            if( result == null ) result = caseIdentifiedObject( hydroPump );
            if( result == null ) result = caseCimObjectWithID( hydroPump );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.POWER_TRANSFORMER_INFO: {
            PowerTransformerInfo powerTransformerInfo = ( PowerTransformerInfo ) theEObject;
            T result = casePowerTransformerInfo( powerTransformerInfo );
            if( result == null ) result = caseAssetInfo( powerTransformerInfo );
            if( result == null ) result = caseIdentifiedObject( powerTransformerInfo );
            if( result == null ) result = caseCimObjectWithID( powerTransformerInfo );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.PLANT: {
            Plant plant = ( Plant ) theEObject;
            T result = casePlant( plant );
            if( result == null ) result = caseEquipmentContainer( plant );
            if( result == null ) result = caseConnectivityNodeContainer( plant );
            if( result == null ) result = casePowerSystemResource( plant );
            if( result == null ) result = caseIdentifiedObject( plant );
            if( result == null ) result = caseCimObjectWithID( plant );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.MECHANICAL_LOAD_DYNAMICS: {
            MechanicalLoadDynamics mechanicalLoadDynamics = ( MechanicalLoadDynamics ) theEObject;
            T result = caseMechanicalLoadDynamics( mechanicalLoadDynamics );
            if( result == null ) result = caseDynamicsFunctionBlock( mechanicalLoadDynamics );
            if( result == null ) result = caseIdentifiedObject( mechanicalLoadDynamics );
            if( result == null ) result = caseCimObjectWithID( mechanicalLoadDynamics );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.BUSBAR_SECTION_INFO: {
            BusbarSectionInfo busbarSectionInfo = ( BusbarSectionInfo ) theEObject;
            T result = caseBusbarSectionInfo( busbarSectionInfo );
            if( result == null ) result = caseAssetInfo( busbarSectionInfo );
            if( result == null ) result = caseIdentifiedObject( busbarSectionInfo );
            if( result == null ) result = caseCimObjectWithID( busbarSectionInfo );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.CUT_ACTION: {
            CutAction cutAction = ( CutAction ) theEObject;
            T result = caseCutAction( cutAction );
            if( result == null ) result = caseSwitchingStep( cutAction );
            if( result == null ) result = caseCimObjectWithID( cutAction );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.AUXILIARY_AGREEMENT: {
            AuxiliaryAgreement auxiliaryAgreement = ( AuxiliaryAgreement ) theEObject;
            T result = caseAuxiliaryAgreement( auxiliaryAgreement );
            if( result == null ) result = caseAgreement( auxiliaryAgreement );
            if( result == null ) result = caseDocument( auxiliaryAgreement );
            if( result == null ) result = caseIdentifiedObject( auxiliaryAgreement );
            if( result == null ) result = caseCimObjectWithID( auxiliaryAgreement );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.WIND_CONT_QLIM_IEC: {
            WindContQLimIEC windContQLimIEC = ( WindContQLimIEC ) theEObject;
            T result = caseWindContQLimIEC( windContQLimIEC );
            if( result == null ) result = caseIdentifiedObject( windContQLimIEC );
            if( result == null ) result = caseCimObjectWithID( windContQLimIEC );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.CURRENT_TRANSFORMER: {
            CurrentTransformer currentTransformer = ( CurrentTransformer ) theEObject;
            T result = caseCurrentTransformer( currentTransformer );
            if( result == null ) result = caseSensor( currentTransformer );
            if( result == null ) result = caseAuxiliaryEquipment( currentTransformer );
            if( result == null ) result = caseEquipment( currentTransformer );
            if( result == null ) result = casePowerSystemResource( currentTransformer );
            if( result == null ) result = caseIdentifiedObject( currentTransformer );
            if( result == null ) result = caseCimObjectWithID( currentTransformer );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.STRUCTURE_SUPPORT: {
            StructureSupport structureSupport = ( StructureSupport ) theEObject;
            T result = caseStructureSupport( structureSupport );
            if( result == null ) result = caseAsset( structureSupport );
            if( result == null ) result = caseIdentifiedObject( structureSupport );
            if( result == null ) result = caseCimObjectWithID( structureSupport );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.SYNCHROCHECK_RELAY: {
            SynchrocheckRelay synchrocheckRelay = ( SynchrocheckRelay ) theEObject;
            T result = caseSynchrocheckRelay( synchrocheckRelay );
            if( result == null ) result = caseProtectionEquipment( synchrocheckRelay );
            if( result == null ) result = caseEquipment( synchrocheckRelay );
            if( result == null ) result = casePowerSystemResource( synchrocheckRelay );
            if( result == null ) result = caseIdentifiedObject( synchrocheckRelay );
            if( result == null ) result = caseCimObjectWithID( synchrocheckRelay );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.ANALOG_VALUE: {
            AnalogValue analogValue = ( AnalogValue ) theEObject;
            T result = caseAnalogValue( analogValue );
            if( result == null ) result = caseMeasurementValue( analogValue );
            if( result == null ) result = caseIOPoint( analogValue );
            if( result == null ) result = caseIdentifiedObject( analogValue );
            if( result == null ) result = caseCimObjectWithID( analogValue );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.ISO_UPPER_LAYER: {
            ISOUpperLayer isoUpperLayer = ( ISOUpperLayer ) theEObject;
            T result = caseISOUpperLayer( isoUpperLayer );
            if( result == null ) result = caseTCPAccessPoint( isoUpperLayer );
            if( result == null ) result = caseIPAccessPoint( isoUpperLayer );
            if( result == null ) result = caseCommunicationLink( isoUpperLayer );
            if( result == null ) result = casePowerSystemResource( isoUpperLayer );
            if( result == null ) result = caseIdentifiedObject( isoUpperLayer );
            if( result == null ) result = caseCimObjectWithID( isoUpperLayer );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.WIND_TURBINE_TYPE4B_IEC: {
            WindTurbineType4bIEC windTurbineType4bIEC = ( WindTurbineType4bIEC ) theEObject;
            T result = caseWindTurbineType4bIEC( windTurbineType4bIEC );
            if( result == null ) result = caseWindTurbineType4IEC( windTurbineType4bIEC );
            if( result == null ) result = caseWindTurbineType3or4IEC( windTurbineType4bIEC );
            if( result == null ) result = caseWindTurbineType3or4Dynamics( windTurbineType4bIEC );
            if( result == null ) result = caseDynamicsFunctionBlock( windTurbineType4bIEC );
            if( result == null ) result = caseIdentifiedObject( windTurbineType4bIEC );
            if( result == null ) result = caseCimObjectWithID( windTurbineType4bIEC );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.CREW_MEMBER: {
            CrewMember crewMember = ( CrewMember ) theEObject;
            T result = caseCrewMember( crewMember );
            if( result == null ) result = caseOperationPersonRole( crewMember );
            if( result == null ) result = casePersonRole( crewMember );
            if( result == null ) result = caseIdentifiedObject( crewMember );
            if( result == null ) result = caseCimObjectWithID( crewMember );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.OBJECT_DELETION: {
            ObjectDeletion objectDeletion = ( ObjectDeletion ) theEObject;
            T result = caseObjectDeletion( objectDeletion );
            if( result == null ) result = caseChangeSetMember( objectDeletion );
            if( result == null ) result = caseDataSetMember( objectDeletion );
            if( result == null ) result = caseIdentifiedObject( objectDeletion );
            if( result == null ) result = caseCimObjectWithID( objectDeletion );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.STEAM_SUPPLY: {
            SteamSupply steamSupply = ( SteamSupply ) theEObject;
            T result = caseSteamSupply( steamSupply );
            if( result == null ) result = casePowerSystemResource( steamSupply );
            if( result == null ) result = caseIdentifiedObject( steamSupply );
            if( result == null ) result = caseCimObjectWithID( steamSupply );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.TOPOLOGICAL_ISLAND: {
            TopologicalIsland topologicalIsland = ( TopologicalIsland ) theEObject;
            T result = caseTopologicalIsland( topologicalIsland );
            if( result == null ) result = caseIdentifiedObject( topologicalIsland );
            if( result == null ) result = caseCimObjectWithID( topologicalIsland );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.LIMIT: {
            Limit limit = ( Limit ) theEObject;
            T result = caseLimit( limit );
            if( result == null ) result = caseIdentifiedObject( limit );
            if( result == null ) result = caseCimObjectWithID( limit );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.USAGE_POINT: {
            UsagePoint usagePoint = ( UsagePoint ) theEObject;
            T result = caseUsagePoint( usagePoint );
            if( result == null ) result = caseIdentifiedObject( usagePoint );
            if( result == null ) result = caseCimObjectWithID( usagePoint );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.CONCENTRIC_NEUTRAL_CABLE_INFO: {
            ConcentricNeutralCableInfo concentricNeutralCableInfo = ( ConcentricNeutralCableInfo ) theEObject;
            T result = caseConcentricNeutralCableInfo( concentricNeutralCableInfo );
            if( result == null ) result = caseCableInfo( concentricNeutralCableInfo );
            if( result == null ) result = caseWireInfo( concentricNeutralCableInfo );
            if( result == null ) result = caseAssetInfo( concentricNeutralCableInfo );
            if( result == null ) result = caseIdentifiedObject( concentricNeutralCableInfo );
            if( result == null ) result = caseCimObjectWithID( concentricNeutralCableInfo );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.CONTROL_AREA: {
            ControlArea controlArea = ( ControlArea ) theEObject;
            T result = caseControlArea( controlArea );
            if( result == null ) result = casePowerSystemResource( controlArea );
            if( result == null ) result = caseIdentifiedObject( controlArea );
            if( result == null ) result = caseCimObjectWithID( controlArea );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.NUCLEAR_GENERATING_UNIT: {
            NuclearGeneratingUnit nuclearGeneratingUnit = ( NuclearGeneratingUnit ) theEObject;
            T result = caseNuclearGeneratingUnit( nuclearGeneratingUnit );
            if( result == null ) result = caseGeneratingUnit( nuclearGeneratingUnit );
            if( result == null ) result = caseEquipment( nuclearGeneratingUnit );
            if( result == null ) result = casePowerSystemResource( nuclearGeneratingUnit );
            if( result == null ) result = caseIdentifiedObject( nuclearGeneratingUnit );
            if( result == null ) result = caseCimObjectWithID( nuclearGeneratingUnit );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.DISCONNECTOR: {
            Disconnector disconnector = ( Disconnector ) theEObject;
            T result = caseDisconnector( disconnector );
            if( result == null ) result = caseSwitch( disconnector );
            if( result == null ) result = caseConductingEquipment( disconnector );
            if( result == null ) result = caseEquipment( disconnector );
            if( result == null ) result = casePowerSystemResource( disconnector );
            if( result == null ) result = caseIdentifiedObject( disconnector );
            if( result == null ) result = caseCimObjectWithID( disconnector );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.WIND_TURBINE_TYPE3OR4_DYNAMICS: {
            WindTurbineType3or4Dynamics windTurbineType3or4Dynamics = ( WindTurbineType3or4Dynamics ) theEObject;
            T result = caseWindTurbineType3or4Dynamics( windTurbineType3or4Dynamics );
            if( result == null ) result = caseDynamicsFunctionBlock( windTurbineType3or4Dynamics );
            if( result == null ) result = caseIdentifiedObject( windTurbineType3or4Dynamics );
            if( result == null ) result = caseCimObjectWithID( windTurbineType3or4Dynamics );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.OPERATIONS_SAFETY_SUPERVISOR: {
            OperationsSafetySupervisor operationsSafetySupervisor = ( OperationsSafetySupervisor ) theEObject;
            T result = caseOperationsSafetySupervisor( operationsSafetySupervisor );
            if( result == null ) result = caseOperator( operationsSafetySupervisor );
            if( result == null ) result = caseOperationPersonRole( operationsSafetySupervisor );
            if( result == null ) result = casePersonRole( operationsSafetySupervisor );
            if( result == null ) result = caseIdentifiedObject( operationsSafetySupervisor );
            if( result == null ) result = caseCimObjectWithID( operationsSafetySupervisor );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.TAILBAY_LOSS_CURVE: {
            TailbayLossCurve tailbayLossCurve = ( TailbayLossCurve ) theEObject;
            T result = caseTailbayLossCurve( tailbayLossCurve );
            if( result == null ) result = caseCurve( tailbayLossCurve );
            if( result == null ) result = caseIdentifiedObject( tailbayLossCurve );
            if( result == null ) result = caseCimObjectWithID( tailbayLossCurve );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.TRANSFORMER_MESH_IMPEDANCE: {
            TransformerMeshImpedance transformerMeshImpedance = ( TransformerMeshImpedance ) theEObject;
            T result = caseTransformerMeshImpedance( transformerMeshImpedance );
            if( result == null ) result = caseIdentifiedObject( transformerMeshImpedance );
            if( result == null ) result = caseCimObjectWithID( transformerMeshImpedance );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.DC_SERIES_DEVICE: {
            DCSeriesDevice dcSeriesDevice = ( DCSeriesDevice ) theEObject;
            T result = caseDCSeriesDevice( dcSeriesDevice );
            if( result == null ) result = caseDCConductingEquipment( dcSeriesDevice );
            if( result == null ) result = caseEquipment( dcSeriesDevice );
            if( result == null ) result = casePowerSystemResource( dcSeriesDevice );
            if( result == null ) result = caseIdentifiedObject( dcSeriesDevice );
            if( result == null ) result = caseCimObjectWithID( dcSeriesDevice );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.ALT_GENERATING_UNIT_MEAS: {
            AltGeneratingUnitMeas altGeneratingUnitMeas = ( AltGeneratingUnitMeas ) theEObject;
            T result = caseAltGeneratingUnitMeas( altGeneratingUnitMeas );
            if( result == null ) result = caseIdentifiedObject( altGeneratingUnitMeas );
            if( result == null ) result = caseCimObjectWithID( altGeneratingUnitMeas );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.ACTIVITY_RECORD: {
            ActivityRecord activityRecord = ( ActivityRecord ) theEObject;
            T result = caseActivityRecord( activityRecord );
            if( result == null ) result = caseIdentifiedObject( activityRecord );
            if( result == null ) result = caseCimObjectWithID( activityRecord );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.TIME_SCHEDULE: {
            TimeSchedule timeSchedule = ( TimeSchedule ) theEObject;
            T result = caseTimeSchedule( timeSchedule );
            if( result == null ) result = caseDocument( timeSchedule );
            if( result == null ) result = caseIdentifiedObject( timeSchedule );
            if( result == null ) result = caseCimObjectWithID( timeSchedule );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.FOSSIL_FUEL: {
            FossilFuel fossilFuel = ( FossilFuel ) theEObject;
            T result = caseFossilFuel( fossilFuel );
            if( result == null ) result = caseIdentifiedObject( fossilFuel );
            if( result == null ) result = caseCimObjectWithID( fossilFuel );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.PER_LENGTH_SEQUENCE_IMPEDANCE: {
            PerLengthSequenceImpedance perLengthSequenceImpedance = ( PerLengthSequenceImpedance ) theEObject;
            T result = casePerLengthSequenceImpedance( perLengthSequenceImpedance );
            if( result == null ) result = casePerLengthImpedance( perLengthSequenceImpedance );
            if( result == null ) result = casePerLengthLineParameter( perLengthSequenceImpedance );
            if( result == null ) result = caseIdentifiedObject( perLengthSequenceImpedance );
            if( result == null ) result = caseCimObjectWithID( perLengthSequenceImpedance );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.START_RAMP_CURVE: {
            StartRampCurve startRampCurve = ( StartRampCurve ) theEObject;
            T result = caseStartRampCurve( startRampCurve );
            if( result == null ) result = caseCurve( startRampCurve );
            if( result == null ) result = caseIdentifiedObject( startRampCurve );
            if( result == null ) result = caseCimObjectWithID( startRampCurve );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.POWER_TRANSFORMER_END: {
            PowerTransformerEnd powerTransformerEnd = ( PowerTransformerEnd ) theEObject;
            T result = casePowerTransformerEnd( powerTransformerEnd );
            if( result == null ) result = caseTransformerEnd( powerTransformerEnd );
            if( result == null ) result = caseIdentifiedObject( powerTransformerEnd );
            if( result == null ) result = caseCimObjectWithID( powerTransformerEnd );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.DER_CAPABILITIES: {
            DERCapabilities derCapabilities = ( DERCapabilities ) theEObject;
            T result = caseDERCapabilities( derCapabilities );
            if( result == null ) result = caseCimObjectWithID( derCapabilities );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.SWITCH_PHASE: {
            SwitchPhase switchPhase = ( SwitchPhase ) theEObject;
            T result = caseSwitchPhase( switchPhase );
            if( result == null ) result = casePowerSystemResource( switchPhase );
            if( result == null ) result = caseIdentifiedObject( switchPhase );
            if( result == null ) result = caseCimObjectWithID( switchPhase );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.EDITOR: {
            Editor editor = ( Editor ) theEObject;
            T result = caseEditor( editor );
            if( result == null ) result = caseDocumentPersonRole( editor );
            if( result == null ) result = casePersonRole( editor );
            if( result == null ) result = caseIdentifiedObject( editor );
            if( result == null ) result = caseCimObjectWithID( editor );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.DATA_SET: {
            DataSet dataSet = ( DataSet ) theEObject;
            T result = caseDataSet( dataSet );
            if( result == null ) result = caseIdentifiedObject( dataSet );
            if( result == null ) result = caseCimObjectWithID( dataSet );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.TRANSFORMER_TANK_INFO: {
            TransformerTankInfo transformerTankInfo = ( TransformerTankInfo ) theEObject;
            T result = caseTransformerTankInfo( transformerTankInfo );
            if( result == null ) result = caseAssetInfo( transformerTankInfo );
            if( result == null ) result = caseIdentifiedObject( transformerTankInfo );
            if( result == null ) result = caseCimObjectWithID( transformerTankInfo );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.EXC_AVR4: {
            ExcAVR4 excAVR4 = ( ExcAVR4 ) theEObject;
            T result = caseExcAVR4( excAVR4 );
            if( result == null ) result = caseExcitationSystemDynamics( excAVR4 );
            if( result == null ) result = caseDynamicsFunctionBlock( excAVR4 );
            if( result == null ) result = caseIdentifiedObject( excAVR4 );
            if( result == null ) result = caseCimObjectWithID( excAVR4 );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.FLOW_SENSOR: {
            FlowSensor flowSensor = ( FlowSensor ) theEObject;
            T result = caseFlowSensor( flowSensor );
            if( result == null ) result = caseConductingEquipment( flowSensor );
            if( result == null ) result = caseEquipment( flowSensor );
            if( result == null ) result = casePowerSystemResource( flowSensor );
            if( result == null ) result = caseIdentifiedObject( flowSensor );
            if( result == null ) result = caseCimObjectWithID( flowSensor );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.EMISSION_CURVE: {
            EmissionCurve emissionCurve = ( EmissionCurve ) theEObject;
            T result = caseEmissionCurve( emissionCurve );
            if( result == null ) result = caseCurve( emissionCurve );
            if( result == null ) result = caseIdentifiedObject( emissionCurve );
            if( result == null ) result = caseCimObjectWithID( emissionCurve );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.EXC_REXS: {
            ExcREXS excREXS = ( ExcREXS ) theEObject;
            T result = caseExcREXS( excREXS );
            if( result == null ) result = caseExcitationSystemDynamics( excREXS );
            if( result == null ) result = caseDynamicsFunctionBlock( excREXS );
            if( result == null ) result = caseIdentifiedObject( excREXS );
            if( result == null ) result = caseCimObjectWithID( excREXS );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.DISPATCHABLE_POWER_CAPABILITY: {
            DispatchablePowerCapability dispatchablePowerCapability = ( DispatchablePowerCapability ) theEObject;
            T result = caseDispatchablePowerCapability( dispatchablePowerCapability );
            if( result == null ) result = caseCimObjectWithID( dispatchablePowerCapability );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.EXC_AC2A: {
            ExcAC2A excAC2A = ( ExcAC2A ) theEObject;
            T result = caseExcAC2A( excAC2A );
            if( result == null ) result = caseExcitationSystemDynamics( excAC2A );
            if( result == null ) result = caseDynamicsFunctionBlock( excAC2A );
            if( result == null ) result = caseIdentifiedObject( excAC2A );
            if( result == null ) result = caseCimObjectWithID( excAC2A );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.IRREGULAR_INTERVAL_SCHEDULE: {
            IrregularIntervalSchedule irregularIntervalSchedule = ( IrregularIntervalSchedule ) theEObject;
            T result = caseIrregularIntervalSchedule( irregularIntervalSchedule );
            if( result == null ) result = caseBasicIntervalSchedule( irregularIntervalSchedule );
            if( result == null ) result = caseIdentifiedObject( irregularIntervalSchedule );
            if( result == null ) result = caseCimObjectWithID( irregularIntervalSchedule );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.OUTAGE_AREA: {
            OutageArea outageArea = ( OutageArea ) theEObject;
            T result = caseOutageArea( outageArea );
            if( result == null ) result = caseOutage( outageArea );
            if( result == null ) result = caseDocument( outageArea );
            if( result == null ) result = caseIdentifiedObject( outageArea );
            if( result == null ) result = caseCimObjectWithID( outageArea );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.HYDRO_GENERATING_UNIT: {
            HydroGeneratingUnit hydroGeneratingUnit = ( HydroGeneratingUnit ) theEObject;
            T result = caseHydroGeneratingUnit( hydroGeneratingUnit );
            if( result == null ) result = caseGeneratingUnit( hydroGeneratingUnit );
            if( result == null ) result = caseEquipment( hydroGeneratingUnit );
            if( result == null ) result = casePowerSystemResource( hydroGeneratingUnit );
            if( result == null ) result = caseIdentifiedObject( hydroGeneratingUnit );
            if( result == null ) result = caseCimObjectWithID( hydroGeneratingUnit );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.READING: {
            Reading reading = ( Reading ) theEObject;
            T result = caseReading( reading );
            if( result == null ) result = caseBaseReading( reading );
            if( result == null ) result = caseMeasurementValue( reading );
            if( result == null ) result = caseIOPoint( reading );
            if( result == null ) result = caseIdentifiedObject( reading );
            if( result == null ) result = caseCimObjectWithID( reading );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.ICCP_INFORMATION_MESSAGE: {
            ICCPInformationMessage iccpInformationMessage = ( ICCPInformationMessage ) theEObject;
            T result = caseICCPInformationMessage( iccpInformationMessage );
            if( result == null ) result = caseIdentifiedObject( iccpInformationMessage );
            if( result == null ) result = caseCimObjectWithID( iccpInformationMessage );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.EQUIVALENT_SHUNT: {
            EquivalentShunt equivalentShunt = ( EquivalentShunt ) theEObject;
            T result = caseEquivalentShunt( equivalentShunt );
            if( result == null ) result = caseEquivalentEquipment( equivalentShunt );
            if( result == null ) result = caseConductingEquipment( equivalentShunt );
            if( result == null ) result = caseEquipment( equivalentShunt );
            if( result == null ) result = casePowerSystemResource( equivalentShunt );
            if( result == null ) result = caseIdentifiedObject( equivalentShunt );
            if( result == null ) result = caseCimObjectWithID( equivalentShunt );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.WIND_AERO_CONST_IEC: {
            WindAeroConstIEC windAeroConstIEC = ( WindAeroConstIEC ) theEObject;
            T result = caseWindAeroConstIEC( windAeroConstIEC );
            if( result == null ) result = caseIdentifiedObject( windAeroConstIEC );
            if( result == null ) result = caseCimObjectWithID( windAeroConstIEC );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.ASSET_GROUP: {
            AssetGroup assetGroup = ( AssetGroup ) theEObject;
            T result = caseAssetGroup( assetGroup );
            if( result == null ) result = caseDocument( assetGroup );
            if( result == null ) result = caseIdentifiedObject( assetGroup );
            if( result == null ) result = caseCimObjectWithID( assetGroup );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.CONDUCTING_EQUIPMENT: {
            ConductingEquipment conductingEquipment = ( ConductingEquipment ) theEObject;
            T result = caseConductingEquipment( conductingEquipment );
            if( result == null ) result = caseEquipment( conductingEquipment );
            if( result == null ) result = casePowerSystemResource( conductingEquipment );
            if( result == null ) result = caseIdentifiedObject( conductingEquipment );
            if( result == null ) result = caseCimObjectWithID( conductingEquipment );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.WORK_TIME_SCHEDULE: {
            WorkTimeSchedule workTimeSchedule = ( WorkTimeSchedule ) theEObject;
            T result = caseWorkTimeSchedule( workTimeSchedule );
            if( result == null ) result = caseTimeSchedule( workTimeSchedule );
            if( result == null ) result = caseDocument( workTimeSchedule );
            if( result == null ) result = caseIdentifiedObject( workTimeSchedule );
            if( result == null ) result = caseCimObjectWithID( workTimeSchedule );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.OPERATIONAL_TAG: {
            OperationalTag operationalTag = ( OperationalTag ) theEObject;
            T result = caseOperationalTag( operationalTag );
            if( result == null ) result = caseDocument( operationalTag );
            if( result == null ) result = caseIdentifiedObject( operationalTag );
            if( result == null ) result = caseCimObjectWithID( operationalTag );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.ENERGY_SOURCE: {
            EnergySource energySource = ( EnergySource ) theEObject;
            T result = caseEnergySource( energySource );
            if( result == null ) result = caseEnergyConnection( energySource );
            if( result == null ) result = caseConductingEquipment( energySource );
            if( result == null ) result = caseEquipment( energySource );
            if( result == null ) result = casePowerSystemResource( energySource );
            if( result == null ) result = caseIdentifiedObject( energySource );
            if( result == null ) result = caseCimObjectWithID( energySource );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.CS_CONVERTER: {
            CsConverter csConverter = ( CsConverter ) theEObject;
            T result = caseCsConverter( csConverter );
            if( result == null ) result = caseACDCConverter( csConverter );
            if( result == null ) result = caseConductingEquipment( csConverter );
            if( result == null ) result = caseEquipment( csConverter );
            if( result == null ) result = casePowerSystemResource( csConverter );
            if( result == null ) result = caseIdentifiedObject( csConverter );
            if( result == null ) result = caseCimObjectWithID( csConverter );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.QUALITY61850: {
            Quality61850 quality61850 = ( Quality61850 ) theEObject;
            T result = caseQuality61850( quality61850 );
            if( result == null ) result = caseCimObjectWithID( quality61850 );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.PSS_PTIST1: {
            PssPTIST1 pssPTIST1 = ( PssPTIST1 ) theEObject;
            T result = casePssPTIST1( pssPTIST1 );
            if( result == null ) result = casePowerSystemStabilizerDynamics( pssPTIST1 );
            if( result == null ) result = caseDynamicsFunctionBlock( pssPTIST1 );
            if( result == null ) result = caseIdentifiedObject( pssPTIST1 );
            if( result == null ) result = caseCimObjectWithID( pssPTIST1 );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.SWITCH_INFO: {
            SwitchInfo switchInfo = ( SwitchInfo ) theEObject;
            T result = caseSwitchInfo( switchInfo );
            if( result == null ) result = caseAssetInfo( switchInfo );
            if( result == null ) result = caseIdentifiedObject( switchInfo );
            if( result == null ) result = caseCimObjectWithID( switchInfo );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.OIL_ANALYSIS_FLUID_DISCRETE: {
            OilAnalysisFluidDiscrete oilAnalysisFluidDiscrete = ( OilAnalysisFluidDiscrete ) theEObject;
            T result = caseOilAnalysisFluidDiscrete( oilAnalysisFluidDiscrete );
            if( result == null ) result = caseAssetDiscrete( oilAnalysisFluidDiscrete );
            if( result == null ) result = caseDiscrete( oilAnalysisFluidDiscrete );
            if( result == null ) result = caseMeasurement( oilAnalysisFluidDiscrete );
            if( result == null ) result = caseIdentifiedObject( oilAnalysisFluidDiscrete );
            if( result == null ) result = caseCimObjectWithID( oilAnalysisFluidDiscrete );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.SEASON: {
            Season season = ( Season ) theEObject;
            T result = caseSeason( season );
            if( result == null ) result = caseIdentifiedObject( season );
            if( result == null ) result = caseCimObjectWithID( season );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.SECTIONALISER: {
            Sectionaliser sectionaliser = ( Sectionaliser ) theEObject;
            T result = caseSectionaliser( sectionaliser );
            if( result == null ) result = caseSwitch( sectionaliser );
            if( result == null ) result = caseConductingEquipment( sectionaliser );
            if( result == null ) result = caseEquipment( sectionaliser );
            if( result == null ) result = casePowerSystemResource( sectionaliser );
            if( result == null ) result = caseIdentifiedObject( sectionaliser );
            if( result == null ) result = caseCimObjectWithID( sectionaliser );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.POWER_SYSTEM_STABILIZER_USER_DEFINED: {
            PowerSystemStabilizerUserDefined powerSystemStabilizerUserDefined = ( PowerSystemStabilizerUserDefined ) theEObject;
            T result = casePowerSystemStabilizerUserDefined( powerSystemStabilizerUserDefined );
            if( result == null ) result = casePowerSystemStabilizerDynamics( powerSystemStabilizerUserDefined );
            if( result == null ) result = caseDynamicsFunctionBlock( powerSystemStabilizerUserDefined );
            if( result == null ) result = caseIdentifiedObject( powerSystemStabilizerUserDefined );
            if( result == null ) result = caseCimObjectWithID( powerSystemStabilizerUserDefined );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.SUB_GEOGRAPHICAL_REGION: {
            SubGeographicalRegion subGeographicalRegion = ( SubGeographicalRegion ) theEObject;
            T result = caseSubGeographicalRegion( subGeographicalRegion );
            if( result == null ) result = caseIdentifiedObject( subGeographicalRegion );
            if( result == null ) result = caseCimObjectWithID( subGeographicalRegion );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.TAP_CHANGER: {
            TapChanger tapChanger = ( TapChanger ) theEObject;
            T result = caseTapChanger( tapChanger );
            if( result == null ) result = casePowerSystemResource( tapChanger );
            if( result == null ) result = caseIdentifiedObject( tapChanger );
            if( result == null ) result = caseCimObjectWithID( tapChanger );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.TIE_FLOW: {
            TieFlow tieFlow = ( TieFlow ) theEObject;
            T result = caseTieFlow( tieFlow );
            if( result == null ) result = caseIdentifiedObject( tieFlow );
            if( result == null ) result = caseCimObjectWithID( tieFlow );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.PAN_PRICING: {
            PanPricing panPricing = ( PanPricing ) theEObject;
            T result = casePanPricing( panPricing );
            if( result == null ) result = caseEndDeviceAction( panPricing );
            if( result == null ) result = caseCimObjectWithID( panPricing );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.ASSET_USER: {
            AssetUser assetUser = ( AssetUser ) theEObject;
            T result = caseAssetUser( assetUser );
            if( result == null ) result = caseAssetOrganisationRole( assetUser );
            if( result == null ) result = caseOrganisationRole( assetUser );
            if( result == null ) result = caseIdentifiedObject( assetUser );
            if( result == null ) result = caseCimObjectWithID( assetUser );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.METER: {
            Meter meter = ( Meter ) theEObject;
            T result = caseMeter( meter );
            if( result == null ) result = caseEndDevice( meter );
            if( result == null ) result = caseAssetContainer( meter );
            if( result == null ) result = caseAsset( meter );
            if( result == null ) result = caseIdentifiedObject( meter );
            if( result == null ) result = caseCimObjectWithID( meter );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.REGULATION_SCHEDULE: {
            RegulationSchedule regulationSchedule = ( RegulationSchedule ) theEObject;
            T result = caseRegulationSchedule( regulationSchedule );
            if( result == null ) result = caseSeasonDayTypeSchedule( regulationSchedule );
            if( result == null ) result = caseRegularIntervalSchedule( regulationSchedule );
            if( result == null ) result = caseBasicIntervalSchedule( regulationSchedule );
            if( result == null ) result = caseIdentifiedObject( regulationSchedule );
            if( result == null ) result = caseCimObjectWithID( regulationSchedule );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.COORDINATE_SYSTEM: {
            CoordinateSystem coordinateSystem = ( CoordinateSystem ) theEObject;
            T result = caseCoordinateSystem( coordinateSystem );
            if( result == null ) result = caseIdentifiedObject( coordinateSystem );
            if( result == null ) result = caseCimObjectWithID( coordinateSystem );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.AGGREGATE_SCORE: {
            AggregateScore aggregateScore = ( AggregateScore ) theEObject;
            T result = caseAggregateScore( aggregateScore );
            if( result == null ) result = caseAnalyticScore( aggregateScore );
            if( result == null ) result = caseIdentifiedObject( aggregateScore );
            if( result == null ) result = caseCimObjectWithID( aggregateScore );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.CATALOG_ASSET_TYPE: {
            CatalogAssetType catalogAssetType = ( CatalogAssetType ) theEObject;
            T result = caseCatalogAssetType( catalogAssetType );
            if( result == null ) result = caseIdentifiedObject( catalogAssetType );
            if( result == null ) result = caseCimObjectWithID( catalogAssetType );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.PSS2_B: {
            Pss2B pss2B = ( Pss2B ) theEObject;
            T result = casePss2B( pss2B );
            if( result == null ) result = casePowerSystemStabilizerDynamics( pss2B );
            if( result == null ) result = caseDynamicsFunctionBlock( pss2B );
            if( result == null ) result = caseIdentifiedObject( pss2B );
            if( result == null ) result = caseCimObjectWithID( pss2B );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.CHANNEL: {
            Channel channel = ( Channel ) theEObject;
            T result = caseChannel( channel );
            if( result == null ) result = caseIdentifiedObject( channel );
            if( result == null ) result = caseCimObjectWithID( channel );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.CARD: {
            Card card = ( Card ) theEObject;
            T result = caseCard( card );
            if( result == null ) result = caseCimObjectWithID( card );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.NONLINEAR_SHUNT_COMPENSATOR_PHASE: {
            NonlinearShuntCompensatorPhase nonlinearShuntCompensatorPhase = ( NonlinearShuntCompensatorPhase ) theEObject;
            T result = caseNonlinearShuntCompensatorPhase( nonlinearShuntCompensatorPhase );
            if( result == null ) result = caseShuntCompensatorPhase( nonlinearShuntCompensatorPhase );
            if( result == null ) result = casePowerSystemResource( nonlinearShuntCompensatorPhase );
            if( result == null ) result = caseIdentifiedObject( nonlinearShuntCompensatorPhase );
            if( result == null ) result = caseCimObjectWithID( nonlinearShuntCompensatorPhase );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.GOV_GAST3: {
            GovGAST3 govGAST3 = ( GovGAST3 ) theEObject;
            T result = caseGovGAST3( govGAST3 );
            if( result == null ) result = caseTurbineGovernorDynamics( govGAST3 );
            if( result == null ) result = caseDynamicsFunctionBlock( govGAST3 );
            if( result == null ) result = caseIdentifiedObject( govGAST3 );
            if( result == null ) result = caseCimObjectWithID( govGAST3 );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.PFV_AR_TYPE1_IEEEPF_CONTROLLER: {
            PFVArType1IEEEPFController pfvArType1IEEEPFController = ( PFVArType1IEEEPFController ) theEObject;
            T result = casePFVArType1IEEEPFController( pfvArType1IEEEPFController );
            if( result == null ) result = casePFVArControllerType1Dynamics( pfvArType1IEEEPFController );
            if( result == null ) result = caseDynamicsFunctionBlock( pfvArType1IEEEPFController );
            if( result == null ) result = caseIdentifiedObject( pfvArType1IEEEPFController );
            if( result == null ) result = caseCimObjectWithID( pfvArType1IEEEPFController );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.POWER_TRANSFORMER: {
            PowerTransformer powerTransformer = ( PowerTransformer ) theEObject;
            T result = casePowerTransformer( powerTransformer );
            if( result == null ) result = caseConductingEquipment( powerTransformer );
            if( result == null ) result = caseEquipment( powerTransformer );
            if( result == null ) result = casePowerSystemResource( powerTransformer );
            if( result == null ) result = caseIdentifiedObject( powerTransformer );
            if( result == null ) result = caseCimObjectWithID( powerTransformer );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.TARIFF: {
            Tariff tariff = ( Tariff ) theEObject;
            T result = caseTariff( tariff );
            if( result == null ) result = caseDocument( tariff );
            if( result == null ) result = caseIdentifiedObject( tariff );
            if( result == null ) result = caseCimObjectWithID( tariff );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.ACCUMULATOR_VALUE: {
            AccumulatorValue accumulatorValue = ( AccumulatorValue ) theEObject;
            T result = caseAccumulatorValue( accumulatorValue );
            if( result == null ) result = caseMeasurementValue( accumulatorValue );
            if( result == null ) result = caseIOPoint( accumulatorValue );
            if( result == null ) result = caseIdentifiedObject( accumulatorValue );
            if( result == null ) result = caseCimObjectWithID( accumulatorValue );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.GOV_HYDRO_R: {
            GovHydroR govHydroR = ( GovHydroR ) theEObject;
            T result = caseGovHydroR( govHydroR );
            if( result == null ) result = caseTurbineGovernorDynamics( govHydroR );
            if( result == null ) result = caseDynamicsFunctionBlock( govHydroR );
            if( result == null ) result = caseIdentifiedObject( govHydroR );
            if( result == null ) result = caseCimObjectWithID( govHydroR );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.MEDIUM: {
            Medium medium = ( Medium ) theEObject;
            T result = caseMedium( medium );
            if( result == null ) result = caseIdentifiedObject( medium );
            if( result == null ) result = caseCimObjectWithID( medium );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.PRIME_MOVER: {
            PrimeMover primeMover = ( PrimeMover ) theEObject;
            T result = casePrimeMover( primeMover );
            if( result == null ) result = casePowerSystemResource( primeMover );
            if( result == null ) result = caseIdentifiedObject( primeMover );
            if( result == null ) result = caseCimObjectWithID( primeMover );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.PHASE_TAP_CHANGER_TABLE_POINT: {
            PhaseTapChangerTablePoint phaseTapChangerTablePoint = ( PhaseTapChangerTablePoint ) theEObject;
            T result = casePhaseTapChangerTablePoint( phaseTapChangerTablePoint );
            if( result == null ) result = caseTapChangerTablePoint( phaseTapChangerTablePoint );
            if( result == null ) result = caseCimObjectWithID( phaseTapChangerTablePoint );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.READING_TYPE: {
            ReadingType readingType = ( ReadingType ) theEObject;
            T result = caseReadingType( readingType );
            if( result == null ) result = caseIdentifiedObject( readingType );
            if( result == null ) result = caseCimObjectWithID( readingType );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.END_DEVICE_EVENT_TYPE: {
            EndDeviceEventType endDeviceEventType = ( EndDeviceEventType ) theEObject;
            T result = caseEndDeviceEventType( endDeviceEventType );
            if( result == null ) result = caseIdentifiedObject( endDeviceEventType );
            if( result == null ) result = caseCimObjectWithID( endDeviceEventType );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.GOV_HYDRO_WEH: {
            GovHydroWEH govHydroWEH = ( GovHydroWEH ) theEObject;
            T result = caseGovHydroWEH( govHydroWEH );
            if( result == null ) result = caseTurbineGovernorDynamics( govHydroWEH );
            if( result == null ) result = caseDynamicsFunctionBlock( govHydroWEH );
            if( result == null ) result = caseIdentifiedObject( govHydroWEH );
            if( result == null ) result = caseCimObjectWithID( govHydroWEH );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.NAME_TYPE_AUTHORITY: {
            NameTypeAuthority nameTypeAuthority = ( NameTypeAuthority ) theEObject;
            T result = caseNameTypeAuthority( nameTypeAuthority );
            if( result == null ) result = caseCimObjectWithID( nameTypeAuthority );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.BASE_POWER: {
            BasePower basePower = ( BasePower ) theEObject;
            T result = caseBasePower( basePower );
            if( result == null ) result = caseIdentifiedObject( basePower );
            if( result == null ) result = caseCimObjectWithID( basePower );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.EXC_IEEEAC3A: {
            ExcIEEEAC3A excIEEEAC3A = ( ExcIEEEAC3A ) theEObject;
            T result = caseExcIEEEAC3A( excIEEEAC3A );
            if( result == null ) result = caseExcitationSystemDynamics( excIEEEAC3A );
            if( result == null ) result = caseDynamicsFunctionBlock( excIEEEAC3A );
            if( result == null ) result = caseIdentifiedObject( excIEEEAC3A );
            if( result == null ) result = caseCimObjectWithID( excIEEEAC3A );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.OWNERSHIP: {
            Ownership ownership = ( Ownership ) theEObject;
            T result = caseOwnership( ownership );
            if( result == null ) result = caseIdentifiedObject( ownership );
            if( result == null ) result = caseCimObjectWithID( ownership );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.RECLOSE_SEQUENCE: {
            RecloseSequence recloseSequence = ( RecloseSequence ) theEObject;
            T result = caseRecloseSequence( recloseSequence );
            if( result == null ) result = caseIdentifiedObject( recloseSequence );
            if( result == null ) result = caseCimObjectWithID( recloseSequence );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.EMISSION_ACCOUNT: {
            EmissionAccount emissionAccount = ( EmissionAccount ) theEObject;
            T result = caseEmissionAccount( emissionAccount );
            if( result == null ) result = caseCurve( emissionAccount );
            if( result == null ) result = caseIdentifiedObject( emissionAccount );
            if( result == null ) result = caseCimObjectWithID( emissionAccount );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.IRREGULAR_TIME_POINT: {
            IrregularTimePoint irregularTimePoint = ( IrregularTimePoint ) theEObject;
            T result = caseIrregularTimePoint( irregularTimePoint );
            if( result == null ) result = caseCimObjectWithID( irregularTimePoint );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.WIND_PLANT_IEC: {
            WindPlantIEC windPlantIEC = ( WindPlantIEC ) theEObject;
            T result = caseWindPlantIEC( windPlantIEC );
            if( result == null ) result = caseWindPlantDynamics( windPlantIEC );
            if( result == null ) result = caseDynamicsFunctionBlock( windPlantIEC );
            if( result == null ) result = caseIdentifiedObject( windPlantIEC );
            if( result == null ) result = caseCimObjectWithID( windPlantIEC );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.OUTAGE_SCHEDULE: {
            OutageSchedule outageSchedule = ( OutageSchedule ) theEObject;
            T result = caseOutageSchedule( outageSchedule );
            if( result == null ) result = caseDocument( outageSchedule );
            if( result == null ) result = caseIdentifiedObject( outageSchedule );
            if( result == null ) result = caseCimObjectWithID( outageSchedule );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.POST_LINE_SENSOR: {
            PostLineSensor postLineSensor = ( PostLineSensor ) theEObject;
            T result = casePostLineSensor( postLineSensor );
            if( result == null ) result = caseSensor( postLineSensor );
            if( result == null ) result = caseAuxiliaryEquipment( postLineSensor );
            if( result == null ) result = caseEquipment( postLineSensor );
            if( result == null ) result = casePowerSystemResource( postLineSensor );
            if( result == null ) result = caseIdentifiedObject( postLineSensor );
            if( result == null ) result = caseCimObjectWithID( postLineSensor );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.RATIO_TAP_CHANGER_TABLE: {
            RatioTapChangerTable ratioTapChangerTable = ( RatioTapChangerTable ) theEObject;
            T result = caseRatioTapChangerTable( ratioTapChangerTable );
            if( result == null ) result = caseIdentifiedObject( ratioTapChangerTable );
            if( result == null ) result = caseCimObjectWithID( ratioTapChangerTable );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.EXC_ST3A: {
            ExcST3A excST3A = ( ExcST3A ) theEObject;
            T result = caseExcST3A( excST3A );
            if( result == null ) result = caseExcitationSystemDynamics( excST3A );
            if( result == null ) result = caseDynamicsFunctionBlock( excST3A );
            if( result == null ) result = caseIdentifiedObject( excST3A );
            if( result == null ) result = caseCimObjectWithID( excST3A );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.GOV_GAST2: {
            GovGAST2 govGAST2 = ( GovGAST2 ) theEObject;
            T result = caseGovGAST2( govGAST2 );
            if( result == null ) result = caseTurbineGovernorDynamics( govGAST2 );
            if( result == null ) result = caseDynamicsFunctionBlock( govGAST2 );
            if( result == null ) result = caseIdentifiedObject( govGAST2 );
            if( result == null ) result = caseCimObjectWithID( govGAST2 );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.EXC_ST1A: {
            ExcST1A excST1A = ( ExcST1A ) theEObject;
            T result = caseExcST1A( excST1A );
            if( result == null ) result = caseExcitationSystemDynamics( excST1A );
            if( result == null ) result = caseDynamicsFunctionBlock( excST1A );
            if( result == null ) result = caseIdentifiedObject( excST1A );
            if( result == null ) result = caseCimObjectWithID( excST1A );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.END_DEVICE_GROUP: {
            EndDeviceGroup endDeviceGroup = ( EndDeviceGroup ) theEObject;
            T result = caseEndDeviceGroup( endDeviceGroup );
            if( result == null ) result = caseIdentifiedObject( endDeviceGroup );
            if( result == null ) result = caseCimObjectWithID( endDeviceGroup );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.VS_CAPABILITY_CURVE: {
            VsCapabilityCurve vsCapabilityCurve = ( VsCapabilityCurve ) theEObject;
            T result = caseVsCapabilityCurve( vsCapabilityCurve );
            if( result == null ) result = caseCurve( vsCapabilityCurve );
            if( result == null ) result = caseIdentifiedObject( vsCapabilityCurve );
            if( result == null ) result = caseCimObjectWithID( vsCapabilityCurve );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.AUXILIARY_EQUIPMENT: {
            AuxiliaryEquipment auxiliaryEquipment = ( AuxiliaryEquipment ) theEObject;
            T result = caseAuxiliaryEquipment( auxiliaryEquipment );
            if( result == null ) result = caseEquipment( auxiliaryEquipment );
            if( result == null ) result = casePowerSystemResource( auxiliaryEquipment );
            if( result == null ) result = caseIdentifiedObject( auxiliaryEquipment );
            if( result == null ) result = caseCimObjectWithID( auxiliaryEquipment );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.WIND_REF_FRAME_ROT_IEC: {
            WindRefFrameRotIEC windRefFrameRotIEC = ( WindRefFrameRotIEC ) theEObject;
            T result = caseWindRefFrameRotIEC( windRefFrameRotIEC );
            if( result == null ) result = caseIdentifiedObject( windRefFrameRotIEC );
            if( result == null ) result = caseCimObjectWithID( windRefFrameRotIEC );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.WIND_AERO_TWO_DIM_IEC: {
            WindAeroTwoDimIEC windAeroTwoDimIEC = ( WindAeroTwoDimIEC ) theEObject;
            T result = caseWindAeroTwoDimIEC( windAeroTwoDimIEC );
            if( result == null ) result = caseIdentifiedObject( windAeroTwoDimIEC );
            if( result == null ) result = caseCimObjectWithID( windAeroTwoDimIEC );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.ASYNCHRONOUS_MACHINE_TIME_CONSTANT_REACTANCE: {
            AsynchronousMachineTimeConstantReactance asynchronousMachineTimeConstantReactance = ( AsynchronousMachineTimeConstantReactance ) theEObject;
            T result = caseAsynchronousMachineTimeConstantReactance( asynchronousMachineTimeConstantReactance );
            if( result == null ) result = caseAsynchronousMachineDynamics( asynchronousMachineTimeConstantReactance );
            if( result == null ) result = caseRotatingMachineDynamics( asynchronousMachineTimeConstantReactance );
            if( result == null ) result = caseDynamicsFunctionBlock( asynchronousMachineTimeConstantReactance );
            if( result == null ) result = caseIdentifiedObject( asynchronousMachineTimeConstantReactance );
            if( result == null ) result = caseCimObjectWithID( asynchronousMachineTimeConstantReactance );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.DIAGNOSIS_DATA_SET: {
            DiagnosisDataSet diagnosisDataSet = ( DiagnosisDataSet ) theEObject;
            T result = caseDiagnosisDataSet( diagnosisDataSet );
            if( result == null ) result = caseProcedureDataSet( diagnosisDataSet );
            if( result == null ) result = caseDocument( diagnosisDataSet );
            if( result == null ) result = caseIdentifiedObject( diagnosisDataSet );
            if( result == null ) result = caseCimObjectWithID( diagnosisDataSet );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.DUCT_BANK: {
            DuctBank ductBank = ( DuctBank ) theEObject;
            T result = caseDuctBank( ductBank );
            if( result == null ) result = caseAssetContainer( ductBank );
            if( result == null ) result = caseAsset( ductBank );
            if( result == null ) result = caseIdentifiedObject( ductBank );
            if( result == null ) result = caseCimObjectWithID( ductBank );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.SET_POINT: {
            SetPoint setPoint = ( SetPoint ) theEObject;
            T result = caseSetPoint( setPoint );
            if( result == null ) result = caseAnalogControl( setPoint );
            if( result == null ) result = caseControl( setPoint );
            if( result == null ) result = caseIOPoint( setPoint );
            if( result == null ) result = caseIdentifiedObject( setPoint );
            if( result == null ) result = caseCimObjectWithID( setPoint );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.PAN_DISPLAY: {
            PanDisplay panDisplay = ( PanDisplay ) theEObject;
            T result = casePanDisplay( panDisplay );
            if( result == null ) result = caseEndDeviceAction( panDisplay );
            if( result == null ) result = caseCimObjectWithID( panDisplay );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.GOV_HYDRO4: {
            GovHydro4 govHydro4 = ( GovHydro4 ) theEObject;
            T result = caseGovHydro4( govHydro4 );
            if( result == null ) result = caseTurbineGovernorDynamics( govHydro4 );
            if( result == null ) result = caseDynamicsFunctionBlock( govHydro4 );
            if( result == null ) result = caseIdentifiedObject( govHydro4 );
            if( result == null ) result = caseCimObjectWithID( govHydro4 );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.CUSTOMER_AGREEMENT: {
            CustomerAgreement customerAgreement = ( CustomerAgreement ) theEObject;
            T result = caseCustomerAgreement( customerAgreement );
            if( result == null ) result = caseAgreement( customerAgreement );
            if( result == null ) result = caseDocument( customerAgreement );
            if( result == null ) result = caseIdentifiedObject( customerAgreement );
            if( result == null ) result = caseCimObjectWithID( customerAgreement );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.GOV_STEAM_EU: {
            GovSteamEU govSteamEU = ( GovSteamEU ) theEObject;
            T result = caseGovSteamEU( govSteamEU );
            if( result == null ) result = caseTurbineGovernorDynamics( govSteamEU );
            if( result == null ) result = caseDynamicsFunctionBlock( govSteamEU );
            if( result == null ) result = caseIdentifiedObject( govSteamEU );
            if( result == null ) result = caseCimObjectWithID( govSteamEU );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.POTENTIAL_TRANSFORMER: {
            PotentialTransformer potentialTransformer = ( PotentialTransformer ) theEObject;
            T result = casePotentialTransformer( potentialTransformer );
            if( result == null ) result = caseSensor( potentialTransformer );
            if( result == null ) result = caseAuxiliaryEquipment( potentialTransformer );
            if( result == null ) result = caseEquipment( potentialTransformer );
            if( result == null ) result = casePowerSystemResource( potentialTransformer );
            if( result == null ) result = caseIdentifiedObject( potentialTransformer );
            if( result == null ) result = caseCimObjectWithID( potentialTransformer );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.CABLE_INFO: {
            CableInfo cableInfo = ( CableInfo ) theEObject;
            T result = caseCableInfo( cableInfo );
            if( result == null ) result = caseWireInfo( cableInfo );
            if( result == null ) result = caseAssetInfo( cableInfo );
            if( result == null ) result = caseIdentifiedObject( cableInfo );
            if( result == null ) result = caseCimObjectWithID( cableInfo );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.VENDOR_SHIFT: {
            VendorShift vendorShift = ( VendorShift ) theEObject;
            T result = caseVendorShift( vendorShift );
            if( result == null ) result = caseShift( vendorShift );
            if( result == null ) result = caseIdentifiedObject( vendorShift );
            if( result == null ) result = caseCimObjectWithID( vendorShift );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.OIL_ANALYSIS_FLUID_ANALOG: {
            OilAnalysisFluidAnalog oilAnalysisFluidAnalog = ( OilAnalysisFluidAnalog ) theEObject;
            T result = caseOilAnalysisFluidAnalog( oilAnalysisFluidAnalog );
            if( result == null ) result = caseAssetAnalog( oilAnalysisFluidAnalog );
            if( result == null ) result = caseAnalog( oilAnalysisFluidAnalog );
            if( result == null ) result = caseMeasurement( oilAnalysisFluidAnalog );
            if( result == null ) result = caseIdentifiedObject( oilAnalysisFluidAnalog );
            if( result == null ) result = caseCimObjectWithID( oilAnalysisFluidAnalog );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.PHASE_TAP_CHANGER_ASYMMETRICAL: {
            PhaseTapChangerAsymmetrical phaseTapChangerAsymmetrical = ( PhaseTapChangerAsymmetrical ) theEObject;
            T result = casePhaseTapChangerAsymmetrical( phaseTapChangerAsymmetrical );
            if( result == null ) result = casePhaseTapChangerNonLinear( phaseTapChangerAsymmetrical );
            if( result == null ) result = casePhaseTapChanger( phaseTapChangerAsymmetrical );
            if( result == null ) result = caseTapChanger( phaseTapChangerAsymmetrical );
            if( result == null ) result = casePowerSystemResource( phaseTapChangerAsymmetrical );
            if( result == null ) result = caseIdentifiedObject( phaseTapChangerAsymmetrical );
            if( result == null ) result = caseCimObjectWithID( phaseTapChangerAsymmetrical );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.OVEREXC_LIM_IEEE: {
            OverexcLimIEEE overexcLimIEEE = ( OverexcLimIEEE ) theEObject;
            T result = caseOverexcLimIEEE( overexcLimIEEE );
            if( result == null ) result = caseOverexcitationLimiterDynamics( overexcLimIEEE );
            if( result == null ) result = caseDynamicsFunctionBlock( overexcLimIEEE );
            if( result == null ) result = caseIdentifiedObject( overexcLimIEEE );
            if( result == null ) result = caseCimObjectWithID( overexcLimIEEE );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.DIAGRAM_OBJECT_POINT: {
            DiagramObjectPoint diagramObjectPoint = ( DiagramObjectPoint ) theEObject;
            T result = caseDiagramObjectPoint( diagramObjectPoint );
            if( result == null ) result = caseCimObjectWithID( diagramObjectPoint );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.IEC61970CIM_VERSION: {
            IEC61970CIMVersion iec61970CIMVersion = ( IEC61970CIMVersion ) theEObject;
            T result = caseIEC61970CIMVersion( iec61970CIMVersion );
            if( result == null ) result = caseCimObjectWithID( iec61970CIMVersion );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.END_DEVICE_FUNCTION: {
            EndDeviceFunction endDeviceFunction = ( EndDeviceFunction ) theEObject;
            T result = caseEndDeviceFunction( endDeviceFunction );
            if( result == null ) result = caseAssetFunction( endDeviceFunction );
            if( result == null ) result = caseIdentifiedObject( endDeviceFunction );
            if( result == null ) result = caseCimObjectWithID( endDeviceFunction );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.GENERIC_ACTION: {
            GenericAction genericAction = ( GenericAction ) theEObject;
            T result = caseGenericAction( genericAction );
            if( result == null ) result = caseSwitchingStep( genericAction );
            if( result == null ) result = caseCimObjectWithID( genericAction );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.ASSET_CONTAINER: {
            AssetContainer assetContainer = ( AssetContainer ) theEObject;
            T result = caseAssetContainer( assetContainer );
            if( result == null ) result = caseAsset( assetContainer );
            if( result == null ) result = caseIdentifiedObject( assetContainer );
            if( result == null ) result = caseCimObjectWithID( assetContainer );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.CLEARANCE_DOCUMENT: {
            ClearanceDocument clearanceDocument = ( ClearanceDocument ) theEObject;
            T result = caseClearanceDocument( clearanceDocument );
            if( result == null ) result = caseSafetyDocument( clearanceDocument );
            if( result == null ) result = caseDocument( clearanceDocument );
            if( result == null ) result = caseIdentifiedObject( clearanceDocument );
            if( result == null ) result = caseCimObjectWithID( clearanceDocument );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.EXC_AVR5: {
            ExcAVR5 excAVR5 = ( ExcAVR5 ) theEObject;
            T result = caseExcAVR5( excAVR5 );
            if( result == null ) result = caseExcitationSystemDynamics( excAVR5 );
            if( result == null ) result = caseDynamicsFunctionBlock( excAVR5 );
            if( result == null ) result = caseIdentifiedObject( excAVR5 );
            if( result == null ) result = caseCimObjectWithID( excAVR5 );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.OPERATIONAL_LIMIT_TYPE: {
            OperationalLimitType operationalLimitType = ( OperationalLimitType ) theEObject;
            T result = caseOperationalLimitType( operationalLimitType );
            if( result == null ) result = caseIdentifiedObject( operationalLimitType );
            if( result == null ) result = caseCimObjectWithID( operationalLimitType );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.EXC_IEEEST6B: {
            ExcIEEEST6B excIEEEST6B = ( ExcIEEEST6B ) theEObject;
            T result = caseExcIEEEST6B( excIEEEST6B );
            if( result == null ) result = caseExcitationSystemDynamics( excIEEEST6B );
            if( result == null ) result = caseDynamicsFunctionBlock( excIEEEST6B );
            if( result == null ) result = caseIdentifiedObject( excIEEEST6B );
            if( result == null ) result = caseCimObjectWithID( excIEEEST6B );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.EXC_IEEEST2A: {
            ExcIEEEST2A excIEEEST2A = ( ExcIEEEST2A ) theEObject;
            T result = caseExcIEEEST2A( excIEEEST2A );
            if( result == null ) result = caseExcitationSystemDynamics( excIEEEST2A );
            if( result == null ) result = caseDynamicsFunctionBlock( excIEEEST2A );
            if( result == null ) result = caseIdentifiedObject( excIEEEST2A );
            if( result == null ) result = caseCimObjectWithID( excIEEEST2A );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.ASSET: {
            Asset asset = ( Asset ) theEObject;
            T result = caseAsset( asset );
            if( result == null ) result = caseIdentifiedObject( asset );
            if( result == null ) result = caseCimObjectWithID( asset );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.WIND_TURBINE_TYPE3OR4_IEC: {
            WindTurbineType3or4IEC windTurbineType3or4IEC = ( WindTurbineType3or4IEC ) theEObject;
            T result = caseWindTurbineType3or4IEC( windTurbineType3or4IEC );
            if( result == null ) result = caseWindTurbineType3or4Dynamics( windTurbineType3or4IEC );
            if( result == null ) result = caseDynamicsFunctionBlock( windTurbineType3or4IEC );
            if( result == null ) result = caseIdentifiedObject( windTurbineType3or4IEC );
            if( result == null ) result = caseCimObjectWithID( windTurbineType3or4IEC );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.USAGE_POINT_GROUP: {
            UsagePointGroup usagePointGroup = ( UsagePointGroup ) theEObject;
            T result = caseUsagePointGroup( usagePointGroup );
            if( result == null ) result = caseIdentifiedObject( usagePointGroup );
            if( result == null ) result = caseCimObjectWithID( usagePointGroup );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.DIAGRAM_OBJECT_STYLE: {
            DiagramObjectStyle diagramObjectStyle = ( DiagramObjectStyle ) theEObject;
            T result = caseDiagramObjectStyle( diagramObjectStyle );
            if( result == null ) result = caseIdentifiedObject( diagramObjectStyle );
            if( result == null ) result = caseCimObjectWithID( diagramObjectStyle );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.INTERRUPTER_UNIT: {
            InterrupterUnit interrupterUnit = ( InterrupterUnit ) theEObject;
            T result = caseInterrupterUnit( interrupterUnit );
            if( result == null ) result = caseAsset( interrupterUnit );
            if( result == null ) result = caseIdentifiedObject( interrupterUnit );
            if( result == null ) result = caseCimObjectWithID( interrupterUnit );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.CREW_TYPE: {
            CrewType crewType = ( CrewType ) theEObject;
            T result = caseCrewType( crewType );
            if( result == null ) result = caseIdentifiedObject( crewType );
            if( result == null ) result = caseCimObjectWithID( crewType );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.WIND_DYNAMICS_LOOKUP_TABLE: {
            WindDynamicsLookupTable windDynamicsLookupTable = ( WindDynamicsLookupTable ) theEObject;
            T result = caseWindDynamicsLookupTable( windDynamicsLookupTable );
            if( result == null ) result = caseIdentifiedObject( windDynamicsLookupTable );
            if( result == null ) result = caseCimObjectWithID( windDynamicsLookupTable );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.FOSSIL_STEAM_SUPPLY: {
            FossilSteamSupply fossilSteamSupply = ( FossilSteamSupply ) theEObject;
            T result = caseFossilSteamSupply( fossilSteamSupply );
            if( result == null ) result = caseSteamSupply( fossilSteamSupply );
            if( result == null ) result = casePowerSystemResource( fossilSteamSupply );
            if( result == null ) result = caseIdentifiedObject( fossilSteamSupply );
            if( result == null ) result = caseCimObjectWithID( fossilSteamSupply );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.EXC_AVR3: {
            ExcAVR3 excAVR3 = ( ExcAVR3 ) theEObject;
            T result = caseExcAVR3( excAVR3 );
            if( result == null ) result = caseExcitationSystemDynamics( excAVR3 );
            if( result == null ) result = caseDynamicsFunctionBlock( excAVR3 );
            if( result == null ) result = caseIdentifiedObject( excAVR3 );
            if( result == null ) result = caseCimObjectWithID( excAVR3 );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.DC_BUSBAR: {
            DCBusbar dcBusbar = ( DCBusbar ) theEObject;
            T result = caseDCBusbar( dcBusbar );
            if( result == null ) result = caseDCConductingEquipment( dcBusbar );
            if( result == null ) result = caseEquipment( dcBusbar );
            if( result == null ) result = casePowerSystemResource( dcBusbar );
            if( result == null ) result = caseIdentifiedObject( dcBusbar );
            if( result == null ) result = caseCimObjectWithID( dcBusbar );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.EXC_SK: {
            ExcSK excSK = ( ExcSK ) theEObject;
            T result = caseExcSK( excSK );
            if( result == null ) result = caseExcitationSystemDynamics( excSK );
            if( result == null ) result = caseDynamicsFunctionBlock( excSK );
            if( result == null ) result = caseIdentifiedObject( excSK );
            if( result == null ) result = caseCimObjectWithID( excSK );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.BREAKER: {
            Breaker breaker = ( Breaker ) theEObject;
            T result = caseBreaker( breaker );
            if( result == null ) result = caseProtectedSwitch( breaker );
            if( result == null ) result = caseSwitch( breaker );
            if( result == null ) result = caseConductingEquipment( breaker );
            if( result == null ) result = caseEquipment( breaker );
            if( result == null ) result = casePowerSystemResource( breaker );
            if( result == null ) result = caseIdentifiedObject( breaker );
            if( result == null ) result = caseCimObjectWithID( breaker );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.EXCITATION_SYSTEM_DYNAMICS: {
            ExcitationSystemDynamics excitationSystemDynamics = ( ExcitationSystemDynamics ) theEObject;
            T result = caseExcitationSystemDynamics( excitationSystemDynamics );
            if( result == null ) result = caseDynamicsFunctionBlock( excitationSystemDynamics );
            if( result == null ) result = caseIdentifiedObject( excitationSystemDynamics );
            if( result == null ) result = caseCimObjectWithID( excitationSystemDynamics );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.OPERATIONAL_UPDATED_RATING: {
            OperationalUpdatedRating operationalUpdatedRating = ( OperationalUpdatedRating ) theEObject;
            T result = caseOperationalUpdatedRating( operationalUpdatedRating );
            if( result == null ) result = caseOperationalRestriction( operationalUpdatedRating );
            if( result == null ) result = caseDocument( operationalUpdatedRating );
            if( result == null ) result = caseIdentifiedObject( operationalUpdatedRating );
            if( result == null ) result = caseCimObjectWithID( operationalUpdatedRating );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.EXC_HU: {
            ExcHU excHU = ( ExcHU ) theEObject;
            T result = caseExcHU( excHU );
            if( result == null ) result = caseExcitationSystemDynamics( excHU );
            if( result == null ) result = caseDynamicsFunctionBlock( excHU );
            if( result == null ) result = caseIdentifiedObject( excHU );
            if( result == null ) result = caseCimObjectWithID( excHU );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.INCREMENTAL_HEAT_RATE_CURVE: {
            IncrementalHeatRateCurve incrementalHeatRateCurve = ( IncrementalHeatRateCurve ) theEObject;
            T result = caseIncrementalHeatRateCurve( incrementalHeatRateCurve );
            if( result == null ) result = caseCurve( incrementalHeatRateCurve );
            if( result == null ) result = caseIdentifiedObject( incrementalHeatRateCurve );
            if( result == null ) result = caseCimObjectWithID( incrementalHeatRateCurve );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.DIAGRAM_STYLE: {
            DiagramStyle diagramStyle = ( DiagramStyle ) theEObject;
            T result = caseDiagramStyle( diagramStyle );
            if( result == null ) result = caseIdentifiedObject( diagramStyle );
            if( result == null ) result = caseCimObjectWithID( diagramStyle );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.VENDOR: {
            Vendor vendor = ( Vendor ) theEObject;
            T result = caseVendor( vendor );
            if( result == null ) result = caseIdentifiedObject( vendor );
            if( result == null ) result = caseCimObjectWithID( vendor );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.GOV_GAST1: {
            GovGAST1 govGAST1 = ( GovGAST1 ) theEObject;
            T result = caseGovGAST1( govGAST1 );
            if( result == null ) result = caseTurbineGovernorDynamics( govGAST1 );
            if( result == null ) result = caseDynamicsFunctionBlock( govGAST1 );
            if( result == null ) result = caseIdentifiedObject( govGAST1 );
            if( result == null ) result = caseCimObjectWithID( govGAST1 );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.REGULATING_COND_EQ: {
            RegulatingCondEq regulatingCondEq = ( RegulatingCondEq ) theEObject;
            T result = caseRegulatingCondEq( regulatingCondEq );
            if( result == null ) result = caseEnergyConnection( regulatingCondEq );
            if( result == null ) result = caseConductingEquipment( regulatingCondEq );
            if( result == null ) result = caseEquipment( regulatingCondEq );
            if( result == null ) result = casePowerSystemResource( regulatingCondEq );
            if( result == null ) result = caseIdentifiedObject( regulatingCondEq );
            if( result == null ) result = caseCimObjectWithID( regulatingCondEq );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.RATIO_TAP_CHANGER_TABLE_POINT: {
            RatioTapChangerTablePoint ratioTapChangerTablePoint = ( RatioTapChangerTablePoint ) theEObject;
            T result = caseRatioTapChangerTablePoint( ratioTapChangerTablePoint );
            if( result == null ) result = caseTapChangerTablePoint( ratioTapChangerTablePoint );
            if( result == null ) result = caseCimObjectWithID( ratioTapChangerTablePoint );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.TRANSFORMER_TANK_END: {
            TransformerTankEnd transformerTankEnd = ( TransformerTankEnd ) theEObject;
            T result = caseTransformerTankEnd( transformerTankEnd );
            if( result == null ) result = caseTransformerEnd( transformerTankEnd );
            if( result == null ) result = caseIdentifiedObject( transformerTankEnd );
            if( result == null ) result = caseCimObjectWithID( transformerTankEnd );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.DISC_EXC_CONT_IEEEDEC2A: {
            DiscExcContIEEEDEC2A discExcContIEEEDEC2A = ( DiscExcContIEEEDEC2A ) theEObject;
            T result = caseDiscExcContIEEEDEC2A( discExcContIEEEDEC2A );
            if( result == null ) result = caseDiscontinuousExcitationControlDynamics( discExcContIEEEDEC2A );
            if( result == null ) result = caseDynamicsFunctionBlock( discExcContIEEEDEC2A );
            if( result == null ) result = caseIdentifiedObject( discExcContIEEEDEC2A );
            if( result == null ) result = caseCimObjectWithID( discExcContIEEEDEC2A );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.CURRENT_RELAY: {
            CurrentRelay currentRelay = ( CurrentRelay ) theEObject;
            T result = caseCurrentRelay( currentRelay );
            if( result == null ) result = caseProtectionEquipment( currentRelay );
            if( result == null ) result = caseEquipment( currentRelay );
            if( result == null ) result = casePowerSystemResource( currentRelay );
            if( result == null ) result = caseIdentifiedObject( currentRelay );
            if( result == null ) result = caseCimObjectWithID( currentRelay );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.OPERATIONAL_LIMIT: {
            OperationalLimit operationalLimit = ( OperationalLimit ) theEObject;
            T result = caseOperationalLimit( operationalLimit );
            if( result == null ) result = caseIdentifiedObject( operationalLimit );
            if( result == null ) result = caseCimObjectWithID( operationalLimit );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.CONTINGENCY_ELEMENT: {
            ContingencyElement contingencyElement = ( ContingencyElement ) theEObject;
            T result = caseContingencyElement( contingencyElement );
            if( result == null ) result = caseIdentifiedObject( contingencyElement );
            if( result == null ) result = caseCimObjectWithID( contingencyElement );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.PFV_AR_CONTROLLER_TYPE1_DYNAMICS: {
            PFVArControllerType1Dynamics pfvArControllerType1Dynamics = ( PFVArControllerType1Dynamics ) theEObject;
            T result = casePFVArControllerType1Dynamics( pfvArControllerType1Dynamics );
            if( result == null ) result = caseDynamicsFunctionBlock( pfvArControllerType1Dynamics );
            if( result == null ) result = caseIdentifiedObject( pfvArControllerType1Dynamics );
            if( result == null ) result = caseCimObjectWithID( pfvArControllerType1Dynamics );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.SWITCH: {
            fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Switch switch_ = ( fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Switch ) theEObject;
            T result = caseSwitch( switch_ );
            if( result == null ) result = caseConductingEquipment( switch_ );
            if( result == null ) result = caseEquipment( switch_ );
            if( result == null ) result = casePowerSystemResource( switch_ );
            if( result == null ) result = caseIdentifiedObject( switch_ );
            if( result == null ) result = caseCimObjectWithID( switch_ );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.BILATERAL_EXCHANGE_ACTOR: {
            BilateralExchangeActor bilateralExchangeActor = ( BilateralExchangeActor ) theEObject;
            T result = caseBilateralExchangeActor( bilateralExchangeActor );
            if( result == null ) result = caseIdentifiedObject( bilateralExchangeActor );
            if( result == null ) result = caseCimObjectWithID( bilateralExchangeActor );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.TEST_DATA_SET: {
            TestDataSet testDataSet = ( TestDataSet ) theEObject;
            T result = caseTestDataSet( testDataSet );
            if( result == null ) result = caseProcedureDataSet( testDataSet );
            if( result == null ) result = caseDocument( testDataSet );
            if( result == null ) result = caseIdentifiedObject( testDataSet );
            if( result == null ) result = caseCimObjectWithID( testDataSet );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.VCOMP_IEEE_TYPE1: {
            VCompIEEEType1 vCompIEEEType1 = ( VCompIEEEType1 ) theEObject;
            T result = caseVCompIEEEType1( vCompIEEEType1 );
            if( result == null ) result = caseVoltageCompensatorDynamics( vCompIEEEType1 );
            if( result == null ) result = caseDynamicsFunctionBlock( vCompIEEEType1 );
            if( result == null ) result = caseIdentifiedObject( vCompIEEEType1 );
            if( result == null ) result = caseCimObjectWithID( vCompIEEEType1 );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.USAGE_POINT_LOCATION: {
            UsagePointLocation usagePointLocation = ( UsagePointLocation ) theEObject;
            T result = caseUsagePointLocation( usagePointLocation );
            if( result == null ) result = caseLocation( usagePointLocation );
            if( result == null ) result = caseIdentifiedObject( usagePointLocation );
            if( result == null ) result = caseCimObjectWithID( usagePointLocation );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.PER_LENGTH_IMPEDANCE: {
            PerLengthImpedance perLengthImpedance = ( PerLengthImpedance ) theEObject;
            T result = casePerLengthImpedance( perLengthImpedance );
            if( result == null ) result = casePerLengthLineParameter( perLengthImpedance );
            if( result == null ) result = caseIdentifiedObject( perLengthImpedance );
            if( result == null ) result = caseCimObjectWithID( perLengthImpedance );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.IEC61968CIM_VERSION: {
            IEC61968CIMVersion iec61968CIMVersion = ( IEC61968CIMVersion ) theEObject;
            T result = caseIEC61968CIMVersion( iec61968CIMVersion );
            if( result == null ) result = caseCimObjectWithID( iec61968CIMVersion );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.USER_ATTRIBUTE: {
            UserAttribute userAttribute = ( UserAttribute ) theEObject;
            T result = caseUserAttribute( userAttribute );
            if( result == null ) result = caseCimObjectWithID( userAttribute );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.SERVICE_CATEGORY: {
            ServiceCategory serviceCategory = ( ServiceCategory ) theEObject;
            T result = caseServiceCategory( serviceCategory );
            if( result == null ) result = caseIdentifiedObject( serviceCategory );
            if( result == null ) result = caseCimObjectWithID( serviceCategory );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.ALT_TIE_MEAS: {
            AltTieMeas altTieMeas = ( AltTieMeas ) theEObject;
            T result = caseAltTieMeas( altTieMeas );
            if( result == null ) result = caseIdentifiedObject( altTieMeas );
            if( result == null ) result = caseCimObjectWithID( altTieMeas );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.DC_TERMINAL: {
            DCTerminal dcTerminal = ( DCTerminal ) theEObject;
            T result = caseDCTerminal( dcTerminal );
            if( result == null ) result = caseDCBaseTerminal( dcTerminal );
            if( result == null ) result = caseACDCTerminal( dcTerminal );
            if( result == null ) result = caseIdentifiedObject( dcTerminal );
            if( result == null ) result = caseCimObjectWithID( dcTerminal );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.STATIC_VAR_COMPENSATOR: {
            StaticVarCompensator staticVarCompensator = ( StaticVarCompensator ) theEObject;
            T result = caseStaticVarCompensator( staticVarCompensator );
            if( result == null ) result = caseRegulatingCondEq( staticVarCompensator );
            if( result == null ) result = caseEnergyConnection( staticVarCompensator );
            if( result == null ) result = caseConductingEquipment( staticVarCompensator );
            if( result == null ) result = caseEquipment( staticVarCompensator );
            if( result == null ) result = casePowerSystemResource( staticVarCompensator );
            if( result == null ) result = caseIdentifiedObject( staticVarCompensator );
            if( result == null ) result = caseCimObjectWithID( staticVarCompensator );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.GOV_HYDRO_PID: {
            GovHydroPID govHydroPID = ( GovHydroPID ) theEObject;
            T result = caseGovHydroPID( govHydroPID );
            if( result == null ) result = caseTurbineGovernorDynamics( govHydroPID );
            if( result == null ) result = caseDynamicsFunctionBlock( govHydroPID );
            if( result == null ) result = caseIdentifiedObject( govHydroPID );
            if( result == null ) result = caseCimObjectWithID( govHydroPID );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.ASSET_ANALOG: {
            AssetAnalog assetAnalog = ( AssetAnalog ) theEObject;
            T result = caseAssetAnalog( assetAnalog );
            if( result == null ) result = caseAnalog( assetAnalog );
            if( result == null ) result = caseMeasurement( assetAnalog );
            if( result == null ) result = caseIdentifiedObject( assetAnalog );
            if( result == null ) result = caseCimObjectWithID( assetAnalog );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.ACDC_CONVERTER: {
            ACDCConverter acdcConverter = ( ACDCConverter ) theEObject;
            T result = caseACDCConverter( acdcConverter );
            if( result == null ) result = caseConductingEquipment( acdcConverter );
            if( result == null ) result = caseEquipment( acdcConverter );
            if( result == null ) result = casePowerSystemResource( acdcConverter );
            if( result == null ) result = caseIdentifiedObject( acdcConverter );
            if( result == null ) result = caseCimObjectWithID( acdcConverter );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.JUNCTION: {
            Junction junction = ( Junction ) theEObject;
            T result = caseJunction( junction );
            if( result == null ) result = caseConnector( junction );
            if( result == null ) result = caseConductingEquipment( junction );
            if( result == null ) result = caseEquipment( junction );
            if( result == null ) result = casePowerSystemResource( junction );
            if( result == null ) result = caseIdentifiedObject( junction );
            if( result == null ) result = caseCimObjectWithID( junction );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.GOV_HYDRO2: {
            GovHydro2 govHydro2 = ( GovHydro2 ) theEObject;
            T result = caseGovHydro2( govHydro2 );
            if( result == null ) result = caseTurbineGovernorDynamics( govHydro2 );
            if( result == null ) result = caseDynamicsFunctionBlock( govHydro2 );
            if( result == null ) result = caseIdentifiedObject( govHydro2 );
            if( result == null ) result = caseCimObjectWithID( govHydro2 );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.GEN_ICOMPENSATION_FOR_GEN_J: {
            GenICompensationForGenJ genICompensationForGenJ = ( GenICompensationForGenJ ) theEObject;
            T result = caseGenICompensationForGenJ( genICompensationForGenJ );
            if( result == null ) result = caseIdentifiedObject( genICompensationForGenJ );
            if( result == null ) result = caseCimObjectWithID( genICompensationForGenJ );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.METER_READING: {
            MeterReading meterReading = ( MeterReading ) theEObject;
            T result = caseMeterReading( meterReading );
            if( result == null ) result = caseIdentifiedObject( meterReading );
            if( result == null ) result = caseCimObjectWithID( meterReading );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.VOLTAGE_LEVEL: {
            VoltageLevel voltageLevel = ( VoltageLevel ) theEObject;
            T result = caseVoltageLevel( voltageLevel );
            if( result == null ) result = caseEquipmentContainer( voltageLevel );
            if( result == null ) result = caseConnectivityNodeContainer( voltageLevel );
            if( result == null ) result = casePowerSystemResource( voltageLevel );
            if( result == null ) result = caseIdentifiedObject( voltageLevel );
            if( result == null ) result = caseCimObjectWithID( voltageLevel );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.AUXILIARY_ACCOUNT: {
            AuxiliaryAccount auxiliaryAccount = ( AuxiliaryAccount ) theEObject;
            T result = caseAuxiliaryAccount( auxiliaryAccount );
            if( result == null ) result = caseDocument( auxiliaryAccount );
            if( result == null ) result = caseIdentifiedObject( auxiliaryAccount );
            if( result == null ) result = caseCimObjectWithID( auxiliaryAccount );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.BAY: {
            Bay bay = ( Bay ) theEObject;
            T result = caseBay( bay );
            if( result == null ) result = caseEquipmentContainer( bay );
            if( result == null ) result = caseConnectivityNodeContainer( bay );
            if( result == null ) result = casePowerSystemResource( bay );
            if( result == null ) result = caseIdentifiedObject( bay );
            if( result == null ) result = caseCimObjectWithID( bay );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.PSR_TYPE: {
            PSRType psrType = ( PSRType ) theEObject;
            T result = casePSRType( psrType );
            if( result == null ) result = caseIdentifiedObject( psrType );
            if( result == null ) result = caseCimObjectWithID( psrType );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.LOAD_GENERIC_NON_LINEAR: {
            LoadGenericNonLinear loadGenericNonLinear = ( LoadGenericNonLinear ) theEObject;
            T result = caseLoadGenericNonLinear( loadGenericNonLinear );
            if( result == null ) result = caseLoadDynamics( loadGenericNonLinear );
            if( result == null ) result = caseIdentifiedObject( loadGenericNonLinear );
            if( result == null ) result = caseCimObjectWithID( loadGenericNonLinear );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.TURBINE_LOAD_CONTROLLER_DYNAMICS: {
            TurbineLoadControllerDynamics turbineLoadControllerDynamics = ( TurbineLoadControllerDynamics ) theEObject;
            T result = caseTurbineLoadControllerDynamics( turbineLoadControllerDynamics );
            if( result == null ) result = caseDynamicsFunctionBlock( turbineLoadControllerDynamics );
            if( result == null ) result = caseIdentifiedObject( turbineLoadControllerDynamics );
            if( result == null ) result = caseCimObjectWithID( turbineLoadControllerDynamics );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.PFV_AR_CONTROLLER_TYPE1_USER_DEFINED: {
            PFVArControllerType1UserDefined pfvArControllerType1UserDefined = ( PFVArControllerType1UserDefined ) theEObject;
            T result = casePFVArControllerType1UserDefined( pfvArControllerType1UserDefined );
            if( result == null ) result = casePFVArControllerType1Dynamics( pfvArControllerType1UserDefined );
            if( result == null ) result = caseDynamicsFunctionBlock( pfvArControllerType1UserDefined );
            if( result == null ) result = caseIdentifiedObject( pfvArControllerType1UserDefined );
            if( result == null ) result = caseCimObjectWithID( pfvArControllerType1UserDefined );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.EXC_AC3A: {
            ExcAC3A excAC3A = ( ExcAC3A ) theEObject;
            T result = caseExcAC3A( excAC3A );
            if( result == null ) result = caseExcitationSystemDynamics( excAC3A );
            if( result == null ) result = caseDynamicsFunctionBlock( excAC3A );
            if( result == null ) result = caseIdentifiedObject( excAC3A );
            if( result == null ) result = caseCimObjectWithID( excAC3A );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.END_DEVICE_EVENT_DETAIL: {
            EndDeviceEventDetail endDeviceEventDetail = ( EndDeviceEventDetail ) theEObject;
            T result = caseEndDeviceEventDetail( endDeviceEventDetail );
            if( result == null ) result = caseCimObjectWithID( endDeviceEventDetail );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.ASSET_DISCRETE: {
            AssetDiscrete assetDiscrete = ( AssetDiscrete ) theEObject;
            T result = caseAssetDiscrete( assetDiscrete );
            if( result == null ) result = caseDiscrete( assetDiscrete );
            if( result == null ) result = caseMeasurement( assetDiscrete );
            if( result == null ) result = caseIdentifiedObject( assetDiscrete );
            if( result == null ) result = caseCimObjectWithID( assetDiscrete );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.PSS_PTIST3: {
            PssPTIST3 pssPTIST3 = ( PssPTIST3 ) theEObject;
            T result = casePssPTIST3( pssPTIST3 );
            if( result == null ) result = casePowerSystemStabilizerDynamics( pssPTIST3 );
            if( result == null ) result = caseDynamicsFunctionBlock( pssPTIST3 );
            if( result == null ) result = caseIdentifiedObject( pssPTIST3 );
            if( result == null ) result = caseCimObjectWithID( pssPTIST3 );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.WIND_PLANT_DYNAMICS: {
            WindPlantDynamics windPlantDynamics = ( WindPlantDynamics ) theEObject;
            T result = caseWindPlantDynamics( windPlantDynamics );
            if( result == null ) result = caseDynamicsFunctionBlock( windPlantDynamics );
            if( result == null ) result = caseIdentifiedObject( windPlantDynamics );
            if( result == null ) result = caseCimObjectWithID( windPlantDynamics );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.EXC_IEEEDC1A: {
            ExcIEEEDC1A excIEEEDC1A = ( ExcIEEEDC1A ) theEObject;
            T result = caseExcIEEEDC1A( excIEEEDC1A );
            if( result == null ) result = caseExcitationSystemDynamics( excIEEEDC1A );
            if( result == null ) result = caseDynamicsFunctionBlock( excIEEEDC1A );
            if( result == null ) result = caseIdentifiedObject( excIEEEDC1A );
            if( result == null ) result = caseCimObjectWithID( excIEEEDC1A );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.OPERATOR: {
            Operator operator = ( Operator ) theEObject;
            T result = caseOperator( operator );
            if( result == null ) result = caseOperationPersonRole( operator );
            if( result == null ) result = casePersonRole( operator );
            if( result == null ) result = caseIdentifiedObject( operator );
            if( result == null ) result = caseCimObjectWithID( operator );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.ORGANISATION: {
            Organisation organisation = ( Organisation ) theEObject;
            T result = caseOrganisation( organisation );
            if( result == null ) result = caseIdentifiedObject( organisation );
            if( result == null ) result = caseCimObjectWithID( organisation );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.UNDEREXC_LIM_X2: {
            UnderexcLimX2 underexcLimX2 = ( UnderexcLimX2 ) theEObject;
            T result = caseUnderexcLimX2( underexcLimX2 );
            if( result == null ) result = caseUnderexcitationLimiterDynamics( underexcLimX2 );
            if( result == null ) result = caseDynamicsFunctionBlock( underexcLimX2 );
            if( result == null ) result = caseIdentifiedObject( underexcLimX2 );
            if( result == null ) result = caseCimObjectWithID( underexcLimX2 );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.LOAD_BREAK_SWITCH: {
            LoadBreakSwitch loadBreakSwitch = ( LoadBreakSwitch ) theEObject;
            T result = caseLoadBreakSwitch( loadBreakSwitch );
            if( result == null ) result = caseProtectedSwitch( loadBreakSwitch );
            if( result == null ) result = caseSwitch( loadBreakSwitch );
            if( result == null ) result = caseConductingEquipment( loadBreakSwitch );
            if( result == null ) result = caseEquipment( loadBreakSwitch );
            if( result == null ) result = casePowerSystemResource( loadBreakSwitch );
            if( result == null ) result = caseIdentifiedObject( loadBreakSwitch );
            if( result == null ) result = caseCimObjectWithID( loadBreakSwitch );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.PHASE_TAP_CHANGER_TABULAR: {
            PhaseTapChangerTabular phaseTapChangerTabular = ( PhaseTapChangerTabular ) theEObject;
            T result = casePhaseTapChangerTabular( phaseTapChangerTabular );
            if( result == null ) result = casePhaseTapChanger( phaseTapChangerTabular );
            if( result == null ) result = caseTapChanger( phaseTapChangerTabular );
            if( result == null ) result = casePowerSystemResource( phaseTapChangerTabular );
            if( result == null ) result = caseIdentifiedObject( phaseTapChangerTabular );
            if( result == null ) result = caseCimObjectWithID( phaseTapChangerTabular );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.ICCP_VIRTUAL_CONTROL_CENTER: {
            ICCPVirtualControlCenter iccpVirtualControlCenter = ( ICCPVirtualControlCenter ) theEObject;
            T result = caseICCPVirtualControlCenter( iccpVirtualControlCenter );
            if( result == null ) result = caseBilateralExchangeActor( iccpVirtualControlCenter );
            if( result == null ) result = caseIdentifiedObject( iccpVirtualControlCenter );
            if( result == null ) result = caseCimObjectWithID( iccpVirtualControlCenter );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.EQUIPMENT_FAULT: {
            EquipmentFault equipmentFault = ( EquipmentFault ) theEObject;
            T result = caseEquipmentFault( equipmentFault );
            if( result == null ) result = caseFault( equipmentFault );
            if( result == null ) result = caseIdentifiedObject( equipmentFault );
            if( result == null ) result = caseCimObjectWithID( equipmentFault );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.OIL_ANALYSIS_MOISTURE_ANALOG: {
            OilAnalysisMoistureAnalog oilAnalysisMoistureAnalog = ( OilAnalysisMoistureAnalog ) theEObject;
            T result = caseOilAnalysisMoistureAnalog( oilAnalysisMoistureAnalog );
            if( result == null ) result = caseAssetAnalog( oilAnalysisMoistureAnalog );
            if( result == null ) result = caseAnalog( oilAnalysisMoistureAnalog );
            if( result == null ) result = caseMeasurement( oilAnalysisMoistureAnalog );
            if( result == null ) result = caseIdentifiedObject( oilAnalysisMoistureAnalog );
            if( result == null ) result = caseCimObjectWithID( oilAnalysisMoistureAnalog );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.CONNECTOR: {
            Connector connector = ( Connector ) theEObject;
            T result = caseConnector( connector );
            if( result == null ) result = caseConductingEquipment( connector );
            if( result == null ) result = caseEquipment( connector );
            if( result == null ) result = casePowerSystemResource( connector );
            if( result == null ) result = caseIdentifiedObject( connector );
            if( result == null ) result = caseCimObjectWithID( connector );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.EXC_ST2A: {
            ExcST2A excST2A = ( ExcST2A ) theEObject;
            T result = caseExcST2A( excST2A );
            if( result == null ) result = caseExcitationSystemDynamics( excST2A );
            if( result == null ) result = caseDynamicsFunctionBlock( excST2A );
            if( result == null ) result = caseIdentifiedObject( excST2A );
            if( result == null ) result = caseCimObjectWithID( excST2A );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.GOV_STEAM1: {
            GovSteam1 govSteam1 = ( GovSteam1 ) theEObject;
            T result = caseGovSteam1( govSteam1 );
            if( result == null ) result = caseTurbineGovernorDynamics( govSteam1 );
            if( result == null ) result = caseDynamicsFunctionBlock( govSteam1 );
            if( result == null ) result = caseIdentifiedObject( govSteam1 );
            if( result == null ) result = caseCimObjectWithID( govSteam1 );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.GOV_GASTWD: {
            GovGASTWD govGASTWD = ( GovGASTWD ) theEObject;
            T result = caseGovGASTWD( govGASTWD );
            if( result == null ) result = caseTurbineGovernorDynamics( govGASTWD );
            if( result == null ) result = caseDynamicsFunctionBlock( govGASTWD );
            if( result == null ) result = caseIdentifiedObject( govGASTWD );
            if( result == null ) result = caseCimObjectWithID( govGASTWD );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.TRANSFORMER_TEST: {
            TransformerTest transformerTest = ( TransformerTest ) theEObject;
            T result = caseTransformerTest( transformerTest );
            if( result == null ) result = caseIdentifiedObject( transformerTest );
            if( result == null ) result = caseCimObjectWithID( transformerTest );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.CONFIGURATION_EVENT: {
            ConfigurationEvent configurationEvent = ( ConfigurationEvent ) theEObject;
            T result = caseConfigurationEvent( configurationEvent );
            if( result == null ) result = caseActivityRecord( configurationEvent );
            if( result == null ) result = caseIdentifiedObject( configurationEvent );
            if( result == null ) result = caseCimObjectWithID( configurationEvent );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.BUSBAR_SECTION: {
            BusbarSection busbarSection = ( BusbarSection ) theEObject;
            T result = caseBusbarSection( busbarSection );
            if( result == null ) result = caseConnector( busbarSection );
            if( result == null ) result = caseConductingEquipment( busbarSection );
            if( result == null ) result = caseEquipment( busbarSection );
            if( result == null ) result = casePowerSystemResource( busbarSection );
            if( result == null ) result = caseIdentifiedObject( busbarSection );
            if( result == null ) result = caseCimObjectWithID( busbarSection );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.WIND_GENERATING_UNIT: {
            WindGeneratingUnit windGeneratingUnit = ( WindGeneratingUnit ) theEObject;
            T result = caseWindGeneratingUnit( windGeneratingUnit );
            if( result == null ) result = caseGeneratingUnit( windGeneratingUnit );
            if( result == null ) result = caseEquipment( windGeneratingUnit );
            if( result == null ) result = casePowerSystemResource( windGeneratingUnit );
            if( result == null ) result = caseIdentifiedObject( windGeneratingUnit );
            if( result == null ) result = caseCimObjectWithID( windGeneratingUnit );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.WIRE_POSITION: {
            WirePosition wirePosition = ( WirePosition ) theEObject;
            T result = caseWirePosition( wirePosition );
            if( result == null ) result = caseIdentifiedObject( wirePosition );
            if( result == null ) result = caseCimObjectWithID( wirePosition );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.CONTINGENCY: {
            Contingency contingency = ( Contingency ) theEObject;
            T result = caseContingency( contingency );
            if( result == null ) result = caseIdentifiedObject( contingency );
            if( result == null ) result = caseCimObjectWithID( contingency );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.NON_CONFORM_LOAD: {
            NonConformLoad nonConformLoad = ( NonConformLoad ) theEObject;
            T result = caseNonConformLoad( nonConformLoad );
            if( result == null ) result = caseEnergyConsumer( nonConformLoad );
            if( result == null ) result = caseEnergyConnection( nonConformLoad );
            if( result == null ) result = caseConductingEquipment( nonConformLoad );
            if( result == null ) result = caseEquipment( nonConformLoad );
            if( result == null ) result = casePowerSystemResource( nonConformLoad );
            if( result == null ) result = caseIdentifiedObject( nonConformLoad );
            if( result == null ) result = caseCimObjectWithID( nonConformLoad );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.CONNECTIVITY_NODE: {
            ConnectivityNode connectivityNode = ( ConnectivityNode ) theEObject;
            T result = caseConnectivityNode( connectivityNode );
            if( result == null ) result = caseIdentifiedObject( connectivityNode );
            if( result == null ) result = caseCimObjectWithID( connectivityNode );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.SV_STATUS: {
            SvStatus svStatus = ( SvStatus ) theEObject;
            T result = caseSvStatus( svStatus );
            if( result == null ) result = caseStateVariable( svStatus );
            if( result == null ) result = caseCimObjectWithID( svStatus );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.WORK_ASSET: {
            WorkAsset workAsset = ( WorkAsset ) theEObject;
            T result = caseWorkAsset( workAsset );
            if( result == null ) result = caseAsset( workAsset );
            if( result == null ) result = caseIdentifiedObject( workAsset );
            if( result == null ) result = caseCimObjectWithID( workAsset );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.SV_SHUNT_COMPENSATOR_SECTIONS: {
            SvShuntCompensatorSections svShuntCompensatorSections = ( SvShuntCompensatorSections ) theEObject;
            T result = caseSvShuntCompensatorSections( svShuntCompensatorSections );
            if( result == null ) result = caseStateVariable( svShuntCompensatorSections );
            if( result == null ) result = caseCimObjectWithID( svShuntCompensatorSections );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.VEHICLE: {
            Vehicle vehicle = ( Vehicle ) theEObject;
            T result = caseVehicle( vehicle );
            if( result == null ) result = caseWorkAsset( vehicle );
            if( result == null ) result = caseAsset( vehicle );
            if( result == null ) result = caseIdentifiedObject( vehicle );
            if( result == null ) result = caseCimObjectWithID( vehicle );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.EXC_AC4A: {
            ExcAC4A excAC4A = ( ExcAC4A ) theEObject;
            T result = caseExcAC4A( excAC4A );
            if( result == null ) result = caseExcitationSystemDynamics( excAC4A );
            if( result == null ) result = caseDynamicsFunctionBlock( excAC4A );
            if( result == null ) result = caseIdentifiedObject( excAC4A );
            if( result == null ) result = caseCimObjectWithID( excAC4A );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.TOPOLOGICAL_NODE: {
            TopologicalNode topologicalNode = ( TopologicalNode ) theEObject;
            T result = caseTopologicalNode( topologicalNode );
            if( result == null ) result = caseIdentifiedObject( topologicalNode );
            if( result == null ) result = caseCimObjectWithID( topologicalNode );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.EXC_AC5A: {
            ExcAC5A excAC5A = ( ExcAC5A ) theEObject;
            T result = caseExcAC5A( excAC5A );
            if( result == null ) result = caseExcitationSystemDynamics( excAC5A );
            if( result == null ) result = caseDynamicsFunctionBlock( excAC5A );
            if( result == null ) result = caseIdentifiedObject( excAC5A );
            if( result == null ) result = caseCimObjectWithID( excAC5A );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.SOLAR_GENERATING_UNIT: {
            SolarGeneratingUnit solarGeneratingUnit = ( SolarGeneratingUnit ) theEObject;
            T result = caseSolarGeneratingUnit( solarGeneratingUnit );
            if( result == null ) result = caseGeneratingUnit( solarGeneratingUnit );
            if( result == null ) result = caseEquipment( solarGeneratingUnit );
            if( result == null ) result = casePowerSystemResource( solarGeneratingUnit );
            if( result == null ) result = caseIdentifiedObject( solarGeneratingUnit );
            if( result == null ) result = caseCimObjectWithID( solarGeneratingUnit );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.POWER_ELECTRONICS_WIND_UNIT: {
            PowerElectronicsWindUnit powerElectronicsWindUnit = ( PowerElectronicsWindUnit ) theEObject;
            T result = casePowerElectronicsWindUnit( powerElectronicsWindUnit );
            if( result == null ) result = casePowerElectronicsUnit( powerElectronicsWindUnit );
            if( result == null ) result = caseEquipment( powerElectronicsWindUnit );
            if( result == null ) result = casePowerSystemResource( powerElectronicsWindUnit );
            if( result == null ) result = caseIdentifiedObject( powerElectronicsWindUnit );
            if( result == null ) result = caseCimObjectWithID( powerElectronicsWindUnit );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.INCIDENT_HAZARD: {
            IncidentHazard incidentHazard = ( IncidentHazard ) theEObject;
            T result = caseIncidentHazard( incidentHazard );
            if( result == null ) result = caseHazard( incidentHazard );
            if( result == null ) result = caseIdentifiedObject( incidentHazard );
            if( result == null ) result = caseCimObjectWithID( incidentHazard );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.SERIES_COMPENSATOR: {
            SeriesCompensator seriesCompensator = ( SeriesCompensator ) theEObject;
            T result = caseSeriesCompensator( seriesCompensator );
            if( result == null ) result = caseConductingEquipment( seriesCompensator );
            if( result == null ) result = caseEquipment( seriesCompensator );
            if( result == null ) result = casePowerSystemResource( seriesCompensator );
            if( result == null ) result = caseIdentifiedObject( seriesCompensator );
            if( result == null ) result = caseCimObjectWithID( seriesCompensator );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.TEXT_DIAGRAM_OBJECT: {
            TextDiagramObject textDiagramObject = ( TextDiagramObject ) theEObject;
            T result = caseTextDiagramObject( textDiagramObject );
            if( result == null ) result = caseDiagramObject( textDiagramObject );
            if( result == null ) result = caseIdentifiedObject( textDiagramObject );
            if( result == null ) result = caseCimObjectWithID( textDiagramObject );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.WIND_CONT_QPQU_LIM_IEC: {
            WindContQPQULimIEC windContQPQULimIEC = ( WindContQPQULimIEC ) theEObject;
            T result = caseWindContQPQULimIEC( windContQPQULimIEC );
            if( result == null ) result = caseIdentifiedObject( windContQPQULimIEC );
            if( result == null ) result = caseCimObjectWithID( windContQPQULimIEC );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.ANALOG_CONTROL: {
            AnalogControl analogControl = ( AnalogControl ) theEObject;
            T result = caseAnalogControl( analogControl );
            if( result == null ) result = caseControl( analogControl );
            if( result == null ) result = caseIOPoint( analogControl );
            if( result == null ) result = caseIdentifiedObject( analogControl );
            if( result == null ) result = caseCimObjectWithID( analogControl );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.GOV_STEAM2: {
            GovSteam2 govSteam2 = ( GovSteam2 ) theEObject;
            T result = caseGovSteam2( govSteam2 );
            if( result == null ) result = caseTurbineGovernorDynamics( govSteam2 );
            if( result == null ) result = caseDynamicsFunctionBlock( govSteam2 );
            if( result == null ) result = caseIdentifiedObject( govSteam2 );
            if( result == null ) result = caseCimObjectWithID( govSteam2 );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.REMOTE_INPUT_SIGNAL: {
            RemoteInputSignal remoteInputSignal = ( RemoteInputSignal ) theEObject;
            T result = caseRemoteInputSignal( remoteInputSignal );
            if( result == null ) result = caseIdentifiedObject( remoteInputSignal );
            if( result == null ) result = caseCimObjectWithID( remoteInputSignal );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.TRANSFORMER_TANK: {
            TransformerTank transformerTank = ( TransformerTank ) theEObject;
            T result = caseTransformerTank( transformerTank );
            if( result == null ) result = caseEquipment( transformerTank );
            if( result == null ) result = casePowerSystemResource( transformerTank );
            if( result == null ) result = caseIdentifiedObject( transformerTank );
            if( result == null ) result = caseCimObjectWithID( transformerTank );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.ACCUMULATOR_LIMIT_SET: {
            AccumulatorLimitSet accumulatorLimitSet = ( AccumulatorLimitSet ) theEObject;
            T result = caseAccumulatorLimitSet( accumulatorLimitSet );
            if( result == null ) result = caseLimitSet( accumulatorLimitSet );
            if( result == null ) result = caseIdentifiedObject( accumulatorLimitSet );
            if( result == null ) result = caseCimObjectWithID( accumulatorLimitSet );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.SYNCHRONOUS_MACHINE: {
            SynchronousMachine synchronousMachine = ( SynchronousMachine ) theEObject;
            T result = caseSynchronousMachine( synchronousMachine );
            if( result == null ) result = caseRotatingMachine( synchronousMachine );
            if( result == null ) result = caseRegulatingCondEq( synchronousMachine );
            if( result == null ) result = caseEnergyConnection( synchronousMachine );
            if( result == null ) result = caseConductingEquipment( synchronousMachine );
            if( result == null ) result = caseEquipment( synchronousMachine );
            if( result == null ) result = casePowerSystemResource( synchronousMachine );
            if( result == null ) result = caseIdentifiedObject( synchronousMachine );
            if( result == null ) result = caseCimObjectWithID( synchronousMachine );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.PROTECTION_EQUIPMENT: {
            ProtectionEquipment protectionEquipment = ( ProtectionEquipment ) theEObject;
            T result = caseProtectionEquipment( protectionEquipment );
            if( result == null ) result = caseEquipment( protectionEquipment );
            if( result == null ) result = casePowerSystemResource( protectionEquipment );
            if( result == null ) result = caseIdentifiedObject( protectionEquipment );
            if( result == null ) result = caseCimObjectWithID( protectionEquipment );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.EXC_AC1A: {
            ExcAC1A excAC1A = ( ExcAC1A ) theEObject;
            T result = caseExcAC1A( excAC1A );
            if( result == null ) result = caseExcitationSystemDynamics( excAC1A );
            if( result == null ) result = caseDynamicsFunctionBlock( excAC1A );
            if( result == null ) result = caseIdentifiedObject( excAC1A );
            if( result == null ) result = caseCimObjectWithID( excAC1A );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.PFV_AR_TYPE2_COMMON1: {
            PFVArType2Common1 pfvArType2Common1 = ( PFVArType2Common1 ) theEObject;
            T result = casePFVArType2Common1( pfvArType2Common1 );
            if( result == null ) result = casePFVArControllerType2Dynamics( pfvArType2Common1 );
            if( result == null ) result = caseDynamicsFunctionBlock( pfvArType2Common1 );
            if( result == null ) result = caseIdentifiedObject( pfvArType2Common1 );
            if( result == null ) result = caseCimObjectWithID( pfvArType2Common1 );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.MECH_LOAD1: {
            MechLoad1 mechLoad1 = ( MechLoad1 ) theEObject;
            T result = caseMechLoad1( mechLoad1 );
            if( result == null ) result = caseMechanicalLoadDynamics( mechLoad1 );
            if( result == null ) result = caseDynamicsFunctionBlock( mechLoad1 );
            if( result == null ) result = caseIdentifiedObject( mechLoad1 );
            if( result == null ) result = caseCimObjectWithID( mechLoad1 );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.SYNCHRONOUS_MACHINE_DYNAMICS: {
            SynchronousMachineDynamics synchronousMachineDynamics = ( SynchronousMachineDynamics ) theEObject;
            T result = caseSynchronousMachineDynamics( synchronousMachineDynamics );
            if( result == null ) result = caseRotatingMachineDynamics( synchronousMachineDynamics );
            if( result == null ) result = caseDynamicsFunctionBlock( synchronousMachineDynamics );
            if( result == null ) result = caseIdentifiedObject( synchronousMachineDynamics );
            if( result == null ) result = caseCimObjectWithID( synchronousMachineDynamics );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.CURVE: {
            Curve curve = ( Curve ) theEObject;
            T result = caseCurve( curve );
            if( result == null ) result = caseIdentifiedObject( curve );
            if( result == null ) result = caseCimObjectWithID( curve );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.POWER_SYSTEM_STABILIZER_DYNAMICS: {
            PowerSystemStabilizerDynamics powerSystemStabilizerDynamics = ( PowerSystemStabilizerDynamics ) theEObject;
            T result = casePowerSystemStabilizerDynamics( powerSystemStabilizerDynamics );
            if( result == null ) result = caseDynamicsFunctionBlock( powerSystemStabilizerDynamics );
            if( result == null ) result = caseIdentifiedObject( powerSystemStabilizerDynamics );
            if( result == null ) result = caseCimObjectWithID( powerSystemStabilizerDynamics );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.REPORTING_GROUP: {
            ReportingGroup reportingGroup = ( ReportingGroup ) theEObject;
            T result = caseReportingGroup( reportingGroup );
            if( result == null ) result = caseIdentifiedObject( reportingGroup );
            if( result == null ) result = caseCimObjectWithID( reportingGroup );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.CHANGE_SET: {
            ChangeSet changeSet = ( ChangeSet ) theEObject;
            T result = caseChangeSet( changeSet );
            if( result == null ) result = caseDataSet( changeSet );
            if( result == null ) result = caseIdentifiedObject( changeSet );
            if( result == null ) result = caseCimObjectWithID( changeSet );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.FUEL_ALLOCATION_SCHEDULE: {
            FuelAllocationSchedule fuelAllocationSchedule = ( FuelAllocationSchedule ) theEObject;
            T result = caseFuelAllocationSchedule( fuelAllocationSchedule );
            if( result == null ) result = caseCurve( fuelAllocationSchedule );
            if( result == null ) result = caseIdentifiedObject( fuelAllocationSchedule );
            if( result == null ) result = caseCimObjectWithID( fuelAllocationSchedule );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.TAPE_SHIELD_CABLE_INFO: {
            TapeShieldCableInfo tapeShieldCableInfo = ( TapeShieldCableInfo ) theEObject;
            T result = caseTapeShieldCableInfo( tapeShieldCableInfo );
            if( result == null ) result = caseCableInfo( tapeShieldCableInfo );
            if( result == null ) result = caseWireInfo( tapeShieldCableInfo );
            if( result == null ) result = caseAssetInfo( tapeShieldCableInfo );
            if( result == null ) result = caseIdentifiedObject( tapeShieldCableInfo );
            if( result == null ) result = caseCimObjectWithID( tapeShieldCableInfo );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.VOLTAGE_ADJUSTER_USER_DEFINED: {
            VoltageAdjusterUserDefined voltageAdjusterUserDefined = ( VoltageAdjusterUserDefined ) theEObject;
            T result = caseVoltageAdjusterUserDefined( voltageAdjusterUserDefined );
            if( result == null ) result = caseVoltageAdjusterDynamics( voltageAdjusterUserDefined );
            if( result == null ) result = caseDynamicsFunctionBlock( voltageAdjusterUserDefined );
            if( result == null ) result = caseIdentifiedObject( voltageAdjusterUserDefined );
            if( result == null ) result = caseCimObjectWithID( voltageAdjusterUserDefined );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.IO_POINT: {
            IOPoint ioPoint = ( IOPoint ) theEObject;
            T result = caseIOPoint( ioPoint );
            if( result == null ) result = caseIdentifiedObject( ioPoint );
            if( result == null ) result = caseCimObjectWithID( ioPoint );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.HYDRO_TURBINE: {
            HydroTurbine hydroTurbine = ( HydroTurbine ) theEObject;
            T result = caseHydroTurbine( hydroTurbine );
            if( result == null ) result = casePrimeMover( hydroTurbine );
            if( result == null ) result = casePowerSystemResource( hydroTurbine );
            if( result == null ) result = caseIdentifiedObject( hydroTurbine );
            if( result == null ) result = caseCimObjectWithID( hydroTurbine );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.TRANSFORMER_END_INFO: {
            TransformerEndInfo transformerEndInfo = ( TransformerEndInfo ) theEObject;
            T result = caseTransformerEndInfo( transformerEndInfo );
            if( result == null ) result = caseAssetInfo( transformerEndInfo );
            if( result == null ) result = caseIdentifiedObject( transformerEndInfo );
            if( result == null ) result = caseCimObjectWithID( transformerEndInfo );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.OVEREXCITATION_LIMITER_DYNAMICS: {
            OverexcitationLimiterDynamics overexcitationLimiterDynamics = ( OverexcitationLimiterDynamics ) theEObject;
            T result = caseOverexcitationLimiterDynamics( overexcitationLimiterDynamics );
            if( result == null ) result = caseDynamicsFunctionBlock( overexcitationLimiterDynamics );
            if( result == null ) result = caseIdentifiedObject( overexcitationLimiterDynamics );
            if( result == null ) result = caseCimObjectWithID( overexcitationLimiterDynamics );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.WIND_CONT_ROTOR_RIEC: {
            WindContRotorRIEC windContRotorRIEC = ( WindContRotorRIEC ) theEObject;
            T result = caseWindContRotorRIEC( windContRotorRIEC );
            if( result == null ) result = caseIdentifiedObject( windContRotorRIEC );
            if( result == null ) result = caseCimObjectWithID( windContRotorRIEC );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.REPAIR_ITEM: {
            RepairItem repairItem = ( RepairItem ) theEObject;
            T result = caseRepairItem( repairItem );
            if( result == null ) result = caseCimObjectWithID( repairItem );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.PER_LENGTH_PHASE_IMPEDANCE: {
            PerLengthPhaseImpedance perLengthPhaseImpedance = ( PerLengthPhaseImpedance ) theEObject;
            T result = casePerLengthPhaseImpedance( perLengthPhaseImpedance );
            if( result == null ) result = casePerLengthImpedance( perLengthPhaseImpedance );
            if( result == null ) result = casePerLengthLineParameter( perLengthPhaseImpedance );
            if( result == null ) result = caseIdentifiedObject( perLengthPhaseImpedance );
            if( result == null ) result = caseCimObjectWithID( perLengthPhaseImpedance );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.INFLOW_FORECAST: {
            InflowForecast inflowForecast = ( InflowForecast ) theEObject;
            T result = caseInflowForecast( inflowForecast );
            if( result == null ) result = caseRegularIntervalSchedule( inflowForecast );
            if( result == null ) result = caseBasicIntervalSchedule( inflowForecast );
            if( result == null ) result = caseIdentifiedObject( inflowForecast );
            if( result == null ) result = caseCimObjectWithID( inflowForecast );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.GROUND_ACTION: {
            GroundAction groundAction = ( GroundAction ) theEObject;
            T result = caseGroundAction( groundAction );
            if( result == null ) result = caseSwitchingStep( groundAction );
            if( result == null ) result = caseCimObjectWithID( groundAction );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.RESERVOIR: {
            Reservoir reservoir = ( Reservoir ) theEObject;
            T result = caseReservoir( reservoir );
            if( result == null ) result = casePowerSystemResource( reservoir );
            if( result == null ) result = caseIdentifiedObject( reservoir );
            if( result == null ) result = caseCimObjectWithID( reservoir );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.OBJECT_MODIFICATION: {
            ObjectModification objectModification = ( ObjectModification ) theEObject;
            T result = caseObjectModification( objectModification );
            if( result == null ) result = caseChangeSetMember( objectModification );
            if( result == null ) result = caseDataSetMember( objectModification );
            if( result == null ) result = caseIdentifiedObject( objectModification );
            if( result == null ) result = caseCimObjectWithID( objectModification );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.CUSTOMER_ACCOUNT: {
            CustomerAccount customerAccount = ( CustomerAccount ) theEObject;
            T result = caseCustomerAccount( customerAccount );
            if( result == null ) result = caseDocument( customerAccount );
            if( result == null ) result = caseIdentifiedObject( customerAccount );
            if( result == null ) result = caseCimObjectWithID( customerAccount );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.ICCPVCC: {
            ICCPVCC iccpvcc = ( ICCPVCC ) theEObject;
            T result = caseICCPVCC( iccpvcc );
            if( result == null ) result = caseBilateralExchangeActor( iccpvcc );
            if( result == null ) result = caseIdentifiedObject( iccpvcc );
            if( result == null ) result = caseCimObjectWithID( iccpvcc );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.UNDEREXC_LIM_IEEE2: {
            UnderexcLimIEEE2 underexcLimIEEE2 = ( UnderexcLimIEEE2 ) theEObject;
            T result = caseUnderexcLimIEEE2( underexcLimIEEE2 );
            if( result == null ) result = caseUnderexcitationLimiterDynamics( underexcLimIEEE2 );
            if( result == null ) result = caseDynamicsFunctionBlock( underexcLimIEEE2 );
            if( result == null ) result = caseIdentifiedObject( underexcLimIEEE2 );
            if( result == null ) result = caseCimObjectWithID( underexcLimIEEE2 );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.BWR_STEAM_SUPPLY: {
            BWRSteamSupply bwrSteamSupply = ( BWRSteamSupply ) theEObject;
            T result = caseBWRSteamSupply( bwrSteamSupply );
            if( result == null ) result = caseSteamSupply( bwrSteamSupply );
            if( result == null ) result = casePowerSystemResource( bwrSteamSupply );
            if( result == null ) result = caseIdentifiedObject( bwrSteamSupply );
            if( result == null ) result = caseCimObjectWithID( bwrSteamSupply );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.WORK: {
            Work work = ( Work ) theEObject;
            T result = caseWork( work );
            if( result == null ) result = caseBaseWork( work );
            if( result == null ) result = caseDocument( work );
            if( result == null ) result = caseIdentifiedObject( work );
            if( result == null ) result = caseCimObjectWithID( work );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.REPAIR_WORK_TASK: {
            RepairWorkTask repairWorkTask = ( RepairWorkTask ) theEObject;
            T result = caseRepairWorkTask( repairWorkTask );
            if( result == null ) result = caseWorkTask( repairWorkTask );
            if( result == null ) result = caseBaseWork( repairWorkTask );
            if( result == null ) result = caseDocument( repairWorkTask );
            if( result == null ) result = caseIdentifiedObject( repairWorkTask );
            if( result == null ) result = caseCimObjectWithID( repairWorkTask );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.SURGE_ARRESTER: {
            SurgeArrester surgeArrester = ( SurgeArrester ) theEObject;
            T result = caseSurgeArrester( surgeArrester );
            if( result == null ) result = caseAuxiliaryEquipment( surgeArrester );
            if( result == null ) result = caseEquipment( surgeArrester );
            if( result == null ) result = casePowerSystemResource( surgeArrester );
            if( result == null ) result = caseIdentifiedObject( surgeArrester );
            if( result == null ) result = caseCimObjectWithID( surgeArrester );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.EXC_PIC: {
            ExcPIC excPIC = ( ExcPIC ) theEObject;
            T result = caseExcPIC( excPIC );
            if( result == null ) result = caseExcitationSystemDynamics( excPIC );
            if( result == null ) result = caseDynamicsFunctionBlock( excPIC );
            if( result == null ) result = caseIdentifiedObject( excPIC );
            if( result == null ) result = caseCimObjectWithID( excPIC );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.FIELD_SAFETY_SUPERVISOR: {
            FieldSafetySupervisor fieldSafetySupervisor = ( FieldSafetySupervisor ) theEObject;
            T result = caseFieldSafetySupervisor( fieldSafetySupervisor );
            if( result == null ) result = caseCrewMember( fieldSafetySupervisor );
            if( result == null ) result = caseOperationPersonRole( fieldSafetySupervisor );
            if( result == null ) result = casePersonRole( fieldSafetySupervisor );
            if( result == null ) result = caseIdentifiedObject( fieldSafetySupervisor );
            if( result == null ) result = caseCimObjectWithID( fieldSafetySupervisor );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.ENERGY_SOURCE_PHASE: {
            EnergySourcePhase energySourcePhase = ( EnergySourcePhase ) theEObject;
            T result = caseEnergySourcePhase( energySourcePhase );
            if( result == null ) result = casePowerSystemResource( energySourcePhase );
            if( result == null ) result = caseIdentifiedObject( energySourcePhase );
            if( result == null ) result = caseCimObjectWithID( energySourcePhase );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.AUTHOR: {
            Author author = ( Author ) theEObject;
            T result = caseAuthor( author );
            if( result == null ) result = caseDocumentPersonRole( author );
            if( result == null ) result = casePersonRole( author );
            if( result == null ) result = caseIdentifiedObject( author );
            if( result == null ) result = caseCimObjectWithID( author );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.BRANCH_GROUP: {
            BranchGroup branchGroup = ( BranchGroup ) theEObject;
            T result = caseBranchGroup( branchGroup );
            if( result == null ) result = caseIdentifiedObject( branchGroup );
            if( result == null ) result = caseCimObjectWithID( branchGroup );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.DC_TOPOLOGICAL_ISLAND: {
            DCTopologicalIsland dcTopologicalIsland = ( DCTopologicalIsland ) theEObject;
            T result = caseDCTopologicalIsland( dcTopologicalIsland );
            if( result == null ) result = caseIdentifiedObject( dcTopologicalIsland );
            if( result == null ) result = caseCimObjectWithID( dcTopologicalIsland );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.APPARENT_POWER_LIMIT: {
            ApparentPowerLimit apparentPowerLimit = ( ApparentPowerLimit ) theEObject;
            T result = caseApparentPowerLimit( apparentPowerLimit );
            if( result == null ) result = caseOperationalLimit( apparentPowerLimit );
            if( result == null ) result = caseIdentifiedObject( apparentPowerLimit );
            if( result == null ) result = caseCimObjectWithID( apparentPowerLimit );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.FAULT: {
            Fault fault = ( Fault ) theEObject;
            T result = caseFault( fault );
            if( result == null ) result = caseIdentifiedObject( fault );
            if( result == null ) result = caseCimObjectWithID( fault );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.RECLOSER: {
            Recloser recloser = ( Recloser ) theEObject;
            T result = caseRecloser( recloser );
            if( result == null ) result = caseProtectedSwitch( recloser );
            if( result == null ) result = caseSwitch( recloser );
            if( result == null ) result = caseConductingEquipment( recloser );
            if( result == null ) result = caseEquipment( recloser );
            if( result == null ) result = casePowerSystemResource( recloser );
            if( result == null ) result = caseIdentifiedObject( recloser );
            if( result == null ) result = caseCimObjectWithID( recloser );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.CONTROL_AREA_GENERATING_UNIT: {
            ControlAreaGeneratingUnit controlAreaGeneratingUnit = ( ControlAreaGeneratingUnit ) theEObject;
            T result = caseControlAreaGeneratingUnit( controlAreaGeneratingUnit );
            if( result == null ) result = caseIdentifiedObject( controlAreaGeneratingUnit );
            if( result == null ) result = caseCimObjectWithID( controlAreaGeneratingUnit );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.EXC_AVR2: {
            ExcAVR2 excAVR2 = ( ExcAVR2 ) theEObject;
            T result = caseExcAVR2( excAVR2 );
            if( result == null ) result = caseExcitationSystemDynamics( excAVR2 );
            if( result == null ) result = caseDynamicsFunctionBlock( excAVR2 );
            if( result == null ) result = caseIdentifiedObject( excAVR2 );
            if( result == null ) result = caseCimObjectWithID( excAVR2 );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.TURB_LCFB1: {
            TurbLCFB1 turbLCFB1 = ( TurbLCFB1 ) theEObject;
            T result = caseTurbLCFB1( turbLCFB1 );
            if( result == null ) result = caseTurbineLoadControllerDynamics( turbLCFB1 );
            if( result == null ) result = caseDynamicsFunctionBlock( turbLCFB1 );
            if( result == null ) result = caseIdentifiedObject( turbLCFB1 );
            if( result == null ) result = caseCimObjectWithID( turbLCFB1 );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.DC_LINE: {
            DCLine dcLine = ( DCLine ) theEObject;
            T result = caseDCLine( dcLine );
            if( result == null ) result = caseDCEquipmentContainer( dcLine );
            if( result == null ) result = caseEquipmentContainer( dcLine );
            if( result == null ) result = caseConnectivityNodeContainer( dcLine );
            if( result == null ) result = casePowerSystemResource( dcLine );
            if( result == null ) result = caseIdentifiedObject( dcLine );
            if( result == null ) result = caseCimObjectWithID( dcLine );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.EQUIPMENT: {
            Equipment equipment = ( Equipment ) theEObject;
            T result = caseEquipment( equipment );
            if( result == null ) result = casePowerSystemResource( equipment );
            if( result == null ) result = caseIdentifiedObject( equipment );
            if( result == null ) result = caseCimObjectWithID( equipment );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.START_MAIN_FUEL_CURVE: {
            StartMainFuelCurve startMainFuelCurve = ( StartMainFuelCurve ) theEObject;
            T result = caseStartMainFuelCurve( startMainFuelCurve );
            if( result == null ) result = caseCurve( startMainFuelCurve );
            if( result == null ) result = caseIdentifiedObject( startMainFuelCurve );
            if( result == null ) result = caseCimObjectWithID( startMainFuelCurve );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.CUT: {
            Cut cut = ( Cut ) theEObject;
            T result = caseCut( cut );
            if( result == null ) result = caseSwitch( cut );
            if( result == null ) result = caseConductingEquipment( cut );
            if( result == null ) result = caseEquipment( cut );
            if( result == null ) result = casePowerSystemResource( cut );
            if( result == null ) result = caseIdentifiedObject( cut );
            if( result == null ) result = caseCimObjectWithID( cut );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.ROTATING_MACHINE: {
            RotatingMachine rotatingMachine = ( RotatingMachine ) theEObject;
            T result = caseRotatingMachine( rotatingMachine );
            if( result == null ) result = caseRegulatingCondEq( rotatingMachine );
            if( result == null ) result = caseEnergyConnection( rotatingMachine );
            if( result == null ) result = caseConductingEquipment( rotatingMachine );
            if( result == null ) result = caseEquipment( rotatingMachine );
            if( result == null ) result = casePowerSystemResource( rotatingMachine );
            if( result == null ) result = caseIdentifiedObject( rotatingMachine );
            if( result == null ) result = caseCimObjectWithID( rotatingMachine );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.EXC_ELIN1: {
            ExcELIN1 excELIN1 = ( ExcELIN1 ) theEObject;
            T result = caseExcELIN1( excELIN1 );
            if( result == null ) result = caseExcitationSystemDynamics( excELIN1 );
            if( result == null ) result = caseDynamicsFunctionBlock( excELIN1 );
            if( result == null ) result = caseIdentifiedObject( excELIN1 );
            if( result == null ) result = caseCimObjectWithID( excELIN1 );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.PROCEDURE: {
            Procedure procedure = ( Procedure ) theEObject;
            T result = caseProcedure( procedure );
            if( result == null ) result = caseDocument( procedure );
            if( result == null ) result = caseIdentifiedObject( procedure );
            if( result == null ) result = caseCimObjectWithID( procedure );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.NON_CONFORM_LOAD_SCHEDULE: {
            NonConformLoadSchedule nonConformLoadSchedule = ( NonConformLoadSchedule ) theEObject;
            T result = caseNonConformLoadSchedule( nonConformLoadSchedule );
            if( result == null ) result = caseSeasonDayTypeSchedule( nonConformLoadSchedule );
            if( result == null ) result = caseRegularIntervalSchedule( nonConformLoadSchedule );
            if( result == null ) result = caseBasicIntervalSchedule( nonConformLoadSchedule );
            if( result == null ) result = caseIdentifiedObject( nonConformLoadSchedule );
            if( result == null ) result = caseCimObjectWithID( nonConformLoadSchedule );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.PWR_STEAM_SUPPLY: {
            PWRSteamSupply pwrSteamSupply = ( PWRSteamSupply ) theEObject;
            T result = casePWRSteamSupply( pwrSteamSupply );
            if( result == null ) result = caseSteamSupply( pwrSteamSupply );
            if( result == null ) result = casePowerSystemResource( pwrSteamSupply );
            if( result == null ) result = caseIdentifiedObject( pwrSteamSupply );
            if( result == null ) result = caseCimObjectWithID( pwrSteamSupply );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.TARGET_LEVEL_SCHEDULE: {
            TargetLevelSchedule targetLevelSchedule = ( TargetLevelSchedule ) theEObject;
            T result = caseTargetLevelSchedule( targetLevelSchedule );
            if( result == null ) result = caseCurve( targetLevelSchedule );
            if( result == null ) result = caseIdentifiedObject( targetLevelSchedule );
            if( result == null ) result = caseCimObjectWithID( targetLevelSchedule );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.CAES_PLANT: {
            CAESPlant caesPlant = ( CAESPlant ) theEObject;
            T result = caseCAESPlant( caesPlant );
            if( result == null ) result = casePowerSystemResource( caesPlant );
            if( result == null ) result = caseIdentifiedObject( caesPlant );
            if( result == null ) result = caseCimObjectWithID( caesPlant );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.WIND_PLANT_FREQ_PCONTROL_IEC: {
            WindPlantFreqPcontrolIEC windPlantFreqPcontrolIEC = ( WindPlantFreqPcontrolIEC ) theEObject;
            T result = caseWindPlantFreqPcontrolIEC( windPlantFreqPcontrolIEC );
            if( result == null ) result = caseIdentifiedObject( windPlantFreqPcontrolIEC );
            if( result == null ) result = caseCimObjectWithID( windPlantFreqPcontrolIEC );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.WIRE_PHASE_INFO: {
            WirePhaseInfo wirePhaseInfo = ( WirePhaseInfo ) theEObject;
            T result = caseWirePhaseInfo( wirePhaseInfo );
            if( result == null ) result = caseCimObjectWithID( wirePhaseInfo );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.PSS_WECC: {
            PssWECC pssWECC = ( PssWECC ) theEObject;
            T result = casePssWECC( pssWECC );
            if( result == null ) result = casePowerSystemStabilizerDynamics( pssWECC );
            if( result == null ) result = caseDynamicsFunctionBlock( pssWECC );
            if( result == null ) result = caseIdentifiedObject( pssWECC );
            if( result == null ) result = caseCimObjectWithID( pssWECC );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.SEASON_DAY_TYPE_SCHEDULE: {
            SeasonDayTypeSchedule seasonDayTypeSchedule = ( SeasonDayTypeSchedule ) theEObject;
            T result = caseSeasonDayTypeSchedule( seasonDayTypeSchedule );
            if( result == null ) result = caseRegularIntervalSchedule( seasonDayTypeSchedule );
            if( result == null ) result = caseBasicIntervalSchedule( seasonDayTypeSchedule );
            if( result == null ) result = caseIdentifiedObject( seasonDayTypeSchedule );
            if( result == null ) result = caseCimObjectWithID( seasonDayTypeSchedule );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.PSS_SK: {
            PssSK pssSK = ( PssSK ) theEObject;
            T result = casePssSK( pssSK );
            if( result == null ) result = casePowerSystemStabilizerDynamics( pssSK );
            if( result == null ) result = caseDynamicsFunctionBlock( pssSK );
            if( result == null ) result = caseIdentifiedObject( pssSK );
            if( result == null ) result = caseCimObjectWithID( pssSK );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.VALUE_TO_ALIAS: {
            ValueToAlias valueToAlias = ( ValueToAlias ) theEObject;
            T result = caseValueToAlias( valueToAlias );
            if( result == null ) result = caseIdentifiedObject( valueToAlias );
            if( result == null ) result = caseCimObjectWithID( valueToAlias );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.END_DEVICE_EVENT: {
            EndDeviceEvent endDeviceEvent = ( EndDeviceEvent ) theEObject;
            T result = caseEndDeviceEvent( endDeviceEvent );
            if( result == null ) result = caseActivityRecord( endDeviceEvent );
            if( result == null ) result = caseIdentifiedObject( endDeviceEvent );
            if( result == null ) result = caseCimObjectWithID( endDeviceEvent );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.WIND_TYPE3OR4_USER_DEFINED: {
            WindType3or4UserDefined windType3or4UserDefined = ( WindType3or4UserDefined ) theEObject;
            T result = caseWindType3or4UserDefined( windType3or4UserDefined );
            if( result == null ) result = caseWindTurbineType3or4Dynamics( windType3or4UserDefined );
            if( result == null ) result = caseDynamicsFunctionBlock( windType3or4UserDefined );
            if( result == null ) result = caseIdentifiedObject( windType3or4UserDefined );
            if( result == null ) result = caseCimObjectWithID( windType3or4UserDefined );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.THERMAL_GENERATING_UNIT: {
            ThermalGeneratingUnit thermalGeneratingUnit = ( ThermalGeneratingUnit ) theEObject;
            T result = caseThermalGeneratingUnit( thermalGeneratingUnit );
            if( result == null ) result = caseGeneratingUnit( thermalGeneratingUnit );
            if( result == null ) result = caseEquipment( thermalGeneratingUnit );
            if( result == null ) result = casePowerSystemResource( thermalGeneratingUnit );
            if( result == null ) result = caseIdentifiedObject( thermalGeneratingUnit );
            if( result == null ) result = caseCimObjectWithID( thermalGeneratingUnit );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.PROFILE: {
            Profile profile = ( Profile ) theEObject;
            T result = caseProfile( profile );
            if( result == null ) result = caseIdentifiedObject( profile );
            if( result == null ) result = caseCimObjectWithID( profile );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.APPOINTMENT: {
            Appointment appointment = ( Appointment ) theEObject;
            T result = caseAppointment( appointment );
            if( result == null ) result = caseIdentifiedObject( appointment );
            if( result == null ) result = caseCimObjectWithID( appointment );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.SPECIMEN: {
            Specimen specimen = ( Specimen ) theEObject;
            T result = caseSpecimen( specimen );
            if( result == null ) result = caseIdentifiedObject( specimen );
            if( result == null ) result = caseCimObjectWithID( specimen );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.STRING_MEASUREMENT_VALUE: {
            StringMeasurementValue stringMeasurementValue = ( StringMeasurementValue ) theEObject;
            T result = caseStringMeasurementValue( stringMeasurementValue );
            if( result == null ) result = caseMeasurementValue( stringMeasurementValue );
            if( result == null ) result = caseIOPoint( stringMeasurementValue );
            if( result == null ) result = caseIdentifiedObject( stringMeasurementValue );
            if( result == null ) result = caseCimObjectWithID( stringMeasurementValue );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.WIND_TURBINE_TYPE3_IEC: {
            WindTurbineType3IEC windTurbineType3IEC = ( WindTurbineType3IEC ) theEObject;
            T result = caseWindTurbineType3IEC( windTurbineType3IEC );
            if( result == null ) result = caseWindTurbineType3or4IEC( windTurbineType3IEC );
            if( result == null ) result = caseWindTurbineType3or4Dynamics( windTurbineType3IEC );
            if( result == null ) result = caseDynamicsFunctionBlock( windTurbineType3IEC );
            if( result == null ) result = caseIdentifiedObject( windTurbineType3IEC );
            if( result == null ) result = caseCimObjectWithID( windTurbineType3IEC );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.REMOTE_UNIT: {
            RemoteUnit remoteUnit = ( RemoteUnit ) theEObject;
            T result = caseRemoteUnit( remoteUnit );
            if( result == null ) result = casePowerSystemResource( remoteUnit );
            if( result == null ) result = caseIdentifiedObject( remoteUnit );
            if( result == null ) result = caseCimObjectWithID( remoteUnit );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.GEN_UNIT_OP_SCHEDULE: {
            GenUnitOpSchedule genUnitOpSchedule = ( GenUnitOpSchedule ) theEObject;
            T result = caseGenUnitOpSchedule( genUnitOpSchedule );
            if( result == null ) result = caseRegularIntervalSchedule( genUnitOpSchedule );
            if( result == null ) result = caseBasicIntervalSchedule( genUnitOpSchedule );
            if( result == null ) result = caseIdentifiedObject( genUnitOpSchedule );
            if( result == null ) result = caseCimObjectWithID( genUnitOpSchedule );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.SV_VOLTAGE: {
            SvVoltage svVoltage = ( SvVoltage ) theEObject;
            T result = caseSvVoltage( svVoltage );
            if( result == null ) result = caseStateVariable( svVoltage );
            if( result == null ) result = caseCimObjectWithID( svVoltage );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.COGENERATION_PLANT: {
            CogenerationPlant cogenerationPlant = ( CogenerationPlant ) theEObject;
            T result = caseCogenerationPlant( cogenerationPlant );
            if( result == null ) result = casePowerSystemResource( cogenerationPlant );
            if( result == null ) result = caseIdentifiedObject( cogenerationPlant );
            if( result == null ) result = caseCimObjectWithID( cogenerationPlant );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.DISCRETE_VALUE: {
            DiscreteValue discreteValue = ( DiscreteValue ) theEObject;
            T result = caseDiscreteValue( discreteValue );
            if( result == null ) result = caseMeasurementValue( discreteValue );
            if( result == null ) result = caseIOPoint( discreteValue );
            if( result == null ) result = caseIdentifiedObject( discreteValue );
            if( result == null ) result = caseCimObjectWithID( discreteValue );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.CT_TEMP_ACTIVE_POWER_CURVE: {
            CTTempActivePowerCurve ctTempActivePowerCurve = ( CTTempActivePowerCurve ) theEObject;
            T result = caseCTTempActivePowerCurve( ctTempActivePowerCurve );
            if( result == null ) result = caseCurve( ctTempActivePowerCurve );
            if( result == null ) result = caseIdentifiedObject( ctTempActivePowerCurve );
            if( result == null ) result = caseCimObjectWithID( ctTempActivePowerCurve );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.ENERGY_CONSUMER_PHASE: {
            EnergyConsumerPhase energyConsumerPhase = ( EnergyConsumerPhase ) theEObject;
            T result = caseEnergyConsumerPhase( energyConsumerPhase );
            if( result == null ) result = casePowerSystemResource( energyConsumerPhase );
            if( result == null ) result = caseIdentifiedObject( energyConsumerPhase );
            if( result == null ) result = caseCimObjectWithID( energyConsumerPhase );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.EXC_AVR1: {
            ExcAVR1 excAVR1 = ( ExcAVR1 ) theEObject;
            T result = caseExcAVR1( excAVR1 );
            if( result == null ) result = caseExcitationSystemDynamics( excAVR1 );
            if( result == null ) result = caseDynamicsFunctionBlock( excAVR1 );
            if( result == null ) result = caseIdentifiedObject( excAVR1 );
            if( result == null ) result = caseCimObjectWithID( excAVR1 );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.CREW: {
            Crew crew = ( Crew ) theEObject;
            T result = caseCrew( crew );
            if( result == null ) result = caseIdentifiedObject( crew );
            if( result == null ) result = caseCimObjectWithID( crew );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.WIND_PITCH_CONT_POWER_IEC: {
            WindPitchContPowerIEC windPitchContPowerIEC = ( WindPitchContPowerIEC ) theEObject;
            T result = caseWindPitchContPowerIEC( windPitchContPowerIEC );
            if( result == null ) result = caseIdentifiedObject( windPitchContPowerIEC );
            if( result == null ) result = caseCimObjectWithID( windPitchContPowerIEC );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.HEAT_INPUT_CURVE: {
            HeatInputCurve heatInputCurve = ( HeatInputCurve ) theEObject;
            T result = caseHeatInputCurve( heatInputCurve );
            if( result == null ) result = caseCurve( heatInputCurve );
            if( result == null ) result = caseIdentifiedObject( heatInputCurve );
            if( result == null ) result = caseCimObjectWithID( heatInputCurve );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.TENDER: {
            Tender tender = ( Tender ) theEObject;
            T result = caseTender( tender );
            if( result == null ) result = caseIdentifiedObject( tender );
            if( result == null ) result = caseCimObjectWithID( tender );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.AIR_COMPRESSOR: {
            AirCompressor airCompressor = ( AirCompressor ) theEObject;
            T result = caseAirCompressor( airCompressor );
            if( result == null ) result = casePowerSystemResource( airCompressor );
            if( result == null ) result = caseIdentifiedObject( airCompressor );
            if( result == null ) result = caseCimObjectWithID( airCompressor );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.METROLOGY_REQUIREMENT: {
            MetrologyRequirement metrologyRequirement = ( MetrologyRequirement ) theEObject;
            T result = caseMetrologyRequirement( metrologyRequirement );
            if( result == null ) result = caseIdentifiedObject( metrologyRequirement );
            if( result == null ) result = caseCimObjectWithID( metrologyRequirement );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.LINEAR_SHUNT_COMPENSATOR: {
            LinearShuntCompensator linearShuntCompensator = ( LinearShuntCompensator ) theEObject;
            T result = caseLinearShuntCompensator( linearShuntCompensator );
            if( result == null ) result = caseShuntCompensator( linearShuntCompensator );
            if( result == null ) result = caseRegulatingCondEq( linearShuntCompensator );
            if( result == null ) result = caseEnergyConnection( linearShuntCompensator );
            if( result == null ) result = caseConductingEquipment( linearShuntCompensator );
            if( result == null ) result = caseEquipment( linearShuntCompensator );
            if( result == null ) result = casePowerSystemResource( linearShuntCompensator );
            if( result == null ) result = caseIdentifiedObject( linearShuntCompensator );
            if( result == null ) result = caseCimObjectWithID( linearShuntCompensator );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.ISSUER: {
            Issuer issuer = ( Issuer ) theEObject;
            T result = caseIssuer( issuer );
            if( result == null ) result = caseDocumentPersonRole( issuer );
            if( result == null ) result = casePersonRole( issuer );
            if( result == null ) result = caseIdentifiedObject( issuer );
            if( result == null ) result = caseCimObjectWithID( issuer );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.CLEARANCE_ACTION: {
            ClearanceAction clearanceAction = ( ClearanceAction ) theEObject;
            T result = caseClearanceAction( clearanceAction );
            if( result == null ) result = caseSwitchingStep( clearanceAction );
            if( result == null ) result = caseCimObjectWithID( clearanceAction );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.IO_POINT_SOURCE: {
            IOPointSource ioPointSource = ( IOPointSource ) theEObject;
            T result = caseIOPointSource( ioPointSource );
            if( result == null ) result = caseMeasurementValueSource( ioPointSource );
            if( result == null ) result = caseIdentifiedObject( ioPointSource );
            if( result == null ) result = caseCimObjectWithID( ioPointSource );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.REACTIVE_CAPABILITY_CURVE: {
            ReactiveCapabilityCurve reactiveCapabilityCurve = ( ReactiveCapabilityCurve ) theEObject;
            T result = caseReactiveCapabilityCurve( reactiveCapabilityCurve );
            if( result == null ) result = caseCurve( reactiveCapabilityCurve );
            if( result == null ) result = caseIdentifiedObject( reactiveCapabilityCurve );
            if( result == null ) result = caseCimObjectWithID( reactiveCapabilityCurve );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.SV_TAP_STEP: {
            SvTapStep svTapStep = ( SvTapStep ) theEObject;
            T result = caseSvTapStep( svTapStep );
            if( result == null ) result = caseStateVariable( svTapStep );
            if( result == null ) result = caseCimObjectWithID( svTapStep );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.GOV_STEAM_CC: {
            GovSteamCC govSteamCC = ( GovSteamCC ) theEObject;
            T result = caseGovSteamCC( govSteamCC );
            if( result == null ) result = caseTurbineGovernorDynamics( govSteamCC );
            if( result == null ) result = caseDynamicsFunctionBlock( govSteamCC );
            if( result == null ) result = caseIdentifiedObject( govSteamCC );
            if( result == null ) result = caseCimObjectWithID( govSteamCC );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.SWITCH_OPERATION_SUMMARY: {
            SwitchOperationSummary switchOperationSummary = ( SwitchOperationSummary ) theEObject;
            T result = caseSwitchOperationSummary( switchOperationSummary );
            if( result == null ) result = caseIdentifiedObject( switchOperationSummary );
            if( result == null ) result = caseCimObjectWithID( switchOperationSummary );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.SCHEDULED_EVENT_DATA: {
            ScheduledEventData scheduledEventData = ( ScheduledEventData ) theEObject;
            T result = caseScheduledEventData( scheduledEventData );
            if( result == null ) result = caseCimObjectWithID( scheduledEventData );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.DER_GROUP_FORECAST: {
            DERGroupForecast derGroupForecast = ( DERGroupForecast ) theEObject;
            T result = caseDERGroupForecast( derGroupForecast );
            if( result == null ) result = caseIdentifiedObject( derGroupForecast );
            if( result == null ) result = caseCimObjectWithID( derGroupForecast );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.BRANCH_GROUP_TERMINAL: {
            BranchGroupTerminal branchGroupTerminal = ( BranchGroupTerminal ) theEObject;
            T result = caseBranchGroupTerminal( branchGroupTerminal );
            if( result == null ) result = caseCimObjectWithID( branchGroupTerminal );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.SHIFT: {
            Shift shift = ( Shift ) theEObject;
            T result = caseShift( shift );
            if( result == null ) result = caseIdentifiedObject( shift );
            if( result == null ) result = caseCimObjectWithID( shift );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.PHASE_TAP_CHANGER_TABLE: {
            PhaseTapChangerTable phaseTapChangerTable = ( PhaseTapChangerTable ) theEObject;
            T result = casePhaseTapChangerTable( phaseTapChangerTable );
            if( result == null ) result = caseIdentifiedObject( phaseTapChangerTable );
            if( result == null ) result = caseCimObjectWithID( phaseTapChangerTable );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.OVEREXC_LIM_X2: {
            OverexcLimX2 overexcLimX2 = ( OverexcLimX2 ) theEObject;
            T result = caseOverexcLimX2( overexcLimX2 );
            if( result == null ) result = caseOverexcitationLimiterDynamics( overexcLimX2 );
            if( result == null ) result = caseDynamicsFunctionBlock( overexcLimX2 );
            if( result == null ) result = caseIdentifiedObject( overexcLimX2 );
            if( result == null ) result = caseCimObjectWithID( overexcLimX2 );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.DEMAND_RESPONSE_PROGRAM: {
            DemandResponseProgram demandResponseProgram = ( DemandResponseProgram ) theEObject;
            T result = caseDemandResponseProgram( demandResponseProgram );
            if( result == null ) result = caseIdentifiedObject( demandResponseProgram );
            if( result == null ) result = caseCimObjectWithID( demandResponseProgram );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.PERSON_ROLE: {
            PersonRole personRole = ( PersonRole ) theEObject;
            T result = casePersonRole( personRole );
            if( result == null ) result = caseIdentifiedObject( personRole );
            if( result == null ) result = caseCimObjectWithID( personRole );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.OIL_ANALYSIS_PARTICLE_DISCRETE: {
            OilAnalysisParticleDiscrete oilAnalysisParticleDiscrete = ( OilAnalysisParticleDiscrete ) theEObject;
            T result = caseOilAnalysisParticleDiscrete( oilAnalysisParticleDiscrete );
            if( result == null ) result = caseAssetDiscrete( oilAnalysisParticleDiscrete );
            if( result == null ) result = caseDiscrete( oilAnalysisParticleDiscrete );
            if( result == null ) result = caseMeasurement( oilAnalysisParticleDiscrete );
            if( result == null ) result = caseIdentifiedObject( oilAnalysisParticleDiscrete );
            if( result == null ) result = caseCimObjectWithID( oilAnalysisParticleDiscrete );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.GOV_GAST4: {
            GovGAST4 govGAST4 = ( GovGAST4 ) theEObject;
            T result = caseGovGAST4( govGAST4 );
            if( result == null ) result = caseTurbineGovernorDynamics( govGAST4 );
            if( result == null ) result = caseDynamicsFunctionBlock( govGAST4 );
            if( result == null ) result = caseIdentifiedObject( govGAST4 );
            if( result == null ) result = caseCimObjectWithID( govGAST4 );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.LOAD_COMPOSITE: {
            LoadComposite loadComposite = ( LoadComposite ) theEObject;
            T result = caseLoadComposite( loadComposite );
            if( result == null ) result = caseLoadDynamics( loadComposite );
            if( result == null ) result = caseIdentifiedObject( loadComposite );
            if( result == null ) result = caseCimObjectWithID( loadComposite );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.EQUIVALENT_INJECTION: {
            EquivalentInjection equivalentInjection = ( EquivalentInjection ) theEObject;
            T result = caseEquivalentInjection( equivalentInjection );
            if( result == null ) result = caseEquivalentEquipment( equivalentInjection );
            if( result == null ) result = caseConductingEquipment( equivalentInjection );
            if( result == null ) result = caseEquipment( equivalentInjection );
            if( result == null ) result = casePowerSystemResource( equivalentInjection );
            if( result == null ) result = caseIdentifiedObject( equivalentInjection );
            if( result == null ) result = caseCimObjectWithID( equivalentInjection );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.DOCUMENT_PERSON_ROLE: {
            DocumentPersonRole documentPersonRole = ( DocumentPersonRole ) theEObject;
            T result = caseDocumentPersonRole( documentPersonRole );
            if( result == null ) result = casePersonRole( documentPersonRole );
            if( result == null ) result = caseIdentifiedObject( documentPersonRole );
            if( result == null ) result = caseCimObjectWithID( documentPersonRole );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.IDENTIFIED_OBJECT: {
            IdentifiedObject identifiedObject = ( IdentifiedObject ) theEObject;
            T result = caseIdentifiedObject( identifiedObject );
            if( result == null ) result = caseCimObjectWithID( identifiedObject );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.PSS_IEEE3B: {
            PssIEEE3B pssIEEE3B = ( PssIEEE3B ) theEObject;
            T result = casePssIEEE3B( pssIEEE3B );
            if( result == null ) result = casePowerSystemStabilizerDynamics( pssIEEE3B );
            if( result == null ) result = caseDynamicsFunctionBlock( pssIEEE3B );
            if( result == null ) result = caseIdentifiedObject( pssIEEE3B );
            if( result == null ) result = caseCimObjectWithID( pssIEEE3B );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.TRANSACTION: {
            Transaction transaction = ( Transaction ) theEObject;
            T result = caseTransaction( transaction );
            if( result == null ) result = caseIdentifiedObject( transaction );
            if( result == null ) result = caseCimObjectWithID( transaction );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.STATISTICAL_CALCULATION: {
            StatisticalCalculation statisticalCalculation = ( StatisticalCalculation ) theEObject;
            T result = caseStatisticalCalculation( statisticalCalculation );
            if( result == null ) result = caseIdentifiedObject( statisticalCalculation );
            if( result == null ) result = caseCimObjectWithID( statisticalCalculation );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.METER_MULTIPLIER: {
            MeterMultiplier meterMultiplier = ( MeterMultiplier ) theEObject;
            T result = caseMeterMultiplier( meterMultiplier );
            if( result == null ) result = caseIdentifiedObject( meterMultiplier );
            if( result == null ) result = caseCimObjectWithID( meterMultiplier );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.INTERNAL_LOCATION: {
            InternalLocation internalLocation = ( InternalLocation ) theEObject;
            T result = caseInternalLocation( internalLocation );
            if( result == null ) result = caseWorkLocation( internalLocation );
            if( result == null ) result = caseLocation( internalLocation );
            if( result == null ) result = caseIdentifiedObject( internalLocation );
            if( result == null ) result = caseCimObjectWithID( internalLocation );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.BUS_NAME_MARKER: {
            BusNameMarker busNameMarker = ( BusNameMarker ) theEObject;
            T result = caseBusNameMarker( busNameMarker );
            if( result == null ) result = caseIdentifiedObject( busNameMarker );
            if( result == null ) result = caseCimObjectWithID( busNameMarker );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.SHUNT_COMPENSATOR_PHASE: {
            ShuntCompensatorPhase shuntCompensatorPhase = ( ShuntCompensatorPhase ) theEObject;
            T result = caseShuntCompensatorPhase( shuntCompensatorPhase );
            if( result == null ) result = casePowerSystemResource( shuntCompensatorPhase );
            if( result == null ) result = caseIdentifiedObject( shuntCompensatorPhase );
            if( result == null ) result = caseCimObjectWithID( shuntCompensatorPhase );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.SV_POWER_FLOW: {
            SvPowerFlow svPowerFlow = ( SvPowerFlow ) theEObject;
            T result = caseSvPowerFlow( svPowerFlow );
            if( result == null ) result = caseStateVariable( svPowerFlow );
            if( result == null ) result = caseCimObjectWithID( svPowerFlow );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.DRUM_BOILER: {
            DrumBoiler drumBoiler = ( DrumBoiler ) theEObject;
            T result = caseDrumBoiler( drumBoiler );
            if( result == null ) result = caseFossilSteamSupply( drumBoiler );
            if( result == null ) result = caseSteamSupply( drumBoiler );
            if( result == null ) result = casePowerSystemResource( drumBoiler );
            if( result == null ) result = caseIdentifiedObject( drumBoiler );
            if( result == null ) result = caseCimObjectWithID( drumBoiler );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.ASYNCHRONOUS_MACHINE_EQUIVALENT_CIRCUIT: {
            AsynchronousMachineEquivalentCircuit asynchronousMachineEquivalentCircuit = ( AsynchronousMachineEquivalentCircuit ) theEObject;
            T result = caseAsynchronousMachineEquivalentCircuit( asynchronousMachineEquivalentCircuit );
            if( result == null ) result = caseAsynchronousMachineDynamics( asynchronousMachineEquivalentCircuit );
            if( result == null ) result = caseRotatingMachineDynamics( asynchronousMachineEquivalentCircuit );
            if( result == null ) result = caseDynamicsFunctionBlock( asynchronousMachineEquivalentCircuit );
            if( result == null ) result = caseIdentifiedObject( asynchronousMachineEquivalentCircuit );
            if( result == null ) result = caseCimObjectWithID( asynchronousMachineEquivalentCircuit );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.WIND_CONT_QIEC: {
            WindContQIEC windContQIEC = ( WindContQIEC ) theEObject;
            T result = caseWindContQIEC( windContQIEC );
            if( result == null ) result = caseIdentifiedObject( windContQIEC );
            if( result == null ) result = caseCimObjectWithID( windContQIEC );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.PSR_EVENT: {
            PSREvent psrEvent = ( PSREvent ) theEObject;
            T result = casePSREvent( psrEvent );
            if( result == null ) result = caseActivityRecord( psrEvent );
            if( result == null ) result = caseIdentifiedObject( psrEvent );
            if( result == null ) result = caseCimObjectWithID( psrEvent );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.DER_GROUP_FORECAST_REQUEST: {
            DERGroupForecastRequest derGroupForecastRequest = ( DERGroupForecastRequest ) theEObject;
            T result = caseDERGroupForecastRequest( derGroupForecastRequest );
            if( result == null ) result = caseIdentifiedObject( derGroupForecastRequest );
            if( result == null ) result = caseCimObjectWithID( derGroupForecastRequest );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.TRANSFORMER_CORE_ADMITTANCE: {
            TransformerCoreAdmittance transformerCoreAdmittance = ( TransformerCoreAdmittance ) theEObject;
            T result = caseTransformerCoreAdmittance( transformerCoreAdmittance );
            if( result == null ) result = caseIdentifiedObject( transformerCoreAdmittance );
            if( result == null ) result = caseCimObjectWithID( transformerCoreAdmittance );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.REMOTE_CONTROL: {
            RemoteControl remoteControl = ( RemoteControl ) theEObject;
            T result = caseRemoteControl( remoteControl );
            if( result == null ) result = caseRemotePoint( remoteControl );
            if( result == null ) result = caseIdentifiedObject( remoteControl );
            if( result == null ) result = caseCimObjectWithID( remoteControl );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.MECHANICAL_LOAD_USER_DEFINED: {
            MechanicalLoadUserDefined mechanicalLoadUserDefined = ( MechanicalLoadUserDefined ) theEObject;
            T result = caseMechanicalLoadUserDefined( mechanicalLoadUserDefined );
            if( result == null ) result = caseMechanicalLoadDynamics( mechanicalLoadUserDefined );
            if( result == null ) result = caseDynamicsFunctionBlock( mechanicalLoadUserDefined );
            if( result == null ) result = caseIdentifiedObject( mechanicalLoadUserDefined );
            if( result == null ) result = caseCimObjectWithID( mechanicalLoadUserDefined );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.SV_INJECTION: {
            SvInjection svInjection = ( SvInjection ) theEObject;
            T result = caseSvInjection( svInjection );
            if( result == null ) result = caseStateVariable( svInjection );
            if( result == null ) result = caseCimObjectWithID( svInjection );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.FAULT_CAUSE_TYPE: {
            FaultCauseType faultCauseType = ( FaultCauseType ) theEObject;
            T result = caseFaultCauseType( faultCauseType );
            if( result == null ) result = caseIdentifiedObject( faultCauseType );
            if( result == null ) result = caseCimObjectWithID( faultCauseType );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.PHOTO_VOLTAIC_UNIT: {
            PhotoVoltaicUnit photoVoltaicUnit = ( PhotoVoltaicUnit ) theEObject;
            T result = casePhotoVoltaicUnit( photoVoltaicUnit );
            if( result == null ) result = casePowerElectronicsUnit( photoVoltaicUnit );
            if( result == null ) result = caseEquipment( photoVoltaicUnit );
            if( result == null ) result = casePowerSystemResource( photoVoltaicUnit );
            if( result == null ) result = caseIdentifiedObject( photoVoltaicUnit );
            if( result == null ) result = caseCimObjectWithID( photoVoltaicUnit );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.GOV_STEAM_SGO: {
            GovSteamSGO govSteamSGO = ( GovSteamSGO ) theEObject;
            T result = caseGovSteamSGO( govSteamSGO );
            if( result == null ) result = caseTurbineGovernorDynamics( govSteamSGO );
            if( result == null ) result = caseDynamicsFunctionBlock( govSteamSGO );
            if( result == null ) result = caseIdentifiedObject( govSteamSGO );
            if( result == null ) result = caseCimObjectWithID( govSteamSGO );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.INTERVAL_READING: {
            IntervalReading intervalReading = ( IntervalReading ) theEObject;
            T result = caseIntervalReading( intervalReading );
            if( result == null ) result = caseBaseReading( intervalReading );
            if( result == null ) result = caseMeasurementValue( intervalReading );
            if( result == null ) result = caseIOPoint( intervalReading );
            if( result == null ) result = caseIdentifiedObject( intervalReading );
            if( result == null ) result = caseCimObjectWithID( intervalReading );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.SWITCHING_STEP_GROUP: {
            SwitchingStepGroup switchingStepGroup = ( SwitchingStepGroup ) theEObject;
            T result = caseSwitchingStepGroup( switchingStepGroup );
            if( result == null ) result = caseDocument( switchingStepGroup );
            if( result == null ) result = caseIdentifiedObject( switchingStepGroup );
            if( result == null ) result = caseCimObjectWithID( switchingStepGroup );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.EXC_IEEEAC7B: {
            ExcIEEEAC7B excIEEEAC7B = ( ExcIEEEAC7B ) theEObject;
            T result = caseExcIEEEAC7B( excIEEEAC7B );
            if( result == null ) result = caseExcitationSystemDynamics( excIEEEAC7B );
            if( result == null ) result = caseDynamicsFunctionBlock( excIEEEAC7B );
            if( result == null ) result = caseIdentifiedObject( excIEEEAC7B );
            if( result == null ) result = caseCimObjectWithID( excIEEEAC7B );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.PSS2_ST: {
            Pss2ST pss2ST = ( Pss2ST ) theEObject;
            T result = casePss2ST( pss2ST );
            if( result == null ) result = casePowerSystemStabilizerDynamics( pss2ST );
            if( result == null ) result = caseDynamicsFunctionBlock( pss2ST );
            if( result == null ) result = caseIdentifiedObject( pss2ST );
            if( result == null ) result = caseCimObjectWithID( pss2ST );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.ACCUMULATOR_LIMIT: {
            AccumulatorLimit accumulatorLimit = ( AccumulatorLimit ) theEObject;
            T result = caseAccumulatorLimit( accumulatorLimit );
            if( result == null ) result = caseLimit( accumulatorLimit );
            if( result == null ) result = caseIdentifiedObject( accumulatorLimit );
            if( result == null ) result = caseCimObjectWithID( accumulatorLimit );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.EXC_AC6A: {
            ExcAC6A excAC6A = ( ExcAC6A ) theEObject;
            T result = caseExcAC6A( excAC6A );
            if( result == null ) result = caseExcitationSystemDynamics( excAC6A );
            if( result == null ) result = caseDynamicsFunctionBlock( excAC6A );
            if( result == null ) result = caseIdentifiedObject( excAC6A );
            if( result == null ) result = caseCimObjectWithID( excAC6A );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.SWITCH_ACTION: {
            SwitchAction switchAction = ( SwitchAction ) theEObject;
            T result = caseSwitchAction( switchAction );
            if( result == null ) result = caseSwitchingStep( switchAction );
            if( result == null ) result = caseCimObjectWithID( switchAction );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.WIRE_ASSEMBLY_INFO: {
            WireAssemblyInfo wireAssemblyInfo = ( WireAssemblyInfo ) theEObject;
            T result = caseWireAssemblyInfo( wireAssemblyInfo );
            if( result == null ) result = caseAssetInfo( wireAssemblyInfo );
            if( result == null ) result = caseIdentifiedObject( wireAssemblyInfo );
            if( result == null ) result = caseCimObjectWithID( wireAssemblyInfo );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.MEASUREMENT_VALUE: {
            MeasurementValue measurementValue = ( MeasurementValue ) theEObject;
            T result = caseMeasurementValue( measurementValue );
            if( result == null ) result = caseIOPoint( measurementValue );
            if( result == null ) result = caseIdentifiedObject( measurementValue );
            if( result == null ) result = caseCimObjectWithID( measurementValue );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.CALCULATION_METHOD_HIERARCHY: {
            CalculationMethodHierarchy calculationMethodHierarchy = ( CalculationMethodHierarchy ) theEObject;
            T result = caseCalculationMethodHierarchy( calculationMethodHierarchy );
            if( result == null ) result = caseIdentifiedObject( calculationMethodHierarchy );
            if( result == null ) result = caseCimObjectWithID( calculationMethodHierarchy );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.DC_BASE_TERMINAL: {
            DCBaseTerminal dcBaseTerminal = ( DCBaseTerminal ) theEObject;
            T result = caseDCBaseTerminal( dcBaseTerminal );
            if( result == null ) result = caseACDCTerminal( dcBaseTerminal );
            if( result == null ) result = caseIdentifiedObject( dcBaseTerminal );
            if( result == null ) result = caseCimObjectWithID( dcBaseTerminal );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.VOLTAGE_COMPENSATOR_DYNAMICS: {
            VoltageCompensatorDynamics voltageCompensatorDynamics = ( VoltageCompensatorDynamics ) theEObject;
            T result = caseVoltageCompensatorDynamics( voltageCompensatorDynamics );
            if( result == null ) result = caseDynamicsFunctionBlock( voltageCompensatorDynamics );
            if( result == null ) result = caseIdentifiedObject( voltageCompensatorDynamics );
            if( result == null ) result = caseCimObjectWithID( voltageCompensatorDynamics );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.TRANSFORMER_STAR_IMPEDANCE: {
            TransformerStarImpedance transformerStarImpedance = ( TransformerStarImpedance ) theEObject;
            T result = caseTransformerStarImpedance( transformerStarImpedance );
            if( result == null ) result = caseIdentifiedObject( transformerStarImpedance );
            if( result == null ) result = caseCimObjectWithID( transformerStarImpedance );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.TCP_ACCESS_POINT: {
            TCPAccessPoint tcpAccessPoint = ( TCPAccessPoint ) theEObject;
            T result = caseTCPAccessPoint( tcpAccessPoint );
            if( result == null ) result = caseIPAccessPoint( tcpAccessPoint );
            if( result == null ) result = caseCommunicationLink( tcpAccessPoint );
            if( result == null ) result = casePowerSystemResource( tcpAccessPoint );
            if( result == null ) result = caseIdentifiedObject( tcpAccessPoint );
            if( result == null ) result = caseCimObjectWithID( tcpAccessPoint );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.CONNECT_DISCONNECT_FUNCTION: {
            ConnectDisconnectFunction connectDisconnectFunction = ( ConnectDisconnectFunction ) theEObject;
            T result = caseConnectDisconnectFunction( connectDisconnectFunction );
            if( result == null ) result = caseEndDeviceFunction( connectDisconnectFunction );
            if( result == null ) result = caseAssetFunction( connectDisconnectFunction );
            if( result == null ) result = caseIdentifiedObject( connectDisconnectFunction );
            if( result == null ) result = caseCimObjectWithID( connectDisconnectFunction );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.ICCP_PROVIDED_POINT: {
            ICCPProvidedPoint iccpProvidedPoint = ( ICCPProvidedPoint ) theEObject;
            T result = caseICCPProvidedPoint( iccpProvidedPoint );
            if( result == null ) result = caseProvidedBilateralPoint( iccpProvidedPoint );
            if( result == null ) result = caseIdentifiedObject( iccpProvidedPoint );
            if( result == null ) result = caseCimObjectWithID( iccpProvidedPoint );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.PROTECTED_SWITCH: {
            ProtectedSwitch protectedSwitch = ( ProtectedSwitch ) theEObject;
            T result = caseProtectedSwitch( protectedSwitch );
            if( result == null ) result = caseSwitch( protectedSwitch );
            if( result == null ) result = caseConductingEquipment( protectedSwitch );
            if( result == null ) result = caseEquipment( protectedSwitch );
            if( result == null ) result = casePowerSystemResource( protectedSwitch );
            if( result == null ) result = caseIdentifiedObject( protectedSwitch );
            if( result == null ) result = caseCimObjectWithID( protectedSwitch );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.LOAD_RESPONSE_CHARACTERISTIC: {
            LoadResponseCharacteristic loadResponseCharacteristic = ( LoadResponseCharacteristic ) theEObject;
            T result = caseLoadResponseCharacteristic( loadResponseCharacteristic );
            if( result == null ) result = caseIdentifiedObject( loadResponseCharacteristic );
            if( result == null ) result = caseCimObjectWithID( loadResponseCharacteristic );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.SERVICE_SUPPLIER: {
            ServiceSupplier serviceSupplier = ( ServiceSupplier ) theEObject;
            T result = caseServiceSupplier( serviceSupplier );
            if( result == null ) result = caseOrganisationRole( serviceSupplier );
            if( result == null ) result = caseIdentifiedObject( serviceSupplier );
            if( result == null ) result = caseCimObjectWithID( serviceSupplier );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.CASHIER: {
            Cashier cashier = ( Cashier ) theEObject;
            T result = caseCashier( cashier );
            if( result == null ) result = caseIdentifiedObject( cashier );
            if( result == null ) result = caseCimObjectWithID( cashier );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.FUSE: {
            Fuse fuse = ( Fuse ) theEObject;
            T result = caseFuse( fuse );
            if( result == null ) result = caseSwitch( fuse );
            if( result == null ) result = caseConductingEquipment( fuse );
            if( result == null ) result = caseEquipment( fuse );
            if( result == null ) result = casePowerSystemResource( fuse );
            if( result == null ) result = caseIdentifiedObject( fuse );
            if( result == null ) result = caseCimObjectWithID( fuse );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.WIND_AERO_ONE_DIM_IEC: {
            WindAeroOneDimIEC windAeroOneDimIEC = ( WindAeroOneDimIEC ) theEObject;
            T result = caseWindAeroOneDimIEC( windAeroOneDimIEC );
            if( result == null ) result = caseIdentifiedObject( windAeroOneDimIEC );
            if( result == null ) result = caseCimObjectWithID( windAeroOneDimIEC );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.GOV_HYDRO3: {
            GovHydro3 govHydro3 = ( GovHydro3 ) theEObject;
            T result = caseGovHydro3( govHydro3 );
            if( result == null ) result = caseTurbineGovernorDynamics( govHydro3 );
            if( result == null ) result = caseDynamicsFunctionBlock( govHydro3 );
            if( result == null ) result = caseIdentifiedObject( govHydro3 );
            if( result == null ) result = caseCimObjectWithID( govHydro3 );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.EXC_AVR7: {
            ExcAVR7 excAVR7 = ( ExcAVR7 ) theEObject;
            T result = caseExcAVR7( excAVR7 );
            if( result == null ) result = caseExcitationSystemDynamics( excAVR7 );
            if( result == null ) result = caseDynamicsFunctionBlock( excAVR7 );
            if( result == null ) result = caseIdentifiedObject( excAVR7 );
            if( result == null ) result = caseCimObjectWithID( excAVR7 );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.START_IGN_FUEL_CURVE: {
            StartIgnFuelCurve startIgnFuelCurve = ( StartIgnFuelCurve ) theEObject;
            T result = caseStartIgnFuelCurve( startIgnFuelCurve );
            if( result == null ) result = caseCurve( startIgnFuelCurve );
            if( result == null ) result = caseIdentifiedObject( startIgnFuelCurve );
            if( result == null ) result = caseCimObjectWithID( startIgnFuelCurve );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.STATION_SUPPLY: {
            StationSupply stationSupply = ( StationSupply ) theEObject;
            T result = caseStationSupply( stationSupply );
            if( result == null ) result = caseEnergyConsumer( stationSupply );
            if( result == null ) result = caseEnergyConnection( stationSupply );
            if( result == null ) result = caseConductingEquipment( stationSupply );
            if( result == null ) result = caseEquipment( stationSupply );
            if( result == null ) result = casePowerSystemResource( stationSupply );
            if( result == null ) result = caseIdentifiedObject( stationSupply );
            if( result == null ) result = caseCimObjectWithID( stationSupply );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.NON_CONFORM_LOAD_GROUP: {
            NonConformLoadGroup nonConformLoadGroup = ( NonConformLoadGroup ) theEObject;
            T result = caseNonConformLoadGroup( nonConformLoadGroup );
            if( result == null ) result = caseLoadGroup( nonConformLoadGroup );
            if( result == null ) result = caseIdentifiedObject( nonConformLoadGroup );
            if( result == null ) result = caseCimObjectWithID( nonConformLoadGroup );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.DATA_SET_MEMBER: {
            DataSetMember dataSetMember = ( DataSetMember ) theEObject;
            T result = caseDataSetMember( dataSetMember );
            if( result == null ) result = caseIdentifiedObject( dataSetMember );
            if( result == null ) result = caseCimObjectWithID( dataSetMember );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.DC_DISCONNECTOR: {
            DCDisconnector dcDisconnector = ( DCDisconnector ) theEObject;
            T result = caseDCDisconnector( dcDisconnector );
            if( result == null ) result = caseDCSwitch( dcDisconnector );
            if( result == null ) result = caseDCConductingEquipment( dcDisconnector );
            if( result == null ) result = caseEquipment( dcDisconnector );
            if( result == null ) result = casePowerSystemResource( dcDisconnector );
            if( result == null ) result = caseIdentifiedObject( dcDisconnector );
            if( result == null ) result = caseCimObjectWithID( dcDisconnector );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.EXC_OEX3T: {
            ExcOEX3T excOEX3T = ( ExcOEX3T ) theEObject;
            T result = caseExcOEX3T( excOEX3T );
            if( result == null ) result = caseExcitationSystemDynamics( excOEX3T );
            if( result == null ) result = caseDynamicsFunctionBlock( excOEX3T );
            if( result == null ) result = caseIdentifiedObject( excOEX3T );
            if( result == null ) result = caseCimObjectWithID( excOEX3T );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.EXC_DC1A: {
            ExcDC1A excDC1A = ( ExcDC1A ) theEObject;
            T result = caseExcDC1A( excDC1A );
            if( result == null ) result = caseExcitationSystemDynamics( excDC1A );
            if( result == null ) result = caseDynamicsFunctionBlock( excDC1A );
            if( result == null ) result = caseIdentifiedObject( excDC1A );
            if( result == null ) result = caseCimObjectWithID( excDC1A );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.SHUTDOWN_CURVE: {
            ShutdownCurve shutdownCurve = ( ShutdownCurve ) theEObject;
            T result = caseShutdownCurve( shutdownCurve );
            if( result == null ) result = caseCurve( shutdownCurve );
            if( result == null ) result = caseIdentifiedObject( shutdownCurve );
            if( result == null ) result = caseCimObjectWithID( shutdownCurve );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.WIND_GEN_TYPE3A_IEC: {
            WindGenType3aIEC windGenType3aIEC = ( WindGenType3aIEC ) theEObject;
            T result = caseWindGenType3aIEC( windGenType3aIEC );
            if( result == null ) result = caseWindGenType3IEC( windGenType3aIEC );
            if( result == null ) result = caseIdentifiedObject( windGenType3aIEC );
            if( result == null ) result = caseCimObjectWithID( windGenType3aIEC );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.TEST_STANDARD: {
            TestStandard testStandard = ( TestStandard ) theEObject;
            T result = caseTestStandard( testStandard );
            if( result == null ) result = caseIdentifiedObject( testStandard );
            if( result == null ) result = caseCimObjectWithID( testStandard );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.CURVE_DATA: {
            CurveData curveData = ( CurveData ) theEObject;
            T result = caseCurveData( curveData );
            if( result == null ) result = caseCimObjectWithID( curveData );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.SUBCRITICAL: {
            Subcritical subcritical = ( Subcritical ) theEObject;
            T result = caseSubcritical( subcritical );
            if( result == null ) result = caseFossilSteamSupply( subcritical );
            if( result == null ) result = caseSteamSupply( subcritical );
            if( result == null ) result = casePowerSystemResource( subcritical );
            if( result == null ) result = caseIdentifiedObject( subcritical );
            if( result == null ) result = caseCimObjectWithID( subcritical );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.PHASE_TAP_CHANGER: {
            PhaseTapChanger phaseTapChanger = ( PhaseTapChanger ) theEObject;
            T result = casePhaseTapChanger( phaseTapChanger );
            if( result == null ) result = caseTapChanger( phaseTapChanger );
            if( result == null ) result = casePowerSystemResource( phaseTapChanger );
            if( result == null ) result = caseIdentifiedObject( phaseTapChanger );
            if( result == null ) result = caseCimObjectWithID( phaseTapChanger );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.PFV_AR_CONTROLLER_TYPE2_USER_DEFINED: {
            PFVArControllerType2UserDefined pfvArControllerType2UserDefined = ( PFVArControllerType2UserDefined ) theEObject;
            T result = casePFVArControllerType2UserDefined( pfvArControllerType2UserDefined );
            if( result == null ) result = casePFVArControllerType2Dynamics( pfvArControllerType2UserDefined );
            if( result == null ) result = caseDynamicsFunctionBlock( pfvArControllerType2UserDefined );
            if( result == null ) result = caseIdentifiedObject( pfvArControllerType2UserDefined );
            if( result == null ) result = caseCimObjectWithID( pfvArControllerType2UserDefined );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.PHASE_TAP_CHANGER_NON_LINEAR: {
            PhaseTapChangerNonLinear phaseTapChangerNonLinear = ( PhaseTapChangerNonLinear ) theEObject;
            T result = casePhaseTapChangerNonLinear( phaseTapChangerNonLinear );
            if( result == null ) result = casePhaseTapChanger( phaseTapChangerNonLinear );
            if( result == null ) result = caseTapChanger( phaseTapChangerNonLinear );
            if( result == null ) result = casePowerSystemResource( phaseTapChangerNonLinear );
            if( result == null ) result = caseIdentifiedObject( phaseTapChangerNonLinear );
            if( result == null ) result = caseCimObjectWithID( phaseTapChangerNonLinear );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.DC_GROUND: {
            DCGround dcGround = ( DCGround ) theEObject;
            T result = caseDCGround( dcGround );
            if( result == null ) result = caseDCConductingEquipment( dcGround );
            if( result == null ) result = caseEquipment( dcGround );
            if( result == null ) result = casePowerSystemResource( dcGround );
            if( result == null ) result = caseIdentifiedObject( dcGround );
            if( result == null ) result = caseCimObjectWithID( dcGround );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.LINE_FAULT: {
            LineFault lineFault = ( LineFault ) theEObject;
            T result = caseLineFault( lineFault );
            if( result == null ) result = caseFault( lineFault );
            if( result == null ) result = caseIdentifiedObject( lineFault );
            if( result == null ) result = caseCimObjectWithID( lineFault );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.VOLTAGE_COMPENSATOR_USER_DEFINED: {
            VoltageCompensatorUserDefined voltageCompensatorUserDefined = ( VoltageCompensatorUserDefined ) theEObject;
            T result = caseVoltageCompensatorUserDefined( voltageCompensatorUserDefined );
            if( result == null ) result = caseVoltageCompensatorDynamics( voltageCompensatorUserDefined );
            if( result == null ) result = caseDynamicsFunctionBlock( voltageCompensatorUserDefined );
            if( result == null ) result = caseIdentifiedObject( voltageCompensatorUserDefined );
            if( result == null ) result = caseCimObjectWithID( voltageCompensatorUserDefined );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.EXTERNAL_NETWORK_INJECTION: {
            ExternalNetworkInjection externalNetworkInjection = ( ExternalNetworkInjection ) theEObject;
            T result = caseExternalNetworkInjection( externalNetworkInjection );
            if( result == null ) result = caseRegulatingCondEq( externalNetworkInjection );
            if( result == null ) result = caseEnergyConnection( externalNetworkInjection );
            if( result == null ) result = caseConductingEquipment( externalNetworkInjection );
            if( result == null ) result = caseEquipment( externalNetworkInjection );
            if( result == null ) result = casePowerSystemResource( externalNetworkInjection );
            if( result == null ) result = caseIdentifiedObject( externalNetworkInjection );
            if( result == null ) result = caseCimObjectWithID( externalNetworkInjection );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.WAVE_TRAP: {
            WaveTrap waveTrap = ( WaveTrap ) theEObject;
            T result = caseWaveTrap( waveTrap );
            if( result == null ) result = caseAuxiliaryEquipment( waveTrap );
            if( result == null ) result = caseEquipment( waveTrap );
            if( result == null ) result = casePowerSystemResource( waveTrap );
            if( result == null ) result = caseIdentifiedObject( waveTrap );
            if( result == null ) result = caseCimObjectWithID( waveTrap );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.EQUIVALENT_EQUIPMENT: {
            EquivalentEquipment equivalentEquipment = ( EquivalentEquipment ) theEObject;
            T result = caseEquivalentEquipment( equivalentEquipment );
            if( result == null ) result = caseConductingEquipment( equivalentEquipment );
            if( result == null ) result = caseEquipment( equivalentEquipment );
            if( result == null ) result = casePowerSystemResource( equivalentEquipment );
            if( result == null ) result = caseIdentifiedObject( equivalentEquipment );
            if( result == null ) result = caseCimObjectWithID( equivalentEquipment );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.OBJECT_REVERSE_MODIFICATION: {
            ObjectReverseModification objectReverseModification = ( ObjectReverseModification ) theEObject;
            T result = caseObjectReverseModification( objectReverseModification );
            if( result == null ) result = caseChangeSetMember( objectReverseModification );
            if( result == null ) result = caseDataSetMember( objectReverseModification );
            if( result == null ) result = caseIdentifiedObject( objectReverseModification );
            if( result == null ) result = caseCimObjectWithID( objectReverseModification );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.TAP_SCHEDULE: {
            TapSchedule tapSchedule = ( TapSchedule ) theEObject;
            T result = caseTapSchedule( tapSchedule );
            if( result == null ) result = caseSeasonDayTypeSchedule( tapSchedule );
            if( result == null ) result = caseRegularIntervalSchedule( tapSchedule );
            if( result == null ) result = caseBasicIntervalSchedule( tapSchedule );
            if( result == null ) result = caseIdentifiedObject( tapSchedule );
            if( result == null ) result = caseCimObjectWithID( tapSchedule );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.EXC_ANS: {
            ExcANS excANS = ( ExcANS ) theEObject;
            T result = caseExcANS( excANS );
            if( result == null ) result = caseExcitationSystemDynamics( excANS );
            if( result == null ) result = caseDynamicsFunctionBlock( excANS );
            if( result == null ) result = caseIdentifiedObject( excANS );
            if( result == null ) result = caseCimObjectWithID( excANS );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.TAP_CHANGER_CONTROL: {
            TapChangerControl tapChangerControl = ( TapChangerControl ) theEObject;
            T result = caseTapChangerControl( tapChangerControl );
            if( result == null ) result = caseRegulatingControl( tapChangerControl );
            if( result == null ) result = casePowerSystemResource( tapChangerControl );
            if( result == null ) result = caseIdentifiedObject( tapChangerControl );
            if( result == null ) result = caseCimObjectWithID( tapChangerControl );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.GOV_HYDRO_DD: {
            GovHydroDD govHydroDD = ( GovHydroDD ) theEObject;
            T result = caseGovHydroDD( govHydroDD );
            if( result == null ) result = caseTurbineGovernorDynamics( govHydroDD );
            if( result == null ) result = caseDynamicsFunctionBlock( govHydroDD );
            if( result == null ) result = caseIdentifiedObject( govHydroDD );
            if( result == null ) result = caseCimObjectWithID( govHydroDD );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.LOAD_DYNAMICS: {
            LoadDynamics loadDynamics = ( LoadDynamics ) theEObject;
            T result = caseLoadDynamics( loadDynamics );
            if( result == null ) result = caseIdentifiedObject( loadDynamics );
            if( result == null ) result = caseCimObjectWithID( loadDynamics );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.EXC_ST7B: {
            ExcST7B excST7B = ( ExcST7B ) theEObject;
            T result = caseExcST7B( excST7B );
            if( result == null ) result = caseExcitationSystemDynamics( excST7B );
            if( result == null ) result = caseDynamicsFunctionBlock( excST7B );
            if( result == null ) result = caseIdentifiedObject( excST7B );
            if( result == null ) result = caseCimObjectWithID( excST7B );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.HYDRO_GENERATING_EFFICIENCY_CURVE: {
            HydroGeneratingEfficiencyCurve hydroGeneratingEfficiencyCurve = ( HydroGeneratingEfficiencyCurve ) theEObject;
            T result = caseHydroGeneratingEfficiencyCurve( hydroGeneratingEfficiencyCurve );
            if( result == null ) result = caseCurve( hydroGeneratingEfficiencyCurve );
            if( result == null ) result = caseIdentifiedObject( hydroGeneratingEfficiencyCurve );
            if( result == null ) result = caseCimObjectWithID( hydroGeneratingEfficiencyCurve );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.PENSTOCK_LOSS_CURVE: {
            PenstockLossCurve penstockLossCurve = ( PenstockLossCurve ) theEObject;
            T result = casePenstockLossCurve( penstockLossCurve );
            if( result == null ) result = caseCurve( penstockLossCurve );
            if( result == null ) result = caseIdentifiedObject( penstockLossCurve );
            if( result == null ) result = caseCimObjectWithID( penstockLossCurve );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.ENERGY_SOURCE_ACTION: {
            EnergySourceAction energySourceAction = ( EnergySourceAction ) theEObject;
            T result = caseEnergySourceAction( energySourceAction );
            if( result == null ) result = caseSwitchingStep( energySourceAction );
            if( result == null ) result = caseCimObjectWithID( energySourceAction );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.HYDRO_POWER_PLANT: {
            HydroPowerPlant hydroPowerPlant = ( HydroPowerPlant ) theEObject;
            T result = caseHydroPowerPlant( hydroPowerPlant );
            if( result == null ) result = casePowerSystemResource( hydroPowerPlant );
            if( result == null ) result = caseIdentifiedObject( hydroPowerPlant );
            if( result == null ) result = caseCimObjectWithID( hydroPowerPlant );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.MANUFACTURER: {
            Manufacturer manufacturer = ( Manufacturer ) theEObject;
            T result = caseManufacturer( manufacturer );
            if( result == null ) result = caseOrganisationRole( manufacturer );
            if( result == null ) result = caseIdentifiedObject( manufacturer );
            if( result == null ) result = caseCimObjectWithID( manufacturer );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.TURBINE_LOAD_CONTROLLER_USER_DEFINED: {
            TurbineLoadControllerUserDefined turbineLoadControllerUserDefined = ( TurbineLoadControllerUserDefined ) theEObject;
            T result = caseTurbineLoadControllerUserDefined( turbineLoadControllerUserDefined );
            if( result == null ) result = caseTurbineLoadControllerDynamics( turbineLoadControllerUserDefined );
            if( result == null ) result = caseDynamicsFunctionBlock( turbineLoadControllerUserDefined );
            if( result == null ) result = caseIdentifiedObject( turbineLoadControllerUserDefined );
            if( result == null ) result = caseCimObjectWithID( turbineLoadControllerUserDefined );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.PENDING_CALCULATION: {
            PendingCalculation pendingCalculation = ( PendingCalculation ) theEObject;
            T result = casePendingCalculation( pendingCalculation );
            if( result == null ) result = caseCimObjectWithID( pendingCalculation );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.BUSHING_INFO: {
            BushingInfo bushingInfo = ( BushingInfo ) theEObject;
            T result = caseBushingInfo( bushingInfo );
            if( result == null ) result = caseAssetInfo( bushingInfo );
            if( result == null ) result = caseIdentifiedObject( bushingInfo );
            if( result == null ) result = caseCimObjectWithID( bushingInfo );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.EXC_ST4B: {
            ExcST4B excST4B = ( ExcST4B ) theEObject;
            T result = caseExcST4B( excST4B );
            if( result == null ) result = caseExcitationSystemDynamics( excST4B );
            if( result == null ) result = caseDynamicsFunctionBlock( excST4B );
            if( result == null ) result = caseIdentifiedObject( excST4B );
            if( result == null ) result = caseCimObjectWithID( excST4B );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.ASSET_TEST_SAMPLE_TAKER: {
            AssetTestSampleTaker assetTestSampleTaker = ( AssetTestSampleTaker ) theEObject;
            T result = caseAssetTestSampleTaker( assetTestSampleTaker );
            if( result == null ) result = caseAssetOrganisationRole( assetTestSampleTaker );
            if( result == null ) result = caseOrganisationRole( assetTestSampleTaker );
            if( result == null ) result = caseIdentifiedObject( assetTestSampleTaker );
            if( result == null ) result = caseCimObjectWithID( assetTestSampleTaker );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.LEVEL_VS_VOLUME_CURVE: {
            LevelVsVolumeCurve levelVsVolumeCurve = ( LevelVsVolumeCurve ) theEObject;
            T result = caseLevelVsVolumeCurve( levelVsVolumeCurve );
            if( result == null ) result = caseCurve( levelVsVolumeCurve );
            if( result == null ) result = caseIdentifiedObject( levelVsVolumeCurve );
            if( result == null ) result = caseCimObjectWithID( levelVsVolumeCurve );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.PHASE_TAP_CHANGER_LINEAR: {
            PhaseTapChangerLinear phaseTapChangerLinear = ( PhaseTapChangerLinear ) theEObject;
            T result = casePhaseTapChangerLinear( phaseTapChangerLinear );
            if( result == null ) result = casePhaseTapChanger( phaseTapChangerLinear );
            if( result == null ) result = caseTapChanger( phaseTapChangerLinear );
            if( result == null ) result = casePowerSystemResource( phaseTapChangerLinear );
            if( result == null ) result = caseIdentifiedObject( phaseTapChangerLinear );
            if( result == null ) result = caseCimObjectWithID( phaseTapChangerLinear );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.DIAGRAM: {
            Diagram diagram = ( Diagram ) theEObject;
            T result = caseDiagram( diagram );
            if( result == null ) result = caseIdentifiedObject( diagram );
            if( result == null ) result = caseCimObjectWithID( diagram );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.READING_QUALITY_TYPE: {
            ReadingQualityType readingQualityType = ( ReadingQualityType ) theEObject;
            T result = caseReadingQualityType( readingQualityType );
            if( result == null ) result = caseIdentifiedObject( readingQualityType );
            if( result == null ) result = caseCimObjectWithID( readingQualityType );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.COM_MODULE: {
            ComModule comModule = ( ComModule ) theEObject;
            T result = caseComModule( comModule );
            if( result == null ) result = caseAsset( comModule );
            if( result == null ) result = caseIdentifiedObject( comModule );
            if( result == null ) result = caseCimObjectWithID( comModule );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.ACCUMULATOR_RESET: {
            AccumulatorReset accumulatorReset = ( AccumulatorReset ) theEObject;
            T result = caseAccumulatorReset( accumulatorReset );
            if( result == null ) result = caseControl( accumulatorReset );
            if( result == null ) result = caseIOPoint( accumulatorReset );
            if( result == null ) result = caseIdentifiedObject( accumulatorReset );
            if( result == null ) result = caseCimObjectWithID( accumulatorReset );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.TOOL: {
            Tool tool = ( Tool ) theEObject;
            T result = caseTool( tool );
            if( result == null ) result = caseWorkAsset( tool );
            if( result == null ) result = caseAsset( tool );
            if( result == null ) result = caseIdentifiedObject( tool );
            if( result == null ) result = caseCimObjectWithID( tool );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.COMMAND: {
            Command command = ( Command ) theEObject;
            T result = caseCommand( command );
            if( result == null ) result = caseControl( command );
            if( result == null ) result = caseIOPoint( command );
            if( result == null ) result = caseIdentifiedObject( command );
            if( result == null ) result = caseCimObjectWithID( command );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.EXC_BBC: {
            ExcBBC excBBC = ( ExcBBC ) theEObject;
            T result = caseExcBBC( excBBC );
            if( result == null ) result = caseExcitationSystemDynamics( excBBC );
            if( result == null ) result = caseDynamicsFunctionBlock( excBBC );
            if( result == null ) result = caseIdentifiedObject( excBBC );
            if( result == null ) result = caseCimObjectWithID( excBBC );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.DISCONTINUOUS_EXCITATION_CONTROL_USER_DEFINED: {
            DiscontinuousExcitationControlUserDefined discontinuousExcitationControlUserDefined = ( DiscontinuousExcitationControlUserDefined ) theEObject;
            T result = caseDiscontinuousExcitationControlUserDefined( discontinuousExcitationControlUserDefined );
            if( result == null )
                result = caseDiscontinuousExcitationControlDynamics( discontinuousExcitationControlUserDefined );
            if( result == null ) result = caseDynamicsFunctionBlock( discontinuousExcitationControlUserDefined );
            if( result == null ) result = caseIdentifiedObject( discontinuousExcitationControlUserDefined );
            if( result == null ) result = caseCimObjectWithID( discontinuousExcitationControlUserDefined );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.METER_WORK_TASK: {
            MeterWorkTask meterWorkTask = ( MeterWorkTask ) theEObject;
            T result = caseMeterWorkTask( meterWorkTask );
            if( result == null ) result = caseWorkTask( meterWorkTask );
            if( result == null ) result = caseBaseWork( meterWorkTask );
            if( result == null ) result = caseDocument( meterWorkTask );
            if( result == null ) result = caseIdentifiedObject( meterWorkTask );
            if( result == null ) result = caseCimObjectWithID( meterWorkTask );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.GEOGRAPHICAL_REGION: {
            GeographicalRegion geographicalRegion = ( GeographicalRegion ) theEObject;
            T result = caseGeographicalRegion( geographicalRegion );
            if( result == null ) result = caseIdentifiedObject( geographicalRegion );
            if( result == null ) result = caseCimObjectWithID( geographicalRegion );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.PSS_SB4: {
            PssSB4 pssSB4 = ( PssSB4 ) theEObject;
            T result = casePssSB4( pssSB4 );
            if( result == null ) result = casePowerSystemStabilizerDynamics( pssSB4 );
            if( result == null ) result = caseDynamicsFunctionBlock( pssSB4 );
            if( result == null ) result = caseIdentifiedObject( pssSB4 );
            if( result == null ) result = caseCimObjectWithID( pssSB4 );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.LOAD_MOTOR: {
            LoadMotor loadMotor = ( LoadMotor ) theEObject;
            T result = caseLoadMotor( loadMotor );
            if( result == null ) result = caseIdentifiedObject( loadMotor );
            if( result == null ) result = caseCimObjectWithID( loadMotor );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.DC_LINE_SEGMENT: {
            DCLineSegment dcLineSegment = ( DCLineSegment ) theEObject;
            T result = caseDCLineSegment( dcLineSegment );
            if( result == null ) result = caseDCConductingEquipment( dcLineSegment );
            if( result == null ) result = caseEquipment( dcLineSegment );
            if( result == null ) result = casePowerSystemResource( dcLineSegment );
            if( result == null ) result = caseIdentifiedObject( dcLineSegment );
            if( result == null ) result = caseCimObjectWithID( dcLineSegment );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.PFV_AR_TYPE2_IEEEPF_CONTROLLER: {
            PFVArType2IEEEPFController pfvArType2IEEEPFController = ( PFVArType2IEEEPFController ) theEObject;
            T result = casePFVArType2IEEEPFController( pfvArType2IEEEPFController );
            if( result == null ) result = casePFVArControllerType2Dynamics( pfvArType2IEEEPFController );
            if( result == null ) result = caseDynamicsFunctionBlock( pfvArType2IEEEPFController );
            if( result == null ) result = caseIdentifiedObject( pfvArType2IEEEPFController );
            if( result == null ) result = caseCimObjectWithID( pfvArType2IEEEPFController );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.PFV_AR_TYPE2_IEEEV_AR_CONTROLLER: {
            PFVArType2IEEEVArController pfvArType2IEEEVArController = ( PFVArType2IEEEVArController ) theEObject;
            T result = casePFVArType2IEEEVArController( pfvArType2IEEEVArController );
            if( result == null ) result = casePFVArControllerType2Dynamics( pfvArType2IEEEVArController );
            if( result == null ) result = caseDynamicsFunctionBlock( pfvArType2IEEEVArController );
            if( result == null ) result = caseIdentifiedObject( pfvArType2IEEEVArController );
            if( result == null ) result = caseCimObjectWithID( pfvArType2IEEEVArController );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.CASHIER_SHIFT: {
            CashierShift cashierShift = ( CashierShift ) theEObject;
            T result = caseCashierShift( cashierShift );
            if( result == null ) result = caseShift( cashierShift );
            if( result == null ) result = caseIdentifiedObject( cashierShift );
            if( result == null ) result = caseCimObjectWithID( cashierShift );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.STARTUP_MODEL: {
            StartupModel startupModel = ( StartupModel ) theEObject;
            T result = caseStartupModel( startupModel );
            if( result == null ) result = caseIdentifiedObject( startupModel );
            if( result == null ) result = caseCimObjectWithID( startupModel );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.ANALOG: {
            Analog analog = ( Analog ) theEObject;
            T result = caseAnalog( analog );
            if( result == null ) result = caseMeasurement( analog );
            if( result == null ) result = caseIdentifiedObject( analog );
            if( result == null ) result = caseCimObjectWithID( analog );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.REMOTE_POINT: {
            RemotePoint remotePoint = ( RemotePoint ) theEObject;
            T result = caseRemotePoint( remotePoint );
            if( result == null ) result = caseIdentifiedObject( remotePoint );
            if( result == null ) result = caseCimObjectWithID( remotePoint );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.DC_SHUNT: {
            DCShunt dcShunt = ( DCShunt ) theEObject;
            T result = caseDCShunt( dcShunt );
            if( result == null ) result = caseDCConductingEquipment( dcShunt );
            if( result == null ) result = caseEquipment( dcShunt );
            if( result == null ) result = casePowerSystemResource( dcShunt );
            if( result == null ) result = caseIdentifiedObject( dcShunt );
            if( result == null ) result = caseCimObjectWithID( dcShunt );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.VOLTAGE_LIMIT: {
            VoltageLimit voltageLimit = ( VoltageLimit ) theEObject;
            T result = caseVoltageLimit( voltageLimit );
            if( result == null ) result = caseOperationalLimit( voltageLimit );
            if( result == null ) result = caseIdentifiedObject( voltageLimit );
            if( result == null ) result = caseCimObjectWithID( voltageLimit );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.DC_CONVERTER_UNIT: {
            DCConverterUnit dcConverterUnit = ( DCConverterUnit ) theEObject;
            T result = caseDCConverterUnit( dcConverterUnit );
            if( result == null ) result = caseDCEquipmentContainer( dcConverterUnit );
            if( result == null ) result = caseEquipmentContainer( dcConverterUnit );
            if( result == null ) result = caseConnectivityNodeContainer( dcConverterUnit );
            if( result == null ) result = casePowerSystemResource( dcConverterUnit );
            if( result == null ) result = caseIdentifiedObject( dcConverterUnit );
            if( result == null ) result = caseCimObjectWithID( dcConverterUnit );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.DC_BREAKER: {
            DCBreaker dcBreaker = ( DCBreaker ) theEObject;
            T result = caseDCBreaker( dcBreaker );
            if( result == null ) result = caseDCSwitch( dcBreaker );
            if( result == null ) result = caseDCConductingEquipment( dcBreaker );
            if( result == null ) result = caseEquipment( dcBreaker );
            if( result == null ) result = casePowerSystemResource( dcBreaker );
            if( result == null ) result = caseIdentifiedObject( dcBreaker );
            if( result == null ) result = caseCimObjectWithID( dcBreaker );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.CABINET: {
            Cabinet cabinet = ( Cabinet ) theEObject;
            T result = caseCabinet( cabinet );
            if( result == null ) result = caseAssetContainer( cabinet );
            if( result == null ) result = caseAsset( cabinet );
            if( result == null ) result = caseIdentifiedObject( cabinet );
            if( result == null ) result = caseCimObjectWithID( cabinet );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.SYNCHRONOUS_MACHINE_SIMPLIFIED: {
            SynchronousMachineSimplified synchronousMachineSimplified = ( SynchronousMachineSimplified ) theEObject;
            T result = caseSynchronousMachineSimplified( synchronousMachineSimplified );
            if( result == null ) result = caseSynchronousMachineDynamics( synchronousMachineSimplified );
            if( result == null ) result = caseRotatingMachineDynamics( synchronousMachineSimplified );
            if( result == null ) result = caseDynamicsFunctionBlock( synchronousMachineSimplified );
            if( result == null ) result = caseIdentifiedObject( synchronousMachineSimplified );
            if( result == null ) result = caseCimObjectWithID( synchronousMachineSimplified );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.PSS_ELIN2: {
            PssELIN2 pssELIN2 = ( PssELIN2 ) theEObject;
            T result = casePssELIN2( pssELIN2 );
            if( result == null ) result = casePowerSystemStabilizerDynamics( pssELIN2 );
            if( result == null ) result = caseDynamicsFunctionBlock( pssELIN2 );
            if( result == null ) result = caseIdentifiedObject( pssELIN2 );
            if( result == null ) result = caseCimObjectWithID( pssELIN2 );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.GOV_STEAM_FV4: {
            GovSteamFV4 govSteamFV4 = ( GovSteamFV4 ) theEObject;
            T result = caseGovSteamFV4( govSteamFV4 );
            if( result == null ) result = caseTurbineGovernorDynamics( govSteamFV4 );
            if( result == null ) result = caseDynamicsFunctionBlock( govSteamFV4 );
            if( result == null ) result = caseIdentifiedObject( govSteamFV4 );
            if( result == null ) result = caseCimObjectWithID( govSteamFV4 );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.ASSET_TEST_LAB: {
            AssetTestLab assetTestLab = ( AssetTestLab ) theEObject;
            T result = caseAssetTestLab( assetTestLab );
            if( result == null ) result = caseAssetOrganisationRole( assetTestLab );
            if( result == null ) result = caseOrganisationRole( assetTestLab );
            if( result == null ) result = caseIdentifiedObject( assetTestLab );
            if( result == null ) result = caseCimObjectWithID( assetTestLab );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.ASSET_TEMPERATURE_PRESSURE_ANALOG: {
            AssetTemperaturePressureAnalog assetTemperaturePressureAnalog = ( AssetTemperaturePressureAnalog ) theEObject;
            T result = caseAssetTemperaturePressureAnalog( assetTemperaturePressureAnalog );
            if( result == null ) result = caseAssetAnalog( assetTemperaturePressureAnalog );
            if( result == null ) result = caseAnalog( assetTemperaturePressureAnalog );
            if( result == null ) result = caseMeasurement( assetTemperaturePressureAnalog );
            if( result == null ) result = caseIdentifiedObject( assetTemperaturePressureAnalog );
            if( result == null ) result = caseCimObjectWithID( assetTemperaturePressureAnalog );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.PROPRIETARY_PARAMETER_DYNAMICS: {
            ProprietaryParameterDynamics proprietaryParameterDynamics = ( ProprietaryParameterDynamics ) theEObject;
            T result = caseProprietaryParameterDynamics( proprietaryParameterDynamics );
            if( result == null ) result = caseCimObjectWithID( proprietaryParameterDynamics );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.BASE_FREQUENCY: {
            BaseFrequency baseFrequency = ( BaseFrequency ) theEObject;
            T result = caseBaseFrequency( baseFrequency );
            if( result == null ) result = caseIdentifiedObject( baseFrequency );
            if( result == null ) result = caseCimObjectWithID( baseFrequency );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.MAINTENANCE_LOCATION: {
            MaintenanceLocation maintenanceLocation = ( MaintenanceLocation ) theEObject;
            T result = caseMaintenanceLocation( maintenanceLocation );
            if( result == null ) result = caseWorkLocation( maintenanceLocation );
            if( result == null ) result = caseLocation( maintenanceLocation );
            if( result == null ) result = caseIdentifiedObject( maintenanceLocation );
            if( result == null ) result = caseCimObjectWithID( maintenanceLocation );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.RAISE_LOWER_COMMAND: {
            RaiseLowerCommand raiseLowerCommand = ( RaiseLowerCommand ) theEObject;
            T result = caseRaiseLowerCommand( raiseLowerCommand );
            if( result == null ) result = caseAnalogControl( raiseLowerCommand );
            if( result == null ) result = caseControl( raiseLowerCommand );
            if( result == null ) result = caseIOPoint( raiseLowerCommand );
            if( result == null ) result = caseIdentifiedObject( raiseLowerCommand );
            if( result == null ) result = caseCimObjectWithID( raiseLowerCommand );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.EXC_ELIN2: {
            ExcELIN2 excELIN2 = ( ExcELIN2 ) theEObject;
            T result = caseExcELIN2( excELIN2 );
            if( result == null ) result = caseExcitationSystemDynamics( excELIN2 );
            if( result == null ) result = caseDynamicsFunctionBlock( excELIN2 );
            if( result == null ) result = caseIdentifiedObject( excELIN2 );
            if( result == null ) result = caseCimObjectWithID( excELIN2 );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.BILATERAL_EXCHANGE_AGREEMENT: {
            BilateralExchangeAgreement bilateralExchangeAgreement = ( BilateralExchangeAgreement ) theEObject;
            T result = caseBilateralExchangeAgreement( bilateralExchangeAgreement );
            if( result == null ) result = caseIdentifiedObject( bilateralExchangeAgreement );
            if( result == null ) result = caseCimObjectWithID( bilateralExchangeAgreement );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.WIND_PLANT_USER_DEFINED: {
            WindPlantUserDefined windPlantUserDefined = ( WindPlantUserDefined ) theEObject;
            T result = caseWindPlantUserDefined( windPlantUserDefined );
            if( result == null ) result = caseWindPlantDynamics( windPlantUserDefined );
            if( result == null ) result = caseDynamicsFunctionBlock( windPlantUserDefined );
            if( result == null ) result = caseIdentifiedObject( windPlantUserDefined );
            if( result == null ) result = caseCimObjectWithID( windPlantUserDefined );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.GOV_HYDRO_FRANCIS: {
            GovHydroFrancis govHydroFrancis = ( GovHydroFrancis ) theEObject;
            T result = caseGovHydroFrancis( govHydroFrancis );
            if( result == null ) result = caseTurbineGovernorDynamics( govHydroFrancis );
            if( result == null ) result = caseDynamicsFunctionBlock( govHydroFrancis );
            if( result == null ) result = caseIdentifiedObject( govHydroFrancis );
            if( result == null ) result = caseCimObjectWithID( govHydroFrancis );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.WIND_CONT_PTYPE4B_IEC: {
            WindContPType4bIEC windContPType4bIEC = ( WindContPType4bIEC ) theEObject;
            T result = caseWindContPType4bIEC( windContPType4bIEC );
            if( result == null ) result = caseIdentifiedObject( windContPType4bIEC );
            if( result == null ) result = caseCimObjectWithID( windContPType4bIEC );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.CONDUCTOR: {
            Conductor conductor = ( Conductor ) theEObject;
            T result = caseConductor( conductor );
            if( result == null ) result = caseConductingEquipment( conductor );
            if( result == null ) result = caseEquipment( conductor );
            if( result == null ) result = casePowerSystemResource( conductor );
            if( result == null ) result = caseIdentifiedObject( conductor );
            if( result == null ) result = caseCimObjectWithID( conductor );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.FREQUENCY_CONVERTER: {
            FrequencyConverter frequencyConverter = ( FrequencyConverter ) theEObject;
            T result = caseFrequencyConverter( frequencyConverter );
            if( result == null ) result = caseRegulatingCondEq( frequencyConverter );
            if( result == null ) result = caseEnergyConnection( frequencyConverter );
            if( result == null ) result = caseConductingEquipment( frequencyConverter );
            if( result == null ) result = caseEquipment( frequencyConverter );
            if( result == null ) result = casePowerSystemResource( frequencyConverter );
            if( result == null ) result = caseIdentifiedObject( frequencyConverter );
            if( result == null ) result = caseCimObjectWithID( frequencyConverter );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.EXC_IEEEAC2A: {
            ExcIEEEAC2A excIEEEAC2A = ( ExcIEEEAC2A ) theEObject;
            T result = caseExcIEEEAC2A( excIEEEAC2A );
            if( result == null ) result = caseExcitationSystemDynamics( excIEEEAC2A );
            if( result == null ) result = caseDynamicsFunctionBlock( excIEEEAC2A );
            if( result == null ) result = caseIdentifiedObject( excIEEEAC2A );
            if( result == null ) result = caseCimObjectWithID( excIEEEAC2A );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.EXC_IEEEST3A: {
            ExcIEEEST3A excIEEEST3A = ( ExcIEEEST3A ) theEObject;
            T result = caseExcIEEEST3A( excIEEEST3A );
            if( result == null ) result = caseExcitationSystemDynamics( excIEEEST3A );
            if( result == null ) result = caseDynamicsFunctionBlock( excIEEEST3A );
            if( result == null ) result = caseIdentifiedObject( excIEEEST3A );
            if( result == null ) result = caseCimObjectWithID( excIEEEST3A );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.PSS1: {
            Pss1 pss1 = ( Pss1 ) theEObject;
            T result = casePss1( pss1 );
            if( result == null ) result = casePowerSystemStabilizerDynamics( pss1 );
            if( result == null ) result = caseDynamicsFunctionBlock( pss1 );
            if( result == null ) result = caseIdentifiedObject( pss1 );
            if( result == null ) result = caseCimObjectWithID( pss1 );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.TAG_ACTION: {
            TagAction tagAction = ( TagAction ) theEObject;
            T result = caseTagAction( tagAction );
            if( result == null ) result = caseSwitchingStep( tagAction );
            if( result == null ) result = caseCimObjectWithID( tagAction );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.MEASUREMENT_VALUE_QUALITY: {
            MeasurementValueQuality measurementValueQuality = ( MeasurementValueQuality ) theEObject;
            T result = caseMeasurementValueQuality( measurementValueQuality );
            if( result == null ) result = caseQuality61850( measurementValueQuality );
            if( result == null ) result = caseCimObjectWithID( measurementValueQuality );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.TRANSACTOR: {
            Transactor transactor = ( Transactor ) theEObject;
            T result = caseTransactor( transactor );
            if( result == null ) result = caseIdentifiedObject( transactor );
            if( result == null ) result = caseCimObjectWithID( transactor );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.ANALOG_LIMIT_SET: {
            AnalogLimitSet analogLimitSet = ( AnalogLimitSet ) theEObject;
            T result = caseAnalogLimitSet( analogLimitSet );
            if( result == null ) result = caseLimitSet( analogLimitSet );
            if( result == null ) result = caseIdentifiedObject( analogLimitSet );
            if( result == null ) result = caseCimObjectWithID( analogLimitSet );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.MERCHANT_ACCOUNT: {
            MerchantAccount merchantAccount = ( MerchantAccount ) theEObject;
            T result = caseMerchantAccount( merchantAccount );
            if( result == null ) result = caseDocument( merchantAccount );
            if( result == null ) result = caseIdentifiedObject( merchantAccount );
            if( result == null ) result = caseCimObjectWithID( merchantAccount );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.OBJECT_CREATION: {
            ObjectCreation objectCreation = ( ObjectCreation ) theEObject;
            T result = caseObjectCreation( objectCreation );
            if( result == null ) result = caseChangeSetMember( objectCreation );
            if( result == null ) result = caseDataSetMember( objectCreation );
            if( result == null ) result = caseIdentifiedObject( objectCreation );
            if( result == null ) result = caseCimObjectWithID( objectCreation );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.SUPERCRITICAL: {
            Supercritical supercritical = ( Supercritical ) theEObject;
            T result = caseSupercritical( supercritical );
            if( result == null ) result = caseFossilSteamSupply( supercritical );
            if( result == null ) result = caseSteamSupply( supercritical );
            if( result == null ) result = casePowerSystemResource( supercritical );
            if( result == null ) result = caseIdentifiedObject( supercritical );
            if( result == null ) result = caseCimObjectWithID( supercritical );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.COM_MEDIA: {
            ComMedia comMedia = ( ComMedia ) theEObject;
            T result = caseComMedia( comMedia );
            if( result == null ) result = caseAsset( comMedia );
            if( result == null ) result = caseIdentifiedObject( comMedia );
            if( result == null ) result = caseCimObjectWithID( comMedia );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.ASYNCHRONOUS_MACHINE: {
            AsynchronousMachine asynchronousMachine = ( AsynchronousMachine ) theEObject;
            T result = caseAsynchronousMachine( asynchronousMachine );
            if( result == null ) result = caseRotatingMachine( asynchronousMachine );
            if( result == null ) result = caseRegulatingCondEq( asynchronousMachine );
            if( result == null ) result = caseEnergyConnection( asynchronousMachine );
            if( result == null ) result = caseConductingEquipment( asynchronousMachine );
            if( result == null ) result = caseEquipment( asynchronousMachine );
            if( result == null ) result = casePowerSystemResource( asynchronousMachine );
            if( result == null ) result = caseIdentifiedObject( asynchronousMachine );
            if( result == null ) result = caseCimObjectWithID( asynchronousMachine );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.LOAD_GROUP: {
            LoadGroup loadGroup = ( LoadGroup ) theEObject;
            T result = caseLoadGroup( loadGroup );
            if( result == null ) result = caseIdentifiedObject( loadGroup );
            if( result == null ) result = caseCimObjectWithID( loadGroup );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.EQUIVALENT_NETWORK: {
            EquivalentNetwork equivalentNetwork = ( EquivalentNetwork ) theEObject;
            T result = caseEquivalentNetwork( equivalentNetwork );
            if( result == null ) result = caseConnectivityNodeContainer( equivalentNetwork );
            if( result == null ) result = casePowerSystemResource( equivalentNetwork );
            if( result == null ) result = caseIdentifiedObject( equivalentNetwork );
            if( result == null ) result = caseCimObjectWithID( equivalentNetwork );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case CimPackage.ENERGY_AREA: {
            EnergyArea energyArea = ( EnergyArea ) theEObject;
            T result = caseEnergyArea( energyArea );
            if( result == null ) result = caseIdentifiedObject( energyArea );
            if( result == null ) result = caseCimObjectWithID( energyArea );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        default:
            return defaultCase( theEObject );
        }
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Object With ID</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Object With ID</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCimObjectWithID( CimObjectWithID object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>ISO Standard</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>ISO Standard</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseISOStandard( ISOStandard object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Date Interval</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Date Interval</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDateInterval( DateInterval object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Date Time Interval</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Date Time Interval</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDateTimeInterval( DateTimeInterval object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Laborelec Standard</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Laborelec Standard</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseLaborelecStandard( LaborelecStandard object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Deployment Date</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Deployment Date</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDeploymentDate( DeploymentDate object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Priority</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Priority</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePriority( Priority object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Street Detail</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Street Detail</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseStreetDetail( StreetDetail object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Due</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Due</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDue( Due object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Rational Number</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Rational Number</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseRationalNumber( RationalNumber object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>DIN Standard</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>DIN Standard</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDINStandard( DINStandard object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>String Quantity</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>String Quantity</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseStringQuantity( StringQuantity object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Reading Interharmonic</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Reading Interharmonic</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseReadingInterharmonic( ReadingInterharmonic object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>WEP Standard</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>WEP Standard</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseWEPStandard( WEPStandard object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Remote Connect Disconnect Info</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Remote Connect Disconnect Info</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseRemoteConnectDisconnectInfo( RemoteConnectDisconnectInfo object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>End Device Capability</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>End Device Capability</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseEndDeviceCapability( EndDeviceCapability object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Decimal Quantity</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Decimal Quantity</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDecimalQuantity( DecimalQuantity object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Status</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Status</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseStatus( Status object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Doble Standard</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Doble Standard</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDobleStandard( DobleStandard object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>EPA Standard</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>EPA Standard</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseEPAStandard( EPAStandard object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Month Day Interval</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Month Day Interval</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseMonthDayInterval( MonthDayInterval object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>UK Ministry Of Defence Standard</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>UK Ministry Of Defence Standard</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseUKMinistryOfDefenceStandard( UKMinistryOfDefenceStandard object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Electronic Address</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Electronic Address</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseElectronicAddress( ElectronicAddress object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Controlled Appliance</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Controlled Appliance</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseControlledAppliance( ControlledAppliance object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Fault Impedance</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Fault Impedance</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseFaultImpedance( FaultImpedance object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Lifecycle Date</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Lifecycle Date</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseLifecycleDate( LifecycleDate object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>TAPPI Standard</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>TAPPI Standard</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTAPPIStandard( TAPPIStandard object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Version</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Version</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseVersion( Version object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Integer Quantity</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Integer Quantity</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseIntegerQuantity( IntegerQuantity object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Telephone Number</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Telephone Number</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTelephoneNumber( TelephoneNumber object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Service Point Outage Summary</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Service Point Outage Summary</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseServicePointOutageSummary( ServicePointOutageSummary object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Bank Account Detail</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Bank Account Detail</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseBankAccountDetail( BankAccountDetail object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Town Detail</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Town Detail</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTownDetail( TownDetail object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>IEC Standard</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>IEC Standard</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseIECStandard( IECStandard object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Time Interval</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Time Interval</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTimeInterval( TimeInterval object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>IEEE Standard</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>IEEE Standard</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseIEEEStandard( IEEEStandard object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>In Use Date</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>In Use Date</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseInUseDate( InUseDate object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>ASTM Standard</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>ASTM Standard</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseASTMStandard( ASTMStandard object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Account Movement</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Account Movement</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAccountMovement( AccountMovement object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Accounting Unit</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Accounting Unit</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAccountingUnit( AccountingUnit object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>CIGRE Standard</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>CIGRE Standard</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCIGREStandard( CIGREStandard object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Float Quantity</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Float Quantity</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseFloatQuantity( FloatQuantity object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Acceptance Test</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Acceptance Test</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAcceptanceTest( AcceptanceTest object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Extension Item</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Extension Item</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseExtensionItem( ExtensionItem object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Line Detail</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Line Detail</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseLineDetail( LineDetail object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Street Address</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Street Address</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseStreetAddress( StreetAddress object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Extensions List</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Extensions List</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseExtensionsList( ExtensionsList object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>End Device Timing</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>End Device Timing</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseEndDeviceTiming( EndDeviceTiming object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Analytic Score</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Analytic Score</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAnalyticScore( AnalyticScore object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Service Location</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Service Location</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseServiceLocation( ServiceLocation object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Hydro Pump Op Schedule</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Hydro Pump Op Schedule</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseHydroPumpOpSchedule( HydroPumpOpSchedule object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Outage</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Outage</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseOutage( Outage object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Regular Time Point</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Regular Time Point</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseRegularTimePoint( RegularTimePoint object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Change Set Member</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Change Set Member</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseChangeSetMember( ChangeSetMember object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Position Point</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Position Point</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePositionPoint( PositionPoint object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Nonlinear Shunt Compensator Point</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Nonlinear Shunt Compensator Point</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseNonlinearShuntCompensatorPoint( NonlinearShuntCompensatorPoint object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Parent Organization</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Parent Organization</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseParentOrganization( ParentOrganization object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Synchronous Machine User Defined</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Synchronous Machine User Defined</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSynchronousMachineUserDefined( SynchronousMachineUserDefined object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Sensor</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Sensor</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSensor( Sensor object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Sub Load Area</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Sub Load Area</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSubLoadArea( SubLoadArea object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Operating Share</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Operating Share</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseOperatingShare( OperatingShare object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Synchronous Machine Equivalent Circuit</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Synchronous Machine Equivalent Circuit</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSynchronousMachineEquivalentCircuit( SynchronousMachineEquivalentCircuit object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Conform Load Schedule</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Conform Load Schedule</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseConformLoadSchedule( ConformLoadSchedule object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Agreement</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Agreement</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAgreement( Agreement object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Power System Resource</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Power System Resource</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePowerSystemResource( PowerSystemResource object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Operating Participant</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Operating Participant</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseOperatingParticipant( OperatingParticipant object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Limit Set</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Limit Set</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseLimitSet( LimitSet object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>No Load Test</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>No Load Test</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseNoLoadTest( NoLoadTest object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Switch Schedule</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Switch Schedule</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSwitchSchedule( SwitchSchedule object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Jumper</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Jumper</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseJumper( Jumper object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Exc ST6B</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Exc ST6B</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseExcST6B( ExcST6B object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Exc IEEEAC5A</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Exc IEEEAC5A</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseExcIEEEAC5A( ExcIEEEAC5A object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Overhead Wire Info</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Overhead Wire Info</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseOverheadWireInfo( OverheadWireInfo object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Combined Cycle Plant</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Combined Cycle Plant</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCombinedCyclePlant( CombinedCyclePlant object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Control</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Control</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseControl( Control object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Instance Set</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Instance Set</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseInstanceSet( InstanceSet object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Open Circuit Test</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Open Circuit Test</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseOpenCircuitTest( OpenCircuitTest object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Measurement</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Measurement</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseMeasurement( Measurement object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>End Device Action</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>End Device Action</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseEndDeviceAction( EndDeviceAction object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Charge</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Charge</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCharge( Charge object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Lab Test Data Set</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Lab Test Data Set</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseLabTestDataSet( LabTestDataSet object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Operation Person Role</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Operation Person Role</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseOperationPersonRole( OperationPersonRole object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Heat Rate Curve</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Heat Rate Curve</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseHeatRateCurve( HeatRateCurve object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Wind Gen Turbine Type1b IEC</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Wind Gen Turbine Type1b IEC</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseWindGenTurbineType1bIEC( WindGenTurbineType1bIEC object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Asset Health Event</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Asset Health Event</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAssetHealthEvent( AssetHealthEvent object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Connectivity Node Container</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Connectivity Node Container</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseConnectivityNodeContainer( ConnectivityNodeContainer object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Wire Info</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Wire Info</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseWireInfo( WireInfo object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Turbine Governor User Defined</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Turbine Governor User Defined</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTurbineGovernorUserDefined( TurbineGovernorUserDefined object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Fault Indicator</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Fault Indicator</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseFaultIndicator( FaultIndicator object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Gov Hydro IEEE0</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Gov Hydro IEEE0</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseGovHydroIEEE0( GovHydroIEEE0 object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Phase Impedance Data</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Phase Impedance Data</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePhaseImpedanceData( PhaseImpedanceData object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Turbine Governor Dynamics</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Turbine Governor Dynamics</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTurbineGovernorDynamics( TurbineGovernorDynamics object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Maintenance Work Task</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Maintenance Work Task</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseMaintenanceWorkTask( MaintenanceWorkTask object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>IP Access Point</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>IP Access Point</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseIPAccessPoint( IPAccessPoint object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Equivalent Branch</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Equivalent Branch</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseEquivalentBranch( EquivalentBranch object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Battery Unit</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Battery Unit</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseBatteryUnit( BatteryUnit object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Analog Limit</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Analog Limit</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAnalogLimit( AnalogLimit object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Name Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Name Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseNameType( NameType object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Power Electronics Unit</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Power Electronics Unit</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePowerElectronicsUnit( PowerElectronicsUnit object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Exc IEEEDC2A</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Exc IEEEDC2A</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseExcIEEEDC2A( ExcIEEEDC2A object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Analytic</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Analytic</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAnalytic( Analytic object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Name</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Name</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseName( Name object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Rotating Machine Dynamics</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Rotating Machine Dynamics</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseRotatingMachineDynamics( RotatingMachineDynamics object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Combustion Turbine</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Combustion Turbine</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCombustionTurbine( CombustionTurbine object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Register</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Register</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseRegister( Register object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Oil Analysis Metals Analog</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Oil Analysis Metals Analog</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseOilAnalysisMetalsAnalog( OilAnalysisMetalsAnalog object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Operational Restriction</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Operational Restriction</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseOperationalRestriction( OperationalRestriction object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Clamp</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Clamp</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseClamp( Clamp object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Financial Info</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Financial Info</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseFinancialInfo( FinancialInfo object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Ground</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Ground</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseGround( Ground object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Day Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Day Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDayType( DayType object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Exc DC2A</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Exc DC2A</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseExcDC2A( ExcDC2A object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Operating Mechanism</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Operating Mechanism</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseOperatingMechanism( OperatingMechanism object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Generating Unit</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Generating Unit</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseGeneratingUnit( GeneratingUnit object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Wind Type1or2 User Defined</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Wind Type1or2 User Defined</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseWindType1or2UserDefined( WindType1or2UserDefined object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Health Score</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Health Score</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseHealthScore( HealthScore object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Base Work</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Base Work</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseBaseWork( BaseWork object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Receipt</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Receipt</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseReceipt( Receipt object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Periodic Statistical Calculation</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Periodic Statistical Calculation</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePeriodicStatisticalCalculation( PeriodicStatisticalCalculation object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Line</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Line</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseLine( Line object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Wind Turbine Type4a IEC</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Wind Turbine Type4a IEC</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseWindTurbineType4aIEC( WindTurbineType4aIEC object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Oil Analysis PCB Discrete</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Oil Analysis PCB Discrete</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseOilAnalysisPCBDiscrete( OilAnalysisPCBDiscrete object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Scheduled Event</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Scheduled Event</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseScheduledEvent( ScheduledEvent object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Pss5</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Pss5</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePss5( Pss5 object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Short Circuit Test</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Short Circuit Test</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseShortCircuitTest( ShortCircuitTest object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Risk Score</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Risk Score</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseRiskScore( RiskScore object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Exc SCRX</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Exc SCRX</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseExcSCRX( ExcSCRX object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Voltage Adjuster Dynamics</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Voltage Adjuster Dynamics</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseVoltageAdjusterDynamics( VoltageAdjusterDynamics object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Time Point</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Time Point</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTimePoint( TimePoint object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Remote Source</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Remote Source</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseRemoteSource( RemoteSource object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Gov Hydro WPID</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Gov Hydro WPID</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseGovHydroWPID( GovHydroWPID object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Gov Hydro IEEE2</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Gov Hydro IEEE2</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseGovHydroIEEE2( GovHydroIEEE2 object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Requested Capability</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Requested Capability</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseRequestedCapability( RequestedCapability object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Failure Event</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Failure Event</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseFailureEvent( FailureEvent object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>AC Line Segment</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>AC Line Segment</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseACLineSegment( ACLineSegment object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Active Power Limit</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Active Power Limit</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseActivePowerLimit( ActivePowerLimit object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Tap Changer Info</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Tap Changer Info</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTapChangerInfo( TapChangerInfo object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Synchronous Machine Time Constant Reactance</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Synchronous Machine Time Constant Reactance</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSynchronousMachineTimeConstantReactance( SynchronousMachineTimeConstantReactance object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Point Of Sale</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Point Of Sale</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePointOfSale( PointOfSale object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>DC Topological Node</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>DC Topological Node</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDCTopologicalNode( DCTopologicalNode object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Exc IEEEAC8B</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Exc IEEEAC8B</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseExcIEEEAC8B( ExcIEEEAC8B object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Per Length DC Line Parameter</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Per Length DC Line Parameter</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePerLengthDCLineParameter( PerLengthDCLineParameter object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Discrete</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Discrete</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDiscrete( Discrete object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Ratio Tap Changer</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Ratio Tap Changer</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseRatioTapChanger( RatioTapChanger object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Structure</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Structure</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseStructure( Structure object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Product Asset Model</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Product Asset Model</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseProductAssetModel( ProductAssetModel object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Exc DC3A1</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Exc DC3A1</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseExcDC3A1( ExcDC3A1 object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Wind Gen Turbine Type1a IEC</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Wind Gen Turbine Type1a IEC</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseWindGenTurbineType1aIEC( WindGenTurbineType1aIEC object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Exc IEEEST5B</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Exc IEEEST5B</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseExcIEEEST5B( ExcIEEEST5B object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Load User Defined</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Load User Defined</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseLoadUserDefined( LoadUserDefined object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Exc IEEEDC4B</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Exc IEEEDC4B</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseExcIEEEDC4B( ExcIEEEDC4B object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Value Alias Set</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Value Alias Set</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseValueAliasSet( ValueAliasSet object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Tariff Profile</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Tariff Profile</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTariffProfile( TariffProfile object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Terminal</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Terminal</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTerminal( Terminal object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Approver</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Approver</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseApprover( Approver object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Generic Data Set Version</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Generic Data Set Version</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseGenericDataSetVersion( GenericDataSetVersion object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Nonlinear Shunt Compensator</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Nonlinear Shunt Compensator</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseNonlinearShuntCompensator( NonlinearShuntCompensator object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Pan Demand Response</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Pan Demand Response</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePanDemandResponse( PanDemandResponse object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Shunt Compensator</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Shunt Compensator</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseShuntCompensator( ShuntCompensator object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Maintenance Data Set</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Maintenance Data Set</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseMaintenanceDataSet( MaintenanceDataSet object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Underexc Lim X1</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Underexc Lim X1</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseUnderexcLimX1( UnderexcLimX1 object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Organisation Role</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Organisation Role</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseOrganisationRole( OrganisationRole object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Gov Steam IEEE1</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Gov Steam IEEE1</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseGovSteamIEEE1( GovSteamIEEE1 object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>DC Equipment Container</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>DC Equipment Container</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDCEquipmentContainer( DCEquipmentContainer object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Pss SH</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Pss SH</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePssSH( PssSH object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Reporting Super Group</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Reporting Super Group</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseReportingSuperGroup( ReportingSuperGroup object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Vs Converter</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Vs Converter</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseVsConverter( VsConverter object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Wind Cont Curr Lim IEC</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Wind Cont Curr Lim IEC</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseWindContCurrLimIEC( WindContCurrLimIEC object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Exc DC3A</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Exc DC3A</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseExcDC3A( ExcDC3A object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>String Measurement</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>String Measurement</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseStringMeasurement( StringMeasurement object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Gov Steam FV3</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Gov Steam FV3</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseGovSteamFV3( GovSteamFV3 object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Merchant Agreement</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Merchant Agreement</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseMerchantAgreement( MerchantAgreement object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Exc IEEEST4B</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Exc IEEEST4B</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseExcIEEEST4B( ExcIEEEST4B object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>End Device Info</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>End Device Info</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseEndDeviceInfo( EndDeviceInfo object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Load Aggregate</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Load Aggregate</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseLoadAggregate( LoadAggregate object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Inspection Analog</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Inspection Analog</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseInspectionAnalog( InspectionAnalog object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Underexcitation Limiter Dynamics</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Underexcitation Limiter Dynamics</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseUnderexcitationLimiterDynamics( UnderexcitationLimiterDynamics object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Nonlinear Shunt Compensator Phase Point</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Nonlinear Shunt Compensator Phase Point</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseNonlinearShuntCompensatorPhasePoint( NonlinearShuntCompensatorPhasePoint object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Shunt Compensator Info</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Shunt Compensator Info</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseShuntCompensatorInfo( ShuntCompensatorInfo object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Asset Location Hazard</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Asset Location Hazard</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAssetLocationHazard( AssetLocationHazard object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Asset String Measurement</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Asset String Measurement</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAssetStringMeasurement( AssetStringMeasurement object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>VComp IEEE Type2</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>VComp IEEE Type2</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseVCompIEEEType2( VCompIEEEType2 object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Exc IEEEST7B</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Exc IEEEST7B</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseExcIEEEST7B( ExcIEEEST7B object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Transformer End</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Transformer End</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTransformerEnd( TransformerEnd object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Instance Set Member</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Instance Set Member</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseInstanceSetMember( InstanceSetMember object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Exc IEEEAC6A</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Exc IEEEAC6A</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseExcIEEEAC6A( ExcIEEEAC6A object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Inspection Discrete</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Inspection Discrete</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseInspectionDiscrete( InspectionDiscrete object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Pricing Structure</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Pricing Structure</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePricingStructure( PricingStructure object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>DER Group Dispatch</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>DER Group Dispatch</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDERGroupDispatch( DERGroupDispatch object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Material Item</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Material Item</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseMaterialItem( MaterialItem object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Composite Switch</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Composite Switch</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCompositeSwitch( CompositeSwitch object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Asset Deployment</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Asset Deployment</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAssetDeployment( AssetDeployment object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Oil Analysis Particle Analog</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Oil Analysis Particle Analog</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseOilAnalysisParticleAnalog( OilAnalysisParticleAnalog object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Calculation Method Order</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Calculation Method Order</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCalculationMethodOrder( CalculationMethodOrder object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Exc IEEEAC1A</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Exc IEEEAC1A</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseExcIEEEAC1A( ExcIEEEAC1A object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Wind Gen Type3b IEC</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Wind Gen Type3b IEC</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseWindGenType3bIEC( WindGenType3bIEC object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Incident</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Incident</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseIncident( Incident object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Overexc Lim X1</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Overexc Lim X1</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseOverexcLimX1( OverexcLimX1 object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Asset Organisation Role</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Asset Organisation Role</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAssetOrganisationRole( AssetOrganisationRole object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Location</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Location</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseLocation( Location object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Work Task</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Work Task</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseWorkTask( WorkTask object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Exc AC8B</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Exc AC8B</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseExcAC8B( ExcAC8B object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Gov Steam FV2</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Gov Steam FV2</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseGovSteamFV2( GovSteamFV2 object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>DC Chopper</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>DC Chopper</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDCChopper( DCChopper object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Cheque</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Cheque</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCheque( Cheque object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>VAdj IEEE</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>VAdj IEEE</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseVAdjIEEE( VAdjIEEE object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Reading Quality</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Reading Quality</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseReadingQuality( ReadingQuality object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Grounding Impedance</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Grounding Impedance</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseGroundingImpedance( GroundingImpedance object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Interval Block</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Interval Block</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseIntervalBlock( IntervalBlock object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Energy Connection</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Energy Connection</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseEnergyConnection( EnergyConnection object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Streetlight</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Streetlight</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseStreetlight( Streetlight object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Wind Gen Type3 IEC</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Wind Gen Type3 IEC</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseWindGenType3IEC( WindGenType3IEC object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>DC Conducting Equipment</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>DC Conducting Equipment</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDCConductingEquipment( DCConductingEquipment object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Asynchronous Machine User Defined</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Asynchronous Machine User Defined</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAsynchronousMachineUserDefined( AsynchronousMachineUserDefined object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Predictions</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Predictions</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePredictions( Predictions object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Pss IEEE1A</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Pss IEEE1A</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePssIEEE1A( PssIEEE1A object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>End Device Control Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>End Device Control Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseEndDeviceControlType( EndDeviceControlType object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Operating Mechanism Info</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Operating Mechanism Info</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseOperatingMechanismInfo( OperatingMechanismInfo object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Oil Analysis Gas Analog</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Oil Analysis Gas Analog</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseOilAnalysisGasAnalog( OilAnalysisGasAnalog object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Oil Analysis PCB Analog</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Oil Analysis PCB Analog</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseOilAnalysisPCBAnalog( OilAnalysisPCBAnalog object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Mutual Coupling</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Mutual Coupling</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseMutualCoupling( MutualCoupling object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Other Capability</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Other Capability</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseOtherCapability( OtherCapability object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Accumulator</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Accumulator</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAccumulator( Accumulator object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Gov CT1</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Gov CT1</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseGovCT1( GovCT1 object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Wire Spacing</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Wire Spacing</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseWireSpacing( WireSpacing object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Wind Mech IEC</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Wind Mech IEC</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseWindMechIEC( WindMechIEC object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Wind Cont PType4a IEC</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Wind Cont PType4a IEC</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseWindContPType4aIEC( WindContPType4aIEC object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>ACDC Converter DC Terminal</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>ACDC Converter DC Terminal</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseACDCConverterDCTerminal( ACDCConverterDCTerminal object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Customer Notification</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Customer Notification</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCustomerNotification( CustomerNotification object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Communication Link</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Communication Link</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCommunicationLink( CommunicationLink object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Asset Owner</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Asset Owner</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAssetOwner( AssetOwner object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Gov Hydro Pelton</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Gov Hydro Pelton</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseGovHydroPelton( GovHydroPelton object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Wind Turbine Type1or2 IEC</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Wind Turbine Type1or2 IEC</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseWindTurbineType1or2IEC( WindTurbineType1or2IEC object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Maintainer</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Maintainer</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseMaintainer( Maintainer object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Overexcitation Limiter User Defined</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Overexcitation Limiter User Defined</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseOverexcitationLimiterUserDefined( OverexcitationLimiterUserDefined object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>PFV Ar Controller Type2 Dynamics</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>PFV Ar Controller Type2 Dynamics</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePFVArControllerType2Dynamics( PFVArControllerType2Dynamics object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Regular Interval Schedule</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Regular Interval Schedule</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseRegularIntervalSchedule( RegularIntervalSchedule object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Exc IEEEDC3A</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Exc IEEEDC3A</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseExcIEEEDC3A( ExcIEEEDC3A object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Load Area</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Load Area</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseLoadArea( LoadArea object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Disc Exc Cont IEEEDEC3A</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Disc Exc Cont IEEEDEC3A</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDiscExcContIEEEDEC3A( DiscExcContIEEEDEC3A object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Account Notification</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Account Notification</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAccountNotification( AccountNotification object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Exc CZ</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Exc CZ</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseExcCZ( ExcCZ object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Operational Limit Set</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Operational Limit Set</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseOperationalLimitSet( OperationalLimitSet object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Dynamics Function Block</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Dynamics Function Block</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDynamicsFunctionBlock( DynamicsFunctionBlock object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Seal</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Seal</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSeal( Seal object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Safety Document</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Safety Document</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSafetyDocument( SafetyDocument object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Gov CT2</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Gov CT2</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseGovCT2( GovCT2 object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Wind Cont Pitch Angle IEC</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Wind Cont Pitch Angle IEC</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseWindContPitchAngleIEC( WindContPitchAngleIEC object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Wind Plant Reactive Control IEC</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Wind Plant Reactive Control IEC</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseWindPlantReactiveControlIEC( WindPlantReactiveControlIEC object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Tap Changer Table Point</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Tap Changer Table Point</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTapChangerTablePoint( TapChangerTablePoint object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Contingency Equipment</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Contingency Equipment</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseContingencyEquipment( ContingencyEquipment object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Wind Gen Turbine Type2 IEC</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Wind Gen Turbine Type2 IEC</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseWindGenTurbineType2IEC( WindGenTurbineType2IEC object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Provided Bilateral Point</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Provided Bilateral Point</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseProvidedBilateralPoint( ProvidedBilateralPoint object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Per Length Line Parameter</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Per Length Line Parameter</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePerLengthLineParameter( PerLengthLineParameter object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Earth Fault Compensator</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Earth Fault Compensator</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseEarthFaultCompensator( EarthFaultCompensator object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Equipment Container</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Equipment Container</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseEquipmentContainer( EquipmentContainer object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Hazard</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Hazard</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseHazard( Hazard object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Asset Info</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Asset Info</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAssetInfo( AssetInfo object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>ACDC Terminal</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>ACDC Terminal</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseACDCTerminal( ACDCTerminal object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Pss IEEE2B</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Pss IEEE2B</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePssIEEE2B( PssIEEE2B object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Steam Turbine</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Steam Turbine</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSteamTurbine( SteamTurbine object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Wind Cont PType3 IEC</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Wind Cont PType3 IEC</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseWindContPType3IEC( WindContPType3IEC object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Petersen Coil</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Petersen Coil</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePetersenCoil( PetersenCoil object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Estimated Restoration Time</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Estimated Restoration Time</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseEstimatedRestorationTime( EstimatedRestorationTime object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Asynchronous Machine Dynamics</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Asynchronous Machine Dynamics</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAsynchronousMachineDynamics( AsynchronousMachineDynamics object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Joint</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Joint</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseJoint( Joint object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Steam Sendout Schedule</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Steam Sendout Schedule</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSteamSendoutSchedule( SteamSendoutSchedule object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Exc IEEEST1A</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Exc IEEEST1A</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseExcIEEEST1A( ExcIEEEST1A object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Trouble Ticket</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Trouble Ticket</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTroubleTicket( TroubleTicket object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Regulating Control</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Regulating Control</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseRegulatingControl( RegulatingControl object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Gov Steam0</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Gov Steam0</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseGovSteam0( GovSteam0 object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>TASE2 Bilateral Table</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>TASE2 Bilateral Table</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTASE2BilateralTable( TASE2BilateralTable object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Ground Disconnector</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Ground Disconnector</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseGroundDisconnector( GroundDisconnector object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Pss1 A</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Pss1 A</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePss1A( Pss1A object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Gen Unit Op Cost Curve</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Gen Unit Op Cost Curve</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseGenUnitOpCostCurve( GenUnitOpCostCurve object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Power Electronics Connection</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Power Electronics Connection</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePowerElectronicsConnection( PowerElectronicsConnection object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Person</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Person</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePerson( Person object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Pss IEEE4B</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Pss IEEE4B</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePssIEEE4B( PssIEEE4B object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Sourcing Actor</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Sourcing Actor</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSourcingActor( SourcingActor object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Gov Hydro1</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Gov Hydro1</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseGovHydro1( GovHydro1 object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Wind Gen Type4 IEC</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Wind Gen Type4 IEC</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseWindGenType4IEC( WindGenType4IEC object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Synchronous Machine Detailed</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Synchronous Machine Detailed</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSynchronousMachineDetailed( SynchronousMachineDetailed object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Voltage Control Zone</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Voltage Control Zone</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseVoltageControlZone( VoltageControlZone object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Discrete Command</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Discrete Command</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDiscreteCommand( DiscreteCommand object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Base Voltage</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Base Voltage</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseBaseVoltage( BaseVoltage object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>End Device Control</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>End Device Control</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseEndDeviceControl( EndDeviceControl object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Conform Load Group</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Conform Load Group</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseConformLoadGroup( ConformLoadGroup object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Underexc Lim IEEE1</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Underexc Lim IEEE1</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseUnderexcLimIEEE1( UnderexcLimIEEE1 object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Energy Consumer</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Energy Consumer</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseEnergyConsumer( EnergyConsumer object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Measurement Value Source</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Measurement Value Source</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseMeasurementValueSource( MeasurementValueSource object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Power Cut Zone</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Power Cut Zone</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePowerCutZone( PowerCutZone object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Conform Load</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Conform Load</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseConformLoad( ConformLoad object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Overexc Lim2</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Overexc Lim2</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseOverexcLim2( OverexcLim2 object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>End Device</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>End Device</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseEndDevice( EndDevice object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Basic Interval Schedule</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Basic Interval Schedule</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseBasicIntervalSchedule( BasicIntervalSchedule object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Oil Specimen</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Oil Specimen</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseOilSpecimen( OilSpecimen object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Substation</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Substation</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSubstation( Substation object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Gov Hydro PID2</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Gov Hydro PID2</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseGovHydroPID2( GovHydroPID2 object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Com Function</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Com Function</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseComFunction( ComFunction object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Pan Pricing Detail</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Pan Pricing Detail</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePanPricingDetail( PanPricingDetail object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Linear Shunt Compensator Phase</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Linear Shunt Compensator Phase</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseLinearShuntCompensatorPhase( LinearShuntCompensatorPhase object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Gross To Net Active Power Curve</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Gross To Net Active Power Curve</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseGrossToNetActivePowerCurve( GrossToNetActivePowerCurve object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>DC Node</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>DC Node</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDCNode( DCNode object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Wind Turbine Type1or2 Dynamics</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Wind Turbine Type1or2 Dynamics</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseWindTurbineType1or2Dynamics( WindTurbineType1or2Dynamics object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>State Variable</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>State Variable</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseStateVariable( StateVariable object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Work Activity Record</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Work Activity Record</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseWorkActivityRecord( WorkActivityRecord object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Oil Analysis Paper Analog</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Oil Analysis Paper Analog</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseOilAnalysisPaperAnalog( OilAnalysisPaperAnalog object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>DC Switch</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>DC Switch</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDCSwitch( DCSwitch object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>PFV Ar Type1 IEEEV Ar Controller</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>PFV Ar Type1 IEEEV Ar Controller</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePFVArType1IEEEVArController( PFVArType1IEEEVArController object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Procedure Data Set</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Procedure Data Set</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseProcedureDataSet( ProcedureDataSet object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Visibility Layer</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Visibility Layer</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseVisibilityLayer( VisibilityLayer object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Diagram Object Glue Point</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Diagram Object Glue Point</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDiagramObjectGluePoint( DiagramObjectGluePoint object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Diagram Object</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Diagram Object</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDiagramObject( DiagramObject object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Heat Recovery Boiler</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Heat Recovery Boiler</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseHeatRecoveryBoiler( HeatRecoveryBoiler object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Interrupter Unit Info</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Interrupter Unit Info</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseInterrupterUnitInfo( InterrupterUnitInfo object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Gov GAST</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Gov GAST</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseGovGAST( GovGAST object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Customer</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Customer</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCustomer( Customer object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Exc SEXS</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Exc SEXS</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseExcSEXS( ExcSEXS object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Excitation System User Defined</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Excitation System User Defined</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseExcitationSystemUserDefined( ExcitationSystemUserDefined object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Switching Plan</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Switching Plan</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSwitchingPlan( SwitchingPlan object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Work Location</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Work Location</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseWorkLocation( WorkLocation object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Switching Step</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Switching Step</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSwitchingStep( SwitchingStep object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Consumption Tariff Interval</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Consumption Tariff Interval</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseConsumptionTariffInterval( ConsumptionTariffInterval object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Wind Protection IEC</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Wind Protection IEC</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseWindProtectionIEC( WindProtectionIEC object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Underexc Lim2 Simplified</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Underexc Lim2 Simplified</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseUnderexcLim2Simplified( UnderexcLim2Simplified object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Simple End Device Function</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Simple End Device Function</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSimpleEndDeviceFunction( SimpleEndDeviceFunction object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Disc Exc Cont IEEEDEC1A</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Disc Exc Cont IEEEDEC1A</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDiscExcContIEEEDEC1A( DiscExcContIEEEDEC1A object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Jumper Action</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Jumper Action</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseJumperAction( JumperAction object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Service Multiplier</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Service Multiplier</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseServiceMultiplier( ServiceMultiplier object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Document</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Document</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDocument( Document object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Inspection Data Set</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Inspection Data Set</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseInspectionDataSet( InspectionDataSet object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Load Static</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Load Static</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseLoadStatic( LoadStatic object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>FACTS Device</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>FACTS Device</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseFACTSDevice( FACTSDevice object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Asset Function</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Asset Function</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAssetFunction( AssetFunction object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Discontinuous Excitation Control Dynamics</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Discontinuous Excitation Control Dynamics</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDiscontinuousExcitationControlDynamics( DiscontinuousExcitationControlDynamics object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Current Limit</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Current Limit</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCurrentLimit( CurrentLimit object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Phase Tap Changer Symmetrical</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Phase Tap Changer Symmetrical</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePhaseTapChangerSymmetrical( PhaseTapChangerSymmetrical object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Time Tariff Interval</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Time Tariff Interval</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTimeTariffInterval( TimeTariffInterval object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Exc IEEEAC4A</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Exc IEEEAC4A</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseExcIEEEAC4A( ExcIEEEAC4A object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Wind Turbine Type4 IEC</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Wind Turbine Type4 IEC</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseWindTurbineType4IEC( WindTurbineType4IEC object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Base Reading</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Base Reading</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseBaseReading( BaseReading object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Underexcitation Limiter User Defined</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Underexcitation Limiter User Defined</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseUnderexcitationLimiterUserDefined( UnderexcitationLimiterUserDefined object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Hydro Pump</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Hydro Pump</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseHydroPump( HydroPump object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Power Transformer Info</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Power Transformer Info</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePowerTransformerInfo( PowerTransformerInfo object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Plant</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Plant</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePlant( Plant object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Mechanical Load Dynamics</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Mechanical Load Dynamics</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseMechanicalLoadDynamics( MechanicalLoadDynamics object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Busbar Section Info</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Busbar Section Info</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseBusbarSectionInfo( BusbarSectionInfo object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Cut Action</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Cut Action</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCutAction( CutAction object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Auxiliary Agreement</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Auxiliary Agreement</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAuxiliaryAgreement( AuxiliaryAgreement object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Wind Cont QLim IEC</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Wind Cont QLim IEC</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseWindContQLimIEC( WindContQLimIEC object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Current Transformer</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Current Transformer</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCurrentTransformer( CurrentTransformer object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Structure Support</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Structure Support</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseStructureSupport( StructureSupport object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Synchrocheck Relay</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Synchrocheck Relay</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSynchrocheckRelay( SynchrocheckRelay object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Analog Value</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Analog Value</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAnalogValue( AnalogValue object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>ISO Upper Layer</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>ISO Upper Layer</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseISOUpperLayer( ISOUpperLayer object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Wind Turbine Type4b IEC</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Wind Turbine Type4b IEC</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseWindTurbineType4bIEC( WindTurbineType4bIEC object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Crew Member</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Crew Member</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCrewMember( CrewMember object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Object Deletion</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Object Deletion</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseObjectDeletion( ObjectDeletion object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Steam Supply</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Steam Supply</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSteamSupply( SteamSupply object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Topological Island</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Topological Island</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTopologicalIsland( TopologicalIsland object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Limit</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Limit</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseLimit( Limit object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Usage Point</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Usage Point</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseUsagePoint( UsagePoint object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Concentric Neutral Cable Info</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Concentric Neutral Cable Info</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseConcentricNeutralCableInfo( ConcentricNeutralCableInfo object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Control Area</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Control Area</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseControlArea( ControlArea object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Nuclear Generating Unit</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Nuclear Generating Unit</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseNuclearGeneratingUnit( NuclearGeneratingUnit object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Disconnector</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Disconnector</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDisconnector( Disconnector object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Wind Turbine Type3or4 Dynamics</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Wind Turbine Type3or4 Dynamics</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseWindTurbineType3or4Dynamics( WindTurbineType3or4Dynamics object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Operations Safety Supervisor</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Operations Safety Supervisor</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseOperationsSafetySupervisor( OperationsSafetySupervisor object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Tailbay Loss Curve</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Tailbay Loss Curve</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTailbayLossCurve( TailbayLossCurve object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Transformer Mesh Impedance</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Transformer Mesh Impedance</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTransformerMeshImpedance( TransformerMeshImpedance object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>DC Series Device</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>DC Series Device</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDCSeriesDevice( DCSeriesDevice object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Alt Generating Unit Meas</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Alt Generating Unit Meas</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAltGeneratingUnitMeas( AltGeneratingUnitMeas object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Activity Record</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Activity Record</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseActivityRecord( ActivityRecord object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Time Schedule</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Time Schedule</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTimeSchedule( TimeSchedule object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Fossil Fuel</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Fossil Fuel</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseFossilFuel( FossilFuel object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Per Length Sequence Impedance</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Per Length Sequence Impedance</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePerLengthSequenceImpedance( PerLengthSequenceImpedance object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Start Ramp Curve</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Start Ramp Curve</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseStartRampCurve( StartRampCurve object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Power Transformer End</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Power Transformer End</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePowerTransformerEnd( PowerTransformerEnd object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>DER Capabilities</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>DER Capabilities</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDERCapabilities( DERCapabilities object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Switch Phase</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Switch Phase</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSwitchPhase( SwitchPhase object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Editor</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Editor</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseEditor( Editor object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Data Set</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Data Set</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDataSet( DataSet object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Transformer Tank Info</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Transformer Tank Info</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTransformerTankInfo( TransformerTankInfo object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Exc AVR4</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Exc AVR4</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseExcAVR4( ExcAVR4 object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Flow Sensor</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Flow Sensor</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseFlowSensor( FlowSensor object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Emission Curve</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Emission Curve</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseEmissionCurve( EmissionCurve object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Exc REXS</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Exc REXS</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseExcREXS( ExcREXS object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Dispatchable Power Capability</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Dispatchable Power Capability</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDispatchablePowerCapability( DispatchablePowerCapability object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Exc AC2A</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Exc AC2A</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseExcAC2A( ExcAC2A object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Irregular Interval Schedule</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Irregular Interval Schedule</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseIrregularIntervalSchedule( IrregularIntervalSchedule object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Outage Area</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Outage Area</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseOutageArea( OutageArea object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Hydro Generating Unit</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Hydro Generating Unit</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseHydroGeneratingUnit( HydroGeneratingUnit object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Reading</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Reading</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseReading( Reading object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>ICCP Information Message</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>ICCP Information Message</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseICCPInformationMessage( ICCPInformationMessage object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Equivalent Shunt</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Equivalent Shunt</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseEquivalentShunt( EquivalentShunt object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Wind Aero Const IEC</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Wind Aero Const IEC</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseWindAeroConstIEC( WindAeroConstIEC object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Asset Group</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Asset Group</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAssetGroup( AssetGroup object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Conducting Equipment</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Conducting Equipment</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseConductingEquipment( ConductingEquipment object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Work Time Schedule</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Work Time Schedule</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseWorkTimeSchedule( WorkTimeSchedule object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Operational Tag</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Operational Tag</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseOperationalTag( OperationalTag object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Energy Source</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Energy Source</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseEnergySource( EnergySource object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Cs Converter</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Cs Converter</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCsConverter( CsConverter object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Quality61850</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Quality61850</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseQuality61850( Quality61850 object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Pss PTIST1</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Pss PTIST1</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePssPTIST1( PssPTIST1 object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Switch Info</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Switch Info</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSwitchInfo( SwitchInfo object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Oil Analysis Fluid Discrete</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Oil Analysis Fluid Discrete</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseOilAnalysisFluidDiscrete( OilAnalysisFluidDiscrete object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Season</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Season</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSeason( Season object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Sectionaliser</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Sectionaliser</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSectionaliser( Sectionaliser object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Power System Stabilizer User Defined</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Power System Stabilizer User Defined</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePowerSystemStabilizerUserDefined( PowerSystemStabilizerUserDefined object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Sub Geographical Region</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Sub Geographical Region</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSubGeographicalRegion( SubGeographicalRegion object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Tap Changer</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Tap Changer</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTapChanger( TapChanger object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Tie Flow</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Tie Flow</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTieFlow( TieFlow object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Pan Pricing</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Pan Pricing</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePanPricing( PanPricing object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Asset User</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Asset User</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAssetUser( AssetUser object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Meter</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Meter</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseMeter( Meter object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Regulation Schedule</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Regulation Schedule</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseRegulationSchedule( RegulationSchedule object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Coordinate System</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Coordinate System</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCoordinateSystem( CoordinateSystem object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Aggregate Score</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Aggregate Score</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAggregateScore( AggregateScore object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Catalog Asset Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Catalog Asset Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCatalogAssetType( CatalogAssetType object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Pss2 B</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Pss2 B</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePss2B( Pss2B object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Channel</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Channel</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseChannel( Channel object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Card</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Card</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCard( Card object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Nonlinear Shunt Compensator Phase</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Nonlinear Shunt Compensator Phase</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseNonlinearShuntCompensatorPhase( NonlinearShuntCompensatorPhase object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Gov GAST3</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Gov GAST3</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseGovGAST3( GovGAST3 object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>PFV Ar Type1 IEEEPF Controller</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>PFV Ar Type1 IEEEPF Controller</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePFVArType1IEEEPFController( PFVArType1IEEEPFController object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Power Transformer</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Power Transformer</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePowerTransformer( PowerTransformer object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Tariff</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Tariff</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTariff( Tariff object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Accumulator Value</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Accumulator Value</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAccumulatorValue( AccumulatorValue object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Gov Hydro R</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Gov Hydro R</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseGovHydroR( GovHydroR object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Medium</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Medium</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseMedium( Medium object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Prime Mover</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Prime Mover</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePrimeMover( PrimeMover object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Phase Tap Changer Table Point</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Phase Tap Changer Table Point</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePhaseTapChangerTablePoint( PhaseTapChangerTablePoint object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Reading Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Reading Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseReadingType( ReadingType object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>End Device Event Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>End Device Event Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseEndDeviceEventType( EndDeviceEventType object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Gov Hydro WEH</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Gov Hydro WEH</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseGovHydroWEH( GovHydroWEH object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Name Type Authority</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Name Type Authority</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseNameTypeAuthority( NameTypeAuthority object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Base Power</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Base Power</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseBasePower( BasePower object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Exc IEEEAC3A</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Exc IEEEAC3A</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseExcIEEEAC3A( ExcIEEEAC3A object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Ownership</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Ownership</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseOwnership( Ownership object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Reclose Sequence</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Reclose Sequence</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseRecloseSequence( RecloseSequence object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Emission Account</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Emission Account</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseEmissionAccount( EmissionAccount object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Irregular Time Point</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Irregular Time Point</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseIrregularTimePoint( IrregularTimePoint object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Wind Plant IEC</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Wind Plant IEC</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseWindPlantIEC( WindPlantIEC object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Outage Schedule</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Outage Schedule</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseOutageSchedule( OutageSchedule object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Post Line Sensor</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Post Line Sensor</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePostLineSensor( PostLineSensor object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Ratio Tap Changer Table</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Ratio Tap Changer Table</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseRatioTapChangerTable( RatioTapChangerTable object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Exc ST3A</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Exc ST3A</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseExcST3A( ExcST3A object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Gov GAST2</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Gov GAST2</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseGovGAST2( GovGAST2 object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Exc ST1A</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Exc ST1A</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseExcST1A( ExcST1A object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>End Device Group</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>End Device Group</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseEndDeviceGroup( EndDeviceGroup object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Vs Capability Curve</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Vs Capability Curve</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseVsCapabilityCurve( VsCapabilityCurve object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Auxiliary Equipment</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Auxiliary Equipment</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAuxiliaryEquipment( AuxiliaryEquipment object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Wind Ref Frame Rot IEC</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Wind Ref Frame Rot IEC</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseWindRefFrameRotIEC( WindRefFrameRotIEC object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Wind Aero Two Dim IEC</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Wind Aero Two Dim IEC</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseWindAeroTwoDimIEC( WindAeroTwoDimIEC object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Asynchronous Machine Time Constant Reactance</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Asynchronous Machine Time Constant Reactance</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAsynchronousMachineTimeConstantReactance( AsynchronousMachineTimeConstantReactance object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Diagnosis Data Set</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Diagnosis Data Set</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDiagnosisDataSet( DiagnosisDataSet object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Duct Bank</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Duct Bank</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDuctBank( DuctBank object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Set Point</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Set Point</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSetPoint( SetPoint object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Pan Display</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Pan Display</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePanDisplay( PanDisplay object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Gov Hydro4</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Gov Hydro4</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseGovHydro4( GovHydro4 object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Customer Agreement</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Customer Agreement</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCustomerAgreement( CustomerAgreement object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Gov Steam EU</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Gov Steam EU</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseGovSteamEU( GovSteamEU object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Potential Transformer</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Potential Transformer</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePotentialTransformer( PotentialTransformer object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Cable Info</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Cable Info</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCableInfo( CableInfo object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Vendor Shift</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Vendor Shift</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseVendorShift( VendorShift object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Oil Analysis Fluid Analog</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Oil Analysis Fluid Analog</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseOilAnalysisFluidAnalog( OilAnalysisFluidAnalog object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Phase Tap Changer Asymmetrical</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Phase Tap Changer Asymmetrical</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePhaseTapChangerAsymmetrical( PhaseTapChangerAsymmetrical object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Overexc Lim IEEE</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Overexc Lim IEEE</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseOverexcLimIEEE( OverexcLimIEEE object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Diagram Object Point</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Diagram Object Point</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDiagramObjectPoint( DiagramObjectPoint object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>IEC61970CIM Version</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>IEC61970CIM Version</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseIEC61970CIMVersion( IEC61970CIMVersion object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>End Device Function</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>End Device Function</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseEndDeviceFunction( EndDeviceFunction object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Generic Action</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Generic Action</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseGenericAction( GenericAction object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Asset Container</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Asset Container</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAssetContainer( AssetContainer object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Clearance Document</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Clearance Document</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseClearanceDocument( ClearanceDocument object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Exc AVR5</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Exc AVR5</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseExcAVR5( ExcAVR5 object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Operational Limit Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Operational Limit Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseOperationalLimitType( OperationalLimitType object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Exc IEEEST6B</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Exc IEEEST6B</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseExcIEEEST6B( ExcIEEEST6B object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Exc IEEEST2A</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Exc IEEEST2A</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseExcIEEEST2A( ExcIEEEST2A object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Asset</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Asset</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAsset( Asset object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Wind Turbine Type3or4 IEC</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Wind Turbine Type3or4 IEC</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseWindTurbineType3or4IEC( WindTurbineType3or4IEC object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Usage Point Group</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Usage Point Group</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseUsagePointGroup( UsagePointGroup object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Diagram Object Style</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Diagram Object Style</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDiagramObjectStyle( DiagramObjectStyle object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Interrupter Unit</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Interrupter Unit</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseInterrupterUnit( InterrupterUnit object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Crew Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Crew Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCrewType( CrewType object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Wind Dynamics Lookup Table</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Wind Dynamics Lookup Table</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseWindDynamicsLookupTable( WindDynamicsLookupTable object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Fossil Steam Supply</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Fossil Steam Supply</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseFossilSteamSupply( FossilSteamSupply object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Exc AVR3</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Exc AVR3</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseExcAVR3( ExcAVR3 object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>DC Busbar</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>DC Busbar</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDCBusbar( DCBusbar object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Exc SK</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Exc SK</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseExcSK( ExcSK object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Breaker</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Breaker</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseBreaker( Breaker object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Excitation System Dynamics</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Excitation System Dynamics</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseExcitationSystemDynamics( ExcitationSystemDynamics object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Operational Updated Rating</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Operational Updated Rating</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseOperationalUpdatedRating( OperationalUpdatedRating object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Exc HU</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Exc HU</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseExcHU( ExcHU object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Incremental Heat Rate Curve</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Incremental Heat Rate Curve</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseIncrementalHeatRateCurve( IncrementalHeatRateCurve object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Diagram Style</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Diagram Style</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDiagramStyle( DiagramStyle object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Vendor</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Vendor</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseVendor( Vendor object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Gov GAST1</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Gov GAST1</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseGovGAST1( GovGAST1 object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Regulating Cond Eq</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Regulating Cond Eq</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseRegulatingCondEq( RegulatingCondEq object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Ratio Tap Changer Table Point</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Ratio Tap Changer Table Point</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseRatioTapChangerTablePoint( RatioTapChangerTablePoint object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Transformer Tank End</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Transformer Tank End</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTransformerTankEnd( TransformerTankEnd object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Disc Exc Cont IEEEDEC2A</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Disc Exc Cont IEEEDEC2A</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDiscExcContIEEEDEC2A( DiscExcContIEEEDEC2A object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Current Relay</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Current Relay</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCurrentRelay( CurrentRelay object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Operational Limit</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Operational Limit</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseOperationalLimit( OperationalLimit object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Contingency Element</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Contingency Element</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseContingencyElement( ContingencyElement object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>PFV Ar Controller Type1 Dynamics</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>PFV Ar Controller Type1 Dynamics</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePFVArControllerType1Dynamics( PFVArControllerType1Dynamics object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Switch</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Switch</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSwitch(
            fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Switch object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Bilateral Exchange Actor</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Bilateral Exchange Actor</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseBilateralExchangeActor( BilateralExchangeActor object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Test Data Set</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Test Data Set</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTestDataSet( TestDataSet object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>VComp IEEE Type1</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>VComp IEEE Type1</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseVCompIEEEType1( VCompIEEEType1 object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Usage Point Location</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Usage Point Location</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseUsagePointLocation( UsagePointLocation object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Per Length Impedance</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Per Length Impedance</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePerLengthImpedance( PerLengthImpedance object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>IEC61968CIM Version</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>IEC61968CIM Version</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseIEC61968CIMVersion( IEC61968CIMVersion object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>User Attribute</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>User Attribute</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseUserAttribute( UserAttribute object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Service Category</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Service Category</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseServiceCategory( ServiceCategory object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Alt Tie Meas</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Alt Tie Meas</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAltTieMeas( AltTieMeas object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>DC Terminal</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>DC Terminal</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDCTerminal( DCTerminal object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Static Var Compensator</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Static Var Compensator</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseStaticVarCompensator( StaticVarCompensator object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Gov Hydro PID</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Gov Hydro PID</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseGovHydroPID( GovHydroPID object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Asset Analog</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Asset Analog</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAssetAnalog( AssetAnalog object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>ACDC Converter</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>ACDC Converter</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseACDCConverter( ACDCConverter object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Junction</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Junction</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseJunction( Junction object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Gov Hydro2</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Gov Hydro2</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseGovHydro2( GovHydro2 object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Gen ICompensation For Gen J</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Gen ICompensation For Gen J</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseGenICompensationForGenJ( GenICompensationForGenJ object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Meter Reading</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Meter Reading</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseMeterReading( MeterReading object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Voltage Level</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Voltage Level</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseVoltageLevel( VoltageLevel object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Auxiliary Account</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Auxiliary Account</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAuxiliaryAccount( AuxiliaryAccount object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Bay</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Bay</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseBay( Bay object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>PSR Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>PSR Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePSRType( PSRType object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Load Generic Non Linear</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Load Generic Non Linear</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseLoadGenericNonLinear( LoadGenericNonLinear object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Turbine Load Controller Dynamics</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Turbine Load Controller Dynamics</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTurbineLoadControllerDynamics( TurbineLoadControllerDynamics object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>PFV Ar Controller Type1 User Defined</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>PFV Ar Controller Type1 User Defined</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePFVArControllerType1UserDefined( PFVArControllerType1UserDefined object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Exc AC3A</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Exc AC3A</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseExcAC3A( ExcAC3A object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>End Device Event Detail</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>End Device Event Detail</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseEndDeviceEventDetail( EndDeviceEventDetail object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Asset Discrete</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Asset Discrete</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAssetDiscrete( AssetDiscrete object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Pss PTIST3</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Pss PTIST3</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePssPTIST3( PssPTIST3 object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Wind Plant Dynamics</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Wind Plant Dynamics</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseWindPlantDynamics( WindPlantDynamics object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Exc IEEEDC1A</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Exc IEEEDC1A</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseExcIEEEDC1A( ExcIEEEDC1A object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Operator</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Operator</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseOperator( Operator object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Organisation</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Organisation</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseOrganisation( Organisation object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Underexc Lim X2</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Underexc Lim X2</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseUnderexcLimX2( UnderexcLimX2 object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Load Break Switch</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Load Break Switch</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseLoadBreakSwitch( LoadBreakSwitch object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Phase Tap Changer Tabular</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Phase Tap Changer Tabular</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePhaseTapChangerTabular( PhaseTapChangerTabular object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>ICCP Virtual Control Center</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>ICCP Virtual Control Center</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseICCPVirtualControlCenter( ICCPVirtualControlCenter object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Equipment Fault</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Equipment Fault</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseEquipmentFault( EquipmentFault object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Oil Analysis Moisture Analog</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Oil Analysis Moisture Analog</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseOilAnalysisMoistureAnalog( OilAnalysisMoistureAnalog object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Connector</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Connector</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseConnector( Connector object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Exc ST2A</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Exc ST2A</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseExcST2A( ExcST2A object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Gov Steam1</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Gov Steam1</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseGovSteam1( GovSteam1 object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Gov GASTWD</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Gov GASTWD</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseGovGASTWD( GovGASTWD object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Transformer Test</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Transformer Test</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTransformerTest( TransformerTest object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Configuration Event</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Configuration Event</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseConfigurationEvent( ConfigurationEvent object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Busbar Section</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Busbar Section</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseBusbarSection( BusbarSection object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Wind Generating Unit</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Wind Generating Unit</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseWindGeneratingUnit( WindGeneratingUnit object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Wire Position</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Wire Position</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseWirePosition( WirePosition object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Contingency</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Contingency</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseContingency( Contingency object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Non Conform Load</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Non Conform Load</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseNonConformLoad( NonConformLoad object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Connectivity Node</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Connectivity Node</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseConnectivityNode( ConnectivityNode object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Sv Status</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Sv Status</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSvStatus( SvStatus object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Work Asset</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Work Asset</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseWorkAsset( WorkAsset object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Sv Shunt Compensator Sections</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Sv Shunt Compensator Sections</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSvShuntCompensatorSections( SvShuntCompensatorSections object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Vehicle</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Vehicle</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseVehicle( Vehicle object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Exc AC4A</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Exc AC4A</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseExcAC4A( ExcAC4A object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Topological Node</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Topological Node</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTopologicalNode( TopologicalNode object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Exc AC5A</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Exc AC5A</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseExcAC5A( ExcAC5A object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Solar Generating Unit</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Solar Generating Unit</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSolarGeneratingUnit( SolarGeneratingUnit object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Power Electronics Wind Unit</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Power Electronics Wind Unit</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePowerElectronicsWindUnit( PowerElectronicsWindUnit object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Incident Hazard</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Incident Hazard</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseIncidentHazard( IncidentHazard object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Series Compensator</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Series Compensator</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSeriesCompensator( SeriesCompensator object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Text Diagram Object</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Text Diagram Object</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTextDiagramObject( TextDiagramObject object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Wind Cont QPQU Lim IEC</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Wind Cont QPQU Lim IEC</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseWindContQPQULimIEC( WindContQPQULimIEC object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Analog Control</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Analog Control</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAnalogControl( AnalogControl object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Gov Steam2</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Gov Steam2</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseGovSteam2( GovSteam2 object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Remote Input Signal</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Remote Input Signal</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseRemoteInputSignal( RemoteInputSignal object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Transformer Tank</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Transformer Tank</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTransformerTank( TransformerTank object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Accumulator Limit Set</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Accumulator Limit Set</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAccumulatorLimitSet( AccumulatorLimitSet object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Synchronous Machine</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Synchronous Machine</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSynchronousMachine( SynchronousMachine object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Protection Equipment</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Protection Equipment</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseProtectionEquipment( ProtectionEquipment object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Exc AC1A</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Exc AC1A</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseExcAC1A( ExcAC1A object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>PFV Ar Type2 Common1</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>PFV Ar Type2 Common1</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePFVArType2Common1( PFVArType2Common1 object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Mech Load1</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Mech Load1</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseMechLoad1( MechLoad1 object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Synchronous Machine Dynamics</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Synchronous Machine Dynamics</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSynchronousMachineDynamics( SynchronousMachineDynamics object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Curve</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Curve</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCurve( Curve object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Power System Stabilizer Dynamics</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Power System Stabilizer Dynamics</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePowerSystemStabilizerDynamics( PowerSystemStabilizerDynamics object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Reporting Group</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Reporting Group</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseReportingGroup( ReportingGroup object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Change Set</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Change Set</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseChangeSet( ChangeSet object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Fuel Allocation Schedule</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Fuel Allocation Schedule</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseFuelAllocationSchedule( FuelAllocationSchedule object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Tape Shield Cable Info</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Tape Shield Cable Info</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTapeShieldCableInfo( TapeShieldCableInfo object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Voltage Adjuster User Defined</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Voltage Adjuster User Defined</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseVoltageAdjusterUserDefined( VoltageAdjusterUserDefined object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>IO Point</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>IO Point</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseIOPoint( IOPoint object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Hydro Turbine</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Hydro Turbine</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseHydroTurbine( HydroTurbine object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Transformer End Info</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Transformer End Info</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTransformerEndInfo( TransformerEndInfo object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Overexcitation Limiter Dynamics</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Overexcitation Limiter Dynamics</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseOverexcitationLimiterDynamics( OverexcitationLimiterDynamics object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Wind Cont Rotor RIEC</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Wind Cont Rotor RIEC</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseWindContRotorRIEC( WindContRotorRIEC object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Repair Item</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Repair Item</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseRepairItem( RepairItem object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Per Length Phase Impedance</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Per Length Phase Impedance</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePerLengthPhaseImpedance( PerLengthPhaseImpedance object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Inflow Forecast</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Inflow Forecast</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseInflowForecast( InflowForecast object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Ground Action</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Ground Action</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseGroundAction( GroundAction object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Reservoir</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Reservoir</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseReservoir( Reservoir object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Object Modification</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Object Modification</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseObjectModification( ObjectModification object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Customer Account</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Customer Account</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCustomerAccount( CustomerAccount object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>ICCPVCC</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>ICCPVCC</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseICCPVCC( ICCPVCC object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Underexc Lim IEEE2</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Underexc Lim IEEE2</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseUnderexcLimIEEE2( UnderexcLimIEEE2 object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>BWR Steam Supply</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>BWR Steam Supply</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseBWRSteamSupply( BWRSteamSupply object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Work</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Work</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseWork( Work object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Repair Work Task</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Repair Work Task</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseRepairWorkTask( RepairWorkTask object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Surge Arrester</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Surge Arrester</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSurgeArrester( SurgeArrester object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Exc PIC</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Exc PIC</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseExcPIC( ExcPIC object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Field Safety Supervisor</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Field Safety Supervisor</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseFieldSafetySupervisor( FieldSafetySupervisor object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Energy Source Phase</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Energy Source Phase</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseEnergySourcePhase( EnergySourcePhase object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Author</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Author</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAuthor( Author object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Branch Group</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Branch Group</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseBranchGroup( BranchGroup object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>DC Topological Island</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>DC Topological Island</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDCTopologicalIsland( DCTopologicalIsland object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Apparent Power Limit</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Apparent Power Limit</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseApparentPowerLimit( ApparentPowerLimit object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Fault</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Fault</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseFault( Fault object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Recloser</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Recloser</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseRecloser( Recloser object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Control Area Generating Unit</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Control Area Generating Unit</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseControlAreaGeneratingUnit( ControlAreaGeneratingUnit object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Exc AVR2</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Exc AVR2</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseExcAVR2( ExcAVR2 object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Turb LCFB1</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Turb LCFB1</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTurbLCFB1( TurbLCFB1 object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>DC Line</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>DC Line</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDCLine( DCLine object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Equipment</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Equipment</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseEquipment( Equipment object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Start Main Fuel Curve</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Start Main Fuel Curve</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseStartMainFuelCurve( StartMainFuelCurve object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Cut</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Cut</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCut( Cut object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Rotating Machine</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Rotating Machine</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseRotatingMachine( RotatingMachine object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Exc ELIN1</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Exc ELIN1</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseExcELIN1( ExcELIN1 object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Procedure</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Procedure</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseProcedure( Procedure object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Non Conform Load Schedule</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Non Conform Load Schedule</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseNonConformLoadSchedule( NonConformLoadSchedule object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>PWR Steam Supply</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>PWR Steam Supply</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePWRSteamSupply( PWRSteamSupply object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Target Level Schedule</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Target Level Schedule</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTargetLevelSchedule( TargetLevelSchedule object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>CAES Plant</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>CAES Plant</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCAESPlant( CAESPlant object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Wind Plant Freq Pcontrol IEC</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Wind Plant Freq Pcontrol IEC</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseWindPlantFreqPcontrolIEC( WindPlantFreqPcontrolIEC object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Wire Phase Info</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Wire Phase Info</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseWirePhaseInfo( WirePhaseInfo object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Pss WECC</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Pss WECC</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePssWECC( PssWECC object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Season Day Type Schedule</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Season Day Type Schedule</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSeasonDayTypeSchedule( SeasonDayTypeSchedule object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Pss SK</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Pss SK</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePssSK( PssSK object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Value To Alias</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Value To Alias</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseValueToAlias( ValueToAlias object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>End Device Event</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>End Device Event</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseEndDeviceEvent( EndDeviceEvent object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Wind Type3or4 User Defined</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Wind Type3or4 User Defined</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseWindType3or4UserDefined( WindType3or4UserDefined object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Thermal Generating Unit</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Thermal Generating Unit</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseThermalGeneratingUnit( ThermalGeneratingUnit object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Profile</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Profile</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseProfile( Profile object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Appointment</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Appointment</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAppointment( Appointment object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Specimen</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Specimen</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSpecimen( Specimen object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>String Measurement Value</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>String Measurement Value</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseStringMeasurementValue( StringMeasurementValue object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Wind Turbine Type3 IEC</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Wind Turbine Type3 IEC</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseWindTurbineType3IEC( WindTurbineType3IEC object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Remote Unit</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Remote Unit</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseRemoteUnit( RemoteUnit object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Gen Unit Op Schedule</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Gen Unit Op Schedule</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseGenUnitOpSchedule( GenUnitOpSchedule object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Sv Voltage</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Sv Voltage</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSvVoltage( SvVoltage object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Cogeneration Plant</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Cogeneration Plant</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCogenerationPlant( CogenerationPlant object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Discrete Value</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Discrete Value</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDiscreteValue( DiscreteValue object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>CT Temp Active Power Curve</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>CT Temp Active Power Curve</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCTTempActivePowerCurve( CTTempActivePowerCurve object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Energy Consumer Phase</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Energy Consumer Phase</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseEnergyConsumerPhase( EnergyConsumerPhase object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Exc AVR1</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Exc AVR1</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseExcAVR1( ExcAVR1 object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Crew</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Crew</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCrew( Crew object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Wind Pitch Cont Power IEC</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Wind Pitch Cont Power IEC</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseWindPitchContPowerIEC( WindPitchContPowerIEC object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Heat Input Curve</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Heat Input Curve</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseHeatInputCurve( HeatInputCurve object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Tender</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Tender</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTender( Tender object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Air Compressor</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Air Compressor</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAirCompressor( AirCompressor object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Metrology Requirement</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Metrology Requirement</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseMetrologyRequirement( MetrologyRequirement object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Linear Shunt Compensator</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Linear Shunt Compensator</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseLinearShuntCompensator( LinearShuntCompensator object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Issuer</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Issuer</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseIssuer( Issuer object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Clearance Action</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Clearance Action</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseClearanceAction( ClearanceAction object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>IO Point Source</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>IO Point Source</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseIOPointSource( IOPointSource object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Reactive Capability Curve</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Reactive Capability Curve</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseReactiveCapabilityCurve( ReactiveCapabilityCurve object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Sv Tap Step</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Sv Tap Step</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSvTapStep( SvTapStep object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Gov Steam CC</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Gov Steam CC</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseGovSteamCC( GovSteamCC object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Switch Operation Summary</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Switch Operation Summary</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSwitchOperationSummary( SwitchOperationSummary object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Scheduled Event Data</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Scheduled Event Data</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseScheduledEventData( ScheduledEventData object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>DER Group Forecast</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>DER Group Forecast</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDERGroupForecast( DERGroupForecast object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Branch Group Terminal</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Branch Group Terminal</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseBranchGroupTerminal( BranchGroupTerminal object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Shift</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Shift</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseShift( Shift object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Phase Tap Changer Table</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Phase Tap Changer Table</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePhaseTapChangerTable( PhaseTapChangerTable object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Overexc Lim X2</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Overexc Lim X2</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseOverexcLimX2( OverexcLimX2 object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Demand Response Program</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Demand Response Program</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDemandResponseProgram( DemandResponseProgram object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Person Role</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Person Role</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePersonRole( PersonRole object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Oil Analysis Particle Discrete</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Oil Analysis Particle Discrete</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseOilAnalysisParticleDiscrete( OilAnalysisParticleDiscrete object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Gov GAST4</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Gov GAST4</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseGovGAST4( GovGAST4 object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Load Composite</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Load Composite</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseLoadComposite( LoadComposite object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Equivalent Injection</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Equivalent Injection</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseEquivalentInjection( EquivalentInjection object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Document Person Role</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Document Person Role</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDocumentPersonRole( DocumentPersonRole object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Identified Object</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Identified Object</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseIdentifiedObject( IdentifiedObject object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Pss IEEE3B</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Pss IEEE3B</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePssIEEE3B( PssIEEE3B object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Transaction</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Transaction</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTransaction( Transaction object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Statistical Calculation</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Statistical Calculation</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseStatisticalCalculation( StatisticalCalculation object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Meter Multiplier</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Meter Multiplier</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseMeterMultiplier( MeterMultiplier object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Internal Location</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Internal Location</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseInternalLocation( InternalLocation object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Bus Name Marker</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Bus Name Marker</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseBusNameMarker( BusNameMarker object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Shunt Compensator Phase</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Shunt Compensator Phase</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseShuntCompensatorPhase( ShuntCompensatorPhase object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Sv Power Flow</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Sv Power Flow</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSvPowerFlow( SvPowerFlow object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Drum Boiler</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Drum Boiler</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDrumBoiler( DrumBoiler object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Asynchronous Machine Equivalent Circuit</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Asynchronous Machine Equivalent Circuit</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAsynchronousMachineEquivalentCircuit( AsynchronousMachineEquivalentCircuit object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Wind Cont QIEC</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Wind Cont QIEC</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseWindContQIEC( WindContQIEC object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>PSR Event</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>PSR Event</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePSREvent( PSREvent object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>DER Group Forecast Request</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>DER Group Forecast Request</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDERGroupForecastRequest( DERGroupForecastRequest object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Transformer Core Admittance</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Transformer Core Admittance</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTransformerCoreAdmittance( TransformerCoreAdmittance object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Remote Control</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Remote Control</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseRemoteControl( RemoteControl object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Mechanical Load User Defined</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Mechanical Load User Defined</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseMechanicalLoadUserDefined( MechanicalLoadUserDefined object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Sv Injection</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Sv Injection</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSvInjection( SvInjection object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Fault Cause Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Fault Cause Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseFaultCauseType( FaultCauseType object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Photo Voltaic Unit</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Photo Voltaic Unit</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePhotoVoltaicUnit( PhotoVoltaicUnit object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Gov Steam SGO</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Gov Steam SGO</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseGovSteamSGO( GovSteamSGO object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Interval Reading</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Interval Reading</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseIntervalReading( IntervalReading object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Switching Step Group</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Switching Step Group</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSwitchingStepGroup( SwitchingStepGroup object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Exc IEEEAC7B</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Exc IEEEAC7B</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseExcIEEEAC7B( ExcIEEEAC7B object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Pss2 ST</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Pss2 ST</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePss2ST( Pss2ST object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Accumulator Limit</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Accumulator Limit</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAccumulatorLimit( AccumulatorLimit object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Exc AC6A</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Exc AC6A</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseExcAC6A( ExcAC6A object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Switch Action</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Switch Action</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSwitchAction( SwitchAction object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Wire Assembly Info</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Wire Assembly Info</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseWireAssemblyInfo( WireAssemblyInfo object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Measurement Value</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Measurement Value</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseMeasurementValue( MeasurementValue object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Calculation Method Hierarchy</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Calculation Method Hierarchy</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCalculationMethodHierarchy( CalculationMethodHierarchy object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>DC Base Terminal</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>DC Base Terminal</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDCBaseTerminal( DCBaseTerminal object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Voltage Compensator Dynamics</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Voltage Compensator Dynamics</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseVoltageCompensatorDynamics( VoltageCompensatorDynamics object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Transformer Star Impedance</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Transformer Star Impedance</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTransformerStarImpedance( TransformerStarImpedance object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>TCP Access Point</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>TCP Access Point</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTCPAccessPoint( TCPAccessPoint object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Connect Disconnect Function</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Connect Disconnect Function</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseConnectDisconnectFunction( ConnectDisconnectFunction object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>ICCP Provided Point</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>ICCP Provided Point</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseICCPProvidedPoint( ICCPProvidedPoint object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Protected Switch</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Protected Switch</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseProtectedSwitch( ProtectedSwitch object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Load Response Characteristic</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Load Response Characteristic</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseLoadResponseCharacteristic( LoadResponseCharacteristic object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Service Supplier</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Service Supplier</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseServiceSupplier( ServiceSupplier object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Cashier</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Cashier</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCashier( Cashier object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Fuse</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Fuse</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseFuse( Fuse object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Wind Aero One Dim IEC</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Wind Aero One Dim IEC</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseWindAeroOneDimIEC( WindAeroOneDimIEC object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Gov Hydro3</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Gov Hydro3</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseGovHydro3( GovHydro3 object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Exc AVR7</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Exc AVR7</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseExcAVR7( ExcAVR7 object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Start Ign Fuel Curve</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Start Ign Fuel Curve</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseStartIgnFuelCurve( StartIgnFuelCurve object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Station Supply</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Station Supply</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseStationSupply( StationSupply object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Non Conform Load Group</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Non Conform Load Group</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseNonConformLoadGroup( NonConformLoadGroup object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Data Set Member</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Data Set Member</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDataSetMember( DataSetMember object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>DC Disconnector</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>DC Disconnector</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDCDisconnector( DCDisconnector object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Exc OEX3T</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Exc OEX3T</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseExcOEX3T( ExcOEX3T object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Exc DC1A</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Exc DC1A</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseExcDC1A( ExcDC1A object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Shutdown Curve</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Shutdown Curve</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseShutdownCurve( ShutdownCurve object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Wind Gen Type3a IEC</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Wind Gen Type3a IEC</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseWindGenType3aIEC( WindGenType3aIEC object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Test Standard</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Test Standard</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTestStandard( TestStandard object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Curve Data</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Curve Data</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCurveData( CurveData object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Subcritical</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Subcritical</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSubcritical( Subcritical object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Phase Tap Changer</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Phase Tap Changer</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePhaseTapChanger( PhaseTapChanger object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>PFV Ar Controller Type2 User Defined</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>PFV Ar Controller Type2 User Defined</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePFVArControllerType2UserDefined( PFVArControllerType2UserDefined object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Phase Tap Changer Non Linear</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Phase Tap Changer Non Linear</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePhaseTapChangerNonLinear( PhaseTapChangerNonLinear object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>DC Ground</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>DC Ground</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDCGround( DCGround object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Line Fault</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Line Fault</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseLineFault( LineFault object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Voltage Compensator User Defined</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Voltage Compensator User Defined</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseVoltageCompensatorUserDefined( VoltageCompensatorUserDefined object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>External Network Injection</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>External Network Injection</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseExternalNetworkInjection( ExternalNetworkInjection object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Wave Trap</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Wave Trap</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseWaveTrap( WaveTrap object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Equivalent Equipment</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Equivalent Equipment</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseEquivalentEquipment( EquivalentEquipment object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Object Reverse Modification</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Object Reverse Modification</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseObjectReverseModification( ObjectReverseModification object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Tap Schedule</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Tap Schedule</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTapSchedule( TapSchedule object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Exc ANS</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Exc ANS</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseExcANS( ExcANS object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Tap Changer Control</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Tap Changer Control</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTapChangerControl( TapChangerControl object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Gov Hydro DD</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Gov Hydro DD</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseGovHydroDD( GovHydroDD object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Load Dynamics</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Load Dynamics</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseLoadDynamics( LoadDynamics object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Exc ST7B</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Exc ST7B</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseExcST7B( ExcST7B object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Hydro Generating Efficiency Curve</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Hydro Generating Efficiency Curve</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseHydroGeneratingEfficiencyCurve( HydroGeneratingEfficiencyCurve object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Penstock Loss Curve</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Penstock Loss Curve</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePenstockLossCurve( PenstockLossCurve object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Energy Source Action</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Energy Source Action</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseEnergySourceAction( EnergySourceAction object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Hydro Power Plant</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Hydro Power Plant</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseHydroPowerPlant( HydroPowerPlant object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Manufacturer</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Manufacturer</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseManufacturer( Manufacturer object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Turbine Load Controller User Defined</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Turbine Load Controller User Defined</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTurbineLoadControllerUserDefined( TurbineLoadControllerUserDefined object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Pending Calculation</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Pending Calculation</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePendingCalculation( PendingCalculation object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Bushing Info</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Bushing Info</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseBushingInfo( BushingInfo object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Exc ST4B</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Exc ST4B</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseExcST4B( ExcST4B object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Asset Test Sample Taker</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Asset Test Sample Taker</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAssetTestSampleTaker( AssetTestSampleTaker object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Level Vs Volume Curve</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Level Vs Volume Curve</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseLevelVsVolumeCurve( LevelVsVolumeCurve object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Phase Tap Changer Linear</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Phase Tap Changer Linear</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePhaseTapChangerLinear( PhaseTapChangerLinear object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Diagram</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Diagram</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDiagram( Diagram object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Reading Quality Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Reading Quality Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseReadingQualityType( ReadingQualityType object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Com Module</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Com Module</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseComModule( ComModule object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Accumulator Reset</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Accumulator Reset</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAccumulatorReset( AccumulatorReset object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Tool</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Tool</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTool( Tool object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Command</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Command</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCommand( Command object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Exc BBC</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Exc BBC</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseExcBBC( ExcBBC object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Discontinuous Excitation Control User Defined</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Discontinuous Excitation Control User Defined</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDiscontinuousExcitationControlUserDefined( DiscontinuousExcitationControlUserDefined object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Meter Work Task</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Meter Work Task</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseMeterWorkTask( MeterWorkTask object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Geographical Region</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Geographical Region</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseGeographicalRegion( GeographicalRegion object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Pss SB4</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Pss SB4</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePssSB4( PssSB4 object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Load Motor</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Load Motor</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseLoadMotor( LoadMotor object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>DC Line Segment</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>DC Line Segment</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDCLineSegment( DCLineSegment object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>PFV Ar Type2 IEEEPF Controller</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>PFV Ar Type2 IEEEPF Controller</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePFVArType2IEEEPFController( PFVArType2IEEEPFController object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>PFV Ar Type2 IEEEV Ar Controller</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>PFV Ar Type2 IEEEV Ar Controller</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePFVArType2IEEEVArController( PFVArType2IEEEVArController object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Cashier Shift</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Cashier Shift</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCashierShift( CashierShift object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Startup Model</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Startup Model</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseStartupModel( StartupModel object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Analog</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Analog</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAnalog( Analog object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Remote Point</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Remote Point</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseRemotePoint( RemotePoint object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>DC Shunt</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>DC Shunt</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDCShunt( DCShunt object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Voltage Limit</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Voltage Limit</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseVoltageLimit( VoltageLimit object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>DC Converter Unit</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>DC Converter Unit</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDCConverterUnit( DCConverterUnit object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>DC Breaker</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>DC Breaker</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDCBreaker( DCBreaker object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Cabinet</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Cabinet</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCabinet( Cabinet object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Synchronous Machine Simplified</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Synchronous Machine Simplified</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSynchronousMachineSimplified( SynchronousMachineSimplified object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Pss ELIN2</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Pss ELIN2</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePssELIN2( PssELIN2 object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Gov Steam FV4</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Gov Steam FV4</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseGovSteamFV4( GovSteamFV4 object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Asset Test Lab</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Asset Test Lab</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAssetTestLab( AssetTestLab object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Asset Temperature Pressure Analog</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Asset Temperature Pressure Analog</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAssetTemperaturePressureAnalog( AssetTemperaturePressureAnalog object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Proprietary Parameter Dynamics</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Proprietary Parameter Dynamics</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseProprietaryParameterDynamics( ProprietaryParameterDynamics object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Base Frequency</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Base Frequency</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseBaseFrequency( BaseFrequency object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Maintenance Location</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Maintenance Location</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseMaintenanceLocation( MaintenanceLocation object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Raise Lower Command</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Raise Lower Command</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseRaiseLowerCommand( RaiseLowerCommand object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Exc ELIN2</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Exc ELIN2</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseExcELIN2( ExcELIN2 object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Bilateral Exchange Agreement</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Bilateral Exchange Agreement</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseBilateralExchangeAgreement( BilateralExchangeAgreement object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Wind Plant User Defined</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Wind Plant User Defined</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseWindPlantUserDefined( WindPlantUserDefined object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Gov Hydro Francis</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Gov Hydro Francis</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseGovHydroFrancis( GovHydroFrancis object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Wind Cont PType4b IEC</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Wind Cont PType4b IEC</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseWindContPType4bIEC( WindContPType4bIEC object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Conductor</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Conductor</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseConductor( Conductor object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Frequency Converter</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Frequency Converter</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseFrequencyConverter( FrequencyConverter object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Exc IEEEAC2A</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Exc IEEEAC2A</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseExcIEEEAC2A( ExcIEEEAC2A object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Exc IEEEST3A</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Exc IEEEST3A</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseExcIEEEST3A( ExcIEEEST3A object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Pss1</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Pss1</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePss1( Pss1 object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Tag Action</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Tag Action</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTagAction( TagAction object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Measurement Value Quality</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Measurement Value Quality</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseMeasurementValueQuality( MeasurementValueQuality object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Transactor</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Transactor</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTransactor( Transactor object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Analog Limit Set</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Analog Limit Set</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAnalogLimitSet( AnalogLimitSet object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Merchant Account</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Merchant Account</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseMerchantAccount( MerchantAccount object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Object Creation</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Object Creation</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseObjectCreation( ObjectCreation object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Supercritical</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Supercritical</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSupercritical( Supercritical object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Com Media</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Com Media</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseComMedia( ComMedia object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Asynchronous Machine</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Asynchronous Machine</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAsynchronousMachine( AsynchronousMachine object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Load Group</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Load Group</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseLoadGroup( LoadGroup object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Equivalent Network</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Equivalent Network</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseEquivalentNetwork( EquivalentNetwork object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Energy Area</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Energy Area</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseEnergyArea( EnergyArea object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch, but this is the last case anyway.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject)
     * @generated
     */
    @Override
    public T defaultCase( EObject object ) {
        return null;
    }

} //CimSwitch
