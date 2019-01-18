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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.FossilFuel;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.FuelAllocationSchedule;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.FuelType;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ThermalGeneratingUnit;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fuel Allocation Schedule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.FuelAllocationScheduleImpl#getFuelAllocationEndDate <em>Fuel Allocation End Date</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.FuelAllocationScheduleImpl#getFuelAllocationStartDate <em>Fuel Allocation Start Date</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.FuelAllocationScheduleImpl#getFuelType <em>Fuel Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.FuelAllocationScheduleImpl#getMaxFuelAllocation <em>Max Fuel Allocation</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.FuelAllocationScheduleImpl#getMinFuelAllocation <em>Min Fuel Allocation</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.FuelAllocationScheduleImpl#getThermalGeneratingUnit <em>Thermal Generating Unit</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.FuelAllocationScheduleImpl#getFossilFuel <em>Fossil Fuel</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FuelAllocationScheduleImpl extends CurveImpl implements FuelAllocationSchedule {
    /**
     * The default value of the '{@link #getFuelAllocationEndDate() <em>Fuel Allocation End Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFuelAllocationEndDate()
     * @generated
     * @ordered
     */
    protected static final Date FUEL_ALLOCATION_END_DATE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getFuelAllocationEndDate() <em>Fuel Allocation End Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFuelAllocationEndDate()
     * @generated
     * @ordered
     */
    protected Date fuelAllocationEndDate = FUEL_ALLOCATION_END_DATE_EDEFAULT;

    /**
     * This is true if the Fuel Allocation End Date attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean fuelAllocationEndDateESet;

    /**
     * The default value of the '{@link #getFuelAllocationStartDate() <em>Fuel Allocation Start Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFuelAllocationStartDate()
     * @generated
     * @ordered
     */
    protected static final Date FUEL_ALLOCATION_START_DATE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getFuelAllocationStartDate() <em>Fuel Allocation Start Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFuelAllocationStartDate()
     * @generated
     * @ordered
     */
    protected Date fuelAllocationStartDate = FUEL_ALLOCATION_START_DATE_EDEFAULT;

    /**
     * This is true if the Fuel Allocation Start Date attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean fuelAllocationStartDateESet;

    /**
     * The default value of the '{@link #getFuelType() <em>Fuel Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFuelType()
     * @generated
     * @ordered
     */
    protected static final FuelType FUEL_TYPE_EDEFAULT = FuelType.COAL;

    /**
     * The cached value of the '{@link #getFuelType() <em>Fuel Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFuelType()
     * @generated
     * @ordered
     */
    protected FuelType fuelType = FUEL_TYPE_EDEFAULT;

    /**
     * This is true if the Fuel Type attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean fuelTypeESet;

    /**
     * The default value of the '{@link #getMaxFuelAllocation() <em>Max Fuel Allocation</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMaxFuelAllocation()
     * @generated
     * @ordered
     */
    protected static final Float MAX_FUEL_ALLOCATION_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getMaxFuelAllocation() <em>Max Fuel Allocation</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMaxFuelAllocation()
     * @generated
     * @ordered
     */
    protected Float maxFuelAllocation = MAX_FUEL_ALLOCATION_EDEFAULT;

    /**
     * This is true if the Max Fuel Allocation attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean maxFuelAllocationESet;

    /**
     * The default value of the '{@link #getMinFuelAllocation() <em>Min Fuel Allocation</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMinFuelAllocation()
     * @generated
     * @ordered
     */
    protected static final Float MIN_FUEL_ALLOCATION_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getMinFuelAllocation() <em>Min Fuel Allocation</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMinFuelAllocation()
     * @generated
     * @ordered
     */
    protected Float minFuelAllocation = MIN_FUEL_ALLOCATION_EDEFAULT;

    /**
     * This is true if the Min Fuel Allocation attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean minFuelAllocationESet;

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
     * The cached value of the '{@link #getFossilFuel() <em>Fossil Fuel</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFossilFuel()
     * @generated
     * @ordered
     */
    protected FossilFuel fossilFuel;

    /**
     * This is true if the Fossil Fuel reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean fossilFuelESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected FuelAllocationScheduleImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getFuelAllocationSchedule();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Date getFuelAllocationEndDate() {
        return fuelAllocationEndDate;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setFuelAllocationEndDate( Date newFuelAllocationEndDate ) {
        Date oldFuelAllocationEndDate = fuelAllocationEndDate;
        fuelAllocationEndDate = newFuelAllocationEndDate;
        boolean oldFuelAllocationEndDateESet = fuelAllocationEndDateESet;
        fuelAllocationEndDateESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.FUEL_ALLOCATION_SCHEDULE__FUEL_ALLOCATION_END_DATE, oldFuelAllocationEndDate,
                fuelAllocationEndDate, !oldFuelAllocationEndDateESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetFuelAllocationEndDate() {
        Date oldFuelAllocationEndDate = fuelAllocationEndDate;
        boolean oldFuelAllocationEndDateESet = fuelAllocationEndDateESet;
        fuelAllocationEndDate = FUEL_ALLOCATION_END_DATE_EDEFAULT;
        fuelAllocationEndDateESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.FUEL_ALLOCATION_SCHEDULE__FUEL_ALLOCATION_END_DATE, oldFuelAllocationEndDate,
                FUEL_ALLOCATION_END_DATE_EDEFAULT, oldFuelAllocationEndDateESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetFuelAllocationEndDate() {
        return fuelAllocationEndDateESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Date getFuelAllocationStartDate() {
        return fuelAllocationStartDate;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setFuelAllocationStartDate( Date newFuelAllocationStartDate ) {
        Date oldFuelAllocationStartDate = fuelAllocationStartDate;
        fuelAllocationStartDate = newFuelAllocationStartDate;
        boolean oldFuelAllocationStartDateESet = fuelAllocationStartDateESet;
        fuelAllocationStartDateESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.FUEL_ALLOCATION_SCHEDULE__FUEL_ALLOCATION_START_DATE, oldFuelAllocationStartDate,
                fuelAllocationStartDate, !oldFuelAllocationStartDateESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetFuelAllocationStartDate() {
        Date oldFuelAllocationStartDate = fuelAllocationStartDate;
        boolean oldFuelAllocationStartDateESet = fuelAllocationStartDateESet;
        fuelAllocationStartDate = FUEL_ALLOCATION_START_DATE_EDEFAULT;
        fuelAllocationStartDateESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.FUEL_ALLOCATION_SCHEDULE__FUEL_ALLOCATION_START_DATE, oldFuelAllocationStartDate,
                FUEL_ALLOCATION_START_DATE_EDEFAULT, oldFuelAllocationStartDateESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetFuelAllocationStartDate() {
        return fuelAllocationStartDateESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public FuelType getFuelType() {
        return fuelType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setFuelType( FuelType newFuelType ) {
        FuelType oldFuelType = fuelType;
        fuelType = newFuelType == null ? FUEL_TYPE_EDEFAULT : newFuelType;
        boolean oldFuelTypeESet = fuelTypeESet;
        fuelTypeESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.FUEL_ALLOCATION_SCHEDULE__FUEL_TYPE, oldFuelType, fuelType, !oldFuelTypeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetFuelType() {
        FuelType oldFuelType = fuelType;
        boolean oldFuelTypeESet = fuelTypeESet;
        fuelType = FUEL_TYPE_EDEFAULT;
        fuelTypeESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.FUEL_ALLOCATION_SCHEDULE__FUEL_TYPE, oldFuelType, FUEL_TYPE_EDEFAULT, oldFuelTypeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetFuelType() {
        return fuelTypeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getMaxFuelAllocation() {
        return maxFuelAllocation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setMaxFuelAllocation( Float newMaxFuelAllocation ) {
        Float oldMaxFuelAllocation = maxFuelAllocation;
        maxFuelAllocation = newMaxFuelAllocation;
        boolean oldMaxFuelAllocationESet = maxFuelAllocationESet;
        maxFuelAllocationESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.FUEL_ALLOCATION_SCHEDULE__MAX_FUEL_ALLOCATION,
                        oldMaxFuelAllocation, maxFuelAllocation, !oldMaxFuelAllocationESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetMaxFuelAllocation() {
        Float oldMaxFuelAllocation = maxFuelAllocation;
        boolean oldMaxFuelAllocationESet = maxFuelAllocationESet;
        maxFuelAllocation = MAX_FUEL_ALLOCATION_EDEFAULT;
        maxFuelAllocationESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.FUEL_ALLOCATION_SCHEDULE__MAX_FUEL_ALLOCATION, oldMaxFuelAllocation,
                MAX_FUEL_ALLOCATION_EDEFAULT, oldMaxFuelAllocationESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetMaxFuelAllocation() {
        return maxFuelAllocationESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getMinFuelAllocation() {
        return minFuelAllocation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setMinFuelAllocation( Float newMinFuelAllocation ) {
        Float oldMinFuelAllocation = minFuelAllocation;
        minFuelAllocation = newMinFuelAllocation;
        boolean oldMinFuelAllocationESet = minFuelAllocationESet;
        minFuelAllocationESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.FUEL_ALLOCATION_SCHEDULE__MIN_FUEL_ALLOCATION,
                        oldMinFuelAllocation, minFuelAllocation, !oldMinFuelAllocationESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetMinFuelAllocation() {
        Float oldMinFuelAllocation = minFuelAllocation;
        boolean oldMinFuelAllocationESet = minFuelAllocationESet;
        minFuelAllocation = MIN_FUEL_ALLOCATION_EDEFAULT;
        minFuelAllocationESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.FUEL_ALLOCATION_SCHEDULE__MIN_FUEL_ALLOCATION, oldMinFuelAllocation,
                MIN_FUEL_ALLOCATION_EDEFAULT, oldMinFuelAllocationESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetMinFuelAllocation() {
        return minFuelAllocationESet;
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
                    CimPackage.FUEL_ALLOCATION_SCHEDULE__THERMAL_GENERATING_UNIT, oldThermalGeneratingUnit,
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
                        CimPackage.THERMAL_GENERATING_UNIT__FUEL_ALLOCATION_SCHEDULES, ThermalGeneratingUnit.class,
                        msgs );
            if( newThermalGeneratingUnit != null )
                msgs = ( ( InternalEObject ) newThermalGeneratingUnit ).eInverseAdd( this,
                        CimPackage.THERMAL_GENERATING_UNIT__FUEL_ALLOCATION_SCHEDULES, ThermalGeneratingUnit.class,
                        msgs );
            msgs = basicSetThermalGeneratingUnit( newThermalGeneratingUnit, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldThermalGeneratingUnitESet = thermalGeneratingUnitESet;
            thermalGeneratingUnitESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.FUEL_ALLOCATION_SCHEDULE__THERMAL_GENERATING_UNIT, newThermalGeneratingUnit,
                    newThermalGeneratingUnit, !oldThermalGeneratingUnitESet ) );
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
                    CimPackage.FUEL_ALLOCATION_SCHEDULE__THERMAL_GENERATING_UNIT, oldThermalGeneratingUnit, null,
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
                    CimPackage.THERMAL_GENERATING_UNIT__FUEL_ALLOCATION_SCHEDULES, ThermalGeneratingUnit.class, msgs );
            msgs = basicUnsetThermalGeneratingUnit( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldThermalGeneratingUnitESet = thermalGeneratingUnitESet;
            thermalGeneratingUnitESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.FUEL_ALLOCATION_SCHEDULE__THERMAL_GENERATING_UNIT, null, null,
                    oldThermalGeneratingUnitESet ) );
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
    public FossilFuel getFossilFuel() {
        return fossilFuel;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetFossilFuel( FossilFuel newFossilFuel, NotificationChain msgs ) {
        FossilFuel oldFossilFuel = fossilFuel;
        fossilFuel = newFossilFuel;
        boolean oldFossilFuelESet = fossilFuelESet;
        fossilFuelESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.FUEL_ALLOCATION_SCHEDULE__FOSSIL_FUEL, oldFossilFuel, newFossilFuel,
                    !oldFossilFuelESet );
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
    public void setFossilFuel( FossilFuel newFossilFuel ) {
        if( newFossilFuel != fossilFuel ) {
            NotificationChain msgs = null;
            if( fossilFuel != null ) msgs = ( ( InternalEObject ) fossilFuel ).eInverseRemove( this,
                    CimPackage.FOSSIL_FUEL__FUEL_ALLOCATION_SCHEDULES, FossilFuel.class, msgs );
            if( newFossilFuel != null ) msgs = ( ( InternalEObject ) newFossilFuel ).eInverseAdd( this,
                    CimPackage.FOSSIL_FUEL__FUEL_ALLOCATION_SCHEDULES, FossilFuel.class, msgs );
            msgs = basicSetFossilFuel( newFossilFuel, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldFossilFuelESet = fossilFuelESet;
            fossilFuelESet = true;
            if( eNotificationRequired() ) eNotify(
                    new ENotificationImpl( this, Notification.SET, CimPackage.FUEL_ALLOCATION_SCHEDULE__FOSSIL_FUEL,
                            newFossilFuel, newFossilFuel, !oldFossilFuelESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetFossilFuel( NotificationChain msgs ) {
        FossilFuel oldFossilFuel = fossilFuel;
        fossilFuel = null;
        boolean oldFossilFuelESet = fossilFuelESet;
        fossilFuelESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.FUEL_ALLOCATION_SCHEDULE__FOSSIL_FUEL, oldFossilFuel, null, oldFossilFuelESet );
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
    public void unsetFossilFuel() {
        if( fossilFuel != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) fossilFuel ).eInverseRemove( this,
                    CimPackage.FOSSIL_FUEL__FUEL_ALLOCATION_SCHEDULES, FossilFuel.class, msgs );
            msgs = basicUnsetFossilFuel( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldFossilFuelESet = fossilFuelESet;
            fossilFuelESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.FUEL_ALLOCATION_SCHEDULE__FOSSIL_FUEL, null, null, oldFossilFuelESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetFossilFuel() {
        return fossilFuelESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.FUEL_ALLOCATION_SCHEDULE__THERMAL_GENERATING_UNIT:
            if( thermalGeneratingUnit != null )
                msgs = ( ( InternalEObject ) thermalGeneratingUnit ).eInverseRemove( this,
                        CimPackage.THERMAL_GENERATING_UNIT__FUEL_ALLOCATION_SCHEDULES, ThermalGeneratingUnit.class,
                        msgs );
            return basicSetThermalGeneratingUnit( ( ThermalGeneratingUnit ) otherEnd, msgs );
        case CimPackage.FUEL_ALLOCATION_SCHEDULE__FOSSIL_FUEL:
            if( fossilFuel != null ) msgs = ( ( InternalEObject ) fossilFuel ).eInverseRemove( this,
                    CimPackage.FOSSIL_FUEL__FUEL_ALLOCATION_SCHEDULES, FossilFuel.class, msgs );
            return basicSetFossilFuel( ( FossilFuel ) otherEnd, msgs );
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
        case CimPackage.FUEL_ALLOCATION_SCHEDULE__THERMAL_GENERATING_UNIT:
            return basicUnsetThermalGeneratingUnit( msgs );
        case CimPackage.FUEL_ALLOCATION_SCHEDULE__FOSSIL_FUEL:
            return basicUnsetFossilFuel( msgs );
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
        case CimPackage.FUEL_ALLOCATION_SCHEDULE__FUEL_ALLOCATION_END_DATE:
            return getFuelAllocationEndDate();
        case CimPackage.FUEL_ALLOCATION_SCHEDULE__FUEL_ALLOCATION_START_DATE:
            return getFuelAllocationStartDate();
        case CimPackage.FUEL_ALLOCATION_SCHEDULE__FUEL_TYPE:
            return getFuelType();
        case CimPackage.FUEL_ALLOCATION_SCHEDULE__MAX_FUEL_ALLOCATION:
            return getMaxFuelAllocation();
        case CimPackage.FUEL_ALLOCATION_SCHEDULE__MIN_FUEL_ALLOCATION:
            return getMinFuelAllocation();
        case CimPackage.FUEL_ALLOCATION_SCHEDULE__THERMAL_GENERATING_UNIT:
            return getThermalGeneratingUnit();
        case CimPackage.FUEL_ALLOCATION_SCHEDULE__FOSSIL_FUEL:
            return getFossilFuel();
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
        case CimPackage.FUEL_ALLOCATION_SCHEDULE__FUEL_ALLOCATION_END_DATE:
            setFuelAllocationEndDate( ( Date ) newValue );
            return;
        case CimPackage.FUEL_ALLOCATION_SCHEDULE__FUEL_ALLOCATION_START_DATE:
            setFuelAllocationStartDate( ( Date ) newValue );
            return;
        case CimPackage.FUEL_ALLOCATION_SCHEDULE__FUEL_TYPE:
            setFuelType( ( FuelType ) newValue );
            return;
        case CimPackage.FUEL_ALLOCATION_SCHEDULE__MAX_FUEL_ALLOCATION:
            setMaxFuelAllocation( ( Float ) newValue );
            return;
        case CimPackage.FUEL_ALLOCATION_SCHEDULE__MIN_FUEL_ALLOCATION:
            setMinFuelAllocation( ( Float ) newValue );
            return;
        case CimPackage.FUEL_ALLOCATION_SCHEDULE__THERMAL_GENERATING_UNIT:
            setThermalGeneratingUnit( ( ThermalGeneratingUnit ) newValue );
            return;
        case CimPackage.FUEL_ALLOCATION_SCHEDULE__FOSSIL_FUEL:
            setFossilFuel( ( FossilFuel ) newValue );
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
        case CimPackage.FUEL_ALLOCATION_SCHEDULE__FUEL_ALLOCATION_END_DATE:
            unsetFuelAllocationEndDate();
            return;
        case CimPackage.FUEL_ALLOCATION_SCHEDULE__FUEL_ALLOCATION_START_DATE:
            unsetFuelAllocationStartDate();
            return;
        case CimPackage.FUEL_ALLOCATION_SCHEDULE__FUEL_TYPE:
            unsetFuelType();
            return;
        case CimPackage.FUEL_ALLOCATION_SCHEDULE__MAX_FUEL_ALLOCATION:
            unsetMaxFuelAllocation();
            return;
        case CimPackage.FUEL_ALLOCATION_SCHEDULE__MIN_FUEL_ALLOCATION:
            unsetMinFuelAllocation();
            return;
        case CimPackage.FUEL_ALLOCATION_SCHEDULE__THERMAL_GENERATING_UNIT:
            unsetThermalGeneratingUnit();
            return;
        case CimPackage.FUEL_ALLOCATION_SCHEDULE__FOSSIL_FUEL:
            unsetFossilFuel();
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
        case CimPackage.FUEL_ALLOCATION_SCHEDULE__FUEL_ALLOCATION_END_DATE:
            return isSetFuelAllocationEndDate();
        case CimPackage.FUEL_ALLOCATION_SCHEDULE__FUEL_ALLOCATION_START_DATE:
            return isSetFuelAllocationStartDate();
        case CimPackage.FUEL_ALLOCATION_SCHEDULE__FUEL_TYPE:
            return isSetFuelType();
        case CimPackage.FUEL_ALLOCATION_SCHEDULE__MAX_FUEL_ALLOCATION:
            return isSetMaxFuelAllocation();
        case CimPackage.FUEL_ALLOCATION_SCHEDULE__MIN_FUEL_ALLOCATION:
            return isSetMinFuelAllocation();
        case CimPackage.FUEL_ALLOCATION_SCHEDULE__THERMAL_GENERATING_UNIT:
            return isSetThermalGeneratingUnit();
        case CimPackage.FUEL_ALLOCATION_SCHEDULE__FOSSIL_FUEL:
            return isSetFossilFuel();
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
        result.append( " (fuelAllocationEndDate: " );
        if( fuelAllocationEndDateESet )
            result.append( fuelAllocationEndDate );
        else
            result.append( "<unset>" );
        result.append( ", fuelAllocationStartDate: " );
        if( fuelAllocationStartDateESet )
            result.append( fuelAllocationStartDate );
        else
            result.append( "<unset>" );
        result.append( ", fuelType: " );
        if( fuelTypeESet )
            result.append( fuelType );
        else
            result.append( "<unset>" );
        result.append( ", maxFuelAllocation: " );
        if( maxFuelAllocationESet )
            result.append( maxFuelAllocation );
        else
            result.append( "<unset>" );
        result.append( ", minFuelAllocation: " );
        if( minFuelAllocationESet )
            result.append( minFuelAllocation );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //FuelAllocationScheduleImpl
