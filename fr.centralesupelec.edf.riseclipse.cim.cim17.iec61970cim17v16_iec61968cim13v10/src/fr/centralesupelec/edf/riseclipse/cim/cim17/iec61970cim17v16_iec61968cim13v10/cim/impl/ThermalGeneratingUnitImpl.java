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

import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CAESPlant;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CogenerationPlant;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CombinedCyclePlant;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EmissionAccount;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EmissionCurve;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.FossilFuel;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.FuelAllocationSchedule;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.HeatInputCurve;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.HeatRateCurve;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.IncrementalHeatRateCurve;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ShutdownCurve;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.StartupModel;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ThermalGeneratingUnit;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Thermal Generating Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ThermalGeneratingUnitImpl#getOMCost <em>OM Cost</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ThermalGeneratingUnitImpl#getStartupModel <em>Startup Model</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ThermalGeneratingUnitImpl#getIncrementalHeatRateCurve <em>Incremental Heat Rate Curve</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ThermalGeneratingUnitImpl#getEmissionCurves <em>Emission Curves</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ThermalGeneratingUnitImpl#getFuelAllocationSchedules <em>Fuel Allocation Schedules</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ThermalGeneratingUnitImpl#getCombinedCyclePlant <em>Combined Cycle Plant</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ThermalGeneratingUnitImpl#getShutdownCurve <em>Shutdown Curve</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ThermalGeneratingUnitImpl#getHeatRateCurve <em>Heat Rate Curve</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ThermalGeneratingUnitImpl#getFossilFuels <em>Fossil Fuels</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ThermalGeneratingUnitImpl#getHeatInputCurve <em>Heat Input Curve</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ThermalGeneratingUnitImpl#getCAESPlant <em>CAES Plant</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ThermalGeneratingUnitImpl#getEmmissionAccounts <em>Emmission Accounts</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ThermalGeneratingUnitImpl#getCogenerationPlant <em>Cogeneration Plant</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ThermalGeneratingUnitImpl extends GeneratingUnitImpl implements ThermalGeneratingUnit {
    /**
     * The default value of the '{@link #getOMCost() <em>OM Cost</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOMCost()
     * @generated
     * @ordered
     */
    protected static final Float OM_COST_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getOMCost() <em>OM Cost</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOMCost()
     * @generated
     * @ordered
     */
    protected Float oMCost = OM_COST_EDEFAULT;

    /**
     * This is true if the OM Cost attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean oMCostESet;

    /**
     * The cached value of the '{@link #getStartupModel() <em>Startup Model</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getStartupModel()
     * @generated
     * @ordered
     */
    protected StartupModel startupModel;

    /**
     * This is true if the Startup Model reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean startupModelESet;

    /**
     * The cached value of the '{@link #getIncrementalHeatRateCurve() <em>Incremental Heat Rate Curve</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIncrementalHeatRateCurve()
     * @generated
     * @ordered
     */
    protected IncrementalHeatRateCurve incrementalHeatRateCurve;

    /**
     * This is true if the Incremental Heat Rate Curve reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean incrementalHeatRateCurveESet;

    /**
     * The cached value of the '{@link #getEmissionCurves() <em>Emission Curves</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEmissionCurves()
     * @generated
     * @ordered
     */
    protected EList< EmissionCurve > emissionCurves;

    /**
     * The cached value of the '{@link #getFuelAllocationSchedules() <em>Fuel Allocation Schedules</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFuelAllocationSchedules()
     * @generated
     * @ordered
     */
    protected EList< FuelAllocationSchedule > fuelAllocationSchedules;

    /**
     * The cached value of the '{@link #getCombinedCyclePlant() <em>Combined Cycle Plant</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCombinedCyclePlant()
     * @generated
     * @ordered
     */
    protected CombinedCyclePlant combinedCyclePlant;

    /**
     * This is true if the Combined Cycle Plant reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean combinedCyclePlantESet;

    /**
     * The cached value of the '{@link #getShutdownCurve() <em>Shutdown Curve</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getShutdownCurve()
     * @generated
     * @ordered
     */
    protected ShutdownCurve shutdownCurve;

    /**
     * This is true if the Shutdown Curve reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean shutdownCurveESet;

    /**
     * The cached value of the '{@link #getHeatRateCurve() <em>Heat Rate Curve</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getHeatRateCurve()
     * @generated
     * @ordered
     */
    protected HeatRateCurve heatRateCurve;

    /**
     * This is true if the Heat Rate Curve reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean heatRateCurveESet;

    /**
     * The cached value of the '{@link #getFossilFuels() <em>Fossil Fuels</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFossilFuels()
     * @generated
     * @ordered
     */
    protected EList< FossilFuel > fossilFuels;

    /**
     * The cached value of the '{@link #getHeatInputCurve() <em>Heat Input Curve</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getHeatInputCurve()
     * @generated
     * @ordered
     */
    protected HeatInputCurve heatInputCurve;

    /**
     * This is true if the Heat Input Curve reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean heatInputCurveESet;

    /**
     * The cached value of the '{@link #getCAESPlant() <em>CAES Plant</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCAESPlant()
     * @generated
     * @ordered
     */
    protected CAESPlant caesPlant;

    /**
     * This is true if the CAES Plant reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean caesPlantESet;

    /**
     * The cached value of the '{@link #getEmmissionAccounts() <em>Emmission Accounts</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEmmissionAccounts()
     * @generated
     * @ordered
     */
    protected EList< EmissionAccount > emmissionAccounts;

    /**
     * The cached value of the '{@link #getCogenerationPlant() <em>Cogeneration Plant</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCogenerationPlant()
     * @generated
     * @ordered
     */
    protected CogenerationPlant cogenerationPlant;

    /**
     * This is true if the Cogeneration Plant reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean cogenerationPlantESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ThermalGeneratingUnitImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getThermalGeneratingUnit();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getOMCost() {
        return oMCost;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setOMCost( Float newOMCost ) {
        Float oldOMCost = oMCost;
        oMCost = newOMCost;
        boolean oldOMCostESet = oMCostESet;
        oMCostESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.THERMAL_GENERATING_UNIT__OM_COST, oldOMCost, oMCost, !oldOMCostESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetOMCost() {
        Float oldOMCost = oMCost;
        boolean oldOMCostESet = oMCostESet;
        oMCost = OM_COST_EDEFAULT;
        oMCostESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.THERMAL_GENERATING_UNIT__OM_COST, oldOMCost, OM_COST_EDEFAULT, oldOMCostESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetOMCost() {
        return oMCostESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public StartupModel getStartupModel() {
        if( startupModel != null && startupModel.eIsProxy() ) {
            InternalEObject oldStartupModel = ( InternalEObject ) startupModel;
            startupModel = ( StartupModel ) eResolveProxy( oldStartupModel );
            if( startupModel != oldStartupModel ) {
                if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.RESOLVE,
                        CimPackage.THERMAL_GENERATING_UNIT__STARTUP_MODEL, oldStartupModel, startupModel ) );
            }
        }
        return startupModel;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public StartupModel basicGetStartupModel() {
        return startupModel;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetStartupModel( StartupModel newStartupModel, NotificationChain msgs ) {
        StartupModel oldStartupModel = startupModel;
        startupModel = newStartupModel;
        boolean oldStartupModelESet = startupModelESet;
        startupModelESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.THERMAL_GENERATING_UNIT__STARTUP_MODEL, oldStartupModel, newStartupModel,
                    !oldStartupModelESet );
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
    public void setStartupModel( StartupModel newStartupModel ) {
        if( newStartupModel != startupModel ) {
            NotificationChain msgs = null;
            if( startupModel != null ) msgs = ( ( InternalEObject ) startupModel ).eInverseRemove( this,
                    CimPackage.STARTUP_MODEL__THERMAL_GENERATING_UNIT, StartupModel.class, msgs );
            if( newStartupModel != null ) msgs = ( ( InternalEObject ) newStartupModel ).eInverseAdd( this,
                    CimPackage.STARTUP_MODEL__THERMAL_GENERATING_UNIT, StartupModel.class, msgs );
            msgs = basicSetStartupModel( newStartupModel, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldStartupModelESet = startupModelESet;
            startupModelESet = true;
            if( eNotificationRequired() ) eNotify(
                    new ENotificationImpl( this, Notification.SET, CimPackage.THERMAL_GENERATING_UNIT__STARTUP_MODEL,
                            newStartupModel, newStartupModel, !oldStartupModelESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetStartupModel( NotificationChain msgs ) {
        StartupModel oldStartupModel = startupModel;
        startupModel = null;
        boolean oldStartupModelESet = startupModelESet;
        startupModelESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.THERMAL_GENERATING_UNIT__STARTUP_MODEL, oldStartupModel, null, oldStartupModelESet );
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
    public void unsetStartupModel() {
        if( startupModel != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) startupModel ).eInverseRemove( this,
                    CimPackage.STARTUP_MODEL__THERMAL_GENERATING_UNIT, StartupModel.class, msgs );
            msgs = basicUnsetStartupModel( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldStartupModelESet = startupModelESet;
            startupModelESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.THERMAL_GENERATING_UNIT__STARTUP_MODEL, null, null, oldStartupModelESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetStartupModel() {
        return startupModelESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public IncrementalHeatRateCurve getIncrementalHeatRateCurve() {
        if( incrementalHeatRateCurve != null && incrementalHeatRateCurve.eIsProxy() ) {
            InternalEObject oldIncrementalHeatRateCurve = ( InternalEObject ) incrementalHeatRateCurve;
            incrementalHeatRateCurve = ( IncrementalHeatRateCurve ) eResolveProxy( oldIncrementalHeatRateCurve );
            if( incrementalHeatRateCurve != oldIncrementalHeatRateCurve ) {
                if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.RESOLVE,
                        CimPackage.THERMAL_GENERATING_UNIT__INCREMENTAL_HEAT_RATE_CURVE, oldIncrementalHeatRateCurve,
                        incrementalHeatRateCurve ) );
            }
        }
        return incrementalHeatRateCurve;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public IncrementalHeatRateCurve basicGetIncrementalHeatRateCurve() {
        return incrementalHeatRateCurve;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetIncrementalHeatRateCurve( IncrementalHeatRateCurve newIncrementalHeatRateCurve,
            NotificationChain msgs ) {
        IncrementalHeatRateCurve oldIncrementalHeatRateCurve = incrementalHeatRateCurve;
        incrementalHeatRateCurve = newIncrementalHeatRateCurve;
        boolean oldIncrementalHeatRateCurveESet = incrementalHeatRateCurveESet;
        incrementalHeatRateCurveESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.THERMAL_GENERATING_UNIT__INCREMENTAL_HEAT_RATE_CURVE, oldIncrementalHeatRateCurve,
                    newIncrementalHeatRateCurve, !oldIncrementalHeatRateCurveESet );
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
    public void setIncrementalHeatRateCurve( IncrementalHeatRateCurve newIncrementalHeatRateCurve ) {
        if( newIncrementalHeatRateCurve != incrementalHeatRateCurve ) {
            NotificationChain msgs = null;
            if( incrementalHeatRateCurve != null )
                msgs = ( ( InternalEObject ) incrementalHeatRateCurve ).eInverseRemove( this,
                        CimPackage.INCREMENTAL_HEAT_RATE_CURVE__THERMAL_GENERATING_UNIT, IncrementalHeatRateCurve.class,
                        msgs );
            if( newIncrementalHeatRateCurve != null )
                msgs = ( ( InternalEObject ) newIncrementalHeatRateCurve ).eInverseAdd( this,
                        CimPackage.INCREMENTAL_HEAT_RATE_CURVE__THERMAL_GENERATING_UNIT, IncrementalHeatRateCurve.class,
                        msgs );
            msgs = basicSetIncrementalHeatRateCurve( newIncrementalHeatRateCurve, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldIncrementalHeatRateCurveESet = incrementalHeatRateCurveESet;
            incrementalHeatRateCurveESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.THERMAL_GENERATING_UNIT__INCREMENTAL_HEAT_RATE_CURVE, newIncrementalHeatRateCurve,
                    newIncrementalHeatRateCurve, !oldIncrementalHeatRateCurveESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetIncrementalHeatRateCurve( NotificationChain msgs ) {
        IncrementalHeatRateCurve oldIncrementalHeatRateCurve = incrementalHeatRateCurve;
        incrementalHeatRateCurve = null;
        boolean oldIncrementalHeatRateCurveESet = incrementalHeatRateCurveESet;
        incrementalHeatRateCurveESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.THERMAL_GENERATING_UNIT__INCREMENTAL_HEAT_RATE_CURVE, oldIncrementalHeatRateCurve, null,
                    oldIncrementalHeatRateCurveESet );
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
    public void unsetIncrementalHeatRateCurve() {
        if( incrementalHeatRateCurve != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) incrementalHeatRateCurve ).eInverseRemove( this,
                    CimPackage.INCREMENTAL_HEAT_RATE_CURVE__THERMAL_GENERATING_UNIT, IncrementalHeatRateCurve.class,
                    msgs );
            msgs = basicUnsetIncrementalHeatRateCurve( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldIncrementalHeatRateCurveESet = incrementalHeatRateCurveESet;
            incrementalHeatRateCurveESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.THERMAL_GENERATING_UNIT__INCREMENTAL_HEAT_RATE_CURVE, null, null,
                    oldIncrementalHeatRateCurveESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetIncrementalHeatRateCurve() {
        return incrementalHeatRateCurveESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< EmissionCurve > getEmissionCurves() {
        if( emissionCurves == null ) {
            emissionCurves = new EObjectWithInverseResolvingEList.Unsettable< EmissionCurve >( EmissionCurve.class,
                    this, CimPackage.THERMAL_GENERATING_UNIT__EMISSION_CURVES,
                    CimPackage.EMISSION_CURVE__THERMAL_GENERATING_UNIT );
        }
        return emissionCurves;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetEmissionCurves() {
        if( emissionCurves != null ) ( ( InternalEList.Unsettable< ? > ) emissionCurves ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetEmissionCurves() {
        return emissionCurves != null && ( ( InternalEList.Unsettable< ? > ) emissionCurves ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< FuelAllocationSchedule > getFuelAllocationSchedules() {
        if( fuelAllocationSchedules == null ) {
            fuelAllocationSchedules = new EObjectWithInverseResolvingEList.Unsettable< FuelAllocationSchedule >(
                    FuelAllocationSchedule.class, this, CimPackage.THERMAL_GENERATING_UNIT__FUEL_ALLOCATION_SCHEDULES,
                    CimPackage.FUEL_ALLOCATION_SCHEDULE__THERMAL_GENERATING_UNIT );
        }
        return fuelAllocationSchedules;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetFuelAllocationSchedules() {
        if( fuelAllocationSchedules != null ) ( ( InternalEList.Unsettable< ? > ) fuelAllocationSchedules ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetFuelAllocationSchedules() {
        return fuelAllocationSchedules != null && ( ( InternalEList.Unsettable< ? > ) fuelAllocationSchedules ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public CombinedCyclePlant getCombinedCyclePlant() {
        return combinedCyclePlant;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetCombinedCyclePlant( CombinedCyclePlant newCombinedCyclePlant,
            NotificationChain msgs ) {
        CombinedCyclePlant oldCombinedCyclePlant = combinedCyclePlant;
        combinedCyclePlant = newCombinedCyclePlant;
        boolean oldCombinedCyclePlantESet = combinedCyclePlantESet;
        combinedCyclePlantESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.THERMAL_GENERATING_UNIT__COMBINED_CYCLE_PLANT, oldCombinedCyclePlant,
                    newCombinedCyclePlant, !oldCombinedCyclePlantESet );
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
    public void setCombinedCyclePlant( CombinedCyclePlant newCombinedCyclePlant ) {
        if( newCombinedCyclePlant != combinedCyclePlant ) {
            NotificationChain msgs = null;
            if( combinedCyclePlant != null ) msgs = ( ( InternalEObject ) combinedCyclePlant ).eInverseRemove( this,
                    CimPackage.COMBINED_CYCLE_PLANT__THERMAL_GENERATING_UNITS, CombinedCyclePlant.class, msgs );
            if( newCombinedCyclePlant != null ) msgs = ( ( InternalEObject ) newCombinedCyclePlant ).eInverseAdd( this,
                    CimPackage.COMBINED_CYCLE_PLANT__THERMAL_GENERATING_UNITS, CombinedCyclePlant.class, msgs );
            msgs = basicSetCombinedCyclePlant( newCombinedCyclePlant, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldCombinedCyclePlantESet = combinedCyclePlantESet;
            combinedCyclePlantESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.THERMAL_GENERATING_UNIT__COMBINED_CYCLE_PLANT, newCombinedCyclePlant,
                    newCombinedCyclePlant, !oldCombinedCyclePlantESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetCombinedCyclePlant( NotificationChain msgs ) {
        CombinedCyclePlant oldCombinedCyclePlant = combinedCyclePlant;
        combinedCyclePlant = null;
        boolean oldCombinedCyclePlantESet = combinedCyclePlantESet;
        combinedCyclePlantESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.THERMAL_GENERATING_UNIT__COMBINED_CYCLE_PLANT, oldCombinedCyclePlant, null,
                    oldCombinedCyclePlantESet );
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
    public void unsetCombinedCyclePlant() {
        if( combinedCyclePlant != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) combinedCyclePlant ).eInverseRemove( this,
                    CimPackage.COMBINED_CYCLE_PLANT__THERMAL_GENERATING_UNITS, CombinedCyclePlant.class, msgs );
            msgs = basicUnsetCombinedCyclePlant( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldCombinedCyclePlantESet = combinedCyclePlantESet;
            combinedCyclePlantESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.THERMAL_GENERATING_UNIT__COMBINED_CYCLE_PLANT, null, null, oldCombinedCyclePlantESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetCombinedCyclePlant() {
        return combinedCyclePlantESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ShutdownCurve getShutdownCurve() {
        if( shutdownCurve != null && shutdownCurve.eIsProxy() ) {
            InternalEObject oldShutdownCurve = ( InternalEObject ) shutdownCurve;
            shutdownCurve = ( ShutdownCurve ) eResolveProxy( oldShutdownCurve );
            if( shutdownCurve != oldShutdownCurve ) {
                if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.RESOLVE,
                        CimPackage.THERMAL_GENERATING_UNIT__SHUTDOWN_CURVE, oldShutdownCurve, shutdownCurve ) );
            }
        }
        return shutdownCurve;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ShutdownCurve basicGetShutdownCurve() {
        return shutdownCurve;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetShutdownCurve( ShutdownCurve newShutdownCurve, NotificationChain msgs ) {
        ShutdownCurve oldShutdownCurve = shutdownCurve;
        shutdownCurve = newShutdownCurve;
        boolean oldShutdownCurveESet = shutdownCurveESet;
        shutdownCurveESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.THERMAL_GENERATING_UNIT__SHUTDOWN_CURVE, oldShutdownCurve, newShutdownCurve,
                    !oldShutdownCurveESet );
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
    public void setShutdownCurve( ShutdownCurve newShutdownCurve ) {
        if( newShutdownCurve != shutdownCurve ) {
            NotificationChain msgs = null;
            if( shutdownCurve != null ) msgs = ( ( InternalEObject ) shutdownCurve ).eInverseRemove( this,
                    CimPackage.SHUTDOWN_CURVE__THERMAL_GENERATING_UNIT, ShutdownCurve.class, msgs );
            if( newShutdownCurve != null ) msgs = ( ( InternalEObject ) newShutdownCurve ).eInverseAdd( this,
                    CimPackage.SHUTDOWN_CURVE__THERMAL_GENERATING_UNIT, ShutdownCurve.class, msgs );
            msgs = basicSetShutdownCurve( newShutdownCurve, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldShutdownCurveESet = shutdownCurveESet;
            shutdownCurveESet = true;
            if( eNotificationRequired() ) eNotify(
                    new ENotificationImpl( this, Notification.SET, CimPackage.THERMAL_GENERATING_UNIT__SHUTDOWN_CURVE,
                            newShutdownCurve, newShutdownCurve, !oldShutdownCurveESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetShutdownCurve( NotificationChain msgs ) {
        ShutdownCurve oldShutdownCurve = shutdownCurve;
        shutdownCurve = null;
        boolean oldShutdownCurveESet = shutdownCurveESet;
        shutdownCurveESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.THERMAL_GENERATING_UNIT__SHUTDOWN_CURVE, oldShutdownCurve, null, oldShutdownCurveESet );
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
    public void unsetShutdownCurve() {
        if( shutdownCurve != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) shutdownCurve ).eInverseRemove( this,
                    CimPackage.SHUTDOWN_CURVE__THERMAL_GENERATING_UNIT, ShutdownCurve.class, msgs );
            msgs = basicUnsetShutdownCurve( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldShutdownCurveESet = shutdownCurveESet;
            shutdownCurveESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.THERMAL_GENERATING_UNIT__SHUTDOWN_CURVE, null, null, oldShutdownCurveESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetShutdownCurve() {
        return shutdownCurveESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public HeatRateCurve getHeatRateCurve() {
        return heatRateCurve;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetHeatRateCurve( HeatRateCurve newHeatRateCurve, NotificationChain msgs ) {
        HeatRateCurve oldHeatRateCurve = heatRateCurve;
        heatRateCurve = newHeatRateCurve;
        boolean oldHeatRateCurveESet = heatRateCurveESet;
        heatRateCurveESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.THERMAL_GENERATING_UNIT__HEAT_RATE_CURVE, oldHeatRateCurve, newHeatRateCurve,
                    !oldHeatRateCurveESet );
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
    public void setHeatRateCurve( HeatRateCurve newHeatRateCurve ) {
        if( newHeatRateCurve != heatRateCurve ) {
            NotificationChain msgs = null;
            if( heatRateCurve != null ) msgs = ( ( InternalEObject ) heatRateCurve ).eInverseRemove( this,
                    CimPackage.HEAT_RATE_CURVE__THERMAL_GENERATING_UNIT, HeatRateCurve.class, msgs );
            if( newHeatRateCurve != null ) msgs = ( ( InternalEObject ) newHeatRateCurve ).eInverseAdd( this,
                    CimPackage.HEAT_RATE_CURVE__THERMAL_GENERATING_UNIT, HeatRateCurve.class, msgs );
            msgs = basicSetHeatRateCurve( newHeatRateCurve, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldHeatRateCurveESet = heatRateCurveESet;
            heatRateCurveESet = true;
            if( eNotificationRequired() ) eNotify(
                    new ENotificationImpl( this, Notification.SET, CimPackage.THERMAL_GENERATING_UNIT__HEAT_RATE_CURVE,
                            newHeatRateCurve, newHeatRateCurve, !oldHeatRateCurveESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetHeatRateCurve( NotificationChain msgs ) {
        HeatRateCurve oldHeatRateCurve = heatRateCurve;
        heatRateCurve = null;
        boolean oldHeatRateCurveESet = heatRateCurveESet;
        heatRateCurveESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.THERMAL_GENERATING_UNIT__HEAT_RATE_CURVE, oldHeatRateCurve, null, oldHeatRateCurveESet );
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
    public void unsetHeatRateCurve() {
        if( heatRateCurve != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) heatRateCurve ).eInverseRemove( this,
                    CimPackage.HEAT_RATE_CURVE__THERMAL_GENERATING_UNIT, HeatRateCurve.class, msgs );
            msgs = basicUnsetHeatRateCurve( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldHeatRateCurveESet = heatRateCurveESet;
            heatRateCurveESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.THERMAL_GENERATING_UNIT__HEAT_RATE_CURVE, null, null, oldHeatRateCurveESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetHeatRateCurve() {
        return heatRateCurveESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< FossilFuel > getFossilFuels() {
        if( fossilFuels == null ) {
            fossilFuels = new EObjectWithInverseResolvingEList.Unsettable< FossilFuel >( FossilFuel.class, this,
                    CimPackage.THERMAL_GENERATING_UNIT__FOSSIL_FUELS, CimPackage.FOSSIL_FUEL__THERMAL_GENERATING_UNIT );
        }
        return fossilFuels;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetFossilFuels() {
        if( fossilFuels != null ) ( ( InternalEList.Unsettable< ? > ) fossilFuels ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetFossilFuels() {
        return fossilFuels != null && ( ( InternalEList.Unsettable< ? > ) fossilFuels ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public HeatInputCurve getHeatInputCurve() {
        if( heatInputCurve != null && heatInputCurve.eIsProxy() ) {
            InternalEObject oldHeatInputCurve = ( InternalEObject ) heatInputCurve;
            heatInputCurve = ( HeatInputCurve ) eResolveProxy( oldHeatInputCurve );
            if( heatInputCurve != oldHeatInputCurve ) {
                if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.RESOLVE,
                        CimPackage.THERMAL_GENERATING_UNIT__HEAT_INPUT_CURVE, oldHeatInputCurve, heatInputCurve ) );
            }
        }
        return heatInputCurve;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public HeatInputCurve basicGetHeatInputCurve() {
        return heatInputCurve;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetHeatInputCurve( HeatInputCurve newHeatInputCurve, NotificationChain msgs ) {
        HeatInputCurve oldHeatInputCurve = heatInputCurve;
        heatInputCurve = newHeatInputCurve;
        boolean oldHeatInputCurveESet = heatInputCurveESet;
        heatInputCurveESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.THERMAL_GENERATING_UNIT__HEAT_INPUT_CURVE, oldHeatInputCurve, newHeatInputCurve,
                    !oldHeatInputCurveESet );
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
    public void setHeatInputCurve( HeatInputCurve newHeatInputCurve ) {
        if( newHeatInputCurve != heatInputCurve ) {
            NotificationChain msgs = null;
            if( heatInputCurve != null ) msgs = ( ( InternalEObject ) heatInputCurve ).eInverseRemove( this,
                    CimPackage.HEAT_INPUT_CURVE__THERMAL_GENERATING_UNIT, HeatInputCurve.class, msgs );
            if( newHeatInputCurve != null ) msgs = ( ( InternalEObject ) newHeatInputCurve ).eInverseAdd( this,
                    CimPackage.HEAT_INPUT_CURVE__THERMAL_GENERATING_UNIT, HeatInputCurve.class, msgs );
            msgs = basicSetHeatInputCurve( newHeatInputCurve, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldHeatInputCurveESet = heatInputCurveESet;
            heatInputCurveESet = true;
            if( eNotificationRequired() ) eNotify(
                    new ENotificationImpl( this, Notification.SET, CimPackage.THERMAL_GENERATING_UNIT__HEAT_INPUT_CURVE,
                            newHeatInputCurve, newHeatInputCurve, !oldHeatInputCurveESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetHeatInputCurve( NotificationChain msgs ) {
        HeatInputCurve oldHeatInputCurve = heatInputCurve;
        heatInputCurve = null;
        boolean oldHeatInputCurveESet = heatInputCurveESet;
        heatInputCurveESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.THERMAL_GENERATING_UNIT__HEAT_INPUT_CURVE, oldHeatInputCurve, null,
                    oldHeatInputCurveESet );
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
    public void unsetHeatInputCurve() {
        if( heatInputCurve != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) heatInputCurve ).eInverseRemove( this,
                    CimPackage.HEAT_INPUT_CURVE__THERMAL_GENERATING_UNIT, HeatInputCurve.class, msgs );
            msgs = basicUnsetHeatInputCurve( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldHeatInputCurveESet = heatInputCurveESet;
            heatInputCurveESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.THERMAL_GENERATING_UNIT__HEAT_INPUT_CURVE, null, null, oldHeatInputCurveESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetHeatInputCurve() {
        return heatInputCurveESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public CAESPlant getCAESPlant() {
        if( caesPlant != null && caesPlant.eIsProxy() ) {
            InternalEObject oldCAESPlant = ( InternalEObject ) caesPlant;
            caesPlant = ( CAESPlant ) eResolveProxy( oldCAESPlant );
            if( caesPlant != oldCAESPlant ) {
                if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.RESOLVE,
                        CimPackage.THERMAL_GENERATING_UNIT__CAES_PLANT, oldCAESPlant, caesPlant ) );
            }
        }
        return caesPlant;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CAESPlant basicGetCAESPlant() {
        return caesPlant;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetCAESPlant( CAESPlant newCAESPlant, NotificationChain msgs ) {
        CAESPlant oldCAESPlant = caesPlant;
        caesPlant = newCAESPlant;
        boolean oldCAESPlantESet = caesPlantESet;
        caesPlantESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.THERMAL_GENERATING_UNIT__CAES_PLANT, oldCAESPlant, newCAESPlant, !oldCAESPlantESet );
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
    public void setCAESPlant( CAESPlant newCAESPlant ) {
        if( newCAESPlant != caesPlant ) {
            NotificationChain msgs = null;
            if( caesPlant != null ) msgs = ( ( InternalEObject ) caesPlant ).eInverseRemove( this,
                    CimPackage.CAES_PLANT__THERMAL_GENERATING_UNIT, CAESPlant.class, msgs );
            if( newCAESPlant != null ) msgs = ( ( InternalEObject ) newCAESPlant ).eInverseAdd( this,
                    CimPackage.CAES_PLANT__THERMAL_GENERATING_UNIT, CAESPlant.class, msgs );
            msgs = basicSetCAESPlant( newCAESPlant, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldCAESPlantESet = caesPlantESet;
            caesPlantESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.THERMAL_GENERATING_UNIT__CAES_PLANT, newCAESPlant, newCAESPlant, !oldCAESPlantESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetCAESPlant( NotificationChain msgs ) {
        CAESPlant oldCAESPlant = caesPlant;
        caesPlant = null;
        boolean oldCAESPlantESet = caesPlantESet;
        caesPlantESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.THERMAL_GENERATING_UNIT__CAES_PLANT, oldCAESPlant, null, oldCAESPlantESet );
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
    public void unsetCAESPlant() {
        if( caesPlant != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) caesPlant ).eInverseRemove( this,
                    CimPackage.CAES_PLANT__THERMAL_GENERATING_UNIT, CAESPlant.class, msgs );
            msgs = basicUnsetCAESPlant( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldCAESPlantESet = caesPlantESet;
            caesPlantESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.THERMAL_GENERATING_UNIT__CAES_PLANT, null, null, oldCAESPlantESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetCAESPlant() {
        return caesPlantESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< EmissionAccount > getEmmissionAccounts() {
        if( emmissionAccounts == null ) {
            emmissionAccounts = new EObjectWithInverseResolvingEList.Unsettable< EmissionAccount >(
                    EmissionAccount.class, this, CimPackage.THERMAL_GENERATING_UNIT__EMMISSION_ACCOUNTS,
                    CimPackage.EMISSION_ACCOUNT__THERMAL_GENERATING_UNIT );
        }
        return emmissionAccounts;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetEmmissionAccounts() {
        if( emmissionAccounts != null ) ( ( InternalEList.Unsettable< ? > ) emmissionAccounts ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetEmmissionAccounts() {
        return emmissionAccounts != null && ( ( InternalEList.Unsettable< ? > ) emmissionAccounts ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public CogenerationPlant getCogenerationPlant() {
        return cogenerationPlant;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetCogenerationPlant( CogenerationPlant newCogenerationPlant,
            NotificationChain msgs ) {
        CogenerationPlant oldCogenerationPlant = cogenerationPlant;
        cogenerationPlant = newCogenerationPlant;
        boolean oldCogenerationPlantESet = cogenerationPlantESet;
        cogenerationPlantESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.THERMAL_GENERATING_UNIT__COGENERATION_PLANT, oldCogenerationPlant, newCogenerationPlant,
                    !oldCogenerationPlantESet );
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
    public void setCogenerationPlant( CogenerationPlant newCogenerationPlant ) {
        if( newCogenerationPlant != cogenerationPlant ) {
            NotificationChain msgs = null;
            if( cogenerationPlant != null ) msgs = ( ( InternalEObject ) cogenerationPlant ).eInverseRemove( this,
                    CimPackage.COGENERATION_PLANT__THERMAL_GENERATING_UNITS, CogenerationPlant.class, msgs );
            if( newCogenerationPlant != null ) msgs = ( ( InternalEObject ) newCogenerationPlant ).eInverseAdd( this,
                    CimPackage.COGENERATION_PLANT__THERMAL_GENERATING_UNITS, CogenerationPlant.class, msgs );
            msgs = basicSetCogenerationPlant( newCogenerationPlant, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldCogenerationPlantESet = cogenerationPlantESet;
            cogenerationPlantESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.THERMAL_GENERATING_UNIT__COGENERATION_PLANT, newCogenerationPlant, newCogenerationPlant,
                    !oldCogenerationPlantESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetCogenerationPlant( NotificationChain msgs ) {
        CogenerationPlant oldCogenerationPlant = cogenerationPlant;
        cogenerationPlant = null;
        boolean oldCogenerationPlantESet = cogenerationPlantESet;
        cogenerationPlantESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.THERMAL_GENERATING_UNIT__COGENERATION_PLANT, oldCogenerationPlant, null,
                    oldCogenerationPlantESet );
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
    public void unsetCogenerationPlant() {
        if( cogenerationPlant != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) cogenerationPlant ).eInverseRemove( this,
                    CimPackage.COGENERATION_PLANT__THERMAL_GENERATING_UNITS, CogenerationPlant.class, msgs );
            msgs = basicUnsetCogenerationPlant( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldCogenerationPlantESet = cogenerationPlantESet;
            cogenerationPlantESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.THERMAL_GENERATING_UNIT__COGENERATION_PLANT, null, null, oldCogenerationPlantESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetCogenerationPlant() {
        return cogenerationPlantESet;
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
        case CimPackage.THERMAL_GENERATING_UNIT__STARTUP_MODEL:
            if( startupModel != null ) msgs = ( ( InternalEObject ) startupModel ).eInverseRemove( this,
                    CimPackage.STARTUP_MODEL__THERMAL_GENERATING_UNIT, StartupModel.class, msgs );
            return basicSetStartupModel( ( StartupModel ) otherEnd, msgs );
        case CimPackage.THERMAL_GENERATING_UNIT__INCREMENTAL_HEAT_RATE_CURVE:
            if( incrementalHeatRateCurve != null )
                msgs = ( ( InternalEObject ) incrementalHeatRateCurve ).eInverseRemove( this,
                        CimPackage.INCREMENTAL_HEAT_RATE_CURVE__THERMAL_GENERATING_UNIT, IncrementalHeatRateCurve.class,
                        msgs );
            return basicSetIncrementalHeatRateCurve( ( IncrementalHeatRateCurve ) otherEnd, msgs );
        case CimPackage.THERMAL_GENERATING_UNIT__EMISSION_CURVES:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getEmissionCurves() )
                    .basicAdd( otherEnd, msgs );
        case CimPackage.THERMAL_GENERATING_UNIT__FUEL_ALLOCATION_SCHEDULES:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getFuelAllocationSchedules() )
                    .basicAdd( otherEnd, msgs );
        case CimPackage.THERMAL_GENERATING_UNIT__COMBINED_CYCLE_PLANT:
            if( combinedCyclePlant != null ) msgs = ( ( InternalEObject ) combinedCyclePlant ).eInverseRemove( this,
                    CimPackage.COMBINED_CYCLE_PLANT__THERMAL_GENERATING_UNITS, CombinedCyclePlant.class, msgs );
            return basicSetCombinedCyclePlant( ( CombinedCyclePlant ) otherEnd, msgs );
        case CimPackage.THERMAL_GENERATING_UNIT__SHUTDOWN_CURVE:
            if( shutdownCurve != null ) msgs = ( ( InternalEObject ) shutdownCurve ).eInverseRemove( this,
                    CimPackage.SHUTDOWN_CURVE__THERMAL_GENERATING_UNIT, ShutdownCurve.class, msgs );
            return basicSetShutdownCurve( ( ShutdownCurve ) otherEnd, msgs );
        case CimPackage.THERMAL_GENERATING_UNIT__HEAT_RATE_CURVE:
            if( heatRateCurve != null ) msgs = ( ( InternalEObject ) heatRateCurve ).eInverseRemove( this,
                    CimPackage.HEAT_RATE_CURVE__THERMAL_GENERATING_UNIT, HeatRateCurve.class, msgs );
            return basicSetHeatRateCurve( ( HeatRateCurve ) otherEnd, msgs );
        case CimPackage.THERMAL_GENERATING_UNIT__FOSSIL_FUELS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getFossilFuels() ).basicAdd( otherEnd,
                    msgs );
        case CimPackage.THERMAL_GENERATING_UNIT__HEAT_INPUT_CURVE:
            if( heatInputCurve != null ) msgs = ( ( InternalEObject ) heatInputCurve ).eInverseRemove( this,
                    CimPackage.HEAT_INPUT_CURVE__THERMAL_GENERATING_UNIT, HeatInputCurve.class, msgs );
            return basicSetHeatInputCurve( ( HeatInputCurve ) otherEnd, msgs );
        case CimPackage.THERMAL_GENERATING_UNIT__CAES_PLANT:
            if( caesPlant != null ) msgs = ( ( InternalEObject ) caesPlant ).eInverseRemove( this,
                    CimPackage.CAES_PLANT__THERMAL_GENERATING_UNIT, CAESPlant.class, msgs );
            return basicSetCAESPlant( ( CAESPlant ) otherEnd, msgs );
        case CimPackage.THERMAL_GENERATING_UNIT__EMMISSION_ACCOUNTS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getEmmissionAccounts() )
                    .basicAdd( otherEnd, msgs );
        case CimPackage.THERMAL_GENERATING_UNIT__COGENERATION_PLANT:
            if( cogenerationPlant != null ) msgs = ( ( InternalEObject ) cogenerationPlant ).eInverseRemove( this,
                    CimPackage.COGENERATION_PLANT__THERMAL_GENERATING_UNITS, CogenerationPlant.class, msgs );
            return basicSetCogenerationPlant( ( CogenerationPlant ) otherEnd, msgs );
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
        case CimPackage.THERMAL_GENERATING_UNIT__STARTUP_MODEL:
            return basicUnsetStartupModel( msgs );
        case CimPackage.THERMAL_GENERATING_UNIT__INCREMENTAL_HEAT_RATE_CURVE:
            return basicUnsetIncrementalHeatRateCurve( msgs );
        case CimPackage.THERMAL_GENERATING_UNIT__EMISSION_CURVES:
            return ( ( InternalEList< ? > ) getEmissionCurves() ).basicRemove( otherEnd, msgs );
        case CimPackage.THERMAL_GENERATING_UNIT__FUEL_ALLOCATION_SCHEDULES:
            return ( ( InternalEList< ? > ) getFuelAllocationSchedules() ).basicRemove( otherEnd, msgs );
        case CimPackage.THERMAL_GENERATING_UNIT__COMBINED_CYCLE_PLANT:
            return basicUnsetCombinedCyclePlant( msgs );
        case CimPackage.THERMAL_GENERATING_UNIT__SHUTDOWN_CURVE:
            return basicUnsetShutdownCurve( msgs );
        case CimPackage.THERMAL_GENERATING_UNIT__HEAT_RATE_CURVE:
            return basicUnsetHeatRateCurve( msgs );
        case CimPackage.THERMAL_GENERATING_UNIT__FOSSIL_FUELS:
            return ( ( InternalEList< ? > ) getFossilFuels() ).basicRemove( otherEnd, msgs );
        case CimPackage.THERMAL_GENERATING_UNIT__HEAT_INPUT_CURVE:
            return basicUnsetHeatInputCurve( msgs );
        case CimPackage.THERMAL_GENERATING_UNIT__CAES_PLANT:
            return basicUnsetCAESPlant( msgs );
        case CimPackage.THERMAL_GENERATING_UNIT__EMMISSION_ACCOUNTS:
            return ( ( InternalEList< ? > ) getEmmissionAccounts() ).basicRemove( otherEnd, msgs );
        case CimPackage.THERMAL_GENERATING_UNIT__COGENERATION_PLANT:
            return basicUnsetCogenerationPlant( msgs );
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
        case CimPackage.THERMAL_GENERATING_UNIT__OM_COST:
            return getOMCost();
        case CimPackage.THERMAL_GENERATING_UNIT__STARTUP_MODEL:
            if( resolve ) return getStartupModel();
            return basicGetStartupModel();
        case CimPackage.THERMAL_GENERATING_UNIT__INCREMENTAL_HEAT_RATE_CURVE:
            if( resolve ) return getIncrementalHeatRateCurve();
            return basicGetIncrementalHeatRateCurve();
        case CimPackage.THERMAL_GENERATING_UNIT__EMISSION_CURVES:
            return getEmissionCurves();
        case CimPackage.THERMAL_GENERATING_UNIT__FUEL_ALLOCATION_SCHEDULES:
            return getFuelAllocationSchedules();
        case CimPackage.THERMAL_GENERATING_UNIT__COMBINED_CYCLE_PLANT:
            return getCombinedCyclePlant();
        case CimPackage.THERMAL_GENERATING_UNIT__SHUTDOWN_CURVE:
            if( resolve ) return getShutdownCurve();
            return basicGetShutdownCurve();
        case CimPackage.THERMAL_GENERATING_UNIT__HEAT_RATE_CURVE:
            return getHeatRateCurve();
        case CimPackage.THERMAL_GENERATING_UNIT__FOSSIL_FUELS:
            return getFossilFuels();
        case CimPackage.THERMAL_GENERATING_UNIT__HEAT_INPUT_CURVE:
            if( resolve ) return getHeatInputCurve();
            return basicGetHeatInputCurve();
        case CimPackage.THERMAL_GENERATING_UNIT__CAES_PLANT:
            if( resolve ) return getCAESPlant();
            return basicGetCAESPlant();
        case CimPackage.THERMAL_GENERATING_UNIT__EMMISSION_ACCOUNTS:
            return getEmmissionAccounts();
        case CimPackage.THERMAL_GENERATING_UNIT__COGENERATION_PLANT:
            return getCogenerationPlant();
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
        case CimPackage.THERMAL_GENERATING_UNIT__OM_COST:
            setOMCost( ( Float ) newValue );
            return;
        case CimPackage.THERMAL_GENERATING_UNIT__STARTUP_MODEL:
            setStartupModel( ( StartupModel ) newValue );
            return;
        case CimPackage.THERMAL_GENERATING_UNIT__INCREMENTAL_HEAT_RATE_CURVE:
            setIncrementalHeatRateCurve( ( IncrementalHeatRateCurve ) newValue );
            return;
        case CimPackage.THERMAL_GENERATING_UNIT__EMISSION_CURVES:
            getEmissionCurves().clear();
            getEmissionCurves().addAll( ( Collection< ? extends EmissionCurve > ) newValue );
            return;
        case CimPackage.THERMAL_GENERATING_UNIT__FUEL_ALLOCATION_SCHEDULES:
            getFuelAllocationSchedules().clear();
            getFuelAllocationSchedules().addAll( ( Collection< ? extends FuelAllocationSchedule > ) newValue );
            return;
        case CimPackage.THERMAL_GENERATING_UNIT__COMBINED_CYCLE_PLANT:
            setCombinedCyclePlant( ( CombinedCyclePlant ) newValue );
            return;
        case CimPackage.THERMAL_GENERATING_UNIT__SHUTDOWN_CURVE:
            setShutdownCurve( ( ShutdownCurve ) newValue );
            return;
        case CimPackage.THERMAL_GENERATING_UNIT__HEAT_RATE_CURVE:
            setHeatRateCurve( ( HeatRateCurve ) newValue );
            return;
        case CimPackage.THERMAL_GENERATING_UNIT__FOSSIL_FUELS:
            getFossilFuels().clear();
            getFossilFuels().addAll( ( Collection< ? extends FossilFuel > ) newValue );
            return;
        case CimPackage.THERMAL_GENERATING_UNIT__HEAT_INPUT_CURVE:
            setHeatInputCurve( ( HeatInputCurve ) newValue );
            return;
        case CimPackage.THERMAL_GENERATING_UNIT__CAES_PLANT:
            setCAESPlant( ( CAESPlant ) newValue );
            return;
        case CimPackage.THERMAL_GENERATING_UNIT__EMMISSION_ACCOUNTS:
            getEmmissionAccounts().clear();
            getEmmissionAccounts().addAll( ( Collection< ? extends EmissionAccount > ) newValue );
            return;
        case CimPackage.THERMAL_GENERATING_UNIT__COGENERATION_PLANT:
            setCogenerationPlant( ( CogenerationPlant ) newValue );
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
        case CimPackage.THERMAL_GENERATING_UNIT__OM_COST:
            unsetOMCost();
            return;
        case CimPackage.THERMAL_GENERATING_UNIT__STARTUP_MODEL:
            unsetStartupModel();
            return;
        case CimPackage.THERMAL_GENERATING_UNIT__INCREMENTAL_HEAT_RATE_CURVE:
            unsetIncrementalHeatRateCurve();
            return;
        case CimPackage.THERMAL_GENERATING_UNIT__EMISSION_CURVES:
            unsetEmissionCurves();
            return;
        case CimPackage.THERMAL_GENERATING_UNIT__FUEL_ALLOCATION_SCHEDULES:
            unsetFuelAllocationSchedules();
            return;
        case CimPackage.THERMAL_GENERATING_UNIT__COMBINED_CYCLE_PLANT:
            unsetCombinedCyclePlant();
            return;
        case CimPackage.THERMAL_GENERATING_UNIT__SHUTDOWN_CURVE:
            unsetShutdownCurve();
            return;
        case CimPackage.THERMAL_GENERATING_UNIT__HEAT_RATE_CURVE:
            unsetHeatRateCurve();
            return;
        case CimPackage.THERMAL_GENERATING_UNIT__FOSSIL_FUELS:
            unsetFossilFuels();
            return;
        case CimPackage.THERMAL_GENERATING_UNIT__HEAT_INPUT_CURVE:
            unsetHeatInputCurve();
            return;
        case CimPackage.THERMAL_GENERATING_UNIT__CAES_PLANT:
            unsetCAESPlant();
            return;
        case CimPackage.THERMAL_GENERATING_UNIT__EMMISSION_ACCOUNTS:
            unsetEmmissionAccounts();
            return;
        case CimPackage.THERMAL_GENERATING_UNIT__COGENERATION_PLANT:
            unsetCogenerationPlant();
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
        case CimPackage.THERMAL_GENERATING_UNIT__OM_COST:
            return isSetOMCost();
        case CimPackage.THERMAL_GENERATING_UNIT__STARTUP_MODEL:
            return isSetStartupModel();
        case CimPackage.THERMAL_GENERATING_UNIT__INCREMENTAL_HEAT_RATE_CURVE:
            return isSetIncrementalHeatRateCurve();
        case CimPackage.THERMAL_GENERATING_UNIT__EMISSION_CURVES:
            return isSetEmissionCurves();
        case CimPackage.THERMAL_GENERATING_UNIT__FUEL_ALLOCATION_SCHEDULES:
            return isSetFuelAllocationSchedules();
        case CimPackage.THERMAL_GENERATING_UNIT__COMBINED_CYCLE_PLANT:
            return isSetCombinedCyclePlant();
        case CimPackage.THERMAL_GENERATING_UNIT__SHUTDOWN_CURVE:
            return isSetShutdownCurve();
        case CimPackage.THERMAL_GENERATING_UNIT__HEAT_RATE_CURVE:
            return isSetHeatRateCurve();
        case CimPackage.THERMAL_GENERATING_UNIT__FOSSIL_FUELS:
            return isSetFossilFuels();
        case CimPackage.THERMAL_GENERATING_UNIT__HEAT_INPUT_CURVE:
            return isSetHeatInputCurve();
        case CimPackage.THERMAL_GENERATING_UNIT__CAES_PLANT:
            return isSetCAESPlant();
        case CimPackage.THERMAL_GENERATING_UNIT__EMMISSION_ACCOUNTS:
            return isSetEmmissionAccounts();
        case CimPackage.THERMAL_GENERATING_UNIT__COGENERATION_PLANT:
            return isSetCogenerationPlant();
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
        result.append( " (oMCost: " );
        if( oMCostESet )
            result.append( oMCost );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //ThermalGeneratingUnitImpl
