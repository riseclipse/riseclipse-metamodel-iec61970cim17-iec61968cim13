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

import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DCLine;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SubGeographicalRegion;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DC Line</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.DCLineImpl#getRegion <em>Region</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DCLineImpl extends DCEquipmentContainerImpl implements DCLine {
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
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected DCLineImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getDCLine();
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
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET, CimPackage.DC_LINE__REGION,
                    oldRegion, newRegion, !oldRegionESet );
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
                    CimPackage.SUB_GEOGRAPHICAL_REGION__DC_LINES, SubGeographicalRegion.class, msgs );
            if( newRegion != null ) msgs = ( ( InternalEObject ) newRegion ).eInverseAdd( this,
                    CimPackage.SUB_GEOGRAPHICAL_REGION__DC_LINES, SubGeographicalRegion.class, msgs );
            msgs = basicSetRegion( newRegion, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldRegionESet = regionESet;
            regionESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.DC_LINE__REGION, newRegion, newRegion, !oldRegionESet ) );
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
                    CimPackage.DC_LINE__REGION, oldRegion, null, oldRegionESet );
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
            msgs = ( ( InternalEObject ) region ).eInverseRemove( this, CimPackage.SUB_GEOGRAPHICAL_REGION__DC_LINES,
                    SubGeographicalRegion.class, msgs );
            msgs = basicUnsetRegion( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldRegionESet = regionESet;
            regionESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.DC_LINE__REGION, null, null, oldRegionESet ) );
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
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.DC_LINE__REGION:
            if( region != null ) msgs = ( ( InternalEObject ) region ).eInverseRemove( this,
                    CimPackage.SUB_GEOGRAPHICAL_REGION__DC_LINES, SubGeographicalRegion.class, msgs );
            return basicSetRegion( ( SubGeographicalRegion ) otherEnd, msgs );
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
        case CimPackage.DC_LINE__REGION:
            return basicUnsetRegion( msgs );
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
        case CimPackage.DC_LINE__REGION:
            return getRegion();
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
        case CimPackage.DC_LINE__REGION:
            setRegion( ( SubGeographicalRegion ) newValue );
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
        case CimPackage.DC_LINE__REGION:
            unsetRegion();
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
        case CimPackage.DC_LINE__REGION:
            return isSetRegion();
        }
        return super.eIsSet( featureID );
    }

} //DCLineImpl
