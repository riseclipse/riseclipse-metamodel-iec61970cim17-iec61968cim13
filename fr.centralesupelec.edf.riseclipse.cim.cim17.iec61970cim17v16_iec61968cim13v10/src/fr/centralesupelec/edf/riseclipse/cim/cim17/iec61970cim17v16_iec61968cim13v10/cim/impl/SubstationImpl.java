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
package fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl;

import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Bay;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DCConverterUnit;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SubGeographicalRegion;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Substation;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.VoltageLevel;

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
 * An implementation of the model object '<em><b>Substation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.SubstationImpl#getRegion <em>Region</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.SubstationImpl#getDCConverterUnit <em>DC Converter Unit</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.SubstationImpl#getVoltageLevels <em>Voltage Levels</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.SubstationImpl#getBays <em>Bays</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubstationImpl extends EquipmentContainerImpl implements Substation {
    /**
     * The cached value of the '{@link #getRegion() <em>Region</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRegion()
     * @generated
     * @ordered
     */
    protected SubGeographicalRegion region;

    /**
     * This is true if the Region reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean regionESet;

    /**
     * The cached value of the '{@link #getDCConverterUnit() <em>DC Converter Unit</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDCConverterUnit()
     * @generated
     * @ordered
     */
    protected EList< DCConverterUnit > dcConverterUnit;

    /**
     * The cached value of the '{@link #getVoltageLevels() <em>Voltage Levels</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVoltageLevels()
     * @generated
     * @ordered
     */
    protected EList< VoltageLevel > voltageLevels;

    /**
     * The cached value of the '{@link #getBays() <em>Bays</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBays()
     * @generated
     * @ordered
     */
    protected EList< Bay > bays;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SubstationImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getSubstation();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public SubGeographicalRegion getRegion() {
        return region;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetRegion( SubGeographicalRegion newRegion, NotificationChain msgs ) {
        SubGeographicalRegion oldRegion = region;
        region = newRegion;
        boolean oldRegionESet = regionESet;
        regionESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.SUBSTATION__REGION, oldRegion, newRegion, !oldRegionESet );
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
    public void setRegion( SubGeographicalRegion newRegion ) {
        if( newRegion != region ) {
            NotificationChain msgs = null;
            if( region != null ) msgs = ( ( InternalEObject ) region ).eInverseRemove( this,
                    CimPackage.SUB_GEOGRAPHICAL_REGION__SUBSTATIONS, SubGeographicalRegion.class, msgs );
            if( newRegion != null ) msgs = ( ( InternalEObject ) newRegion ).eInverseAdd( this,
                    CimPackage.SUB_GEOGRAPHICAL_REGION__SUBSTATIONS, SubGeographicalRegion.class, msgs );
            msgs = basicSetRegion( newRegion, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldRegionESet = regionESet;
            regionESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.SUBSTATION__REGION, newRegion, newRegion, !oldRegionESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetRegion( NotificationChain msgs ) {
        SubGeographicalRegion oldRegion = region;
        region = null;
        boolean oldRegionESet = regionESet;
        regionESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.SUBSTATION__REGION, oldRegion, null, oldRegionESet );
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
    public void unsetRegion() {
        if( region != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) region ).eInverseRemove( this, CimPackage.SUB_GEOGRAPHICAL_REGION__SUBSTATIONS,
                    SubGeographicalRegion.class, msgs );
            msgs = basicUnsetRegion( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldRegionESet = regionESet;
            regionESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.SUBSTATION__REGION, null, null, oldRegionESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRegion() {
        return regionESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< DCConverterUnit > getDCConverterUnit() {
        if( dcConverterUnit == null ) {
            dcConverterUnit = new EObjectWithInverseResolvingEList.Unsettable< DCConverterUnit >( DCConverterUnit.class,
                    this, CimPackage.SUBSTATION__DC_CONVERTER_UNIT, CimPackage.DC_CONVERTER_UNIT__SUBSTATION );
        }
        return dcConverterUnit;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetDCConverterUnit() {
        if( dcConverterUnit != null ) ( ( InternalEList.Unsettable< ? > ) dcConverterUnit ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetDCConverterUnit() {
        return dcConverterUnit != null && ( ( InternalEList.Unsettable< ? > ) dcConverterUnit ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< VoltageLevel > getVoltageLevels() {
        if( voltageLevels == null ) {
            voltageLevels = new EObjectWithInverseResolvingEList.Unsettable< VoltageLevel >( VoltageLevel.class, this,
                    CimPackage.SUBSTATION__VOLTAGE_LEVELS, CimPackage.VOLTAGE_LEVEL__SUBSTATION );
        }
        return voltageLevels;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetVoltageLevels() {
        if( voltageLevels != null ) ( ( InternalEList.Unsettable< ? > ) voltageLevels ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetVoltageLevels() {
        return voltageLevels != null && ( ( InternalEList.Unsettable< ? > ) voltageLevels ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< Bay > getBays() {
        if( bays == null ) {
            bays = new EObjectWithInverseResolvingEList.Unsettable< Bay >( Bay.class, this, CimPackage.SUBSTATION__BAYS,
                    CimPackage.BAY__SUBSTATION );
        }
        return bays;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetBays() {
        if( bays != null ) ( ( InternalEList.Unsettable< ? > ) bays ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetBays() {
        return bays != null && ( ( InternalEList.Unsettable< ? > ) bays ).isSet();
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
        case CimPackage.SUBSTATION__REGION:
            if( region != null ) msgs = ( ( InternalEObject ) region ).eInverseRemove( this,
                    CimPackage.SUB_GEOGRAPHICAL_REGION__SUBSTATIONS, SubGeographicalRegion.class, msgs );
            return basicSetRegion( ( SubGeographicalRegion ) otherEnd, msgs );
        case CimPackage.SUBSTATION__DC_CONVERTER_UNIT:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getDCConverterUnit() )
                    .basicAdd( otherEnd, msgs );
        case CimPackage.SUBSTATION__VOLTAGE_LEVELS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getVoltageLevels() )
                    .basicAdd( otherEnd, msgs );
        case CimPackage.SUBSTATION__BAYS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getBays() ).basicAdd( otherEnd, msgs );
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
        case CimPackage.SUBSTATION__REGION:
            return basicUnsetRegion( msgs );
        case CimPackage.SUBSTATION__DC_CONVERTER_UNIT:
            return ( ( InternalEList< ? > ) getDCConverterUnit() ).basicRemove( otherEnd, msgs );
        case CimPackage.SUBSTATION__VOLTAGE_LEVELS:
            return ( ( InternalEList< ? > ) getVoltageLevels() ).basicRemove( otherEnd, msgs );
        case CimPackage.SUBSTATION__BAYS:
            return ( ( InternalEList< ? > ) getBays() ).basicRemove( otherEnd, msgs );
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
        case CimPackage.SUBSTATION__REGION:
            return getRegion();
        case CimPackage.SUBSTATION__DC_CONVERTER_UNIT:
            return getDCConverterUnit();
        case CimPackage.SUBSTATION__VOLTAGE_LEVELS:
            return getVoltageLevels();
        case CimPackage.SUBSTATION__BAYS:
            return getBays();
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
        case CimPackage.SUBSTATION__REGION:
            setRegion( ( SubGeographicalRegion ) newValue );
            return;
        case CimPackage.SUBSTATION__DC_CONVERTER_UNIT:
            getDCConverterUnit().clear();
            getDCConverterUnit().addAll( ( Collection< ? extends DCConverterUnit > ) newValue );
            return;
        case CimPackage.SUBSTATION__VOLTAGE_LEVELS:
            getVoltageLevels().clear();
            getVoltageLevels().addAll( ( Collection< ? extends VoltageLevel > ) newValue );
            return;
        case CimPackage.SUBSTATION__BAYS:
            getBays().clear();
            getBays().addAll( ( Collection< ? extends Bay > ) newValue );
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
        case CimPackage.SUBSTATION__REGION:
            unsetRegion();
            return;
        case CimPackage.SUBSTATION__DC_CONVERTER_UNIT:
            unsetDCConverterUnit();
            return;
        case CimPackage.SUBSTATION__VOLTAGE_LEVELS:
            unsetVoltageLevels();
            return;
        case CimPackage.SUBSTATION__BAYS:
            unsetBays();
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
        case CimPackage.SUBSTATION__REGION:
            return isSetRegion();
        case CimPackage.SUBSTATION__DC_CONVERTER_UNIT:
            return isSetDCConverterUnit();
        case CimPackage.SUBSTATION__VOLTAGE_LEVELS:
            return isSetVoltageLevels();
        case CimPackage.SUBSTATION__BAYS:
            return isSetBays();
        }
        return super.eIsSet( featureID );
    }

} //SubstationImpl
