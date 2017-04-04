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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CommunicationLink;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RemotePoint;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RemoteUnit;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RemoteUnitType;

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
 * An implementation of the model object '<em><b>Remote Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.RemoteUnitImpl#getRemoteUnitType <em>Remote Unit Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.RemoteUnitImpl#getCommunicationLinks <em>Communication Links</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.RemoteUnitImpl#getRemotePoints <em>Remote Points</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RemoteUnitImpl extends PowerSystemResourceImpl implements RemoteUnit {
    /**
     * The default value of the '{@link #getRemoteUnitType() <em>Remote Unit Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRemoteUnitType()
     * @generated
     * @ordered
     */
    protected static final RemoteUnitType REMOTE_UNIT_TYPE_EDEFAULT = RemoteUnitType.RTU;

    /**
     * The cached value of the '{@link #getRemoteUnitType() <em>Remote Unit Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRemoteUnitType()
     * @generated
     * @ordered
     */
    protected RemoteUnitType remoteUnitType = REMOTE_UNIT_TYPE_EDEFAULT;

    /**
     * This is true if the Remote Unit Type attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean remoteUnitTypeESet;

    /**
     * The cached value of the '{@link #getCommunicationLinks() <em>Communication Links</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCommunicationLinks()
     * @generated
     * @ordered
     */
    protected EList< CommunicationLink > communicationLinks;

    /**
     * The cached value of the '{@link #getRemotePoints() <em>Remote Points</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRemotePoints()
     * @generated
     * @ordered
     */
    protected EList< RemotePoint > remotePoints;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected RemoteUnitImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getRemoteUnit();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public RemoteUnitType getRemoteUnitType() {
        return remoteUnitType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setRemoteUnitType( RemoteUnitType newRemoteUnitType ) {
        RemoteUnitType oldRemoteUnitType = remoteUnitType;
        remoteUnitType = newRemoteUnitType == null ? REMOTE_UNIT_TYPE_EDEFAULT : newRemoteUnitType;
        boolean oldRemoteUnitTypeESet = remoteUnitTypeESet;
        remoteUnitTypeESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.REMOTE_UNIT__REMOTE_UNIT_TYPE, oldRemoteUnitType, remoteUnitType, !oldRemoteUnitTypeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetRemoteUnitType() {
        RemoteUnitType oldRemoteUnitType = remoteUnitType;
        boolean oldRemoteUnitTypeESet = remoteUnitTypeESet;
        remoteUnitType = REMOTE_UNIT_TYPE_EDEFAULT;
        remoteUnitTypeESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.REMOTE_UNIT__REMOTE_UNIT_TYPE,
                    oldRemoteUnitType, REMOTE_UNIT_TYPE_EDEFAULT, oldRemoteUnitTypeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRemoteUnitType() {
        return remoteUnitTypeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< CommunicationLink > getCommunicationLinks() {
        if( communicationLinks == null ) {
            communicationLinks = new EObjectWithInverseResolvingEList.Unsettable.ManyInverse< CommunicationLink >(
                    CommunicationLink.class, this, CimPackage.REMOTE_UNIT__COMMUNICATION_LINKS,
                    CimPackage.COMMUNICATION_LINK__REMOTE_UNITS );
        }
        return communicationLinks;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetCommunicationLinks() {
        if( communicationLinks != null ) ( ( InternalEList.Unsettable< ? > ) communicationLinks ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetCommunicationLinks() {
        return communicationLinks != null && ( ( InternalEList.Unsettable< ? > ) communicationLinks ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< RemotePoint > getRemotePoints() {
        if( remotePoints == null ) {
            remotePoints = new EObjectWithInverseResolvingEList.Unsettable< RemotePoint >( RemotePoint.class, this,
                    CimPackage.REMOTE_UNIT__REMOTE_POINTS, CimPackage.REMOTE_POINT__REMOTE_UNIT );
        }
        return remotePoints;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetRemotePoints() {
        if( remotePoints != null ) ( ( InternalEList.Unsettable< ? > ) remotePoints ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRemotePoints() {
        return remotePoints != null && ( ( InternalEList.Unsettable< ? > ) remotePoints ).isSet();
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
        case CimPackage.REMOTE_UNIT__COMMUNICATION_LINKS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getCommunicationLinks() )
                    .basicAdd( otherEnd, msgs );
        case CimPackage.REMOTE_UNIT__REMOTE_POINTS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getRemotePoints() ).basicAdd( otherEnd,
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
        case CimPackage.REMOTE_UNIT__COMMUNICATION_LINKS:
            return ( ( InternalEList< ? > ) getCommunicationLinks() ).basicRemove( otherEnd, msgs );
        case CimPackage.REMOTE_UNIT__REMOTE_POINTS:
            return ( ( InternalEList< ? > ) getRemotePoints() ).basicRemove( otherEnd, msgs );
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
        case CimPackage.REMOTE_UNIT__REMOTE_UNIT_TYPE:
            return getRemoteUnitType();
        case CimPackage.REMOTE_UNIT__COMMUNICATION_LINKS:
            return getCommunicationLinks();
        case CimPackage.REMOTE_UNIT__REMOTE_POINTS:
            return getRemotePoints();
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
        case CimPackage.REMOTE_UNIT__REMOTE_UNIT_TYPE:
            setRemoteUnitType( ( RemoteUnitType ) newValue );
            return;
        case CimPackage.REMOTE_UNIT__COMMUNICATION_LINKS:
            getCommunicationLinks().clear();
            getCommunicationLinks().addAll( ( Collection< ? extends CommunicationLink > ) newValue );
            return;
        case CimPackage.REMOTE_UNIT__REMOTE_POINTS:
            getRemotePoints().clear();
            getRemotePoints().addAll( ( Collection< ? extends RemotePoint > ) newValue );
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
        case CimPackage.REMOTE_UNIT__REMOTE_UNIT_TYPE:
            unsetRemoteUnitType();
            return;
        case CimPackage.REMOTE_UNIT__COMMUNICATION_LINKS:
            unsetCommunicationLinks();
            return;
        case CimPackage.REMOTE_UNIT__REMOTE_POINTS:
            unsetRemotePoints();
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
        case CimPackage.REMOTE_UNIT__REMOTE_UNIT_TYPE:
            return isSetRemoteUnitType();
        case CimPackage.REMOTE_UNIT__COMMUNICATION_LINKS:
            return isSetCommunicationLinks();
        case CimPackage.REMOTE_UNIT__REMOTE_POINTS:
            return isSetRemotePoints();
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
        result.append( " (remoteUnitType: " );
        if( remoteUnitTypeESet )
            result.append( remoteUnitType );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //RemoteUnitImpl
