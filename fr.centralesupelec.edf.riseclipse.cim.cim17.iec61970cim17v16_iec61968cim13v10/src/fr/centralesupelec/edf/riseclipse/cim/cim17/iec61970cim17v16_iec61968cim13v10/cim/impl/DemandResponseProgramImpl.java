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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CustomerAgreement;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DateTimeInterval;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DemandResponseProgram;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceGroup;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.UsagePointGroup;

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
 * An implementation of the model object '<em><b>Demand Response Program</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.DemandResponseProgramImpl#getType <em>Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.DemandResponseProgramImpl#getValidityInterval <em>Validity Interval</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.DemandResponseProgramImpl#getCustomerAgreements <em>Customer Agreements</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.DemandResponseProgramImpl#getUsagePointGroups <em>Usage Point Groups</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.DemandResponseProgramImpl#getEndDeviceGroups <em>End Device Groups</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DemandResponseProgramImpl extends IdentifiedObjectImpl implements DemandResponseProgram {
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
     * The cached value of the '{@link #getValidityInterval() <em>Validity Interval</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getValidityInterval()
     * @generated
     * @ordered
     */
    protected DateTimeInterval validityInterval;

    /**
     * This is true if the Validity Interval containment reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean validityIntervalESet;

    /**
     * The cached value of the '{@link #getCustomerAgreements() <em>Customer Agreements</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCustomerAgreements()
     * @generated
     * @ordered
     */
    protected EList< CustomerAgreement > customerAgreements;

    /**
     * The cached value of the '{@link #getUsagePointGroups() <em>Usage Point Groups</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUsagePointGroups()
     * @generated
     * @ordered
     */
    protected EList< UsagePointGroup > usagePointGroups;

    /**
     * The cached value of the '{@link #getEndDeviceGroups() <em>End Device Groups</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEndDeviceGroups()
     * @generated
     * @ordered
     */
    protected EList< EndDeviceGroup > endDeviceGroups;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected DemandResponseProgramImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getDemandResponseProgram();
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
                CimPackage.DEMAND_RESPONSE_PROGRAM__TYPE, oldType, type, !oldTypeESet ) );
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
                CimPackage.DEMAND_RESPONSE_PROGRAM__TYPE, oldType, TYPE_EDEFAULT, oldTypeESet ) );
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
    public DateTimeInterval getValidityInterval() {
        return validityInterval;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetValidityInterval( DateTimeInterval newValidityInterval, NotificationChain msgs ) {
        DateTimeInterval oldValidityInterval = validityInterval;
        validityInterval = newValidityInterval;
        boolean oldValidityIntervalESet = validityIntervalESet;
        validityIntervalESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.DEMAND_RESPONSE_PROGRAM__VALIDITY_INTERVAL, oldValidityInterval, newValidityInterval,
                    !oldValidityIntervalESet );
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
    public void setValidityInterval( DateTimeInterval newValidityInterval ) {
        if( newValidityInterval != validityInterval ) {
            NotificationChain msgs = null;
            if( validityInterval != null ) msgs = ( ( InternalEObject ) validityInterval ).eInverseRemove( this,
                    EOPPOSITE_FEATURE_BASE - CimPackage.DEMAND_RESPONSE_PROGRAM__VALIDITY_INTERVAL, null, msgs );
            if( newValidityInterval != null ) msgs = ( ( InternalEObject ) newValidityInterval ).eInverseAdd( this,
                    EOPPOSITE_FEATURE_BASE - CimPackage.DEMAND_RESPONSE_PROGRAM__VALIDITY_INTERVAL, null, msgs );
            msgs = basicSetValidityInterval( newValidityInterval, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldValidityIntervalESet = validityIntervalESet;
            validityIntervalESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.DEMAND_RESPONSE_PROGRAM__VALIDITY_INTERVAL, newValidityInterval, newValidityInterval,
                    !oldValidityIntervalESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetValidityInterval( NotificationChain msgs ) {
        DateTimeInterval oldValidityInterval = validityInterval;
        validityInterval = null;
        boolean oldValidityIntervalESet = validityIntervalESet;
        validityIntervalESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.DEMAND_RESPONSE_PROGRAM__VALIDITY_INTERVAL, oldValidityInterval, null,
                    oldValidityIntervalESet );
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
    public void unsetValidityInterval() {
        if( validityInterval != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) validityInterval ).eInverseRemove( this,
                    EOPPOSITE_FEATURE_BASE - CimPackage.DEMAND_RESPONSE_PROGRAM__VALIDITY_INTERVAL, null, msgs );
            msgs = basicUnsetValidityInterval( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldValidityIntervalESet = validityIntervalESet;
            validityIntervalESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.DEMAND_RESPONSE_PROGRAM__VALIDITY_INTERVAL, null, null, oldValidityIntervalESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetValidityInterval() {
        return validityIntervalESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< CustomerAgreement > getCustomerAgreements() {
        if( customerAgreements == null ) {
            customerAgreements = new EObjectWithInverseResolvingEList.Unsettable.ManyInverse< CustomerAgreement >(
                    CustomerAgreement.class, this, CimPackage.DEMAND_RESPONSE_PROGRAM__CUSTOMER_AGREEMENTS,
                    CimPackage.CUSTOMER_AGREEMENT__DEMAND_RESPONSE_PROGRAMS );
        }
        return customerAgreements;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetCustomerAgreements() {
        if( customerAgreements != null ) ( ( InternalEList.Unsettable< ? > ) customerAgreements ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetCustomerAgreements() {
        return customerAgreements != null && ( ( InternalEList.Unsettable< ? > ) customerAgreements ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< UsagePointGroup > getUsagePointGroups() {
        if( usagePointGroups == null ) {
            usagePointGroups = new EObjectWithInverseResolvingEList.Unsettable.ManyInverse< UsagePointGroup >(
                    UsagePointGroup.class, this, CimPackage.DEMAND_RESPONSE_PROGRAM__USAGE_POINT_GROUPS,
                    CimPackage.USAGE_POINT_GROUP__DEMAND_RESPONSE_PROGRAMS );
        }
        return usagePointGroups;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetUsagePointGroups() {
        if( usagePointGroups != null ) ( ( InternalEList.Unsettable< ? > ) usagePointGroups ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetUsagePointGroups() {
        return usagePointGroups != null && ( ( InternalEList.Unsettable< ? > ) usagePointGroups ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< EndDeviceGroup > getEndDeviceGroups() {
        if( endDeviceGroups == null ) {
            endDeviceGroups = new EObjectWithInverseResolvingEList.Unsettable.ManyInverse< EndDeviceGroup >(
                    EndDeviceGroup.class, this, CimPackage.DEMAND_RESPONSE_PROGRAM__END_DEVICE_GROUPS,
                    CimPackage.END_DEVICE_GROUP__DEMAND_RESPONSE_PROGRAMS );
        }
        return endDeviceGroups;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetEndDeviceGroups() {
        if( endDeviceGroups != null ) ( ( InternalEList.Unsettable< ? > ) endDeviceGroups ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetEndDeviceGroups() {
        return endDeviceGroups != null && ( ( InternalEList.Unsettable< ? > ) endDeviceGroups ).isSet();
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
        case CimPackage.DEMAND_RESPONSE_PROGRAM__CUSTOMER_AGREEMENTS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getCustomerAgreements() )
                    .basicAdd( otherEnd, msgs );
        case CimPackage.DEMAND_RESPONSE_PROGRAM__USAGE_POINT_GROUPS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getUsagePointGroups() )
                    .basicAdd( otherEnd, msgs );
        case CimPackage.DEMAND_RESPONSE_PROGRAM__END_DEVICE_GROUPS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getEndDeviceGroups() )
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
        case CimPackage.DEMAND_RESPONSE_PROGRAM__VALIDITY_INTERVAL:
            return basicUnsetValidityInterval( msgs );
        case CimPackage.DEMAND_RESPONSE_PROGRAM__CUSTOMER_AGREEMENTS:
            return ( ( InternalEList< ? > ) getCustomerAgreements() ).basicRemove( otherEnd, msgs );
        case CimPackage.DEMAND_RESPONSE_PROGRAM__USAGE_POINT_GROUPS:
            return ( ( InternalEList< ? > ) getUsagePointGroups() ).basicRemove( otherEnd, msgs );
        case CimPackage.DEMAND_RESPONSE_PROGRAM__END_DEVICE_GROUPS:
            return ( ( InternalEList< ? > ) getEndDeviceGroups() ).basicRemove( otherEnd, msgs );
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
        case CimPackage.DEMAND_RESPONSE_PROGRAM__TYPE:
            return getType();
        case CimPackage.DEMAND_RESPONSE_PROGRAM__VALIDITY_INTERVAL:
            return getValidityInterval();
        case CimPackage.DEMAND_RESPONSE_PROGRAM__CUSTOMER_AGREEMENTS:
            return getCustomerAgreements();
        case CimPackage.DEMAND_RESPONSE_PROGRAM__USAGE_POINT_GROUPS:
            return getUsagePointGroups();
        case CimPackage.DEMAND_RESPONSE_PROGRAM__END_DEVICE_GROUPS:
            return getEndDeviceGroups();
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
        case CimPackage.DEMAND_RESPONSE_PROGRAM__TYPE:
            setType( ( String ) newValue );
            return;
        case CimPackage.DEMAND_RESPONSE_PROGRAM__VALIDITY_INTERVAL:
            setValidityInterval( ( DateTimeInterval ) newValue );
            return;
        case CimPackage.DEMAND_RESPONSE_PROGRAM__CUSTOMER_AGREEMENTS:
            getCustomerAgreements().clear();
            getCustomerAgreements().addAll( ( Collection< ? extends CustomerAgreement > ) newValue );
            return;
        case CimPackage.DEMAND_RESPONSE_PROGRAM__USAGE_POINT_GROUPS:
            getUsagePointGroups().clear();
            getUsagePointGroups().addAll( ( Collection< ? extends UsagePointGroup > ) newValue );
            return;
        case CimPackage.DEMAND_RESPONSE_PROGRAM__END_DEVICE_GROUPS:
            getEndDeviceGroups().clear();
            getEndDeviceGroups().addAll( ( Collection< ? extends EndDeviceGroup > ) newValue );
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
        case CimPackage.DEMAND_RESPONSE_PROGRAM__TYPE:
            unsetType();
            return;
        case CimPackage.DEMAND_RESPONSE_PROGRAM__VALIDITY_INTERVAL:
            unsetValidityInterval();
            return;
        case CimPackage.DEMAND_RESPONSE_PROGRAM__CUSTOMER_AGREEMENTS:
            unsetCustomerAgreements();
            return;
        case CimPackage.DEMAND_RESPONSE_PROGRAM__USAGE_POINT_GROUPS:
            unsetUsagePointGroups();
            return;
        case CimPackage.DEMAND_RESPONSE_PROGRAM__END_DEVICE_GROUPS:
            unsetEndDeviceGroups();
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
        case CimPackage.DEMAND_RESPONSE_PROGRAM__TYPE:
            return isSetType();
        case CimPackage.DEMAND_RESPONSE_PROGRAM__VALIDITY_INTERVAL:
            return isSetValidityInterval();
        case CimPackage.DEMAND_RESPONSE_PROGRAM__CUSTOMER_AGREEMENTS:
            return isSetCustomerAgreements();
        case CimPackage.DEMAND_RESPONSE_PROGRAM__USAGE_POINT_GROUPS:
            return isSetUsagePointGroups();
        case CimPackage.DEMAND_RESPONSE_PROGRAM__END_DEVICE_GROUPS:
            return isSetEndDeviceGroups();
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
        result.append( " (type: " );
        if( typeESet )
            result.append( type );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //DemandResponseProgramImpl
