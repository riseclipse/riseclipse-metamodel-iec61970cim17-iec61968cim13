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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.HydroGeneratingUnit;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.HydroPlantStorageKind;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.HydroPowerPlant;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.HydroPump;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Reservoir;

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
 * An implementation of the model object '<em><b>Hydro Power Plant</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.HydroPowerPlantImpl#getDischargeTravelDelay <em>Discharge Travel Delay</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.HydroPowerPlantImpl#getGenRatedP <em>Gen Rated P</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.HydroPowerPlantImpl#getHydroPlantStorageType <em>Hydro Plant Storage Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.HydroPowerPlantImpl#getPenstockType <em>Penstock Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.HydroPowerPlantImpl#getPlantDischargeCapacity <em>Plant Discharge Capacity</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.HydroPowerPlantImpl#getPlantRatedHead <em>Plant Rated Head</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.HydroPowerPlantImpl#getPumpRatedP <em>Pump Rated P</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.HydroPowerPlantImpl#getSurgeTankCode <em>Surge Tank Code</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.HydroPowerPlantImpl#getSurgeTankCrestLevel <em>Surge Tank Crest Level</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.HydroPowerPlantImpl#getHydroGeneratingUnits <em>Hydro Generating Units</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.HydroPowerPlantImpl#getReservoir <em>Reservoir</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.HydroPowerPlantImpl#getGenSourcePumpDischargeReservoir <em>Gen Source Pump Discharge Reservoir</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.HydroPowerPlantImpl#getHydroPumps <em>Hydro Pumps</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HydroPowerPlantImpl extends PowerSystemResourceImpl implements HydroPowerPlant {
    /**
     * The default value of the '{@link #getDischargeTravelDelay() <em>Discharge Travel Delay</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDischargeTravelDelay()
     * @generated
     * @ordered
     */
    protected static final Float DISCHARGE_TRAVEL_DELAY_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDischargeTravelDelay() <em>Discharge Travel Delay</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDischargeTravelDelay()
     * @generated
     * @ordered
     */
    protected Float dischargeTravelDelay = DISCHARGE_TRAVEL_DELAY_EDEFAULT;

    /**
     * This is true if the Discharge Travel Delay attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean dischargeTravelDelayESet;

    /**
     * The default value of the '{@link #getGenRatedP() <em>Gen Rated P</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getGenRatedP()
     * @generated
     * @ordered
     */
    protected static final Float GEN_RATED_P_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getGenRatedP() <em>Gen Rated P</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getGenRatedP()
     * @generated
     * @ordered
     */
    protected Float genRatedP = GEN_RATED_P_EDEFAULT;

    /**
     * This is true if the Gen Rated P attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean genRatedPESet;

    /**
     * The default value of the '{@link #getHydroPlantStorageType() <em>Hydro Plant Storage Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getHydroPlantStorageType()
     * @generated
     * @ordered
     */
    protected static final HydroPlantStorageKind HYDRO_PLANT_STORAGE_TYPE_EDEFAULT = HydroPlantStorageKind.RUN_OF_RIVER;

    /**
     * The cached value of the '{@link #getHydroPlantStorageType() <em>Hydro Plant Storage Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getHydroPlantStorageType()
     * @generated
     * @ordered
     */
    protected HydroPlantStorageKind hydroPlantStorageType = HYDRO_PLANT_STORAGE_TYPE_EDEFAULT;

    /**
     * This is true if the Hydro Plant Storage Type attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean hydroPlantStorageTypeESet;

    /**
     * The default value of the '{@link #getPenstockType() <em>Penstock Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPenstockType()
     * @generated
     * @ordered
     */
    protected static final String PENSTOCK_TYPE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPenstockType() <em>Penstock Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPenstockType()
     * @generated
     * @ordered
     */
    protected String penstockType = PENSTOCK_TYPE_EDEFAULT;

    /**
     * This is true if the Penstock Type attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean penstockTypeESet;

    /**
     * The default value of the '{@link #getPlantDischargeCapacity() <em>Plant Discharge Capacity</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPlantDischargeCapacity()
     * @generated
     * @ordered
     */
    protected static final Float PLANT_DISCHARGE_CAPACITY_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPlantDischargeCapacity() <em>Plant Discharge Capacity</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPlantDischargeCapacity()
     * @generated
     * @ordered
     */
    protected Float plantDischargeCapacity = PLANT_DISCHARGE_CAPACITY_EDEFAULT;

    /**
     * This is true if the Plant Discharge Capacity attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean plantDischargeCapacityESet;

    /**
     * The default value of the '{@link #getPlantRatedHead() <em>Plant Rated Head</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPlantRatedHead()
     * @generated
     * @ordered
     */
    protected static final Float PLANT_RATED_HEAD_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPlantRatedHead() <em>Plant Rated Head</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPlantRatedHead()
     * @generated
     * @ordered
     */
    protected Float plantRatedHead = PLANT_RATED_HEAD_EDEFAULT;

    /**
     * This is true if the Plant Rated Head attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean plantRatedHeadESet;

    /**
     * The default value of the '{@link #getPumpRatedP() <em>Pump Rated P</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPumpRatedP()
     * @generated
     * @ordered
     */
    protected static final Float PUMP_RATED_P_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPumpRatedP() <em>Pump Rated P</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPumpRatedP()
     * @generated
     * @ordered
     */
    protected Float pumpRatedP = PUMP_RATED_P_EDEFAULT;

    /**
     * This is true if the Pump Rated P attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean pumpRatedPESet;

    /**
     * The default value of the '{@link #getSurgeTankCode() <em>Surge Tank Code</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSurgeTankCode()
     * @generated
     * @ordered
     */
    protected static final String SURGE_TANK_CODE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSurgeTankCode() <em>Surge Tank Code</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSurgeTankCode()
     * @generated
     * @ordered
     */
    protected String surgeTankCode = SURGE_TANK_CODE_EDEFAULT;

    /**
     * This is true if the Surge Tank Code attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean surgeTankCodeESet;

    /**
     * The default value of the '{@link #getSurgeTankCrestLevel() <em>Surge Tank Crest Level</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSurgeTankCrestLevel()
     * @generated
     * @ordered
     */
    protected static final Float SURGE_TANK_CREST_LEVEL_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSurgeTankCrestLevel() <em>Surge Tank Crest Level</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSurgeTankCrestLevel()
     * @generated
     * @ordered
     */
    protected Float surgeTankCrestLevel = SURGE_TANK_CREST_LEVEL_EDEFAULT;

    /**
     * This is true if the Surge Tank Crest Level attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean surgeTankCrestLevelESet;

    /**
     * The cached value of the '{@link #getHydroGeneratingUnits() <em>Hydro Generating Units</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getHydroGeneratingUnits()
     * @generated
     * @ordered
     */
    protected EList< HydroGeneratingUnit > hydroGeneratingUnits;

    /**
     * The cached value of the '{@link #getReservoir() <em>Reservoir</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReservoir()
     * @generated
     * @ordered
     */
    protected Reservoir reservoir;

    /**
     * This is true if the Reservoir reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean reservoirESet;

    /**
     * The cached value of the '{@link #getGenSourcePumpDischargeReservoir() <em>Gen Source Pump Discharge Reservoir</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getGenSourcePumpDischargeReservoir()
     * @generated
     * @ordered
     */
    protected Reservoir genSourcePumpDischargeReservoir;

    /**
     * This is true if the Gen Source Pump Discharge Reservoir reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean genSourcePumpDischargeReservoirESet;

    /**
     * The cached value of the '{@link #getHydroPumps() <em>Hydro Pumps</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getHydroPumps()
     * @generated
     * @ordered
     */
    protected EList< HydroPump > hydroPumps;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected HydroPowerPlantImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getHydroPowerPlant();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getDischargeTravelDelay() {
        return dischargeTravelDelay;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setDischargeTravelDelay( Float newDischargeTravelDelay ) {
        Float oldDischargeTravelDelay = dischargeTravelDelay;
        dischargeTravelDelay = newDischargeTravelDelay;
        boolean oldDischargeTravelDelayESet = dischargeTravelDelayESet;
        dischargeTravelDelayESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.HYDRO_POWER_PLANT__DISCHARGE_TRAVEL_DELAY,
                        oldDischargeTravelDelay, dischargeTravelDelay, !oldDischargeTravelDelayESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetDischargeTravelDelay() {
        Float oldDischargeTravelDelay = dischargeTravelDelay;
        boolean oldDischargeTravelDelayESet = dischargeTravelDelayESet;
        dischargeTravelDelay = DISCHARGE_TRAVEL_DELAY_EDEFAULT;
        dischargeTravelDelayESet = false;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.UNSET, CimPackage.HYDRO_POWER_PLANT__DISCHARGE_TRAVEL_DELAY,
                        oldDischargeTravelDelay, DISCHARGE_TRAVEL_DELAY_EDEFAULT, oldDischargeTravelDelayESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetDischargeTravelDelay() {
        return dischargeTravelDelayESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getGenRatedP() {
        return genRatedP;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setGenRatedP( Float newGenRatedP ) {
        Float oldGenRatedP = genRatedP;
        genRatedP = newGenRatedP;
        boolean oldGenRatedPESet = genRatedPESet;
        genRatedPESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.HYDRO_POWER_PLANT__GEN_RATED_P, oldGenRatedP, genRatedP, !oldGenRatedPESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetGenRatedP() {
        Float oldGenRatedP = genRatedP;
        boolean oldGenRatedPESet = genRatedPESet;
        genRatedP = GEN_RATED_P_EDEFAULT;
        genRatedPESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.HYDRO_POWER_PLANT__GEN_RATED_P, oldGenRatedP, GEN_RATED_P_EDEFAULT, oldGenRatedPESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetGenRatedP() {
        return genRatedPESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public HydroPlantStorageKind getHydroPlantStorageType() {
        return hydroPlantStorageType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setHydroPlantStorageType( HydroPlantStorageKind newHydroPlantStorageType ) {
        HydroPlantStorageKind oldHydroPlantStorageType = hydroPlantStorageType;
        hydroPlantStorageType = newHydroPlantStorageType == null ? HYDRO_PLANT_STORAGE_TYPE_EDEFAULT
                : newHydroPlantStorageType;
        boolean oldHydroPlantStorageTypeESet = hydroPlantStorageTypeESet;
        hydroPlantStorageTypeESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.HYDRO_POWER_PLANT__HYDRO_PLANT_STORAGE_TYPE,
                        oldHydroPlantStorageType, hydroPlantStorageType, !oldHydroPlantStorageTypeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetHydroPlantStorageType() {
        HydroPlantStorageKind oldHydroPlantStorageType = hydroPlantStorageType;
        boolean oldHydroPlantStorageTypeESet = hydroPlantStorageTypeESet;
        hydroPlantStorageType = HYDRO_PLANT_STORAGE_TYPE_EDEFAULT;
        hydroPlantStorageTypeESet = false;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.UNSET, CimPackage.HYDRO_POWER_PLANT__HYDRO_PLANT_STORAGE_TYPE,
                        oldHydroPlantStorageType, HYDRO_PLANT_STORAGE_TYPE_EDEFAULT, oldHydroPlantStorageTypeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetHydroPlantStorageType() {
        return hydroPlantStorageTypeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getPenstockType() {
        return penstockType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setPenstockType( String newPenstockType ) {
        String oldPenstockType = penstockType;
        penstockType = newPenstockType;
        boolean oldPenstockTypeESet = penstockTypeESet;
        penstockTypeESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.HYDRO_POWER_PLANT__PENSTOCK_TYPE, oldPenstockType, penstockType, !oldPenstockTypeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetPenstockType() {
        String oldPenstockType = penstockType;
        boolean oldPenstockTypeESet = penstockTypeESet;
        penstockType = PENSTOCK_TYPE_EDEFAULT;
        penstockTypeESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.HYDRO_POWER_PLANT__PENSTOCK_TYPE,
                    oldPenstockType, PENSTOCK_TYPE_EDEFAULT, oldPenstockTypeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPenstockType() {
        return penstockTypeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getPlantDischargeCapacity() {
        return plantDischargeCapacity;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setPlantDischargeCapacity( Float newPlantDischargeCapacity ) {
        Float oldPlantDischargeCapacity = plantDischargeCapacity;
        plantDischargeCapacity = newPlantDischargeCapacity;
        boolean oldPlantDischargeCapacityESet = plantDischargeCapacityESet;
        plantDischargeCapacityESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.HYDRO_POWER_PLANT__PLANT_DISCHARGE_CAPACITY,
                        oldPlantDischargeCapacity, plantDischargeCapacity, !oldPlantDischargeCapacityESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetPlantDischargeCapacity() {
        Float oldPlantDischargeCapacity = plantDischargeCapacity;
        boolean oldPlantDischargeCapacityESet = plantDischargeCapacityESet;
        plantDischargeCapacity = PLANT_DISCHARGE_CAPACITY_EDEFAULT;
        plantDischargeCapacityESet = false;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.UNSET, CimPackage.HYDRO_POWER_PLANT__PLANT_DISCHARGE_CAPACITY,
                        oldPlantDischargeCapacity, PLANT_DISCHARGE_CAPACITY_EDEFAULT, oldPlantDischargeCapacityESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPlantDischargeCapacity() {
        return plantDischargeCapacityESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getPlantRatedHead() {
        return plantRatedHead;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setPlantRatedHead( Float newPlantRatedHead ) {
        Float oldPlantRatedHead = plantRatedHead;
        plantRatedHead = newPlantRatedHead;
        boolean oldPlantRatedHeadESet = plantRatedHeadESet;
        plantRatedHeadESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.HYDRO_POWER_PLANT__PLANT_RATED_HEAD,
                    oldPlantRatedHead, plantRatedHead, !oldPlantRatedHeadESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetPlantRatedHead() {
        Float oldPlantRatedHead = plantRatedHead;
        boolean oldPlantRatedHeadESet = plantRatedHeadESet;
        plantRatedHead = PLANT_RATED_HEAD_EDEFAULT;
        plantRatedHeadESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.HYDRO_POWER_PLANT__PLANT_RATED_HEAD,
                    oldPlantRatedHead, PLANT_RATED_HEAD_EDEFAULT, oldPlantRatedHeadESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPlantRatedHead() {
        return plantRatedHeadESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getPumpRatedP() {
        return pumpRatedP;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setPumpRatedP( Float newPumpRatedP ) {
        Float oldPumpRatedP = pumpRatedP;
        pumpRatedP = newPumpRatedP;
        boolean oldPumpRatedPESet = pumpRatedPESet;
        pumpRatedPESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.HYDRO_POWER_PLANT__PUMP_RATED_P, oldPumpRatedP, pumpRatedP, !oldPumpRatedPESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetPumpRatedP() {
        Float oldPumpRatedP = pumpRatedP;
        boolean oldPumpRatedPESet = pumpRatedPESet;
        pumpRatedP = PUMP_RATED_P_EDEFAULT;
        pumpRatedPESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.HYDRO_POWER_PLANT__PUMP_RATED_P, oldPumpRatedP, PUMP_RATED_P_EDEFAULT, oldPumpRatedPESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPumpRatedP() {
        return pumpRatedPESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getSurgeTankCode() {
        return surgeTankCode;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setSurgeTankCode( String newSurgeTankCode ) {
        String oldSurgeTankCode = surgeTankCode;
        surgeTankCode = newSurgeTankCode;
        boolean oldSurgeTankCodeESet = surgeTankCodeESet;
        surgeTankCodeESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.HYDRO_POWER_PLANT__SURGE_TANK_CODE,
                    oldSurgeTankCode, surgeTankCode, !oldSurgeTankCodeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetSurgeTankCode() {
        String oldSurgeTankCode = surgeTankCode;
        boolean oldSurgeTankCodeESet = surgeTankCodeESet;
        surgeTankCode = SURGE_TANK_CODE_EDEFAULT;
        surgeTankCodeESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.HYDRO_POWER_PLANT__SURGE_TANK_CODE,
                    oldSurgeTankCode, SURGE_TANK_CODE_EDEFAULT, oldSurgeTankCodeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetSurgeTankCode() {
        return surgeTankCodeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getSurgeTankCrestLevel() {
        return surgeTankCrestLevel;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setSurgeTankCrestLevel( Float newSurgeTankCrestLevel ) {
        Float oldSurgeTankCrestLevel = surgeTankCrestLevel;
        surgeTankCrestLevel = newSurgeTankCrestLevel;
        boolean oldSurgeTankCrestLevelESet = surgeTankCrestLevelESet;
        surgeTankCrestLevelESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.HYDRO_POWER_PLANT__SURGE_TANK_CREST_LEVEL,
                        oldSurgeTankCrestLevel, surgeTankCrestLevel, !oldSurgeTankCrestLevelESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetSurgeTankCrestLevel() {
        Float oldSurgeTankCrestLevel = surgeTankCrestLevel;
        boolean oldSurgeTankCrestLevelESet = surgeTankCrestLevelESet;
        surgeTankCrestLevel = SURGE_TANK_CREST_LEVEL_EDEFAULT;
        surgeTankCrestLevelESet = false;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.UNSET, CimPackage.HYDRO_POWER_PLANT__SURGE_TANK_CREST_LEVEL,
                        oldSurgeTankCrestLevel, SURGE_TANK_CREST_LEVEL_EDEFAULT, oldSurgeTankCrestLevelESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetSurgeTankCrestLevel() {
        return surgeTankCrestLevelESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< HydroGeneratingUnit > getHydroGeneratingUnits() {
        if( hydroGeneratingUnits == null ) {
            hydroGeneratingUnits = new EObjectWithInverseResolvingEList.Unsettable< HydroGeneratingUnit >(
                    HydroGeneratingUnit.class, this, CimPackage.HYDRO_POWER_PLANT__HYDRO_GENERATING_UNITS,
                    CimPackage.HYDRO_GENERATING_UNIT__HYDRO_POWER_PLANT );
        }
        return hydroGeneratingUnits;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetHydroGeneratingUnits() {
        if( hydroGeneratingUnits != null ) ( ( InternalEList.Unsettable< ? > ) hydroGeneratingUnits ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetHydroGeneratingUnits() {
        return hydroGeneratingUnits != null && ( ( InternalEList.Unsettable< ? > ) hydroGeneratingUnits ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Reservoir getReservoir() {
        return reservoir;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetReservoir( Reservoir newReservoir, NotificationChain msgs ) {
        Reservoir oldReservoir = reservoir;
        reservoir = newReservoir;
        boolean oldReservoirESet = reservoirESet;
        reservoirESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.HYDRO_POWER_PLANT__RESERVOIR, oldReservoir, newReservoir, !oldReservoirESet );
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
    public void setReservoir( Reservoir newReservoir ) {
        if( newReservoir != reservoir ) {
            NotificationChain msgs = null;
            if( reservoir != null ) msgs = ( ( InternalEObject ) reservoir ).eInverseRemove( this,
                    CimPackage.RESERVOIR__HYDRO_POWER_PLANTS, Reservoir.class, msgs );
            if( newReservoir != null ) msgs = ( ( InternalEObject ) newReservoir ).eInverseAdd( this,
                    CimPackage.RESERVOIR__HYDRO_POWER_PLANTS, Reservoir.class, msgs );
            msgs = basicSetReservoir( newReservoir, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldReservoirESet = reservoirESet;
            reservoirESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.HYDRO_POWER_PLANT__RESERVOIR, newReservoir, newReservoir, !oldReservoirESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetReservoir( NotificationChain msgs ) {
        Reservoir oldReservoir = reservoir;
        reservoir = null;
        boolean oldReservoirESet = reservoirESet;
        reservoirESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.HYDRO_POWER_PLANT__RESERVOIR, oldReservoir, null, oldReservoirESet );
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
    public void unsetReservoir() {
        if( reservoir != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) reservoir ).eInverseRemove( this, CimPackage.RESERVOIR__HYDRO_POWER_PLANTS,
                    Reservoir.class, msgs );
            msgs = basicUnsetReservoir( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldReservoirESet = reservoirESet;
            reservoirESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.HYDRO_POWER_PLANT__RESERVOIR, null, null, oldReservoirESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetReservoir() {
        return reservoirESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Reservoir getGenSourcePumpDischargeReservoir() {
        return genSourcePumpDischargeReservoir;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetGenSourcePumpDischargeReservoir( Reservoir newGenSourcePumpDischargeReservoir,
            NotificationChain msgs ) {
        Reservoir oldGenSourcePumpDischargeReservoir = genSourcePumpDischargeReservoir;
        genSourcePumpDischargeReservoir = newGenSourcePumpDischargeReservoir;
        boolean oldGenSourcePumpDischargeReservoirESet = genSourcePumpDischargeReservoirESet;
        genSourcePumpDischargeReservoirESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.HYDRO_POWER_PLANT__GEN_SOURCE_PUMP_DISCHARGE_RESERVOIR,
                    oldGenSourcePumpDischargeReservoir, newGenSourcePumpDischargeReservoir,
                    !oldGenSourcePumpDischargeReservoirESet );
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
    public void setGenSourcePumpDischargeReservoir( Reservoir newGenSourcePumpDischargeReservoir ) {
        if( newGenSourcePumpDischargeReservoir != genSourcePumpDischargeReservoir ) {
            NotificationChain msgs = null;
            if( genSourcePumpDischargeReservoir != null )
                msgs = ( ( InternalEObject ) genSourcePumpDischargeReservoir ).eInverseRemove( this,
                        CimPackage.RESERVOIR__UPSTREAM_FROM_HYDRO_POWER_PLANTS, Reservoir.class, msgs );
            if( newGenSourcePumpDischargeReservoir != null )
                msgs = ( ( InternalEObject ) newGenSourcePumpDischargeReservoir ).eInverseAdd( this,
                        CimPackage.RESERVOIR__UPSTREAM_FROM_HYDRO_POWER_PLANTS, Reservoir.class, msgs );
            msgs = basicSetGenSourcePumpDischargeReservoir( newGenSourcePumpDischargeReservoir, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldGenSourcePumpDischargeReservoirESet = genSourcePumpDischargeReservoirESet;
            genSourcePumpDischargeReservoirESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.HYDRO_POWER_PLANT__GEN_SOURCE_PUMP_DISCHARGE_RESERVOIR,
                    newGenSourcePumpDischargeReservoir, newGenSourcePumpDischargeReservoir,
                    !oldGenSourcePumpDischargeReservoirESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetGenSourcePumpDischargeReservoir( NotificationChain msgs ) {
        Reservoir oldGenSourcePumpDischargeReservoir = genSourcePumpDischargeReservoir;
        genSourcePumpDischargeReservoir = null;
        boolean oldGenSourcePumpDischargeReservoirESet = genSourcePumpDischargeReservoirESet;
        genSourcePumpDischargeReservoirESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.HYDRO_POWER_PLANT__GEN_SOURCE_PUMP_DISCHARGE_RESERVOIR,
                    oldGenSourcePumpDischargeReservoir, null, oldGenSourcePumpDischargeReservoirESet );
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
    public void unsetGenSourcePumpDischargeReservoir() {
        if( genSourcePumpDischargeReservoir != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) genSourcePumpDischargeReservoir ).eInverseRemove( this,
                    CimPackage.RESERVOIR__UPSTREAM_FROM_HYDRO_POWER_PLANTS, Reservoir.class, msgs );
            msgs = basicUnsetGenSourcePumpDischargeReservoir( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldGenSourcePumpDischargeReservoirESet = genSourcePumpDischargeReservoirESet;
            genSourcePumpDischargeReservoirESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.HYDRO_POWER_PLANT__GEN_SOURCE_PUMP_DISCHARGE_RESERVOIR, null, null,
                    oldGenSourcePumpDischargeReservoirESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetGenSourcePumpDischargeReservoir() {
        return genSourcePumpDischargeReservoirESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< HydroPump > getHydroPumps() {
        if( hydroPumps == null ) {
            hydroPumps = new EObjectWithInverseResolvingEList.Unsettable< HydroPump >( HydroPump.class, this,
                    CimPackage.HYDRO_POWER_PLANT__HYDRO_PUMPS, CimPackage.HYDRO_PUMP__HYDRO_POWER_PLANT );
        }
        return hydroPumps;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetHydroPumps() {
        if( hydroPumps != null ) ( ( InternalEList.Unsettable< ? > ) hydroPumps ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetHydroPumps() {
        return hydroPumps != null && ( ( InternalEList.Unsettable< ? > ) hydroPumps ).isSet();
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
        case CimPackage.HYDRO_POWER_PLANT__HYDRO_GENERATING_UNITS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getHydroGeneratingUnits() )
                    .basicAdd( otherEnd, msgs );
        case CimPackage.HYDRO_POWER_PLANT__RESERVOIR:
            if( reservoir != null ) msgs = ( ( InternalEObject ) reservoir ).eInverseRemove( this,
                    CimPackage.RESERVOIR__HYDRO_POWER_PLANTS, Reservoir.class, msgs );
            return basicSetReservoir( ( Reservoir ) otherEnd, msgs );
        case CimPackage.HYDRO_POWER_PLANT__GEN_SOURCE_PUMP_DISCHARGE_RESERVOIR:
            if( genSourcePumpDischargeReservoir != null )
                msgs = ( ( InternalEObject ) genSourcePumpDischargeReservoir ).eInverseRemove( this,
                        CimPackage.RESERVOIR__UPSTREAM_FROM_HYDRO_POWER_PLANTS, Reservoir.class, msgs );
            return basicSetGenSourcePumpDischargeReservoir( ( Reservoir ) otherEnd, msgs );
        case CimPackage.HYDRO_POWER_PLANT__HYDRO_PUMPS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getHydroPumps() ).basicAdd( otherEnd,
                    msgs );
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
        case CimPackage.HYDRO_POWER_PLANT__HYDRO_GENERATING_UNITS:
            return ( ( InternalEList< ? > ) getHydroGeneratingUnits() ).basicRemove( otherEnd, msgs );
        case CimPackage.HYDRO_POWER_PLANT__RESERVOIR:
            return basicUnsetReservoir( msgs );
        case CimPackage.HYDRO_POWER_PLANT__GEN_SOURCE_PUMP_DISCHARGE_RESERVOIR:
            return basicUnsetGenSourcePumpDischargeReservoir( msgs );
        case CimPackage.HYDRO_POWER_PLANT__HYDRO_PUMPS:
            return ( ( InternalEList< ? > ) getHydroPumps() ).basicRemove( otherEnd, msgs );
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
        case CimPackage.HYDRO_POWER_PLANT__DISCHARGE_TRAVEL_DELAY:
            return getDischargeTravelDelay();
        case CimPackage.HYDRO_POWER_PLANT__GEN_RATED_P:
            return getGenRatedP();
        case CimPackage.HYDRO_POWER_PLANT__HYDRO_PLANT_STORAGE_TYPE:
            return getHydroPlantStorageType();
        case CimPackage.HYDRO_POWER_PLANT__PENSTOCK_TYPE:
            return getPenstockType();
        case CimPackage.HYDRO_POWER_PLANT__PLANT_DISCHARGE_CAPACITY:
            return getPlantDischargeCapacity();
        case CimPackage.HYDRO_POWER_PLANT__PLANT_RATED_HEAD:
            return getPlantRatedHead();
        case CimPackage.HYDRO_POWER_PLANT__PUMP_RATED_P:
            return getPumpRatedP();
        case CimPackage.HYDRO_POWER_PLANT__SURGE_TANK_CODE:
            return getSurgeTankCode();
        case CimPackage.HYDRO_POWER_PLANT__SURGE_TANK_CREST_LEVEL:
            return getSurgeTankCrestLevel();
        case CimPackage.HYDRO_POWER_PLANT__HYDRO_GENERATING_UNITS:
            return getHydroGeneratingUnits();
        case CimPackage.HYDRO_POWER_PLANT__RESERVOIR:
            return getReservoir();
        case CimPackage.HYDRO_POWER_PLANT__GEN_SOURCE_PUMP_DISCHARGE_RESERVOIR:
            return getGenSourcePumpDischargeReservoir();
        case CimPackage.HYDRO_POWER_PLANT__HYDRO_PUMPS:
            return getHydroPumps();
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
        case CimPackage.HYDRO_POWER_PLANT__DISCHARGE_TRAVEL_DELAY:
            setDischargeTravelDelay( ( Float ) newValue );
            return;
        case CimPackage.HYDRO_POWER_PLANT__GEN_RATED_P:
            setGenRatedP( ( Float ) newValue );
            return;
        case CimPackage.HYDRO_POWER_PLANT__HYDRO_PLANT_STORAGE_TYPE:
            setHydroPlantStorageType( ( HydroPlantStorageKind ) newValue );
            return;
        case CimPackage.HYDRO_POWER_PLANT__PENSTOCK_TYPE:
            setPenstockType( ( String ) newValue );
            return;
        case CimPackage.HYDRO_POWER_PLANT__PLANT_DISCHARGE_CAPACITY:
            setPlantDischargeCapacity( ( Float ) newValue );
            return;
        case CimPackage.HYDRO_POWER_PLANT__PLANT_RATED_HEAD:
            setPlantRatedHead( ( Float ) newValue );
            return;
        case CimPackage.HYDRO_POWER_PLANT__PUMP_RATED_P:
            setPumpRatedP( ( Float ) newValue );
            return;
        case CimPackage.HYDRO_POWER_PLANT__SURGE_TANK_CODE:
            setSurgeTankCode( ( String ) newValue );
            return;
        case CimPackage.HYDRO_POWER_PLANT__SURGE_TANK_CREST_LEVEL:
            setSurgeTankCrestLevel( ( Float ) newValue );
            return;
        case CimPackage.HYDRO_POWER_PLANT__HYDRO_GENERATING_UNITS:
            getHydroGeneratingUnits().clear();
            getHydroGeneratingUnits().addAll( ( Collection< ? extends HydroGeneratingUnit > ) newValue );
            return;
        case CimPackage.HYDRO_POWER_PLANT__RESERVOIR:
            setReservoir( ( Reservoir ) newValue );
            return;
        case CimPackage.HYDRO_POWER_PLANT__GEN_SOURCE_PUMP_DISCHARGE_RESERVOIR:
            setGenSourcePumpDischargeReservoir( ( Reservoir ) newValue );
            return;
        case CimPackage.HYDRO_POWER_PLANT__HYDRO_PUMPS:
            getHydroPumps().clear();
            getHydroPumps().addAll( ( Collection< ? extends HydroPump > ) newValue );
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
        case CimPackage.HYDRO_POWER_PLANT__DISCHARGE_TRAVEL_DELAY:
            unsetDischargeTravelDelay();
            return;
        case CimPackage.HYDRO_POWER_PLANT__GEN_RATED_P:
            unsetGenRatedP();
            return;
        case CimPackage.HYDRO_POWER_PLANT__HYDRO_PLANT_STORAGE_TYPE:
            unsetHydroPlantStorageType();
            return;
        case CimPackage.HYDRO_POWER_PLANT__PENSTOCK_TYPE:
            unsetPenstockType();
            return;
        case CimPackage.HYDRO_POWER_PLANT__PLANT_DISCHARGE_CAPACITY:
            unsetPlantDischargeCapacity();
            return;
        case CimPackage.HYDRO_POWER_PLANT__PLANT_RATED_HEAD:
            unsetPlantRatedHead();
            return;
        case CimPackage.HYDRO_POWER_PLANT__PUMP_RATED_P:
            unsetPumpRatedP();
            return;
        case CimPackage.HYDRO_POWER_PLANT__SURGE_TANK_CODE:
            unsetSurgeTankCode();
            return;
        case CimPackage.HYDRO_POWER_PLANT__SURGE_TANK_CREST_LEVEL:
            unsetSurgeTankCrestLevel();
            return;
        case CimPackage.HYDRO_POWER_PLANT__HYDRO_GENERATING_UNITS:
            unsetHydroGeneratingUnits();
            return;
        case CimPackage.HYDRO_POWER_PLANT__RESERVOIR:
            unsetReservoir();
            return;
        case CimPackage.HYDRO_POWER_PLANT__GEN_SOURCE_PUMP_DISCHARGE_RESERVOIR:
            unsetGenSourcePumpDischargeReservoir();
            return;
        case CimPackage.HYDRO_POWER_PLANT__HYDRO_PUMPS:
            unsetHydroPumps();
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
        case CimPackage.HYDRO_POWER_PLANT__DISCHARGE_TRAVEL_DELAY:
            return isSetDischargeTravelDelay();
        case CimPackage.HYDRO_POWER_PLANT__GEN_RATED_P:
            return isSetGenRatedP();
        case CimPackage.HYDRO_POWER_PLANT__HYDRO_PLANT_STORAGE_TYPE:
            return isSetHydroPlantStorageType();
        case CimPackage.HYDRO_POWER_PLANT__PENSTOCK_TYPE:
            return isSetPenstockType();
        case CimPackage.HYDRO_POWER_PLANT__PLANT_DISCHARGE_CAPACITY:
            return isSetPlantDischargeCapacity();
        case CimPackage.HYDRO_POWER_PLANT__PLANT_RATED_HEAD:
            return isSetPlantRatedHead();
        case CimPackage.HYDRO_POWER_PLANT__PUMP_RATED_P:
            return isSetPumpRatedP();
        case CimPackage.HYDRO_POWER_PLANT__SURGE_TANK_CODE:
            return isSetSurgeTankCode();
        case CimPackage.HYDRO_POWER_PLANT__SURGE_TANK_CREST_LEVEL:
            return isSetSurgeTankCrestLevel();
        case CimPackage.HYDRO_POWER_PLANT__HYDRO_GENERATING_UNITS:
            return isSetHydroGeneratingUnits();
        case CimPackage.HYDRO_POWER_PLANT__RESERVOIR:
            return isSetReservoir();
        case CimPackage.HYDRO_POWER_PLANT__GEN_SOURCE_PUMP_DISCHARGE_RESERVOIR:
            return isSetGenSourcePumpDischargeReservoir();
        case CimPackage.HYDRO_POWER_PLANT__HYDRO_PUMPS:
            return isSetHydroPumps();
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
        result.append( " (dischargeTravelDelay: " );
        if( dischargeTravelDelayESet )
            result.append( dischargeTravelDelay );
        else
            result.append( "<unset>" );
        result.append( ", genRatedP: " );
        if( genRatedPESet )
            result.append( genRatedP );
        else
            result.append( "<unset>" );
        result.append( ", hydroPlantStorageType: " );
        if( hydroPlantStorageTypeESet )
            result.append( hydroPlantStorageType );
        else
            result.append( "<unset>" );
        result.append( ", penstockType: " );
        if( penstockTypeESet )
            result.append( penstockType );
        else
            result.append( "<unset>" );
        result.append( ", plantDischargeCapacity: " );
        if( plantDischargeCapacityESet )
            result.append( plantDischargeCapacity );
        else
            result.append( "<unset>" );
        result.append( ", plantRatedHead: " );
        if( plantRatedHeadESet )
            result.append( plantRatedHead );
        else
            result.append( "<unset>" );
        result.append( ", pumpRatedP: " );
        if( pumpRatedPESet )
            result.append( pumpRatedP );
        else
            result.append( "<unset>" );
        result.append( ", surgeTankCode: " );
        if( surgeTankCodeESet )
            result.append( surgeTankCode );
        else
            result.append( "<unset>" );
        result.append( ", surgeTankCrestLevel: " );
        if( surgeTankCrestLevelESet )
            result.append( surgeTankCrestLevel );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //HydroPowerPlantImpl
