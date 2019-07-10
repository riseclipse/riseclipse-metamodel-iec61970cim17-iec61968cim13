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

import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Agreement;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DateTimeInterval;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Agreement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.AgreementImpl#getSignDate <em>Sign Date</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.AgreementImpl#getValidityInterval <em>Validity Interval</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AgreementImpl extends DocumentImpl implements Agreement {
    /**
     * The default value of the '{@link #getSignDate() <em>Sign Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSignDate()
     * @generated
     * @ordered
     */
    protected static final Date SIGN_DATE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSignDate() <em>Sign Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSignDate()
     * @generated
     * @ordered
     */
    protected Date signDate = SIGN_DATE_EDEFAULT;

    /**
     * This is true if the Sign Date attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean signDateESet;

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
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected AgreementImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getAgreement();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Date getSignDate() {
        return signDate;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setSignDate( Date newSignDate ) {
        Date oldSignDate = signDate;
        signDate = newSignDate;
        boolean oldSignDateESet = signDateESet;
        signDateESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.AGREEMENT__SIGN_DATE, oldSignDate, signDate, !oldSignDateESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetSignDate() {
        Date oldSignDate = signDate;
        boolean oldSignDateESet = signDateESet;
        signDate = SIGN_DATE_EDEFAULT;
        signDateESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.AGREEMENT__SIGN_DATE, oldSignDate, SIGN_DATE_EDEFAULT, oldSignDateESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetSignDate() {
        return signDateESet;
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
                    CimPackage.AGREEMENT__VALIDITY_INTERVAL, oldValidityInterval, newValidityInterval,
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
                    EOPPOSITE_FEATURE_BASE - CimPackage.AGREEMENT__VALIDITY_INTERVAL, null, msgs );
            if( newValidityInterval != null ) msgs = ( ( InternalEObject ) newValidityInterval ).eInverseAdd( this,
                    EOPPOSITE_FEATURE_BASE - CimPackage.AGREEMENT__VALIDITY_INTERVAL, null, msgs );
            msgs = basicSetValidityInterval( newValidityInterval, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldValidityIntervalESet = validityIntervalESet;
            validityIntervalESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.AGREEMENT__VALIDITY_INTERVAL,
                        newValidityInterval, newValidityInterval, !oldValidityIntervalESet ) );
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
                    CimPackage.AGREEMENT__VALIDITY_INTERVAL, oldValidityInterval, null, oldValidityIntervalESet );
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
                    EOPPOSITE_FEATURE_BASE - CimPackage.AGREEMENT__VALIDITY_INTERVAL, null, msgs );
            msgs = basicUnsetValidityInterval( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldValidityIntervalESet = validityIntervalESet;
            validityIntervalESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.AGREEMENT__VALIDITY_INTERVAL, null, null, oldValidityIntervalESet ) );
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
    public NotificationChain eInverseRemove( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.AGREEMENT__VALIDITY_INTERVAL:
            return basicUnsetValidityInterval( msgs );
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
        case CimPackage.AGREEMENT__SIGN_DATE:
            return getSignDate();
        case CimPackage.AGREEMENT__VALIDITY_INTERVAL:
            return getValidityInterval();
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
        case CimPackage.AGREEMENT__SIGN_DATE:
            setSignDate( ( Date ) newValue );
            return;
        case CimPackage.AGREEMENT__VALIDITY_INTERVAL:
            setValidityInterval( ( DateTimeInterval ) newValue );
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
        case CimPackage.AGREEMENT__SIGN_DATE:
            unsetSignDate();
            return;
        case CimPackage.AGREEMENT__VALIDITY_INTERVAL:
            unsetValidityInterval();
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
        case CimPackage.AGREEMENT__SIGN_DATE:
            return isSetSignDate();
        case CimPackage.AGREEMENT__VALIDITY_INTERVAL:
            return isSetValidityInterval();
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
        result.append( " (signDate: " );
        if( signDateESet )
            result.append( signDate );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //AgreementImpl
