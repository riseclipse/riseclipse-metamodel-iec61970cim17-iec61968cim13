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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OperatingParticipant;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OperatingShare;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PowerSystemResource;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operating Share</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.OperatingShareImpl#getPercentage <em>Percentage</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.OperatingShareImpl#getPowerSystemResource <em>Power System Resource</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.OperatingShareImpl#getOperatingParticipant <em>Operating Participant</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OperatingShareImpl extends CimObjectWithIDImpl implements OperatingShare {
    /**
     * The default value of the '{@link #getPercentage() <em>Percentage</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPercentage()
     * @generated
     * @ordered
     */
    protected static final Float PERCENTAGE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPercentage() <em>Percentage</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPercentage()
     * @generated
     * @ordered
     */
    protected Float percentage = PERCENTAGE_EDEFAULT;

    /**
     * This is true if the Percentage attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean percentageESet;

    /**
     * The cached value of the '{@link #getPowerSystemResource() <em>Power System Resource</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPowerSystemResource()
     * @generated
     * @ordered
     */
    protected PowerSystemResource powerSystemResource;

    /**
     * This is true if the Power System Resource reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean powerSystemResourceESet;

    /**
     * The cached value of the '{@link #getOperatingParticipant() <em>Operating Participant</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOperatingParticipant()
     * @generated
     * @ordered
     */
    protected OperatingParticipant operatingParticipant;

    /**
     * This is true if the Operating Participant reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean operatingParticipantESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected OperatingShareImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getOperatingShare();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getPercentage() {
        return percentage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setPercentage( Float newPercentage ) {
        Float oldPercentage = percentage;
        percentage = newPercentage;
        boolean oldPercentageESet = percentageESet;
        percentageESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.OPERATING_SHARE__PERCENTAGE, oldPercentage, percentage, !oldPercentageESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetPercentage() {
        Float oldPercentage = percentage;
        boolean oldPercentageESet = percentageESet;
        percentage = PERCENTAGE_EDEFAULT;
        percentageESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.OPERATING_SHARE__PERCENTAGE, oldPercentage, PERCENTAGE_EDEFAULT, oldPercentageESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPercentage() {
        return percentageESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public PowerSystemResource getPowerSystemResource() {
        return powerSystemResource;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetPowerSystemResource( PowerSystemResource newPowerSystemResource,
            NotificationChain msgs ) {
        PowerSystemResource oldPowerSystemResource = powerSystemResource;
        powerSystemResource = newPowerSystemResource;
        boolean oldPowerSystemResourceESet = powerSystemResourceESet;
        powerSystemResourceESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.OPERATING_SHARE__POWER_SYSTEM_RESOURCE, oldPowerSystemResource, newPowerSystemResource,
                    !oldPowerSystemResourceESet );
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
    public void setPowerSystemResource( PowerSystemResource newPowerSystemResource ) {
        if( newPowerSystemResource != powerSystemResource ) {
            NotificationChain msgs = null;
            if( powerSystemResource != null ) msgs = ( ( InternalEObject ) powerSystemResource ).eInverseRemove( this,
                    CimPackage.POWER_SYSTEM_RESOURCE__OPERATING_SHARE, PowerSystemResource.class, msgs );
            if( newPowerSystemResource != null )
                msgs = ( ( InternalEObject ) newPowerSystemResource ).eInverseAdd( this,
                        CimPackage.POWER_SYSTEM_RESOURCE__OPERATING_SHARE, PowerSystemResource.class, msgs );
            msgs = basicSetPowerSystemResource( newPowerSystemResource, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldPowerSystemResourceESet = powerSystemResourceESet;
            powerSystemResourceESet = true;
            if( eNotificationRequired() ) eNotify(
                    new ENotificationImpl( this, Notification.SET, CimPackage.OPERATING_SHARE__POWER_SYSTEM_RESOURCE,
                            newPowerSystemResource, newPowerSystemResource, !oldPowerSystemResourceESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetPowerSystemResource( NotificationChain msgs ) {
        PowerSystemResource oldPowerSystemResource = powerSystemResource;
        powerSystemResource = null;
        boolean oldPowerSystemResourceESet = powerSystemResourceESet;
        powerSystemResourceESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.OPERATING_SHARE__POWER_SYSTEM_RESOURCE, oldPowerSystemResource, null,
                    oldPowerSystemResourceESet );
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
    public void unsetPowerSystemResource() {
        if( powerSystemResource != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) powerSystemResource ).eInverseRemove( this,
                    CimPackage.POWER_SYSTEM_RESOURCE__OPERATING_SHARE, PowerSystemResource.class, msgs );
            msgs = basicUnsetPowerSystemResource( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldPowerSystemResourceESet = powerSystemResourceESet;
            powerSystemResourceESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.OPERATING_SHARE__POWER_SYSTEM_RESOURCE, null, null, oldPowerSystemResourceESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPowerSystemResource() {
        return powerSystemResourceESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public OperatingParticipant getOperatingParticipant() {
        return operatingParticipant;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetOperatingParticipant( OperatingParticipant newOperatingParticipant,
            NotificationChain msgs ) {
        OperatingParticipant oldOperatingParticipant = operatingParticipant;
        operatingParticipant = newOperatingParticipant;
        boolean oldOperatingParticipantESet = operatingParticipantESet;
        operatingParticipantESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.OPERATING_SHARE__OPERATING_PARTICIPANT, oldOperatingParticipant, newOperatingParticipant,
                    !oldOperatingParticipantESet );
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
    public void setOperatingParticipant( OperatingParticipant newOperatingParticipant ) {
        if( newOperatingParticipant != operatingParticipant ) {
            NotificationChain msgs = null;
            if( operatingParticipant != null ) msgs = ( ( InternalEObject ) operatingParticipant ).eInverseRemove( this,
                    CimPackage.OPERATING_PARTICIPANT__OPERATING_SHARE, OperatingParticipant.class, msgs );
            if( newOperatingParticipant != null )
                msgs = ( ( InternalEObject ) newOperatingParticipant ).eInverseAdd( this,
                        CimPackage.OPERATING_PARTICIPANT__OPERATING_SHARE, OperatingParticipant.class, msgs );
            msgs = basicSetOperatingParticipant( newOperatingParticipant, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldOperatingParticipantESet = operatingParticipantESet;
            operatingParticipantESet = true;
            if( eNotificationRequired() ) eNotify(
                    new ENotificationImpl( this, Notification.SET, CimPackage.OPERATING_SHARE__OPERATING_PARTICIPANT,
                            newOperatingParticipant, newOperatingParticipant, !oldOperatingParticipantESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetOperatingParticipant( NotificationChain msgs ) {
        OperatingParticipant oldOperatingParticipant = operatingParticipant;
        operatingParticipant = null;
        boolean oldOperatingParticipantESet = operatingParticipantESet;
        operatingParticipantESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.OPERATING_SHARE__OPERATING_PARTICIPANT, oldOperatingParticipant, null,
                    oldOperatingParticipantESet );
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
    public void unsetOperatingParticipant() {
        if( operatingParticipant != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) operatingParticipant ).eInverseRemove( this,
                    CimPackage.OPERATING_PARTICIPANT__OPERATING_SHARE, OperatingParticipant.class, msgs );
            msgs = basicUnsetOperatingParticipant( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldOperatingParticipantESet = operatingParticipantESet;
            operatingParticipantESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.OPERATING_SHARE__OPERATING_PARTICIPANT, null, null, oldOperatingParticipantESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetOperatingParticipant() {
        return operatingParticipantESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.OPERATING_SHARE__POWER_SYSTEM_RESOURCE:
            if( powerSystemResource != null ) msgs = ( ( InternalEObject ) powerSystemResource ).eInverseRemove( this,
                    CimPackage.POWER_SYSTEM_RESOURCE__OPERATING_SHARE, PowerSystemResource.class, msgs );
            return basicSetPowerSystemResource( ( PowerSystemResource ) otherEnd, msgs );
        case CimPackage.OPERATING_SHARE__OPERATING_PARTICIPANT:
            if( operatingParticipant != null ) msgs = ( ( InternalEObject ) operatingParticipant ).eInverseRemove( this,
                    CimPackage.OPERATING_PARTICIPANT__OPERATING_SHARE, OperatingParticipant.class, msgs );
            return basicSetOperatingParticipant( ( OperatingParticipant ) otherEnd, msgs );
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
        case CimPackage.OPERATING_SHARE__POWER_SYSTEM_RESOURCE:
            return basicUnsetPowerSystemResource( msgs );
        case CimPackage.OPERATING_SHARE__OPERATING_PARTICIPANT:
            return basicUnsetOperatingParticipant( msgs );
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
        case CimPackage.OPERATING_SHARE__PERCENTAGE:
            return getPercentage();
        case CimPackage.OPERATING_SHARE__POWER_SYSTEM_RESOURCE:
            return getPowerSystemResource();
        case CimPackage.OPERATING_SHARE__OPERATING_PARTICIPANT:
            return getOperatingParticipant();
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
        case CimPackage.OPERATING_SHARE__PERCENTAGE:
            setPercentage( ( Float ) newValue );
            return;
        case CimPackage.OPERATING_SHARE__POWER_SYSTEM_RESOURCE:
            setPowerSystemResource( ( PowerSystemResource ) newValue );
            return;
        case CimPackage.OPERATING_SHARE__OPERATING_PARTICIPANT:
            setOperatingParticipant( ( OperatingParticipant ) newValue );
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
        case CimPackage.OPERATING_SHARE__PERCENTAGE:
            unsetPercentage();
            return;
        case CimPackage.OPERATING_SHARE__POWER_SYSTEM_RESOURCE:
            unsetPowerSystemResource();
            return;
        case CimPackage.OPERATING_SHARE__OPERATING_PARTICIPANT:
            unsetOperatingParticipant();
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
        case CimPackage.OPERATING_SHARE__PERCENTAGE:
            return isSetPercentage();
        case CimPackage.OPERATING_SHARE__POWER_SYSTEM_RESOURCE:
            return isSetPowerSystemResource();
        case CimPackage.OPERATING_SHARE__OPERATING_PARTICIPANT:
            return isSetOperatingParticipant();
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
        result.append( " (percentage: " );
        if( percentageESet )
            result.append( percentage );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //OperatingShareImpl
