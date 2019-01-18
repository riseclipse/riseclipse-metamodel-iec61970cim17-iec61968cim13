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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.StartIgnFuelCurve;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.StartMainFuelCurve;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.StartRampCurve;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.StartupModel;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ThermalGeneratingUnit;

import java.math.BigDecimal;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Startup Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.StartupModelImpl#getFixedMaintCost <em>Fixed Maint Cost</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.StartupModelImpl#getHotStandbyHeat <em>Hot Standby Heat</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.StartupModelImpl#getIncrementalMaintCost <em>Incremental Maint Cost</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.StartupModelImpl#getMinimumDownTime <em>Minimum Down Time</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.StartupModelImpl#getMinimumRunTime <em>Minimum Run Time</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.StartupModelImpl#getRiskFactorCost <em>Risk Factor Cost</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.StartupModelImpl#getStartupCost <em>Startup Cost</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.StartupModelImpl#getStartupDate <em>Startup Date</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.StartupModelImpl#getStartupPriority <em>Startup Priority</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.StartupModelImpl#getStbyAuxP <em>Stby Aux P</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.StartupModelImpl#getStartRampCurve <em>Start Ramp Curve</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.StartupModelImpl#getStartIgnFuelCurve <em>Start Ign Fuel Curve</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.StartupModelImpl#getStartMainFuelCurve <em>Start Main Fuel Curve</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.StartupModelImpl#getThermalGeneratingUnit <em>Thermal Generating Unit</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StartupModelImpl extends IdentifiedObjectImpl implements StartupModel {
    /**
     * The default value of the '{@link #getFixedMaintCost() <em>Fixed Maint Cost</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFixedMaintCost()
     * @generated
     * @ordered
     */
    protected static final Float FIXED_MAINT_COST_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getFixedMaintCost() <em>Fixed Maint Cost</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFixedMaintCost()
     * @generated
     * @ordered
     */
    protected Float fixedMaintCost = FIXED_MAINT_COST_EDEFAULT;

    /**
     * This is true if the Fixed Maint Cost attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean fixedMaintCostESet;

    /**
     * The default value of the '{@link #getHotStandbyHeat() <em>Hot Standby Heat</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getHotStandbyHeat()
     * @generated
     * @ordered
     */
    protected static final Float HOT_STANDBY_HEAT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getHotStandbyHeat() <em>Hot Standby Heat</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getHotStandbyHeat()
     * @generated
     * @ordered
     */
    protected Float hotStandbyHeat = HOT_STANDBY_HEAT_EDEFAULT;

    /**
     * This is true if the Hot Standby Heat attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean hotStandbyHeatESet;

    /**
     * The default value of the '{@link #getIncrementalMaintCost() <em>Incremental Maint Cost</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIncrementalMaintCost()
     * @generated
     * @ordered
     */
    protected static final Float INCREMENTAL_MAINT_COST_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getIncrementalMaintCost() <em>Incremental Maint Cost</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIncrementalMaintCost()
     * @generated
     * @ordered
     */
    protected Float incrementalMaintCost = INCREMENTAL_MAINT_COST_EDEFAULT;

    /**
     * This is true if the Incremental Maint Cost attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean incrementalMaintCostESet;

    /**
     * The default value of the '{@link #getMinimumDownTime() <em>Minimum Down Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMinimumDownTime()
     * @generated
     * @ordered
     */
    protected static final Float MINIMUM_DOWN_TIME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getMinimumDownTime() <em>Minimum Down Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMinimumDownTime()
     * @generated
     * @ordered
     */
    protected Float minimumDownTime = MINIMUM_DOWN_TIME_EDEFAULT;

    /**
     * This is true if the Minimum Down Time attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean minimumDownTimeESet;

    /**
     * The default value of the '{@link #getMinimumRunTime() <em>Minimum Run Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMinimumRunTime()
     * @generated
     * @ordered
     */
    protected static final Float MINIMUM_RUN_TIME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getMinimumRunTime() <em>Minimum Run Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMinimumRunTime()
     * @generated
     * @ordered
     */
    protected Float minimumRunTime = MINIMUM_RUN_TIME_EDEFAULT;

    /**
     * This is true if the Minimum Run Time attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean minimumRunTimeESet;

    /**
     * The default value of the '{@link #getRiskFactorCost() <em>Risk Factor Cost</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRiskFactorCost()
     * @generated
     * @ordered
     */
    protected static final BigDecimal RISK_FACTOR_COST_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getRiskFactorCost() <em>Risk Factor Cost</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRiskFactorCost()
     * @generated
     * @ordered
     */
    protected BigDecimal riskFactorCost = RISK_FACTOR_COST_EDEFAULT;

    /**
     * This is true if the Risk Factor Cost attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean riskFactorCostESet;

    /**
     * The default value of the '{@link #getStartupCost() <em>Startup Cost</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getStartupCost()
     * @generated
     * @ordered
     */
    protected static final BigDecimal STARTUP_COST_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getStartupCost() <em>Startup Cost</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getStartupCost()
     * @generated
     * @ordered
     */
    protected BigDecimal startupCost = STARTUP_COST_EDEFAULT;

    /**
     * This is true if the Startup Cost attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean startupCostESet;

    /**
     * The default value of the '{@link #getStartupDate() <em>Startup Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getStartupDate()
     * @generated
     * @ordered
     */
    protected static final Date STARTUP_DATE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getStartupDate() <em>Startup Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getStartupDate()
     * @generated
     * @ordered
     */
    protected Date startupDate = STARTUP_DATE_EDEFAULT;

    /**
     * This is true if the Startup Date attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean startupDateESet;

    /**
     * The default value of the '{@link #getStartupPriority() <em>Startup Priority</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getStartupPriority()
     * @generated
     * @ordered
     */
    protected static final Integer STARTUP_PRIORITY_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getStartupPriority() <em>Startup Priority</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getStartupPriority()
     * @generated
     * @ordered
     */
    protected Integer startupPriority = STARTUP_PRIORITY_EDEFAULT;

    /**
     * This is true if the Startup Priority attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean startupPriorityESet;

    /**
     * The default value of the '{@link #getStbyAuxP() <em>Stby Aux P</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getStbyAuxP()
     * @generated
     * @ordered
     */
    protected static final Float STBY_AUX_P_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getStbyAuxP() <em>Stby Aux P</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getStbyAuxP()
     * @generated
     * @ordered
     */
    protected Float stbyAuxP = STBY_AUX_P_EDEFAULT;

    /**
     * This is true if the Stby Aux P attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean stbyAuxPESet;

    /**
     * The cached value of the '{@link #getStartRampCurve() <em>Start Ramp Curve</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getStartRampCurve()
     * @generated
     * @ordered
     */
    protected StartRampCurve startRampCurve;

    /**
     * This is true if the Start Ramp Curve reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean startRampCurveESet;

    /**
     * The cached value of the '{@link #getStartIgnFuelCurve() <em>Start Ign Fuel Curve</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getStartIgnFuelCurve()
     * @generated
     * @ordered
     */
    protected StartIgnFuelCurve startIgnFuelCurve;

    /**
     * This is true if the Start Ign Fuel Curve reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean startIgnFuelCurveESet;

    /**
     * The cached value of the '{@link #getStartMainFuelCurve() <em>Start Main Fuel Curve</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getStartMainFuelCurve()
     * @generated
     * @ordered
     */
    protected StartMainFuelCurve startMainFuelCurve;

    /**
     * This is true if the Start Main Fuel Curve reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean startMainFuelCurveESet;

    /**
     * The cached value of the '{@link #getThermalGeneratingUnit() <em>Thermal Generating Unit</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getThermalGeneratingUnit()
     * @generated
     * @ordered
     */
    protected ThermalGeneratingUnit thermalGeneratingUnit;

    /**
     * This is true if the Thermal Generating Unit reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean thermalGeneratingUnitESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected StartupModelImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getStartupModel();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getFixedMaintCost() {
        return fixedMaintCost;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setFixedMaintCost( Float newFixedMaintCost ) {
        Float oldFixedMaintCost = fixedMaintCost;
        fixedMaintCost = newFixedMaintCost;
        boolean oldFixedMaintCostESet = fixedMaintCostESet;
        fixedMaintCostESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.STARTUP_MODEL__FIXED_MAINT_COST,
                    oldFixedMaintCost, fixedMaintCost, !oldFixedMaintCostESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetFixedMaintCost() {
        Float oldFixedMaintCost = fixedMaintCost;
        boolean oldFixedMaintCostESet = fixedMaintCostESet;
        fixedMaintCost = FIXED_MAINT_COST_EDEFAULT;
        fixedMaintCostESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.STARTUP_MODEL__FIXED_MAINT_COST,
                    oldFixedMaintCost, FIXED_MAINT_COST_EDEFAULT, oldFixedMaintCostESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetFixedMaintCost() {
        return fixedMaintCostESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getHotStandbyHeat() {
        return hotStandbyHeat;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setHotStandbyHeat( Float newHotStandbyHeat ) {
        Float oldHotStandbyHeat = hotStandbyHeat;
        hotStandbyHeat = newHotStandbyHeat;
        boolean oldHotStandbyHeatESet = hotStandbyHeatESet;
        hotStandbyHeatESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.STARTUP_MODEL__HOT_STANDBY_HEAT,
                    oldHotStandbyHeat, hotStandbyHeat, !oldHotStandbyHeatESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetHotStandbyHeat() {
        Float oldHotStandbyHeat = hotStandbyHeat;
        boolean oldHotStandbyHeatESet = hotStandbyHeatESet;
        hotStandbyHeat = HOT_STANDBY_HEAT_EDEFAULT;
        hotStandbyHeatESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.STARTUP_MODEL__HOT_STANDBY_HEAT,
                    oldHotStandbyHeat, HOT_STANDBY_HEAT_EDEFAULT, oldHotStandbyHeatESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetHotStandbyHeat() {
        return hotStandbyHeatESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getIncrementalMaintCost() {
        return incrementalMaintCost;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setIncrementalMaintCost( Float newIncrementalMaintCost ) {
        Float oldIncrementalMaintCost = incrementalMaintCost;
        incrementalMaintCost = newIncrementalMaintCost;
        boolean oldIncrementalMaintCostESet = incrementalMaintCostESet;
        incrementalMaintCostESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.STARTUP_MODEL__INCREMENTAL_MAINT_COST,
                    oldIncrementalMaintCost, incrementalMaintCost, !oldIncrementalMaintCostESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetIncrementalMaintCost() {
        Float oldIncrementalMaintCost = incrementalMaintCost;
        boolean oldIncrementalMaintCostESet = incrementalMaintCostESet;
        incrementalMaintCost = INCREMENTAL_MAINT_COST_EDEFAULT;
        incrementalMaintCostESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.STARTUP_MODEL__INCREMENTAL_MAINT_COST,
                    oldIncrementalMaintCost, INCREMENTAL_MAINT_COST_EDEFAULT, oldIncrementalMaintCostESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetIncrementalMaintCost() {
        return incrementalMaintCostESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getMinimumDownTime() {
        return minimumDownTime;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setMinimumDownTime( Float newMinimumDownTime ) {
        Float oldMinimumDownTime = minimumDownTime;
        minimumDownTime = newMinimumDownTime;
        boolean oldMinimumDownTimeESet = minimumDownTimeESet;
        minimumDownTimeESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.STARTUP_MODEL__MINIMUM_DOWN_TIME,
                    oldMinimumDownTime, minimumDownTime, !oldMinimumDownTimeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetMinimumDownTime() {
        Float oldMinimumDownTime = minimumDownTime;
        boolean oldMinimumDownTimeESet = minimumDownTimeESet;
        minimumDownTime = MINIMUM_DOWN_TIME_EDEFAULT;
        minimumDownTimeESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.STARTUP_MODEL__MINIMUM_DOWN_TIME,
                    oldMinimumDownTime, MINIMUM_DOWN_TIME_EDEFAULT, oldMinimumDownTimeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetMinimumDownTime() {
        return minimumDownTimeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getMinimumRunTime() {
        return minimumRunTime;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setMinimumRunTime( Float newMinimumRunTime ) {
        Float oldMinimumRunTime = minimumRunTime;
        minimumRunTime = newMinimumRunTime;
        boolean oldMinimumRunTimeESet = minimumRunTimeESet;
        minimumRunTimeESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.STARTUP_MODEL__MINIMUM_RUN_TIME,
                    oldMinimumRunTime, minimumRunTime, !oldMinimumRunTimeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetMinimumRunTime() {
        Float oldMinimumRunTime = minimumRunTime;
        boolean oldMinimumRunTimeESet = minimumRunTimeESet;
        minimumRunTime = MINIMUM_RUN_TIME_EDEFAULT;
        minimumRunTimeESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.STARTUP_MODEL__MINIMUM_RUN_TIME,
                    oldMinimumRunTime, MINIMUM_RUN_TIME_EDEFAULT, oldMinimumRunTimeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetMinimumRunTime() {
        return minimumRunTimeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public BigDecimal getRiskFactorCost() {
        return riskFactorCost;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setRiskFactorCost( BigDecimal newRiskFactorCost ) {
        BigDecimal oldRiskFactorCost = riskFactorCost;
        riskFactorCost = newRiskFactorCost;
        boolean oldRiskFactorCostESet = riskFactorCostESet;
        riskFactorCostESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.STARTUP_MODEL__RISK_FACTOR_COST,
                    oldRiskFactorCost, riskFactorCost, !oldRiskFactorCostESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetRiskFactorCost() {
        BigDecimal oldRiskFactorCost = riskFactorCost;
        boolean oldRiskFactorCostESet = riskFactorCostESet;
        riskFactorCost = RISK_FACTOR_COST_EDEFAULT;
        riskFactorCostESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.STARTUP_MODEL__RISK_FACTOR_COST,
                    oldRiskFactorCost, RISK_FACTOR_COST_EDEFAULT, oldRiskFactorCostESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRiskFactorCost() {
        return riskFactorCostESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public BigDecimal getStartupCost() {
        return startupCost;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setStartupCost( BigDecimal newStartupCost ) {
        BigDecimal oldStartupCost = startupCost;
        startupCost = newStartupCost;
        boolean oldStartupCostESet = startupCostESet;
        startupCostESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.STARTUP_MODEL__STARTUP_COST, oldStartupCost, startupCost, !oldStartupCostESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetStartupCost() {
        BigDecimal oldStartupCost = startupCost;
        boolean oldStartupCostESet = startupCostESet;
        startupCost = STARTUP_COST_EDEFAULT;
        startupCostESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.STARTUP_MODEL__STARTUP_COST, oldStartupCost, STARTUP_COST_EDEFAULT, oldStartupCostESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetStartupCost() {
        return startupCostESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Date getStartupDate() {
        return startupDate;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setStartupDate( Date newStartupDate ) {
        Date oldStartupDate = startupDate;
        startupDate = newStartupDate;
        boolean oldStartupDateESet = startupDateESet;
        startupDateESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.STARTUP_MODEL__STARTUP_DATE, oldStartupDate, startupDate, !oldStartupDateESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetStartupDate() {
        Date oldStartupDate = startupDate;
        boolean oldStartupDateESet = startupDateESet;
        startupDate = STARTUP_DATE_EDEFAULT;
        startupDateESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.STARTUP_MODEL__STARTUP_DATE, oldStartupDate, STARTUP_DATE_EDEFAULT, oldStartupDateESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetStartupDate() {
        return startupDateESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Integer getStartupPriority() {
        return startupPriority;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setStartupPriority( Integer newStartupPriority ) {
        Integer oldStartupPriority = startupPriority;
        startupPriority = newStartupPriority;
        boolean oldStartupPriorityESet = startupPriorityESet;
        startupPriorityESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.STARTUP_MODEL__STARTUP_PRIORITY,
                    oldStartupPriority, startupPriority, !oldStartupPriorityESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetStartupPriority() {
        Integer oldStartupPriority = startupPriority;
        boolean oldStartupPriorityESet = startupPriorityESet;
        startupPriority = STARTUP_PRIORITY_EDEFAULT;
        startupPriorityESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.STARTUP_MODEL__STARTUP_PRIORITY,
                    oldStartupPriority, STARTUP_PRIORITY_EDEFAULT, oldStartupPriorityESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetStartupPriority() {
        return startupPriorityESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getStbyAuxP() {
        return stbyAuxP;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setStbyAuxP( Float newStbyAuxP ) {
        Float oldStbyAuxP = stbyAuxP;
        stbyAuxP = newStbyAuxP;
        boolean oldStbyAuxPESet = stbyAuxPESet;
        stbyAuxPESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.STARTUP_MODEL__STBY_AUX_P, oldStbyAuxP, stbyAuxP, !oldStbyAuxPESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetStbyAuxP() {
        Float oldStbyAuxP = stbyAuxP;
        boolean oldStbyAuxPESet = stbyAuxPESet;
        stbyAuxP = STBY_AUX_P_EDEFAULT;
        stbyAuxPESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.STARTUP_MODEL__STBY_AUX_P, oldStbyAuxP, STBY_AUX_P_EDEFAULT, oldStbyAuxPESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetStbyAuxP() {
        return stbyAuxPESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public StartRampCurve getStartRampCurve() {
        return startRampCurve;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetStartRampCurve( StartRampCurve newStartRampCurve, NotificationChain msgs ) {
        StartRampCurve oldStartRampCurve = startRampCurve;
        startRampCurve = newStartRampCurve;
        boolean oldStartRampCurveESet = startRampCurveESet;
        startRampCurveESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.STARTUP_MODEL__START_RAMP_CURVE, oldStartRampCurve, newStartRampCurve,
                    !oldStartRampCurveESet );
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
    public void setStartRampCurve( StartRampCurve newStartRampCurve ) {
        if( newStartRampCurve != startRampCurve ) {
            NotificationChain msgs = null;
            if( startRampCurve != null ) msgs = ( ( InternalEObject ) startRampCurve ).eInverseRemove( this,
                    CimPackage.START_RAMP_CURVE__STARTUP_MODEL, StartRampCurve.class, msgs );
            if( newStartRampCurve != null ) msgs = ( ( InternalEObject ) newStartRampCurve ).eInverseAdd( this,
                    CimPackage.START_RAMP_CURVE__STARTUP_MODEL, StartRampCurve.class, msgs );
            msgs = basicSetStartRampCurve( newStartRampCurve, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldStartRampCurveESet = startRampCurveESet;
            startRampCurveESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.STARTUP_MODEL__START_RAMP_CURVE,
                        newStartRampCurve, newStartRampCurve, !oldStartRampCurveESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetStartRampCurve( NotificationChain msgs ) {
        StartRampCurve oldStartRampCurve = startRampCurve;
        startRampCurve = null;
        boolean oldStartRampCurveESet = startRampCurveESet;
        startRampCurveESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.STARTUP_MODEL__START_RAMP_CURVE, oldStartRampCurve, null, oldStartRampCurveESet );
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
    public void unsetStartRampCurve() {
        if( startRampCurve != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) startRampCurve ).eInverseRemove( this,
                    CimPackage.START_RAMP_CURVE__STARTUP_MODEL, StartRampCurve.class, msgs );
            msgs = basicUnsetStartRampCurve( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldStartRampCurveESet = startRampCurveESet;
            startRampCurveESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.STARTUP_MODEL__START_RAMP_CURVE, null, null, oldStartRampCurveESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetStartRampCurve() {
        return startRampCurveESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public StartIgnFuelCurve getStartIgnFuelCurve() {
        return startIgnFuelCurve;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetStartIgnFuelCurve( StartIgnFuelCurve newStartIgnFuelCurve,
            NotificationChain msgs ) {
        StartIgnFuelCurve oldStartIgnFuelCurve = startIgnFuelCurve;
        startIgnFuelCurve = newStartIgnFuelCurve;
        boolean oldStartIgnFuelCurveESet = startIgnFuelCurveESet;
        startIgnFuelCurveESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.STARTUP_MODEL__START_IGN_FUEL_CURVE, oldStartIgnFuelCurve, newStartIgnFuelCurve,
                    !oldStartIgnFuelCurveESet );
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
    public void setStartIgnFuelCurve( StartIgnFuelCurve newStartIgnFuelCurve ) {
        if( newStartIgnFuelCurve != startIgnFuelCurve ) {
            NotificationChain msgs = null;
            if( startIgnFuelCurve != null ) msgs = ( ( InternalEObject ) startIgnFuelCurve ).eInverseRemove( this,
                    CimPackage.START_IGN_FUEL_CURVE__STARTUP_MODEL, StartIgnFuelCurve.class, msgs );
            if( newStartIgnFuelCurve != null ) msgs = ( ( InternalEObject ) newStartIgnFuelCurve ).eInverseAdd( this,
                    CimPackage.START_IGN_FUEL_CURVE__STARTUP_MODEL, StartIgnFuelCurve.class, msgs );
            msgs = basicSetStartIgnFuelCurve( newStartIgnFuelCurve, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldStartIgnFuelCurveESet = startIgnFuelCurveESet;
            startIgnFuelCurveESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.STARTUP_MODEL__START_IGN_FUEL_CURVE,
                        newStartIgnFuelCurve, newStartIgnFuelCurve, !oldStartIgnFuelCurveESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetStartIgnFuelCurve( NotificationChain msgs ) {
        StartIgnFuelCurve oldStartIgnFuelCurve = startIgnFuelCurve;
        startIgnFuelCurve = null;
        boolean oldStartIgnFuelCurveESet = startIgnFuelCurveESet;
        startIgnFuelCurveESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.STARTUP_MODEL__START_IGN_FUEL_CURVE, oldStartIgnFuelCurve, null,
                    oldStartIgnFuelCurveESet );
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
    public void unsetStartIgnFuelCurve() {
        if( startIgnFuelCurve != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) startIgnFuelCurve ).eInverseRemove( this,
                    CimPackage.START_IGN_FUEL_CURVE__STARTUP_MODEL, StartIgnFuelCurve.class, msgs );
            msgs = basicUnsetStartIgnFuelCurve( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldStartIgnFuelCurveESet = startIgnFuelCurveESet;
            startIgnFuelCurveESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.STARTUP_MODEL__START_IGN_FUEL_CURVE, null, null, oldStartIgnFuelCurveESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetStartIgnFuelCurve() {
        return startIgnFuelCurveESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public StartMainFuelCurve getStartMainFuelCurve() {
        return startMainFuelCurve;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetStartMainFuelCurve( StartMainFuelCurve newStartMainFuelCurve,
            NotificationChain msgs ) {
        StartMainFuelCurve oldStartMainFuelCurve = startMainFuelCurve;
        startMainFuelCurve = newStartMainFuelCurve;
        boolean oldStartMainFuelCurveESet = startMainFuelCurveESet;
        startMainFuelCurveESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.STARTUP_MODEL__START_MAIN_FUEL_CURVE, oldStartMainFuelCurve, newStartMainFuelCurve,
                    !oldStartMainFuelCurveESet );
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
    public void setStartMainFuelCurve( StartMainFuelCurve newStartMainFuelCurve ) {
        if( newStartMainFuelCurve != startMainFuelCurve ) {
            NotificationChain msgs = null;
            if( startMainFuelCurve != null ) msgs = ( ( InternalEObject ) startMainFuelCurve ).eInverseRemove( this,
                    CimPackage.START_MAIN_FUEL_CURVE__STARTUP_MODEL, StartMainFuelCurve.class, msgs );
            if( newStartMainFuelCurve != null ) msgs = ( ( InternalEObject ) newStartMainFuelCurve ).eInverseAdd( this,
                    CimPackage.START_MAIN_FUEL_CURVE__STARTUP_MODEL, StartMainFuelCurve.class, msgs );
            msgs = basicSetStartMainFuelCurve( newStartMainFuelCurve, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldStartMainFuelCurveESet = startMainFuelCurveESet;
            startMainFuelCurveESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.STARTUP_MODEL__START_MAIN_FUEL_CURVE,
                        newStartMainFuelCurve, newStartMainFuelCurve, !oldStartMainFuelCurveESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetStartMainFuelCurve( NotificationChain msgs ) {
        StartMainFuelCurve oldStartMainFuelCurve = startMainFuelCurve;
        startMainFuelCurve = null;
        boolean oldStartMainFuelCurveESet = startMainFuelCurveESet;
        startMainFuelCurveESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.STARTUP_MODEL__START_MAIN_FUEL_CURVE, oldStartMainFuelCurve, null,
                    oldStartMainFuelCurveESet );
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
    public void unsetStartMainFuelCurve() {
        if( startMainFuelCurve != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) startMainFuelCurve ).eInverseRemove( this,
                    CimPackage.START_MAIN_FUEL_CURVE__STARTUP_MODEL, StartMainFuelCurve.class, msgs );
            msgs = basicUnsetStartMainFuelCurve( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldStartMainFuelCurveESet = startMainFuelCurveESet;
            startMainFuelCurveESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.STARTUP_MODEL__START_MAIN_FUEL_CURVE, null, null, oldStartMainFuelCurveESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetStartMainFuelCurve() {
        return startMainFuelCurveESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ThermalGeneratingUnit getThermalGeneratingUnit() {
        return thermalGeneratingUnit;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetThermalGeneratingUnit( ThermalGeneratingUnit newThermalGeneratingUnit,
            NotificationChain msgs ) {
        ThermalGeneratingUnit oldThermalGeneratingUnit = thermalGeneratingUnit;
        thermalGeneratingUnit = newThermalGeneratingUnit;
        boolean oldThermalGeneratingUnitESet = thermalGeneratingUnitESet;
        thermalGeneratingUnitESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.STARTUP_MODEL__THERMAL_GENERATING_UNIT, oldThermalGeneratingUnit,
                    newThermalGeneratingUnit, !oldThermalGeneratingUnitESet );
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
    public void setThermalGeneratingUnit( ThermalGeneratingUnit newThermalGeneratingUnit ) {
        if( newThermalGeneratingUnit != thermalGeneratingUnit ) {
            NotificationChain msgs = null;
            if( thermalGeneratingUnit != null )
                msgs = ( ( InternalEObject ) thermalGeneratingUnit ).eInverseRemove( this,
                        CimPackage.THERMAL_GENERATING_UNIT__STARTUP_MODEL, ThermalGeneratingUnit.class, msgs );
            if( newThermalGeneratingUnit != null )
                msgs = ( ( InternalEObject ) newThermalGeneratingUnit ).eInverseAdd( this,
                        CimPackage.THERMAL_GENERATING_UNIT__STARTUP_MODEL, ThermalGeneratingUnit.class, msgs );
            msgs = basicSetThermalGeneratingUnit( newThermalGeneratingUnit, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldThermalGeneratingUnitESet = thermalGeneratingUnitESet;
            thermalGeneratingUnitESet = true;
            if( eNotificationRequired() ) eNotify(
                    new ENotificationImpl( this, Notification.SET, CimPackage.STARTUP_MODEL__THERMAL_GENERATING_UNIT,
                            newThermalGeneratingUnit, newThermalGeneratingUnit, !oldThermalGeneratingUnitESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetThermalGeneratingUnit( NotificationChain msgs ) {
        ThermalGeneratingUnit oldThermalGeneratingUnit = thermalGeneratingUnit;
        thermalGeneratingUnit = null;
        boolean oldThermalGeneratingUnitESet = thermalGeneratingUnitESet;
        thermalGeneratingUnitESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.STARTUP_MODEL__THERMAL_GENERATING_UNIT, oldThermalGeneratingUnit, null,
                    oldThermalGeneratingUnitESet );
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
    public void unsetThermalGeneratingUnit() {
        if( thermalGeneratingUnit != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) thermalGeneratingUnit ).eInverseRemove( this,
                    CimPackage.THERMAL_GENERATING_UNIT__STARTUP_MODEL, ThermalGeneratingUnit.class, msgs );
            msgs = basicUnsetThermalGeneratingUnit( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldThermalGeneratingUnitESet = thermalGeneratingUnitESet;
            thermalGeneratingUnitESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.STARTUP_MODEL__THERMAL_GENERATING_UNIT, null, null, oldThermalGeneratingUnitESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetThermalGeneratingUnit() {
        return thermalGeneratingUnitESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.STARTUP_MODEL__START_RAMP_CURVE:
            if( startRampCurve != null ) msgs = ( ( InternalEObject ) startRampCurve ).eInverseRemove( this,
                    CimPackage.START_RAMP_CURVE__STARTUP_MODEL, StartRampCurve.class, msgs );
            return basicSetStartRampCurve( ( StartRampCurve ) otherEnd, msgs );
        case CimPackage.STARTUP_MODEL__START_IGN_FUEL_CURVE:
            if( startIgnFuelCurve != null ) msgs = ( ( InternalEObject ) startIgnFuelCurve ).eInverseRemove( this,
                    CimPackage.START_IGN_FUEL_CURVE__STARTUP_MODEL, StartIgnFuelCurve.class, msgs );
            return basicSetStartIgnFuelCurve( ( StartIgnFuelCurve ) otherEnd, msgs );
        case CimPackage.STARTUP_MODEL__START_MAIN_FUEL_CURVE:
            if( startMainFuelCurve != null ) msgs = ( ( InternalEObject ) startMainFuelCurve ).eInverseRemove( this,
                    CimPackage.START_MAIN_FUEL_CURVE__STARTUP_MODEL, StartMainFuelCurve.class, msgs );
            return basicSetStartMainFuelCurve( ( StartMainFuelCurve ) otherEnd, msgs );
        case CimPackage.STARTUP_MODEL__THERMAL_GENERATING_UNIT:
            if( thermalGeneratingUnit != null )
                msgs = ( ( InternalEObject ) thermalGeneratingUnit ).eInverseRemove( this,
                        CimPackage.THERMAL_GENERATING_UNIT__STARTUP_MODEL, ThermalGeneratingUnit.class, msgs );
            return basicSetThermalGeneratingUnit( ( ThermalGeneratingUnit ) otherEnd, msgs );
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
        case CimPackage.STARTUP_MODEL__START_RAMP_CURVE:
            return basicUnsetStartRampCurve( msgs );
        case CimPackage.STARTUP_MODEL__START_IGN_FUEL_CURVE:
            return basicUnsetStartIgnFuelCurve( msgs );
        case CimPackage.STARTUP_MODEL__START_MAIN_FUEL_CURVE:
            return basicUnsetStartMainFuelCurve( msgs );
        case CimPackage.STARTUP_MODEL__THERMAL_GENERATING_UNIT:
            return basicUnsetThermalGeneratingUnit( msgs );
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
        case CimPackage.STARTUP_MODEL__FIXED_MAINT_COST:
            return getFixedMaintCost();
        case CimPackage.STARTUP_MODEL__HOT_STANDBY_HEAT:
            return getHotStandbyHeat();
        case CimPackage.STARTUP_MODEL__INCREMENTAL_MAINT_COST:
            return getIncrementalMaintCost();
        case CimPackage.STARTUP_MODEL__MINIMUM_DOWN_TIME:
            return getMinimumDownTime();
        case CimPackage.STARTUP_MODEL__MINIMUM_RUN_TIME:
            return getMinimumRunTime();
        case CimPackage.STARTUP_MODEL__RISK_FACTOR_COST:
            return getRiskFactorCost();
        case CimPackage.STARTUP_MODEL__STARTUP_COST:
            return getStartupCost();
        case CimPackage.STARTUP_MODEL__STARTUP_DATE:
            return getStartupDate();
        case CimPackage.STARTUP_MODEL__STARTUP_PRIORITY:
            return getStartupPriority();
        case CimPackage.STARTUP_MODEL__STBY_AUX_P:
            return getStbyAuxP();
        case CimPackage.STARTUP_MODEL__START_RAMP_CURVE:
            return getStartRampCurve();
        case CimPackage.STARTUP_MODEL__START_IGN_FUEL_CURVE:
            return getStartIgnFuelCurve();
        case CimPackage.STARTUP_MODEL__START_MAIN_FUEL_CURVE:
            return getStartMainFuelCurve();
        case CimPackage.STARTUP_MODEL__THERMAL_GENERATING_UNIT:
            return getThermalGeneratingUnit();
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
        case CimPackage.STARTUP_MODEL__FIXED_MAINT_COST:
            setFixedMaintCost( ( Float ) newValue );
            return;
        case CimPackage.STARTUP_MODEL__HOT_STANDBY_HEAT:
            setHotStandbyHeat( ( Float ) newValue );
            return;
        case CimPackage.STARTUP_MODEL__INCREMENTAL_MAINT_COST:
            setIncrementalMaintCost( ( Float ) newValue );
            return;
        case CimPackage.STARTUP_MODEL__MINIMUM_DOWN_TIME:
            setMinimumDownTime( ( Float ) newValue );
            return;
        case CimPackage.STARTUP_MODEL__MINIMUM_RUN_TIME:
            setMinimumRunTime( ( Float ) newValue );
            return;
        case CimPackage.STARTUP_MODEL__RISK_FACTOR_COST:
            setRiskFactorCost( ( BigDecimal ) newValue );
            return;
        case CimPackage.STARTUP_MODEL__STARTUP_COST:
            setStartupCost( ( BigDecimal ) newValue );
            return;
        case CimPackage.STARTUP_MODEL__STARTUP_DATE:
            setStartupDate( ( Date ) newValue );
            return;
        case CimPackage.STARTUP_MODEL__STARTUP_PRIORITY:
            setStartupPriority( ( Integer ) newValue );
            return;
        case CimPackage.STARTUP_MODEL__STBY_AUX_P:
            setStbyAuxP( ( Float ) newValue );
            return;
        case CimPackage.STARTUP_MODEL__START_RAMP_CURVE:
            setStartRampCurve( ( StartRampCurve ) newValue );
            return;
        case CimPackage.STARTUP_MODEL__START_IGN_FUEL_CURVE:
            setStartIgnFuelCurve( ( StartIgnFuelCurve ) newValue );
            return;
        case CimPackage.STARTUP_MODEL__START_MAIN_FUEL_CURVE:
            setStartMainFuelCurve( ( StartMainFuelCurve ) newValue );
            return;
        case CimPackage.STARTUP_MODEL__THERMAL_GENERATING_UNIT:
            setThermalGeneratingUnit( ( ThermalGeneratingUnit ) newValue );
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
        case CimPackage.STARTUP_MODEL__FIXED_MAINT_COST:
            unsetFixedMaintCost();
            return;
        case CimPackage.STARTUP_MODEL__HOT_STANDBY_HEAT:
            unsetHotStandbyHeat();
            return;
        case CimPackage.STARTUP_MODEL__INCREMENTAL_MAINT_COST:
            unsetIncrementalMaintCost();
            return;
        case CimPackage.STARTUP_MODEL__MINIMUM_DOWN_TIME:
            unsetMinimumDownTime();
            return;
        case CimPackage.STARTUP_MODEL__MINIMUM_RUN_TIME:
            unsetMinimumRunTime();
            return;
        case CimPackage.STARTUP_MODEL__RISK_FACTOR_COST:
            unsetRiskFactorCost();
            return;
        case CimPackage.STARTUP_MODEL__STARTUP_COST:
            unsetStartupCost();
            return;
        case CimPackage.STARTUP_MODEL__STARTUP_DATE:
            unsetStartupDate();
            return;
        case CimPackage.STARTUP_MODEL__STARTUP_PRIORITY:
            unsetStartupPriority();
            return;
        case CimPackage.STARTUP_MODEL__STBY_AUX_P:
            unsetStbyAuxP();
            return;
        case CimPackage.STARTUP_MODEL__START_RAMP_CURVE:
            unsetStartRampCurve();
            return;
        case CimPackage.STARTUP_MODEL__START_IGN_FUEL_CURVE:
            unsetStartIgnFuelCurve();
            return;
        case CimPackage.STARTUP_MODEL__START_MAIN_FUEL_CURVE:
            unsetStartMainFuelCurve();
            return;
        case CimPackage.STARTUP_MODEL__THERMAL_GENERATING_UNIT:
            unsetThermalGeneratingUnit();
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
        case CimPackage.STARTUP_MODEL__FIXED_MAINT_COST:
            return isSetFixedMaintCost();
        case CimPackage.STARTUP_MODEL__HOT_STANDBY_HEAT:
            return isSetHotStandbyHeat();
        case CimPackage.STARTUP_MODEL__INCREMENTAL_MAINT_COST:
            return isSetIncrementalMaintCost();
        case CimPackage.STARTUP_MODEL__MINIMUM_DOWN_TIME:
            return isSetMinimumDownTime();
        case CimPackage.STARTUP_MODEL__MINIMUM_RUN_TIME:
            return isSetMinimumRunTime();
        case CimPackage.STARTUP_MODEL__RISK_FACTOR_COST:
            return isSetRiskFactorCost();
        case CimPackage.STARTUP_MODEL__STARTUP_COST:
            return isSetStartupCost();
        case CimPackage.STARTUP_MODEL__STARTUP_DATE:
            return isSetStartupDate();
        case CimPackage.STARTUP_MODEL__STARTUP_PRIORITY:
            return isSetStartupPriority();
        case CimPackage.STARTUP_MODEL__STBY_AUX_P:
            return isSetStbyAuxP();
        case CimPackage.STARTUP_MODEL__START_RAMP_CURVE:
            return isSetStartRampCurve();
        case CimPackage.STARTUP_MODEL__START_IGN_FUEL_CURVE:
            return isSetStartIgnFuelCurve();
        case CimPackage.STARTUP_MODEL__START_MAIN_FUEL_CURVE:
            return isSetStartMainFuelCurve();
        case CimPackage.STARTUP_MODEL__THERMAL_GENERATING_UNIT:
            return isSetThermalGeneratingUnit();
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
        result.append( " (fixedMaintCost: " );
        if( fixedMaintCostESet )
            result.append( fixedMaintCost );
        else
            result.append( "<unset>" );
        result.append( ", hotStandbyHeat: " );
        if( hotStandbyHeatESet )
            result.append( hotStandbyHeat );
        else
            result.append( "<unset>" );
        result.append( ", incrementalMaintCost: " );
        if( incrementalMaintCostESet )
            result.append( incrementalMaintCost );
        else
            result.append( "<unset>" );
        result.append( ", minimumDownTime: " );
        if( minimumDownTimeESet )
            result.append( minimumDownTime );
        else
            result.append( "<unset>" );
        result.append( ", minimumRunTime: " );
        if( minimumRunTimeESet )
            result.append( minimumRunTime );
        else
            result.append( "<unset>" );
        result.append( ", riskFactorCost: " );
        if( riskFactorCostESet )
            result.append( riskFactorCost );
        else
            result.append( "<unset>" );
        result.append( ", startupCost: " );
        if( startupCostESet )
            result.append( startupCost );
        else
            result.append( "<unset>" );
        result.append( ", startupDate: " );
        if( startupDateESet )
            result.append( startupDate );
        else
            result.append( "<unset>" );
        result.append( ", startupPriority: " );
        if( startupPriorityESet )
            result.append( startupPriority );
        else
            result.append( "<unset>" );
        result.append( ", stbyAuxP: " );
        if( stbyAuxPESet )
            result.append( stbyAuxP );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //StartupModelImpl
