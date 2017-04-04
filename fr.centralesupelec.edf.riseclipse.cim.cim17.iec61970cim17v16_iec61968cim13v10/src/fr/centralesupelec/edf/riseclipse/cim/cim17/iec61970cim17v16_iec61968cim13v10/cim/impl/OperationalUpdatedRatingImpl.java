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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OperationalUpdatedRating;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Outage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operational Updated Rating</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.OperationalUpdatedRatingImpl#getChangeType <em>Change Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.OperationalUpdatedRatingImpl#getPlannedOutage <em>Planned Outage</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OperationalUpdatedRatingImpl extends OperationalRestrictionImpl implements OperationalUpdatedRating {
    /**
     * The default value of the '{@link #getChangeType() <em>Change Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getChangeType()
     * @generated
     * @ordered
     */
    protected static final String CHANGE_TYPE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getChangeType() <em>Change Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getChangeType()
     * @generated
     * @ordered
     */
    protected String changeType = CHANGE_TYPE_EDEFAULT;

    /**
     * This is true if the Change Type attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean changeTypeESet;

    /**
     * The cached value of the '{@link #getPlannedOutage() <em>Planned Outage</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPlannedOutage()
     * @generated
     * @ordered
     */
    protected Outage plannedOutage;

    /**
     * This is true if the Planned Outage reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean plannedOutageESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected OperationalUpdatedRatingImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getOperationalUpdatedRating();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getChangeType() {
        return changeType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setChangeType( String newChangeType ) {
        String oldChangeType = changeType;
        changeType = newChangeType;
        boolean oldChangeTypeESet = changeTypeESet;
        changeTypeESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.OPERATIONAL_UPDATED_RATING__CHANGE_TYPE, oldChangeType, changeType, !oldChangeTypeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetChangeType() {
        String oldChangeType = changeType;
        boolean oldChangeTypeESet = changeTypeESet;
        changeType = CHANGE_TYPE_EDEFAULT;
        changeTypeESet = false;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.UNSET, CimPackage.OPERATIONAL_UPDATED_RATING__CHANGE_TYPE,
                        oldChangeType, CHANGE_TYPE_EDEFAULT, oldChangeTypeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetChangeType() {
        return changeTypeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Outage getPlannedOutage() {
        return plannedOutage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetPlannedOutage( Outage newPlannedOutage, NotificationChain msgs ) {
        Outage oldPlannedOutage = plannedOutage;
        plannedOutage = newPlannedOutage;
        boolean oldPlannedOutageESet = plannedOutageESet;
        plannedOutageESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.OPERATIONAL_UPDATED_RATING__PLANNED_OUTAGE, oldPlannedOutage, newPlannedOutage,
                    !oldPlannedOutageESet );
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
    public void setPlannedOutage( Outage newPlannedOutage ) {
        if( newPlannedOutage != plannedOutage ) {
            NotificationChain msgs = null;
            if( plannedOutage != null ) msgs = ( ( InternalEObject ) plannedOutage ).eInverseRemove( this,
                    CimPackage.OUTAGE__UPDATED_RATINGS, Outage.class, msgs );
            if( newPlannedOutage != null ) msgs = ( ( InternalEObject ) newPlannedOutage ).eInverseAdd( this,
                    CimPackage.OUTAGE__UPDATED_RATINGS, Outage.class, msgs );
            msgs = basicSetPlannedOutage( newPlannedOutage, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldPlannedOutageESet = plannedOutageESet;
            plannedOutageESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.OPERATIONAL_UPDATED_RATING__PLANNED_OUTAGE, newPlannedOutage, newPlannedOutage,
                    !oldPlannedOutageESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetPlannedOutage( NotificationChain msgs ) {
        Outage oldPlannedOutage = plannedOutage;
        plannedOutage = null;
        boolean oldPlannedOutageESet = plannedOutageESet;
        plannedOutageESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.OPERATIONAL_UPDATED_RATING__PLANNED_OUTAGE, oldPlannedOutage, null,
                    oldPlannedOutageESet );
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
    public void unsetPlannedOutage() {
        if( plannedOutage != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) plannedOutage ).eInverseRemove( this, CimPackage.OUTAGE__UPDATED_RATINGS,
                    Outage.class, msgs );
            msgs = basicUnsetPlannedOutage( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldPlannedOutageESet = plannedOutageESet;
            plannedOutageESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.OPERATIONAL_UPDATED_RATING__PLANNED_OUTAGE, null, null, oldPlannedOutageESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPlannedOutage() {
        return plannedOutageESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.OPERATIONAL_UPDATED_RATING__PLANNED_OUTAGE:
            if( plannedOutage != null ) msgs = ( ( InternalEObject ) plannedOutage ).eInverseRemove( this,
                    CimPackage.OUTAGE__UPDATED_RATINGS, Outage.class, msgs );
            return basicSetPlannedOutage( ( Outage ) otherEnd, msgs );
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
        case CimPackage.OPERATIONAL_UPDATED_RATING__PLANNED_OUTAGE:
            return basicUnsetPlannedOutage( msgs );
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
        case CimPackage.OPERATIONAL_UPDATED_RATING__CHANGE_TYPE:
            return getChangeType();
        case CimPackage.OPERATIONAL_UPDATED_RATING__PLANNED_OUTAGE:
            return getPlannedOutage();
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
        case CimPackage.OPERATIONAL_UPDATED_RATING__CHANGE_TYPE:
            setChangeType( ( String ) newValue );
            return;
        case CimPackage.OPERATIONAL_UPDATED_RATING__PLANNED_OUTAGE:
            setPlannedOutage( ( Outage ) newValue );
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
        case CimPackage.OPERATIONAL_UPDATED_RATING__CHANGE_TYPE:
            unsetChangeType();
            return;
        case CimPackage.OPERATIONAL_UPDATED_RATING__PLANNED_OUTAGE:
            unsetPlannedOutage();
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
        case CimPackage.OPERATIONAL_UPDATED_RATING__CHANGE_TYPE:
            return isSetChangeType();
        case CimPackage.OPERATIONAL_UPDATED_RATING__PLANNED_OUTAGE:
            return isSetPlannedOutage();
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
        result.append( " (changeType: " );
        if( changeTypeESet )
            result.append( changeType );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //OperationalUpdatedRatingImpl
