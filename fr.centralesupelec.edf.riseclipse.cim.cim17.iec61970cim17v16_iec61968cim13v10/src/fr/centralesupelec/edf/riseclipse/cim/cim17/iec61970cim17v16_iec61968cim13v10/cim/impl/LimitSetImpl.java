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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LimitSet;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Limit Set</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.LimitSetImpl#getIsPercentageLimits <em>Is Percentage Limits</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LimitSetImpl extends IdentifiedObjectImpl implements LimitSet {
    /**
     * The default value of the '{@link #getIsPercentageLimits() <em>Is Percentage Limits</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIsPercentageLimits()
     * @generated
     * @ordered
     */
    protected static final Boolean IS_PERCENTAGE_LIMITS_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getIsPercentageLimits() <em>Is Percentage Limits</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIsPercentageLimits()
     * @generated
     * @ordered
     */
    protected Boolean isPercentageLimits = IS_PERCENTAGE_LIMITS_EDEFAULT;

    /**
     * This is true if the Is Percentage Limits attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean isPercentageLimitsESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected LimitSetImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getLimitSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getIsPercentageLimits() {
        return isPercentageLimits;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setIsPercentageLimits( Boolean newIsPercentageLimits ) {
        Boolean oldIsPercentageLimits = isPercentageLimits;
        isPercentageLimits = newIsPercentageLimits;
        boolean oldIsPercentageLimitsESet = isPercentageLimitsESet;
        isPercentageLimitsESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.LIMIT_SET__IS_PERCENTAGE_LIMITS,
                    oldIsPercentageLimits, isPercentageLimits, !oldIsPercentageLimitsESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetIsPercentageLimits() {
        Boolean oldIsPercentageLimits = isPercentageLimits;
        boolean oldIsPercentageLimitsESet = isPercentageLimitsESet;
        isPercentageLimits = IS_PERCENTAGE_LIMITS_EDEFAULT;
        isPercentageLimitsESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.LIMIT_SET__IS_PERCENTAGE_LIMITS,
                    oldIsPercentageLimits, IS_PERCENTAGE_LIMITS_EDEFAULT, oldIsPercentageLimitsESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetIsPercentageLimits() {
        return isPercentageLimitsESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch( featureID ) {
        case CimPackage.LIMIT_SET__IS_PERCENTAGE_LIMITS:
            return getIsPercentageLimits();
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
        case CimPackage.LIMIT_SET__IS_PERCENTAGE_LIMITS:
            setIsPercentageLimits( ( Boolean ) newValue );
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
        case CimPackage.LIMIT_SET__IS_PERCENTAGE_LIMITS:
            unsetIsPercentageLimits();
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
        case CimPackage.LIMIT_SET__IS_PERCENTAGE_LIMITS:
            return isSetIsPercentageLimits();
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
        result.append( " (isPercentageLimits: " );
        if( isPercentageLimitsESet )
            result.append( isPercentageLimits );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //LimitSetImpl
