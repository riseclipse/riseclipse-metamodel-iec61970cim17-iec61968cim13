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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.InUseDate;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>In Use Date</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.InUseDateImpl#getInUseDate <em>In Use Date</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.InUseDateImpl#getNotReadyForUseDate <em>Not Ready For Use Date</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.InUseDateImpl#getReadyForUseDate <em>Ready For Use Date</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InUseDateImpl extends MinimalEObjectImpl.Container implements InUseDate {
    /**
     * The default value of the '{@link #getInUseDate() <em>In Use Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInUseDate()
     * @generated
     * @ordered
     */
    protected static final Date IN_USE_DATE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getInUseDate() <em>In Use Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInUseDate()
     * @generated
     * @ordered
     */
    protected Date inUseDate = IN_USE_DATE_EDEFAULT;

    /**
     * This is true if the In Use Date attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean inUseDateESet;

    /**
     * The default value of the '{@link #getNotReadyForUseDate() <em>Not Ready For Use Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNotReadyForUseDate()
     * @generated
     * @ordered
     */
    protected static final Date NOT_READY_FOR_USE_DATE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getNotReadyForUseDate() <em>Not Ready For Use Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNotReadyForUseDate()
     * @generated
     * @ordered
     */
    protected Date notReadyForUseDate = NOT_READY_FOR_USE_DATE_EDEFAULT;

    /**
     * This is true if the Not Ready For Use Date attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean notReadyForUseDateESet;

    /**
     * The default value of the '{@link #getReadyForUseDate() <em>Ready For Use Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReadyForUseDate()
     * @generated
     * @ordered
     */
    protected static final Date READY_FOR_USE_DATE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getReadyForUseDate() <em>Ready For Use Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReadyForUseDate()
     * @generated
     * @ordered
     */
    protected Date readyForUseDate = READY_FOR_USE_DATE_EDEFAULT;

    /**
     * This is true if the Ready For Use Date attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean readyForUseDateESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected InUseDateImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getInUseDate();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Date getInUseDate() {
        return inUseDate;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setInUseDate( Date newInUseDate ) {
        Date oldInUseDate = inUseDate;
        inUseDate = newInUseDate;
        boolean oldInUseDateESet = inUseDateESet;
        inUseDateESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.IN_USE_DATE__IN_USE_DATE, oldInUseDate, inUseDate, !oldInUseDateESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetInUseDate() {
        Date oldInUseDate = inUseDate;
        boolean oldInUseDateESet = inUseDateESet;
        inUseDate = IN_USE_DATE_EDEFAULT;
        inUseDateESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.IN_USE_DATE__IN_USE_DATE, oldInUseDate, IN_USE_DATE_EDEFAULT, oldInUseDateESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetInUseDate() {
        return inUseDateESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Date getNotReadyForUseDate() {
        return notReadyForUseDate;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setNotReadyForUseDate( Date newNotReadyForUseDate ) {
        Date oldNotReadyForUseDate = notReadyForUseDate;
        notReadyForUseDate = newNotReadyForUseDate;
        boolean oldNotReadyForUseDateESet = notReadyForUseDateESet;
        notReadyForUseDateESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.IN_USE_DATE__NOT_READY_FOR_USE_DATE,
                    oldNotReadyForUseDate, notReadyForUseDate, !oldNotReadyForUseDateESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetNotReadyForUseDate() {
        Date oldNotReadyForUseDate = notReadyForUseDate;
        boolean oldNotReadyForUseDateESet = notReadyForUseDateESet;
        notReadyForUseDate = NOT_READY_FOR_USE_DATE_EDEFAULT;
        notReadyForUseDateESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.IN_USE_DATE__NOT_READY_FOR_USE_DATE,
                    oldNotReadyForUseDate, NOT_READY_FOR_USE_DATE_EDEFAULT, oldNotReadyForUseDateESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetNotReadyForUseDate() {
        return notReadyForUseDateESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Date getReadyForUseDate() {
        return readyForUseDate;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setReadyForUseDate( Date newReadyForUseDate ) {
        Date oldReadyForUseDate = readyForUseDate;
        readyForUseDate = newReadyForUseDate;
        boolean oldReadyForUseDateESet = readyForUseDateESet;
        readyForUseDateESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.IN_USE_DATE__READY_FOR_USE_DATE,
                    oldReadyForUseDate, readyForUseDate, !oldReadyForUseDateESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetReadyForUseDate() {
        Date oldReadyForUseDate = readyForUseDate;
        boolean oldReadyForUseDateESet = readyForUseDateESet;
        readyForUseDate = READY_FOR_USE_DATE_EDEFAULT;
        readyForUseDateESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.IN_USE_DATE__READY_FOR_USE_DATE,
                    oldReadyForUseDate, READY_FOR_USE_DATE_EDEFAULT, oldReadyForUseDateESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetReadyForUseDate() {
        return readyForUseDateESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch( featureID ) {
        case CimPackage.IN_USE_DATE__IN_USE_DATE:
            return getInUseDate();
        case CimPackage.IN_USE_DATE__NOT_READY_FOR_USE_DATE:
            return getNotReadyForUseDate();
        case CimPackage.IN_USE_DATE__READY_FOR_USE_DATE:
            return getReadyForUseDate();
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
        case CimPackage.IN_USE_DATE__IN_USE_DATE:
            setInUseDate( ( Date ) newValue );
            return;
        case CimPackage.IN_USE_DATE__NOT_READY_FOR_USE_DATE:
            setNotReadyForUseDate( ( Date ) newValue );
            return;
        case CimPackage.IN_USE_DATE__READY_FOR_USE_DATE:
            setReadyForUseDate( ( Date ) newValue );
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
        case CimPackage.IN_USE_DATE__IN_USE_DATE:
            unsetInUseDate();
            return;
        case CimPackage.IN_USE_DATE__NOT_READY_FOR_USE_DATE:
            unsetNotReadyForUseDate();
            return;
        case CimPackage.IN_USE_DATE__READY_FOR_USE_DATE:
            unsetReadyForUseDate();
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
        case CimPackage.IN_USE_DATE__IN_USE_DATE:
            return isSetInUseDate();
        case CimPackage.IN_USE_DATE__NOT_READY_FOR_USE_DATE:
            return isSetNotReadyForUseDate();
        case CimPackage.IN_USE_DATE__READY_FOR_USE_DATE:
            return isSetReadyForUseDate();
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
        result.append( " (inUseDate: " );
        if( inUseDateESet )
            result.append( inUseDate );
        else
            result.append( "<unset>" );
        result.append( ", notReadyForUseDate: " );
        if( notReadyForUseDateESet )
            result.append( notReadyForUseDate );
        else
            result.append( "<unset>" );
        result.append( ", readyForUseDate: " );
        if( readyForUseDateESet )
            result.append( readyForUseDate );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //InUseDateImpl
