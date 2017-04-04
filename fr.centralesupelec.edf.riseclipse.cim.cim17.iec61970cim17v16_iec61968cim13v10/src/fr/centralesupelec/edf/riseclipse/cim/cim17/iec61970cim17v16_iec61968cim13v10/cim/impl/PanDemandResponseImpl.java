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

import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ControlledAppliance;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PanDemandResponse;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pan Demand Response</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PanDemandResponseImpl#getAvgLoadAdjustment <em>Avg Load Adjustment</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PanDemandResponseImpl#getCancelControlMode <em>Cancel Control Mode</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PanDemandResponseImpl#getCancelDateTime <em>Cancel Date Time</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PanDemandResponseImpl#getCancelNow <em>Cancel Now</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PanDemandResponseImpl#getCoolingOffset <em>Cooling Offset</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PanDemandResponseImpl#getCoolingSetpoint <em>Cooling Setpoint</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PanDemandResponseImpl#getCriticalityLevel <em>Criticality Level</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PanDemandResponseImpl#getDutyCycle <em>Duty Cycle</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PanDemandResponseImpl#getEnrollmentGroup <em>Enrollment Group</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PanDemandResponseImpl#getHeatingOffset <em>Heating Offset</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PanDemandResponseImpl#getHeatingSetpoint <em>Heating Setpoint</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PanDemandResponseImpl#getAppliance <em>Appliance</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PanDemandResponseImpl extends EndDeviceActionImpl implements PanDemandResponse {
    /**
     * The default value of the '{@link #getAvgLoadAdjustment() <em>Avg Load Adjustment</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAvgLoadAdjustment()
     * @generated
     * @ordered
     */
    protected static final Float AVG_LOAD_ADJUSTMENT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getAvgLoadAdjustment() <em>Avg Load Adjustment</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAvgLoadAdjustment()
     * @generated
     * @ordered
     */
    protected Float avgLoadAdjustment = AVG_LOAD_ADJUSTMENT_EDEFAULT;

    /**
     * This is true if the Avg Load Adjustment attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean avgLoadAdjustmentESet;

    /**
     * The default value of the '{@link #getCancelControlMode() <em>Cancel Control Mode</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCancelControlMode()
     * @generated
     * @ordered
     */
    protected static final String CANCEL_CONTROL_MODE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getCancelControlMode() <em>Cancel Control Mode</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCancelControlMode()
     * @generated
     * @ordered
     */
    protected String cancelControlMode = CANCEL_CONTROL_MODE_EDEFAULT;

    /**
     * This is true if the Cancel Control Mode attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean cancelControlModeESet;

    /**
     * The default value of the '{@link #getCancelDateTime() <em>Cancel Date Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCancelDateTime()
     * @generated
     * @ordered
     */
    protected static final Date CANCEL_DATE_TIME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getCancelDateTime() <em>Cancel Date Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCancelDateTime()
     * @generated
     * @ordered
     */
    protected Date cancelDateTime = CANCEL_DATE_TIME_EDEFAULT;

    /**
     * This is true if the Cancel Date Time attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean cancelDateTimeESet;

    /**
     * The default value of the '{@link #getCancelNow() <em>Cancel Now</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCancelNow()
     * @generated
     * @ordered
     */
    protected static final Boolean CANCEL_NOW_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getCancelNow() <em>Cancel Now</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCancelNow()
     * @generated
     * @ordered
     */
    protected Boolean cancelNow = CANCEL_NOW_EDEFAULT;

    /**
     * This is true if the Cancel Now attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean cancelNowESet;

    /**
     * The default value of the '{@link #getCoolingOffset() <em>Cooling Offset</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCoolingOffset()
     * @generated
     * @ordered
     */
    protected static final Float COOLING_OFFSET_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getCoolingOffset() <em>Cooling Offset</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCoolingOffset()
     * @generated
     * @ordered
     */
    protected Float coolingOffset = COOLING_OFFSET_EDEFAULT;

    /**
     * This is true if the Cooling Offset attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean coolingOffsetESet;

    /**
     * The default value of the '{@link #getCoolingSetpoint() <em>Cooling Setpoint</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCoolingSetpoint()
     * @generated
     * @ordered
     */
    protected static final Float COOLING_SETPOINT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getCoolingSetpoint() <em>Cooling Setpoint</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCoolingSetpoint()
     * @generated
     * @ordered
     */
    protected Float coolingSetpoint = COOLING_SETPOINT_EDEFAULT;

    /**
     * This is true if the Cooling Setpoint attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean coolingSetpointESet;

    /**
     * The default value of the '{@link #getCriticalityLevel() <em>Criticality Level</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCriticalityLevel()
     * @generated
     * @ordered
     */
    protected static final String CRITICALITY_LEVEL_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getCriticalityLevel() <em>Criticality Level</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCriticalityLevel()
     * @generated
     * @ordered
     */
    protected String criticalityLevel = CRITICALITY_LEVEL_EDEFAULT;

    /**
     * This is true if the Criticality Level attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean criticalityLevelESet;

    /**
     * The default value of the '{@link #getDutyCycle() <em>Duty Cycle</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDutyCycle()
     * @generated
     * @ordered
     */
    protected static final Float DUTY_CYCLE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDutyCycle() <em>Duty Cycle</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDutyCycle()
     * @generated
     * @ordered
     */
    protected Float dutyCycle = DUTY_CYCLE_EDEFAULT;

    /**
     * This is true if the Duty Cycle attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean dutyCycleESet;

    /**
     * The default value of the '{@link #getEnrollmentGroup() <em>Enrollment Group</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEnrollmentGroup()
     * @generated
     * @ordered
     */
    protected static final String ENROLLMENT_GROUP_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getEnrollmentGroup() <em>Enrollment Group</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEnrollmentGroup()
     * @generated
     * @ordered
     */
    protected String enrollmentGroup = ENROLLMENT_GROUP_EDEFAULT;

    /**
     * This is true if the Enrollment Group attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean enrollmentGroupESet;

    /**
     * The default value of the '{@link #getHeatingOffset() <em>Heating Offset</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getHeatingOffset()
     * @generated
     * @ordered
     */
    protected static final Float HEATING_OFFSET_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getHeatingOffset() <em>Heating Offset</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getHeatingOffset()
     * @generated
     * @ordered
     */
    protected Float heatingOffset = HEATING_OFFSET_EDEFAULT;

    /**
     * This is true if the Heating Offset attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean heatingOffsetESet;

    /**
     * The default value of the '{@link #getHeatingSetpoint() <em>Heating Setpoint</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getHeatingSetpoint()
     * @generated
     * @ordered
     */
    protected static final Float HEATING_SETPOINT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getHeatingSetpoint() <em>Heating Setpoint</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getHeatingSetpoint()
     * @generated
     * @ordered
     */
    protected Float heatingSetpoint = HEATING_SETPOINT_EDEFAULT;

    /**
     * This is true if the Heating Setpoint attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean heatingSetpointESet;

    /**
     * The cached value of the '{@link #getAppliance() <em>Appliance</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAppliance()
     * @generated
     * @ordered
     */
    protected ControlledAppliance appliance;

    /**
     * This is true if the Appliance containment reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean applianceESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected PanDemandResponseImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getPanDemandResponse();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getAvgLoadAdjustment() {
        return avgLoadAdjustment;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setAvgLoadAdjustment( Float newAvgLoadAdjustment ) {
        Float oldAvgLoadAdjustment = avgLoadAdjustment;
        avgLoadAdjustment = newAvgLoadAdjustment;
        boolean oldAvgLoadAdjustmentESet = avgLoadAdjustmentESet;
        avgLoadAdjustmentESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.PAN_DEMAND_RESPONSE__AVG_LOAD_ADJUSTMENT,
                    oldAvgLoadAdjustment, avgLoadAdjustment, !oldAvgLoadAdjustmentESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetAvgLoadAdjustment() {
        Float oldAvgLoadAdjustment = avgLoadAdjustment;
        boolean oldAvgLoadAdjustmentESet = avgLoadAdjustmentESet;
        avgLoadAdjustment = AVG_LOAD_ADJUSTMENT_EDEFAULT;
        avgLoadAdjustmentESet = false;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.UNSET, CimPackage.PAN_DEMAND_RESPONSE__AVG_LOAD_ADJUSTMENT,
                        oldAvgLoadAdjustment, AVG_LOAD_ADJUSTMENT_EDEFAULT, oldAvgLoadAdjustmentESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetAvgLoadAdjustment() {
        return avgLoadAdjustmentESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getCancelControlMode() {
        return cancelControlMode;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setCancelControlMode( String newCancelControlMode ) {
        String oldCancelControlMode = cancelControlMode;
        cancelControlMode = newCancelControlMode;
        boolean oldCancelControlModeESet = cancelControlModeESet;
        cancelControlModeESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.PAN_DEMAND_RESPONSE__CANCEL_CONTROL_MODE,
                    oldCancelControlMode, cancelControlMode, !oldCancelControlModeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetCancelControlMode() {
        String oldCancelControlMode = cancelControlMode;
        boolean oldCancelControlModeESet = cancelControlModeESet;
        cancelControlMode = CANCEL_CONTROL_MODE_EDEFAULT;
        cancelControlModeESet = false;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.UNSET, CimPackage.PAN_DEMAND_RESPONSE__CANCEL_CONTROL_MODE,
                        oldCancelControlMode, CANCEL_CONTROL_MODE_EDEFAULT, oldCancelControlModeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetCancelControlMode() {
        return cancelControlModeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Date getCancelDateTime() {
        return cancelDateTime;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setCancelDateTime( Date newCancelDateTime ) {
        Date oldCancelDateTime = cancelDateTime;
        cancelDateTime = newCancelDateTime;
        boolean oldCancelDateTimeESet = cancelDateTimeESet;
        cancelDateTimeESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.PAN_DEMAND_RESPONSE__CANCEL_DATE_TIME,
                    oldCancelDateTime, cancelDateTime, !oldCancelDateTimeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetCancelDateTime() {
        Date oldCancelDateTime = cancelDateTime;
        boolean oldCancelDateTimeESet = cancelDateTimeESet;
        cancelDateTime = CANCEL_DATE_TIME_EDEFAULT;
        cancelDateTimeESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.PAN_DEMAND_RESPONSE__CANCEL_DATE_TIME,
                    oldCancelDateTime, CANCEL_DATE_TIME_EDEFAULT, oldCancelDateTimeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetCancelDateTime() {
        return cancelDateTimeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getCancelNow() {
        return cancelNow;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setCancelNow( Boolean newCancelNow ) {
        Boolean oldCancelNow = cancelNow;
        cancelNow = newCancelNow;
        boolean oldCancelNowESet = cancelNowESet;
        cancelNowESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.PAN_DEMAND_RESPONSE__CANCEL_NOW, oldCancelNow, cancelNow, !oldCancelNowESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetCancelNow() {
        Boolean oldCancelNow = cancelNow;
        boolean oldCancelNowESet = cancelNowESet;
        cancelNow = CANCEL_NOW_EDEFAULT;
        cancelNowESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.PAN_DEMAND_RESPONSE__CANCEL_NOW, oldCancelNow, CANCEL_NOW_EDEFAULT, oldCancelNowESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetCancelNow() {
        return cancelNowESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getCoolingOffset() {
        return coolingOffset;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setCoolingOffset( Float newCoolingOffset ) {
        Float oldCoolingOffset = coolingOffset;
        coolingOffset = newCoolingOffset;
        boolean oldCoolingOffsetESet = coolingOffsetESet;
        coolingOffsetESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.PAN_DEMAND_RESPONSE__COOLING_OFFSET,
                    oldCoolingOffset, coolingOffset, !oldCoolingOffsetESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetCoolingOffset() {
        Float oldCoolingOffset = coolingOffset;
        boolean oldCoolingOffsetESet = coolingOffsetESet;
        coolingOffset = COOLING_OFFSET_EDEFAULT;
        coolingOffsetESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.PAN_DEMAND_RESPONSE__COOLING_OFFSET,
                    oldCoolingOffset, COOLING_OFFSET_EDEFAULT, oldCoolingOffsetESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetCoolingOffset() {
        return coolingOffsetESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getCoolingSetpoint() {
        return coolingSetpoint;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setCoolingSetpoint( Float newCoolingSetpoint ) {
        Float oldCoolingSetpoint = coolingSetpoint;
        coolingSetpoint = newCoolingSetpoint;
        boolean oldCoolingSetpointESet = coolingSetpointESet;
        coolingSetpointESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.PAN_DEMAND_RESPONSE__COOLING_SETPOINT,
                    oldCoolingSetpoint, coolingSetpoint, !oldCoolingSetpointESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetCoolingSetpoint() {
        Float oldCoolingSetpoint = coolingSetpoint;
        boolean oldCoolingSetpointESet = coolingSetpointESet;
        coolingSetpoint = COOLING_SETPOINT_EDEFAULT;
        coolingSetpointESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.PAN_DEMAND_RESPONSE__COOLING_SETPOINT,
                    oldCoolingSetpoint, COOLING_SETPOINT_EDEFAULT, oldCoolingSetpointESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetCoolingSetpoint() {
        return coolingSetpointESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getCriticalityLevel() {
        return criticalityLevel;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setCriticalityLevel( String newCriticalityLevel ) {
        String oldCriticalityLevel = criticalityLevel;
        criticalityLevel = newCriticalityLevel;
        boolean oldCriticalityLevelESet = criticalityLevelESet;
        criticalityLevelESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.PAN_DEMAND_RESPONSE__CRITICALITY_LEVEL,
                    oldCriticalityLevel, criticalityLevel, !oldCriticalityLevelESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetCriticalityLevel() {
        String oldCriticalityLevel = criticalityLevel;
        boolean oldCriticalityLevelESet = criticalityLevelESet;
        criticalityLevel = CRITICALITY_LEVEL_EDEFAULT;
        criticalityLevelESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.PAN_DEMAND_RESPONSE__CRITICALITY_LEVEL,
                    oldCriticalityLevel, CRITICALITY_LEVEL_EDEFAULT, oldCriticalityLevelESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetCriticalityLevel() {
        return criticalityLevelESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getDutyCycle() {
        return dutyCycle;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setDutyCycle( Float newDutyCycle ) {
        Float oldDutyCycle = dutyCycle;
        dutyCycle = newDutyCycle;
        boolean oldDutyCycleESet = dutyCycleESet;
        dutyCycleESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.PAN_DEMAND_RESPONSE__DUTY_CYCLE, oldDutyCycle, dutyCycle, !oldDutyCycleESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetDutyCycle() {
        Float oldDutyCycle = dutyCycle;
        boolean oldDutyCycleESet = dutyCycleESet;
        dutyCycle = DUTY_CYCLE_EDEFAULT;
        dutyCycleESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.PAN_DEMAND_RESPONSE__DUTY_CYCLE, oldDutyCycle, DUTY_CYCLE_EDEFAULT, oldDutyCycleESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetDutyCycle() {
        return dutyCycleESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getEnrollmentGroup() {
        return enrollmentGroup;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setEnrollmentGroup( String newEnrollmentGroup ) {
        String oldEnrollmentGroup = enrollmentGroup;
        enrollmentGroup = newEnrollmentGroup;
        boolean oldEnrollmentGroupESet = enrollmentGroupESet;
        enrollmentGroupESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.PAN_DEMAND_RESPONSE__ENROLLMENT_GROUP,
                    oldEnrollmentGroup, enrollmentGroup, !oldEnrollmentGroupESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetEnrollmentGroup() {
        String oldEnrollmentGroup = enrollmentGroup;
        boolean oldEnrollmentGroupESet = enrollmentGroupESet;
        enrollmentGroup = ENROLLMENT_GROUP_EDEFAULT;
        enrollmentGroupESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.PAN_DEMAND_RESPONSE__ENROLLMENT_GROUP,
                    oldEnrollmentGroup, ENROLLMENT_GROUP_EDEFAULT, oldEnrollmentGroupESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetEnrollmentGroup() {
        return enrollmentGroupESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getHeatingOffset() {
        return heatingOffset;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setHeatingOffset( Float newHeatingOffset ) {
        Float oldHeatingOffset = heatingOffset;
        heatingOffset = newHeatingOffset;
        boolean oldHeatingOffsetESet = heatingOffsetESet;
        heatingOffsetESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.PAN_DEMAND_RESPONSE__HEATING_OFFSET,
                    oldHeatingOffset, heatingOffset, !oldHeatingOffsetESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetHeatingOffset() {
        Float oldHeatingOffset = heatingOffset;
        boolean oldHeatingOffsetESet = heatingOffsetESet;
        heatingOffset = HEATING_OFFSET_EDEFAULT;
        heatingOffsetESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.PAN_DEMAND_RESPONSE__HEATING_OFFSET,
                    oldHeatingOffset, HEATING_OFFSET_EDEFAULT, oldHeatingOffsetESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetHeatingOffset() {
        return heatingOffsetESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getHeatingSetpoint() {
        return heatingSetpoint;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setHeatingSetpoint( Float newHeatingSetpoint ) {
        Float oldHeatingSetpoint = heatingSetpoint;
        heatingSetpoint = newHeatingSetpoint;
        boolean oldHeatingSetpointESet = heatingSetpointESet;
        heatingSetpointESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.PAN_DEMAND_RESPONSE__HEATING_SETPOINT,
                    oldHeatingSetpoint, heatingSetpoint, !oldHeatingSetpointESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetHeatingSetpoint() {
        Float oldHeatingSetpoint = heatingSetpoint;
        boolean oldHeatingSetpointESet = heatingSetpointESet;
        heatingSetpoint = HEATING_SETPOINT_EDEFAULT;
        heatingSetpointESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.PAN_DEMAND_RESPONSE__HEATING_SETPOINT,
                    oldHeatingSetpoint, HEATING_SETPOINT_EDEFAULT, oldHeatingSetpointESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetHeatingSetpoint() {
        return heatingSetpointESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ControlledAppliance getAppliance() {
        return appliance;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetAppliance( ControlledAppliance newAppliance, NotificationChain msgs ) {
        ControlledAppliance oldAppliance = appliance;
        appliance = newAppliance;
        boolean oldApplianceESet = applianceESet;
        applianceESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.PAN_DEMAND_RESPONSE__APPLIANCE, oldAppliance, newAppliance, !oldApplianceESet );
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
    public void setAppliance( ControlledAppliance newAppliance ) {
        if( newAppliance != appliance ) {
            NotificationChain msgs = null;
            if( appliance != null ) msgs = ( ( InternalEObject ) appliance ).eInverseRemove( this,
                    EOPPOSITE_FEATURE_BASE - CimPackage.PAN_DEMAND_RESPONSE__APPLIANCE, null, msgs );
            if( newAppliance != null ) msgs = ( ( InternalEObject ) newAppliance ).eInverseAdd( this,
                    EOPPOSITE_FEATURE_BASE - CimPackage.PAN_DEMAND_RESPONSE__APPLIANCE, null, msgs );
            msgs = basicSetAppliance( newAppliance, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldApplianceESet = applianceESet;
            applianceESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.PAN_DEMAND_RESPONSE__APPLIANCE, newAppliance, newAppliance, !oldApplianceESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetAppliance( NotificationChain msgs ) {
        ControlledAppliance oldAppliance = appliance;
        appliance = null;
        boolean oldApplianceESet = applianceESet;
        applianceESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.PAN_DEMAND_RESPONSE__APPLIANCE, oldAppliance, null, oldApplianceESet );
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
    public void unsetAppliance() {
        if( appliance != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) appliance ).eInverseRemove( this,
                    EOPPOSITE_FEATURE_BASE - CimPackage.PAN_DEMAND_RESPONSE__APPLIANCE, null, msgs );
            msgs = basicUnsetAppliance( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldApplianceESet = applianceESet;
            applianceESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.PAN_DEMAND_RESPONSE__APPLIANCE, null, null, oldApplianceESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetAppliance() {
        return applianceESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.PAN_DEMAND_RESPONSE__APPLIANCE:
            return basicUnsetAppliance( msgs );
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
        case CimPackage.PAN_DEMAND_RESPONSE__AVG_LOAD_ADJUSTMENT:
            return getAvgLoadAdjustment();
        case CimPackage.PAN_DEMAND_RESPONSE__CANCEL_CONTROL_MODE:
            return getCancelControlMode();
        case CimPackage.PAN_DEMAND_RESPONSE__CANCEL_DATE_TIME:
            return getCancelDateTime();
        case CimPackage.PAN_DEMAND_RESPONSE__CANCEL_NOW:
            return getCancelNow();
        case CimPackage.PAN_DEMAND_RESPONSE__COOLING_OFFSET:
            return getCoolingOffset();
        case CimPackage.PAN_DEMAND_RESPONSE__COOLING_SETPOINT:
            return getCoolingSetpoint();
        case CimPackage.PAN_DEMAND_RESPONSE__CRITICALITY_LEVEL:
            return getCriticalityLevel();
        case CimPackage.PAN_DEMAND_RESPONSE__DUTY_CYCLE:
            return getDutyCycle();
        case CimPackage.PAN_DEMAND_RESPONSE__ENROLLMENT_GROUP:
            return getEnrollmentGroup();
        case CimPackage.PAN_DEMAND_RESPONSE__HEATING_OFFSET:
            return getHeatingOffset();
        case CimPackage.PAN_DEMAND_RESPONSE__HEATING_SETPOINT:
            return getHeatingSetpoint();
        case CimPackage.PAN_DEMAND_RESPONSE__APPLIANCE:
            return getAppliance();
        }
        return super.eGet( featureID, resolve, coreType );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eSet( int featureID, Object newValue ) {
        switch( featureID ) {
        case CimPackage.PAN_DEMAND_RESPONSE__AVG_LOAD_ADJUSTMENT:
            setAvgLoadAdjustment( ( Float ) newValue );
            return;
        case CimPackage.PAN_DEMAND_RESPONSE__CANCEL_CONTROL_MODE:
            setCancelControlMode( ( String ) newValue );
            return;
        case CimPackage.PAN_DEMAND_RESPONSE__CANCEL_DATE_TIME:
            setCancelDateTime( ( Date ) newValue );
            return;
        case CimPackage.PAN_DEMAND_RESPONSE__CANCEL_NOW:
            setCancelNow( ( Boolean ) newValue );
            return;
        case CimPackage.PAN_DEMAND_RESPONSE__COOLING_OFFSET:
            setCoolingOffset( ( Float ) newValue );
            return;
        case CimPackage.PAN_DEMAND_RESPONSE__COOLING_SETPOINT:
            setCoolingSetpoint( ( Float ) newValue );
            return;
        case CimPackage.PAN_DEMAND_RESPONSE__CRITICALITY_LEVEL:
            setCriticalityLevel( ( String ) newValue );
            return;
        case CimPackage.PAN_DEMAND_RESPONSE__DUTY_CYCLE:
            setDutyCycle( ( Float ) newValue );
            return;
        case CimPackage.PAN_DEMAND_RESPONSE__ENROLLMENT_GROUP:
            setEnrollmentGroup( ( String ) newValue );
            return;
        case CimPackage.PAN_DEMAND_RESPONSE__HEATING_OFFSET:
            setHeatingOffset( ( Float ) newValue );
            return;
        case CimPackage.PAN_DEMAND_RESPONSE__HEATING_SETPOINT:
            setHeatingSetpoint( ( Float ) newValue );
            return;
        case CimPackage.PAN_DEMAND_RESPONSE__APPLIANCE:
            setAppliance( ( ControlledAppliance ) newValue );
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
        case CimPackage.PAN_DEMAND_RESPONSE__AVG_LOAD_ADJUSTMENT:
            unsetAvgLoadAdjustment();
            return;
        case CimPackage.PAN_DEMAND_RESPONSE__CANCEL_CONTROL_MODE:
            unsetCancelControlMode();
            return;
        case CimPackage.PAN_DEMAND_RESPONSE__CANCEL_DATE_TIME:
            unsetCancelDateTime();
            return;
        case CimPackage.PAN_DEMAND_RESPONSE__CANCEL_NOW:
            unsetCancelNow();
            return;
        case CimPackage.PAN_DEMAND_RESPONSE__COOLING_OFFSET:
            unsetCoolingOffset();
            return;
        case CimPackage.PAN_DEMAND_RESPONSE__COOLING_SETPOINT:
            unsetCoolingSetpoint();
            return;
        case CimPackage.PAN_DEMAND_RESPONSE__CRITICALITY_LEVEL:
            unsetCriticalityLevel();
            return;
        case CimPackage.PAN_DEMAND_RESPONSE__DUTY_CYCLE:
            unsetDutyCycle();
            return;
        case CimPackage.PAN_DEMAND_RESPONSE__ENROLLMENT_GROUP:
            unsetEnrollmentGroup();
            return;
        case CimPackage.PAN_DEMAND_RESPONSE__HEATING_OFFSET:
            unsetHeatingOffset();
            return;
        case CimPackage.PAN_DEMAND_RESPONSE__HEATING_SETPOINT:
            unsetHeatingSetpoint();
            return;
        case CimPackage.PAN_DEMAND_RESPONSE__APPLIANCE:
            unsetAppliance();
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
        case CimPackage.PAN_DEMAND_RESPONSE__AVG_LOAD_ADJUSTMENT:
            return isSetAvgLoadAdjustment();
        case CimPackage.PAN_DEMAND_RESPONSE__CANCEL_CONTROL_MODE:
            return isSetCancelControlMode();
        case CimPackage.PAN_DEMAND_RESPONSE__CANCEL_DATE_TIME:
            return isSetCancelDateTime();
        case CimPackage.PAN_DEMAND_RESPONSE__CANCEL_NOW:
            return isSetCancelNow();
        case CimPackage.PAN_DEMAND_RESPONSE__COOLING_OFFSET:
            return isSetCoolingOffset();
        case CimPackage.PAN_DEMAND_RESPONSE__COOLING_SETPOINT:
            return isSetCoolingSetpoint();
        case CimPackage.PAN_DEMAND_RESPONSE__CRITICALITY_LEVEL:
            return isSetCriticalityLevel();
        case CimPackage.PAN_DEMAND_RESPONSE__DUTY_CYCLE:
            return isSetDutyCycle();
        case CimPackage.PAN_DEMAND_RESPONSE__ENROLLMENT_GROUP:
            return isSetEnrollmentGroup();
        case CimPackage.PAN_DEMAND_RESPONSE__HEATING_OFFSET:
            return isSetHeatingOffset();
        case CimPackage.PAN_DEMAND_RESPONSE__HEATING_SETPOINT:
            return isSetHeatingSetpoint();
        case CimPackage.PAN_DEMAND_RESPONSE__APPLIANCE:
            return isSetAppliance();
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

        StringBuffer result = new StringBuffer( super.toString() );
        result.append( " (avgLoadAdjustment: " );
        if( avgLoadAdjustmentESet )
            result.append( avgLoadAdjustment );
        else
            result.append( "<unset>" );
        result.append( ", cancelControlMode: " );
        if( cancelControlModeESet )
            result.append( cancelControlMode );
        else
            result.append( "<unset>" );
        result.append( ", cancelDateTime: " );
        if( cancelDateTimeESet )
            result.append( cancelDateTime );
        else
            result.append( "<unset>" );
        result.append( ", cancelNow: " );
        if( cancelNowESet )
            result.append( cancelNow );
        else
            result.append( "<unset>" );
        result.append( ", coolingOffset: " );
        if( coolingOffsetESet )
            result.append( coolingOffset );
        else
            result.append( "<unset>" );
        result.append( ", coolingSetpoint: " );
        if( coolingSetpointESet )
            result.append( coolingSetpoint );
        else
            result.append( "<unset>" );
        result.append( ", criticalityLevel: " );
        if( criticalityLevelESet )
            result.append( criticalityLevel );
        else
            result.append( "<unset>" );
        result.append( ", dutyCycle: " );
        if( dutyCycleESet )
            result.append( dutyCycle );
        else
            result.append( "<unset>" );
        result.append( ", enrollmentGroup: " );
        if( enrollmentGroupESet )
            result.append( enrollmentGroup );
        else
            result.append( "<unset>" );
        result.append( ", heatingOffset: " );
        if( heatingOffsetESet )
            result.append( heatingOffset );
        else
            result.append( "<unset>" );
        result.append( ", heatingSetpoint: " );
        if( heatingSetpointESet )
            result.append( heatingSetpoint );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //PanDemandResponseImpl
