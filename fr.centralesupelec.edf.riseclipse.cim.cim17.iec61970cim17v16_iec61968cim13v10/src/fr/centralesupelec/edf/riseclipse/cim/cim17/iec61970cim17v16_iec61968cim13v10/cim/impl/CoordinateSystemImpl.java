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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CoordinateSystem;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Location;

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
 * An implementation of the model object '<em><b>Coordinate System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.CoordinateSystemImpl#getCrsUrn <em>Crs Urn</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.CoordinateSystemImpl#getLocations <em>Locations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CoordinateSystemImpl extends IdentifiedObjectImpl implements CoordinateSystem {
    /**
     * The default value of the '{@link #getCrsUrn() <em>Crs Urn</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCrsUrn()
     * @generated
     * @ordered
     */
    protected static final String CRS_URN_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getCrsUrn() <em>Crs Urn</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCrsUrn()
     * @generated
     * @ordered
     */
    protected String crsUrn = CRS_URN_EDEFAULT;

    /**
     * This is true if the Crs Urn attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean crsUrnESet;

    /**
     * The cached value of the '{@link #getLocations() <em>Locations</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLocations()
     * @generated
     * @ordered
     */
    protected EList< Location > locations;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected CoordinateSystemImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getCoordinateSystem();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getCrsUrn() {
        return crsUrn;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setCrsUrn( String newCrsUrn ) {
        String oldCrsUrn = crsUrn;
        crsUrn = newCrsUrn;
        boolean oldCrsUrnESet = crsUrnESet;
        crsUrnESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.COORDINATE_SYSTEM__CRS_URN, oldCrsUrn, crsUrn, !oldCrsUrnESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetCrsUrn() {
        String oldCrsUrn = crsUrn;
        boolean oldCrsUrnESet = crsUrnESet;
        crsUrn = CRS_URN_EDEFAULT;
        crsUrnESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.COORDINATE_SYSTEM__CRS_URN, oldCrsUrn, CRS_URN_EDEFAULT, oldCrsUrnESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetCrsUrn() {
        return crsUrnESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< Location > getLocations() {
        if( locations == null ) {
            locations = new EObjectWithInverseResolvingEList.Unsettable< Location >( Location.class, this,
                    CimPackage.COORDINATE_SYSTEM__LOCATIONS, CimPackage.LOCATION__COORDINATE_SYSTEM );
        }
        return locations;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetLocations() {
        if( locations != null ) ( ( InternalEList.Unsettable< ? > ) locations ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetLocations() {
        return locations != null && ( ( InternalEList.Unsettable< ? > ) locations ).isSet();
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
        case CimPackage.COORDINATE_SYSTEM__LOCATIONS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getLocations() ).basicAdd( otherEnd,
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
        case CimPackage.COORDINATE_SYSTEM__LOCATIONS:
            return ( ( InternalEList< ? > ) getLocations() ).basicRemove( otherEnd, msgs );
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
        case CimPackage.COORDINATE_SYSTEM__CRS_URN:
            return getCrsUrn();
        case CimPackage.COORDINATE_SYSTEM__LOCATIONS:
            return getLocations();
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
        case CimPackage.COORDINATE_SYSTEM__CRS_URN:
            setCrsUrn( ( String ) newValue );
            return;
        case CimPackage.COORDINATE_SYSTEM__LOCATIONS:
            getLocations().clear();
            getLocations().addAll( ( Collection< ? extends Location > ) newValue );
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
        case CimPackage.COORDINATE_SYSTEM__CRS_URN:
            unsetCrsUrn();
            return;
        case CimPackage.COORDINATE_SYSTEM__LOCATIONS:
            unsetLocations();
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
        case CimPackage.COORDINATE_SYSTEM__CRS_URN:
            return isSetCrsUrn();
        case CimPackage.COORDINATE_SYSTEM__LOCATIONS:
            return isSetLocations();
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
        result.append( " (crsUrn: " );
        if( crsUrnESet )
            result.append( crsUrn );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //CoordinateSystemImpl
