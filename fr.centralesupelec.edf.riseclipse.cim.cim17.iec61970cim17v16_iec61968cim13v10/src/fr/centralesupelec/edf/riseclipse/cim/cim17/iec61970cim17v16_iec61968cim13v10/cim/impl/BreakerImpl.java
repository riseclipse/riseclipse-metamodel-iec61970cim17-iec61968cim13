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

import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Breaker;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Breaker</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.BreakerImpl#getInTransitTime <em>In Transit Time</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BreakerImpl extends ProtectedSwitchImpl implements Breaker {
    /**
     * The default value of the '{@link #getInTransitTime() <em>In Transit Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInTransitTime()
     * @generated
     * @ordered
     */
    protected static final Float IN_TRANSIT_TIME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getInTransitTime() <em>In Transit Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInTransitTime()
     * @generated
     * @ordered
     */
    protected Float inTransitTime = IN_TRANSIT_TIME_EDEFAULT;

    /**
     * This is true if the In Transit Time attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean inTransitTimeESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected BreakerImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getBreaker();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getInTransitTime() {
        return inTransitTime;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setInTransitTime( Float newInTransitTime ) {
        Float oldInTransitTime = inTransitTime;
        inTransitTime = newInTransitTime;
        boolean oldInTransitTimeESet = inTransitTimeESet;
        inTransitTimeESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.BREAKER__IN_TRANSIT_TIME, oldInTransitTime, inTransitTime, !oldInTransitTimeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetInTransitTime() {
        Float oldInTransitTime = inTransitTime;
        boolean oldInTransitTimeESet = inTransitTimeESet;
        inTransitTime = IN_TRANSIT_TIME_EDEFAULT;
        inTransitTimeESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.BREAKER__IN_TRANSIT_TIME,
                    oldInTransitTime, IN_TRANSIT_TIME_EDEFAULT, oldInTransitTimeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetInTransitTime() {
        return inTransitTimeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch( featureID ) {
        case CimPackage.BREAKER__IN_TRANSIT_TIME:
            return getInTransitTime();
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
        case CimPackage.BREAKER__IN_TRANSIT_TIME:
            setInTransitTime( ( Float ) newValue );
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
        case CimPackage.BREAKER__IN_TRANSIT_TIME:
            unsetInTransitTime();
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
        case CimPackage.BREAKER__IN_TRANSIT_TIME:
            return isSetInTransitTime();
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
        result.append( " (inTransitTime: " );
        if( inTransitTimeESet )
            result.append( inTransitTime );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //BreakerImpl
