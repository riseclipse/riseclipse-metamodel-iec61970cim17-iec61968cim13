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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Status;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.StreetAddress;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.StreetDetail;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TownDetail;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Street Address</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.StreetAddressImpl#getPoBox <em>Po Box</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.StreetAddressImpl#getPostalCode <em>Postal Code</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.StreetAddressImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.StreetAddressImpl#getStreetDetail <em>Street Detail</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.StreetAddressImpl#getTownDetail <em>Town Detail</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StreetAddressImpl extends MinimalEObjectImpl.Container implements StreetAddress {
    /**
     * The default value of the '{@link #getPoBox() <em>Po Box</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPoBox()
     * @generated
     * @ordered
     */
    protected static final String PO_BOX_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPoBox() <em>Po Box</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPoBox()
     * @generated
     * @ordered
     */
    protected String poBox = PO_BOX_EDEFAULT;

    /**
     * This is true if the Po Box attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean poBoxESet;

    /**
     * The default value of the '{@link #getPostalCode() <em>Postal Code</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPostalCode()
     * @generated
     * @ordered
     */
    protected static final String POSTAL_CODE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPostalCode() <em>Postal Code</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPostalCode()
     * @generated
     * @ordered
     */
    protected String postalCode = POSTAL_CODE_EDEFAULT;

    /**
     * This is true if the Postal Code attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean postalCodeESet;

    /**
     * The cached value of the '{@link #getStatus() <em>Status</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getStatus()
     * @generated
     * @ordered
     */
    protected Status status;

    /**
     * This is true if the Status containment reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean statusESet;

    /**
     * The cached value of the '{@link #getStreetDetail() <em>Street Detail</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getStreetDetail()
     * @generated
     * @ordered
     */
    protected StreetDetail streetDetail;

    /**
     * This is true if the Street Detail containment reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean streetDetailESet;

    /**
     * The cached value of the '{@link #getTownDetail() <em>Town Detail</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTownDetail()
     * @generated
     * @ordered
     */
    protected TownDetail townDetail;

    /**
     * This is true if the Town Detail containment reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean townDetailESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected StreetAddressImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getStreetAddress();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getPoBox() {
        return poBox;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setPoBox( String newPoBox ) {
        String oldPoBox = poBox;
        poBox = newPoBox;
        boolean oldPoBoxESet = poBoxESet;
        poBoxESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.STREET_ADDRESS__PO_BOX, oldPoBox, poBox, !oldPoBoxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetPoBox() {
        String oldPoBox = poBox;
        boolean oldPoBoxESet = poBoxESet;
        poBox = PO_BOX_EDEFAULT;
        poBoxESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.STREET_ADDRESS__PO_BOX, oldPoBox, PO_BOX_EDEFAULT, oldPoBoxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPoBox() {
        return poBoxESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setPostalCode( String newPostalCode ) {
        String oldPostalCode = postalCode;
        postalCode = newPostalCode;
        boolean oldPostalCodeESet = postalCodeESet;
        postalCodeESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.STREET_ADDRESS__POSTAL_CODE, oldPostalCode, postalCode, !oldPostalCodeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetPostalCode() {
        String oldPostalCode = postalCode;
        boolean oldPostalCodeESet = postalCodeESet;
        postalCode = POSTAL_CODE_EDEFAULT;
        postalCodeESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.STREET_ADDRESS__POSTAL_CODE, oldPostalCode, POSTAL_CODE_EDEFAULT, oldPostalCodeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPostalCode() {
        return postalCodeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Status getStatus() {
        return status;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetStatus( Status newStatus, NotificationChain msgs ) {
        Status oldStatus = status;
        status = newStatus;
        boolean oldStatusESet = statusESet;
        statusESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.STREET_ADDRESS__STATUS, oldStatus, newStatus, !oldStatusESet );
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
    public void setStatus( Status newStatus ) {
        if( newStatus != status ) {
            NotificationChain msgs = null;
            if( status != null ) msgs = ( ( InternalEObject ) status ).eInverseRemove( this,
                    EOPPOSITE_FEATURE_BASE - CimPackage.STREET_ADDRESS__STATUS, null, msgs );
            if( newStatus != null ) msgs = ( ( InternalEObject ) newStatus ).eInverseAdd( this,
                    EOPPOSITE_FEATURE_BASE - CimPackage.STREET_ADDRESS__STATUS, null, msgs );
            msgs = basicSetStatus( newStatus, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldStatusESet = statusESet;
            statusESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.STREET_ADDRESS__STATUS, newStatus, newStatus, !oldStatusESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetStatus( NotificationChain msgs ) {
        Status oldStatus = status;
        status = null;
        boolean oldStatusESet = statusESet;
        statusESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.STREET_ADDRESS__STATUS, oldStatus, null, oldStatusESet );
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
    public void unsetStatus() {
        if( status != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) status ).eInverseRemove( this,
                    EOPPOSITE_FEATURE_BASE - CimPackage.STREET_ADDRESS__STATUS, null, msgs );
            msgs = basicUnsetStatus( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldStatusESet = statusESet;
            statusESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.STREET_ADDRESS__STATUS, null, null, oldStatusESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetStatus() {
        return statusESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public StreetDetail getStreetDetail() {
        return streetDetail;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetStreetDetail( StreetDetail newStreetDetail, NotificationChain msgs ) {
        StreetDetail oldStreetDetail = streetDetail;
        streetDetail = newStreetDetail;
        boolean oldStreetDetailESet = streetDetailESet;
        streetDetailESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.STREET_ADDRESS__STREET_DETAIL, oldStreetDetail, newStreetDetail, !oldStreetDetailESet );
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
    public void setStreetDetail( StreetDetail newStreetDetail ) {
        if( newStreetDetail != streetDetail ) {
            NotificationChain msgs = null;
            if( streetDetail != null ) msgs = ( ( InternalEObject ) streetDetail ).eInverseRemove( this,
                    EOPPOSITE_FEATURE_BASE - CimPackage.STREET_ADDRESS__STREET_DETAIL, null, msgs );
            if( newStreetDetail != null ) msgs = ( ( InternalEObject ) newStreetDetail ).eInverseAdd( this,
                    EOPPOSITE_FEATURE_BASE - CimPackage.STREET_ADDRESS__STREET_DETAIL, null, msgs );
            msgs = basicSetStreetDetail( newStreetDetail, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldStreetDetailESet = streetDetailESet;
            streetDetailESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.STREET_ADDRESS__STREET_DETAIL,
                        newStreetDetail, newStreetDetail, !oldStreetDetailESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetStreetDetail( NotificationChain msgs ) {
        StreetDetail oldStreetDetail = streetDetail;
        streetDetail = null;
        boolean oldStreetDetailESet = streetDetailESet;
        streetDetailESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.STREET_ADDRESS__STREET_DETAIL, oldStreetDetail, null, oldStreetDetailESet );
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
    public void unsetStreetDetail() {
        if( streetDetail != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) streetDetail ).eInverseRemove( this,
                    EOPPOSITE_FEATURE_BASE - CimPackage.STREET_ADDRESS__STREET_DETAIL, null, msgs );
            msgs = basicUnsetStreetDetail( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldStreetDetailESet = streetDetailESet;
            streetDetailESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.STREET_ADDRESS__STREET_DETAIL, null, null, oldStreetDetailESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetStreetDetail() {
        return streetDetailESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public TownDetail getTownDetail() {
        return townDetail;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetTownDetail( TownDetail newTownDetail, NotificationChain msgs ) {
        TownDetail oldTownDetail = townDetail;
        townDetail = newTownDetail;
        boolean oldTownDetailESet = townDetailESet;
        townDetailESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.STREET_ADDRESS__TOWN_DETAIL, oldTownDetail, newTownDetail, !oldTownDetailESet );
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
    public void setTownDetail( TownDetail newTownDetail ) {
        if( newTownDetail != townDetail ) {
            NotificationChain msgs = null;
            if( townDetail != null ) msgs = ( ( InternalEObject ) townDetail ).eInverseRemove( this,
                    EOPPOSITE_FEATURE_BASE - CimPackage.STREET_ADDRESS__TOWN_DETAIL, null, msgs );
            if( newTownDetail != null ) msgs = ( ( InternalEObject ) newTownDetail ).eInverseAdd( this,
                    EOPPOSITE_FEATURE_BASE - CimPackage.STREET_ADDRESS__TOWN_DETAIL, null, msgs );
            msgs = basicSetTownDetail( newTownDetail, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldTownDetailESet = townDetailESet;
            townDetailESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.STREET_ADDRESS__TOWN_DETAIL, newTownDetail, newTownDetail, !oldTownDetailESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetTownDetail( NotificationChain msgs ) {
        TownDetail oldTownDetail = townDetail;
        townDetail = null;
        boolean oldTownDetailESet = townDetailESet;
        townDetailESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.STREET_ADDRESS__TOWN_DETAIL, oldTownDetail, null, oldTownDetailESet );
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
    public void unsetTownDetail() {
        if( townDetail != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) townDetail ).eInverseRemove( this,
                    EOPPOSITE_FEATURE_BASE - CimPackage.STREET_ADDRESS__TOWN_DETAIL, null, msgs );
            msgs = basicUnsetTownDetail( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldTownDetailESet = townDetailESet;
            townDetailESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.STREET_ADDRESS__TOWN_DETAIL, null, null, oldTownDetailESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTownDetail() {
        return townDetailESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.STREET_ADDRESS__STATUS:
            return basicUnsetStatus( msgs );
        case CimPackage.STREET_ADDRESS__STREET_DETAIL:
            return basicUnsetStreetDetail( msgs );
        case CimPackage.STREET_ADDRESS__TOWN_DETAIL:
            return basicUnsetTownDetail( msgs );
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
        case CimPackage.STREET_ADDRESS__PO_BOX:
            return getPoBox();
        case CimPackage.STREET_ADDRESS__POSTAL_CODE:
            return getPostalCode();
        case CimPackage.STREET_ADDRESS__STATUS:
            return getStatus();
        case CimPackage.STREET_ADDRESS__STREET_DETAIL:
            return getStreetDetail();
        case CimPackage.STREET_ADDRESS__TOWN_DETAIL:
            return getTownDetail();
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
        case CimPackage.STREET_ADDRESS__PO_BOX:
            setPoBox( ( String ) newValue );
            return;
        case CimPackage.STREET_ADDRESS__POSTAL_CODE:
            setPostalCode( ( String ) newValue );
            return;
        case CimPackage.STREET_ADDRESS__STATUS:
            setStatus( ( Status ) newValue );
            return;
        case CimPackage.STREET_ADDRESS__STREET_DETAIL:
            setStreetDetail( ( StreetDetail ) newValue );
            return;
        case CimPackage.STREET_ADDRESS__TOWN_DETAIL:
            setTownDetail( ( TownDetail ) newValue );
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
        case CimPackage.STREET_ADDRESS__PO_BOX:
            unsetPoBox();
            return;
        case CimPackage.STREET_ADDRESS__POSTAL_CODE:
            unsetPostalCode();
            return;
        case CimPackage.STREET_ADDRESS__STATUS:
            unsetStatus();
            return;
        case CimPackage.STREET_ADDRESS__STREET_DETAIL:
            unsetStreetDetail();
            return;
        case CimPackage.STREET_ADDRESS__TOWN_DETAIL:
            unsetTownDetail();
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
        case CimPackage.STREET_ADDRESS__PO_BOX:
            return isSetPoBox();
        case CimPackage.STREET_ADDRESS__POSTAL_CODE:
            return isSetPostalCode();
        case CimPackage.STREET_ADDRESS__STATUS:
            return isSetStatus();
        case CimPackage.STREET_ADDRESS__STREET_DETAIL:
            return isSetStreetDetail();
        case CimPackage.STREET_ADDRESS__TOWN_DETAIL:
            return isSetTownDetail();
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
        result.append( " (poBox: " );
        if( poBoxESet )
            result.append( poBox );
        else
            result.append( "<unset>" );
        result.append( ", postalCode: " );
        if( postalCodeESet )
            result.append( postalCode );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //StreetAddressImpl
