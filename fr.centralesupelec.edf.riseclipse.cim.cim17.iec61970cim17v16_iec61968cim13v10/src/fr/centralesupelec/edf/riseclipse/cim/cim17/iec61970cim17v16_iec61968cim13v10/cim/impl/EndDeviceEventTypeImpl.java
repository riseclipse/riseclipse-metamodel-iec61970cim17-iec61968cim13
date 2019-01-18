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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceEvent;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceEventType;

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
 * An implementation of the model object '<em><b>End Device Event Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.EndDeviceEventTypeImpl#getDomain <em>Domain</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.EndDeviceEventTypeImpl#getEventOrAction <em>Event Or Action</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.EndDeviceEventTypeImpl#getSubDomain <em>Sub Domain</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.EndDeviceEventTypeImpl#getType <em>Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.EndDeviceEventTypeImpl#getEndDeviceEvents <em>End Device Events</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EndDeviceEventTypeImpl extends IdentifiedObjectImpl implements EndDeviceEventType {
    /**
     * The default value of the '{@link #getDomain() <em>Domain</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDomain()
     * @generated
     * @ordered
     */
    protected static final String DOMAIN_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDomain() <em>Domain</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDomain()
     * @generated
     * @ordered
     */
    protected String domain = DOMAIN_EDEFAULT;

    /**
     * This is true if the Domain attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean domainESet;

    /**
     * The default value of the '{@link #getEventOrAction() <em>Event Or Action</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEventOrAction()
     * @generated
     * @ordered
     */
    protected static final String EVENT_OR_ACTION_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getEventOrAction() <em>Event Or Action</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEventOrAction()
     * @generated
     * @ordered
     */
    protected String eventOrAction = EVENT_OR_ACTION_EDEFAULT;

    /**
     * This is true if the Event Or Action attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean eventOrActionESet;

    /**
     * The default value of the '{@link #getSubDomain() <em>Sub Domain</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSubDomain()
     * @generated
     * @ordered
     */
    protected static final String SUB_DOMAIN_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSubDomain() <em>Sub Domain</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSubDomain()
     * @generated
     * @ordered
     */
    protected String subDomain = SUB_DOMAIN_EDEFAULT;

    /**
     * This is true if the Sub Domain attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean subDomainESet;

    /**
     * The default value of the '{@link #getType() <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getType()
     * @generated
     * @ordered
     */
    protected static final String TYPE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getType()
     * @generated
     * @ordered
     */
    protected String type = TYPE_EDEFAULT;

    /**
     * This is true if the Type attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean typeESet;

    /**
     * The cached value of the '{@link #getEndDeviceEvents() <em>End Device Events</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEndDeviceEvents()
     * @generated
     * @ordered
     */
    protected EList< EndDeviceEvent > endDeviceEvents;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected EndDeviceEventTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getEndDeviceEventType();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getDomain() {
        return domain;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setDomain( String newDomain ) {
        String oldDomain = domain;
        domain = newDomain;
        boolean oldDomainESet = domainESet;
        domainESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.END_DEVICE_EVENT_TYPE__DOMAIN, oldDomain, domain, !oldDomainESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetDomain() {
        String oldDomain = domain;
        boolean oldDomainESet = domainESet;
        domain = DOMAIN_EDEFAULT;
        domainESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.END_DEVICE_EVENT_TYPE__DOMAIN, oldDomain, DOMAIN_EDEFAULT, oldDomainESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetDomain() {
        return domainESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getEventOrAction() {
        return eventOrAction;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setEventOrAction( String newEventOrAction ) {
        String oldEventOrAction = eventOrAction;
        eventOrAction = newEventOrAction;
        boolean oldEventOrActionESet = eventOrActionESet;
        eventOrActionESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.END_DEVICE_EVENT_TYPE__EVENT_OR_ACTION,
                    oldEventOrAction, eventOrAction, !oldEventOrActionESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetEventOrAction() {
        String oldEventOrAction = eventOrAction;
        boolean oldEventOrActionESet = eventOrActionESet;
        eventOrAction = EVENT_OR_ACTION_EDEFAULT;
        eventOrActionESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.END_DEVICE_EVENT_TYPE__EVENT_OR_ACTION,
                    oldEventOrAction, EVENT_OR_ACTION_EDEFAULT, oldEventOrActionESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetEventOrAction() {
        return eventOrActionESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getSubDomain() {
        return subDomain;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setSubDomain( String newSubDomain ) {
        String oldSubDomain = subDomain;
        subDomain = newSubDomain;
        boolean oldSubDomainESet = subDomainESet;
        subDomainESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.END_DEVICE_EVENT_TYPE__SUB_DOMAIN, oldSubDomain, subDomain, !oldSubDomainESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetSubDomain() {
        String oldSubDomain = subDomain;
        boolean oldSubDomainESet = subDomainESet;
        subDomain = SUB_DOMAIN_EDEFAULT;
        subDomainESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.END_DEVICE_EVENT_TYPE__SUB_DOMAIN, oldSubDomain, SUB_DOMAIN_EDEFAULT, oldSubDomainESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetSubDomain() {
        return subDomainESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getType() {
        return type;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setType( String newType ) {
        String oldType = type;
        type = newType;
        boolean oldTypeESet = typeESet;
        typeESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.END_DEVICE_EVENT_TYPE__TYPE, oldType, type, !oldTypeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetType() {
        String oldType = type;
        boolean oldTypeESet = typeESet;
        type = TYPE_EDEFAULT;
        typeESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.END_DEVICE_EVENT_TYPE__TYPE, oldType, TYPE_EDEFAULT, oldTypeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetType() {
        return typeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< EndDeviceEvent > getEndDeviceEvents() {
        if( endDeviceEvents == null ) {
            endDeviceEvents = new EObjectWithInverseResolvingEList.Unsettable< EndDeviceEvent >( EndDeviceEvent.class,
                    this, CimPackage.END_DEVICE_EVENT_TYPE__END_DEVICE_EVENTS,
                    CimPackage.END_DEVICE_EVENT__END_DEVICE_EVENT_TYPE );
        }
        return endDeviceEvents;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetEndDeviceEvents() {
        if( endDeviceEvents != null ) ( ( InternalEList.Unsettable< ? > ) endDeviceEvents ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetEndDeviceEvents() {
        return endDeviceEvents != null && ( ( InternalEList.Unsettable< ? > ) endDeviceEvents ).isSet();
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
        case CimPackage.END_DEVICE_EVENT_TYPE__END_DEVICE_EVENTS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getEndDeviceEvents() )
                    .basicAdd( otherEnd, msgs );
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
        case CimPackage.END_DEVICE_EVENT_TYPE__END_DEVICE_EVENTS:
            return ( ( InternalEList< ? > ) getEndDeviceEvents() ).basicRemove( otherEnd, msgs );
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
        case CimPackage.END_DEVICE_EVENT_TYPE__DOMAIN:
            return getDomain();
        case CimPackage.END_DEVICE_EVENT_TYPE__EVENT_OR_ACTION:
            return getEventOrAction();
        case CimPackage.END_DEVICE_EVENT_TYPE__SUB_DOMAIN:
            return getSubDomain();
        case CimPackage.END_DEVICE_EVENT_TYPE__TYPE:
            return getType();
        case CimPackage.END_DEVICE_EVENT_TYPE__END_DEVICE_EVENTS:
            return getEndDeviceEvents();
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
        case CimPackage.END_DEVICE_EVENT_TYPE__DOMAIN:
            setDomain( ( String ) newValue );
            return;
        case CimPackage.END_DEVICE_EVENT_TYPE__EVENT_OR_ACTION:
            setEventOrAction( ( String ) newValue );
            return;
        case CimPackage.END_DEVICE_EVENT_TYPE__SUB_DOMAIN:
            setSubDomain( ( String ) newValue );
            return;
        case CimPackage.END_DEVICE_EVENT_TYPE__TYPE:
            setType( ( String ) newValue );
            return;
        case CimPackage.END_DEVICE_EVENT_TYPE__END_DEVICE_EVENTS:
            getEndDeviceEvents().clear();
            getEndDeviceEvents().addAll( ( Collection< ? extends EndDeviceEvent > ) newValue );
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
        case CimPackage.END_DEVICE_EVENT_TYPE__DOMAIN:
            unsetDomain();
            return;
        case CimPackage.END_DEVICE_EVENT_TYPE__EVENT_OR_ACTION:
            unsetEventOrAction();
            return;
        case CimPackage.END_DEVICE_EVENT_TYPE__SUB_DOMAIN:
            unsetSubDomain();
            return;
        case CimPackage.END_DEVICE_EVENT_TYPE__TYPE:
            unsetType();
            return;
        case CimPackage.END_DEVICE_EVENT_TYPE__END_DEVICE_EVENTS:
            unsetEndDeviceEvents();
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
        case CimPackage.END_DEVICE_EVENT_TYPE__DOMAIN:
            return isSetDomain();
        case CimPackage.END_DEVICE_EVENT_TYPE__EVENT_OR_ACTION:
            return isSetEventOrAction();
        case CimPackage.END_DEVICE_EVENT_TYPE__SUB_DOMAIN:
            return isSetSubDomain();
        case CimPackage.END_DEVICE_EVENT_TYPE__TYPE:
            return isSetType();
        case CimPackage.END_DEVICE_EVENT_TYPE__END_DEVICE_EVENTS:
            return isSetEndDeviceEvents();
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
        result.append( " (domain: " );
        if( domainESet )
            result.append( domain );
        else
            result.append( "<unset>" );
        result.append( ", eventOrAction: " );
        if( eventOrActionESet )
            result.append( eventOrAction );
        else
            result.append( "<unset>" );
        result.append( ", subDomain: " );
        if( subDomainESet )
            result.append( subDomain );
        else
            result.append( "<unset>" );
        result.append( ", type: " );
        if( typeESet )
            result.append( type );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //EndDeviceEventTypeImpl
