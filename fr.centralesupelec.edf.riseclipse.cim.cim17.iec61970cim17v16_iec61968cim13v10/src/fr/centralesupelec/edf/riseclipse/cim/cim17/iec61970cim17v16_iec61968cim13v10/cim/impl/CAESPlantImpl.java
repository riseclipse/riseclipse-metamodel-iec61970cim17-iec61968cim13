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

import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AirCompressor;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CAESPlant;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ThermalGeneratingUnit;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CAES Plant</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.CAESPlantImpl#getEnergyStorageCapacity <em>Energy Storage Capacity</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.CAESPlantImpl#getRatedCapacityP <em>Rated Capacity P</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.CAESPlantImpl#getAirCompressor <em>Air Compressor</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.CAESPlantImpl#getThermalGeneratingUnit <em>Thermal Generating Unit</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CAESPlantImpl extends PowerSystemResourceImpl implements CAESPlant {
    /**
     * The default value of the '{@link #getEnergyStorageCapacity() <em>Energy Storage Capacity</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEnergyStorageCapacity()
     * @generated
     * @ordered
     */
    protected static final Float ENERGY_STORAGE_CAPACITY_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getEnergyStorageCapacity() <em>Energy Storage Capacity</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEnergyStorageCapacity()
     * @generated
     * @ordered
     */
    protected Float energyStorageCapacity = ENERGY_STORAGE_CAPACITY_EDEFAULT;

    /**
     * This is true if the Energy Storage Capacity attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean energyStorageCapacityESet;

    /**
     * The default value of the '{@link #getRatedCapacityP() <em>Rated Capacity P</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRatedCapacityP()
     * @generated
     * @ordered
     */
    protected static final Float RATED_CAPACITY_P_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getRatedCapacityP() <em>Rated Capacity P</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRatedCapacityP()
     * @generated
     * @ordered
     */
    protected Float ratedCapacityP = RATED_CAPACITY_P_EDEFAULT;

    /**
     * This is true if the Rated Capacity P attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean ratedCapacityPESet;

    /**
     * The cached value of the '{@link #getAirCompressor() <em>Air Compressor</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAirCompressor()
     * @generated
     * @ordered
     */
    protected AirCompressor airCompressor;

    /**
     * This is true if the Air Compressor reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean airCompressorESet;

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
    protected CAESPlantImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getCAESPlant();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getEnergyStorageCapacity() {
        return energyStorageCapacity;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setEnergyStorageCapacity( Float newEnergyStorageCapacity ) {
        Float oldEnergyStorageCapacity = energyStorageCapacity;
        energyStorageCapacity = newEnergyStorageCapacity;
        boolean oldEnergyStorageCapacityESet = energyStorageCapacityESet;
        energyStorageCapacityESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.CAES_PLANT__ENERGY_STORAGE_CAPACITY,
                    oldEnergyStorageCapacity, energyStorageCapacity, !oldEnergyStorageCapacityESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetEnergyStorageCapacity() {
        Float oldEnergyStorageCapacity = energyStorageCapacity;
        boolean oldEnergyStorageCapacityESet = energyStorageCapacityESet;
        energyStorageCapacity = ENERGY_STORAGE_CAPACITY_EDEFAULT;
        energyStorageCapacityESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.CAES_PLANT__ENERGY_STORAGE_CAPACITY,
                    oldEnergyStorageCapacity, ENERGY_STORAGE_CAPACITY_EDEFAULT, oldEnergyStorageCapacityESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetEnergyStorageCapacity() {
        return energyStorageCapacityESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getRatedCapacityP() {
        return ratedCapacityP;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setRatedCapacityP( Float newRatedCapacityP ) {
        Float oldRatedCapacityP = ratedCapacityP;
        ratedCapacityP = newRatedCapacityP;
        boolean oldRatedCapacityPESet = ratedCapacityPESet;
        ratedCapacityPESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.CAES_PLANT__RATED_CAPACITY_P, oldRatedCapacityP, ratedCapacityP, !oldRatedCapacityPESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetRatedCapacityP() {
        Float oldRatedCapacityP = ratedCapacityP;
        boolean oldRatedCapacityPESet = ratedCapacityPESet;
        ratedCapacityP = RATED_CAPACITY_P_EDEFAULT;
        ratedCapacityPESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.CAES_PLANT__RATED_CAPACITY_P,
                    oldRatedCapacityP, RATED_CAPACITY_P_EDEFAULT, oldRatedCapacityPESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRatedCapacityP() {
        return ratedCapacityPESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public AirCompressor getAirCompressor() {
        if( airCompressor != null && airCompressor.eIsProxy() ) {
            InternalEObject oldAirCompressor = ( InternalEObject ) airCompressor;
            airCompressor = ( AirCompressor ) eResolveProxy( oldAirCompressor );
            if( airCompressor != oldAirCompressor ) {
                if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.RESOLVE,
                        CimPackage.CAES_PLANT__AIR_COMPRESSOR, oldAirCompressor, airCompressor ) );
            }
        }
        return airCompressor;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AirCompressor basicGetAirCompressor() {
        return airCompressor;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetAirCompressor( AirCompressor newAirCompressor, NotificationChain msgs ) {
        AirCompressor oldAirCompressor = airCompressor;
        airCompressor = newAirCompressor;
        boolean oldAirCompressorESet = airCompressorESet;
        airCompressorESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.CAES_PLANT__AIR_COMPRESSOR, oldAirCompressor, newAirCompressor, !oldAirCompressorESet );
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
    public void setAirCompressor( AirCompressor newAirCompressor ) {
        if( newAirCompressor != airCompressor ) {
            NotificationChain msgs = null;
            if( airCompressor != null ) msgs = ( ( InternalEObject ) airCompressor ).eInverseRemove( this,
                    CimPackage.AIR_COMPRESSOR__CAES_PLANT, AirCompressor.class, msgs );
            if( newAirCompressor != null ) msgs = ( ( InternalEObject ) newAirCompressor ).eInverseAdd( this,
                    CimPackage.AIR_COMPRESSOR__CAES_PLANT, AirCompressor.class, msgs );
            msgs = basicSetAirCompressor( newAirCompressor, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldAirCompressorESet = airCompressorESet;
            airCompressorESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.CAES_PLANT__AIR_COMPRESSOR,
                        newAirCompressor, newAirCompressor, !oldAirCompressorESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetAirCompressor( NotificationChain msgs ) {
        AirCompressor oldAirCompressor = airCompressor;
        airCompressor = null;
        boolean oldAirCompressorESet = airCompressorESet;
        airCompressorESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.CAES_PLANT__AIR_COMPRESSOR, oldAirCompressor, null, oldAirCompressorESet );
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
    public void unsetAirCompressor() {
        if( airCompressor != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) airCompressor ).eInverseRemove( this, CimPackage.AIR_COMPRESSOR__CAES_PLANT,
                    AirCompressor.class, msgs );
            msgs = basicUnsetAirCompressor( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldAirCompressorESet = airCompressorESet;
            airCompressorESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.CAES_PLANT__AIR_COMPRESSOR, null, null, oldAirCompressorESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetAirCompressor() {
        return airCompressorESet;
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
                    CimPackage.CAES_PLANT__THERMAL_GENERATING_UNIT, oldThermalGeneratingUnit, newThermalGeneratingUnit,
                    !oldThermalGeneratingUnitESet );
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
                        CimPackage.THERMAL_GENERATING_UNIT__CAES_PLANT, ThermalGeneratingUnit.class, msgs );
            if( newThermalGeneratingUnit != null )
                msgs = ( ( InternalEObject ) newThermalGeneratingUnit ).eInverseAdd( this,
                        CimPackage.THERMAL_GENERATING_UNIT__CAES_PLANT, ThermalGeneratingUnit.class, msgs );
            msgs = basicSetThermalGeneratingUnit( newThermalGeneratingUnit, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldThermalGeneratingUnitESet = thermalGeneratingUnitESet;
            thermalGeneratingUnitESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.CAES_PLANT__THERMAL_GENERATING_UNIT,
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
                    CimPackage.CAES_PLANT__THERMAL_GENERATING_UNIT, oldThermalGeneratingUnit, null,
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
                    CimPackage.THERMAL_GENERATING_UNIT__CAES_PLANT, ThermalGeneratingUnit.class, msgs );
            msgs = basicUnsetThermalGeneratingUnit( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldThermalGeneratingUnitESet = thermalGeneratingUnitESet;
            thermalGeneratingUnitESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.CAES_PLANT__THERMAL_GENERATING_UNIT, null, null, oldThermalGeneratingUnitESet ) );
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
        case CimPackage.CAES_PLANT__AIR_COMPRESSOR:
            if( airCompressor != null ) msgs = ( ( InternalEObject ) airCompressor ).eInverseRemove( this,
                    CimPackage.AIR_COMPRESSOR__CAES_PLANT, AirCompressor.class, msgs );
            return basicSetAirCompressor( ( AirCompressor ) otherEnd, msgs );
        case CimPackage.CAES_PLANT__THERMAL_GENERATING_UNIT:
            if( thermalGeneratingUnit != null )
                msgs = ( ( InternalEObject ) thermalGeneratingUnit ).eInverseRemove( this,
                        CimPackage.THERMAL_GENERATING_UNIT__CAES_PLANT, ThermalGeneratingUnit.class, msgs );
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
        case CimPackage.CAES_PLANT__AIR_COMPRESSOR:
            return basicUnsetAirCompressor( msgs );
        case CimPackage.CAES_PLANT__THERMAL_GENERATING_UNIT:
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
        case CimPackage.CAES_PLANT__ENERGY_STORAGE_CAPACITY:
            return getEnergyStorageCapacity();
        case CimPackage.CAES_PLANT__RATED_CAPACITY_P:
            return getRatedCapacityP();
        case CimPackage.CAES_PLANT__AIR_COMPRESSOR:
            if( resolve ) return getAirCompressor();
            return basicGetAirCompressor();
        case CimPackage.CAES_PLANT__THERMAL_GENERATING_UNIT:
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
        case CimPackage.CAES_PLANT__ENERGY_STORAGE_CAPACITY:
            setEnergyStorageCapacity( ( Float ) newValue );
            return;
        case CimPackage.CAES_PLANT__RATED_CAPACITY_P:
            setRatedCapacityP( ( Float ) newValue );
            return;
        case CimPackage.CAES_PLANT__AIR_COMPRESSOR:
            setAirCompressor( ( AirCompressor ) newValue );
            return;
        case CimPackage.CAES_PLANT__THERMAL_GENERATING_UNIT:
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
        case CimPackage.CAES_PLANT__ENERGY_STORAGE_CAPACITY:
            unsetEnergyStorageCapacity();
            return;
        case CimPackage.CAES_PLANT__RATED_CAPACITY_P:
            unsetRatedCapacityP();
            return;
        case CimPackage.CAES_PLANT__AIR_COMPRESSOR:
            unsetAirCompressor();
            return;
        case CimPackage.CAES_PLANT__THERMAL_GENERATING_UNIT:
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
        case CimPackage.CAES_PLANT__ENERGY_STORAGE_CAPACITY:
            return isSetEnergyStorageCapacity();
        case CimPackage.CAES_PLANT__RATED_CAPACITY_P:
            return isSetRatedCapacityP();
        case CimPackage.CAES_PLANT__AIR_COMPRESSOR:
            return isSetAirCompressor();
        case CimPackage.CAES_PLANT__THERMAL_GENERATING_UNIT:
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

        StringBuffer result = new StringBuffer( super.toString() );
        result.append( " (energyStorageCapacity: " );
        if( energyStorageCapacityESet )
            result.append( energyStorageCapacity );
        else
            result.append( "<unset>" );
        result.append( ", ratedCapacityP: " );
        if( ratedCapacityPESet )
            result.append( ratedCapacityP );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //CAESPlantImpl
