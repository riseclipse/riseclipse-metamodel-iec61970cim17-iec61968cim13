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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ReadingInterharmonic;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reading Interharmonic</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ReadingInterharmonicImpl#getDenominator <em>Denominator</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ReadingInterharmonicImpl#getNumerator <em>Numerator</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReadingInterharmonicImpl extends MinimalEObjectImpl.Container implements ReadingInterharmonic {
    /**
     * The default value of the '{@link #getDenominator() <em>Denominator</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDenominator()
     * @generated
     * @ordered
     */
    protected static final Integer DENOMINATOR_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDenominator() <em>Denominator</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDenominator()
     * @generated
     * @ordered
     */
    protected Integer denominator = DENOMINATOR_EDEFAULT;

    /**
     * This is true if the Denominator attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean denominatorESet;

    /**
     * The default value of the '{@link #getNumerator() <em>Numerator</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNumerator()
     * @generated
     * @ordered
     */
    protected static final Integer NUMERATOR_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getNumerator() <em>Numerator</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNumerator()
     * @generated
     * @ordered
     */
    protected Integer numerator = NUMERATOR_EDEFAULT;

    /**
     * This is true if the Numerator attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean numeratorESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ReadingInterharmonicImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getReadingInterharmonic();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Integer getDenominator() {
        return denominator;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setDenominator( Integer newDenominator ) {
        Integer oldDenominator = denominator;
        denominator = newDenominator;
        boolean oldDenominatorESet = denominatorESet;
        denominatorESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.READING_INTERHARMONIC__DENOMINATOR, oldDenominator, denominator, !oldDenominatorESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetDenominator() {
        Integer oldDenominator = denominator;
        boolean oldDenominatorESet = denominatorESet;
        denominator = DENOMINATOR_EDEFAULT;
        denominatorESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.READING_INTERHARMONIC__DENOMINATOR,
                    oldDenominator, DENOMINATOR_EDEFAULT, oldDenominatorESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetDenominator() {
        return denominatorESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Integer getNumerator() {
        return numerator;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setNumerator( Integer newNumerator ) {
        Integer oldNumerator = numerator;
        numerator = newNumerator;
        boolean oldNumeratorESet = numeratorESet;
        numeratorESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.READING_INTERHARMONIC__NUMERATOR, oldNumerator, numerator, !oldNumeratorESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetNumerator() {
        Integer oldNumerator = numerator;
        boolean oldNumeratorESet = numeratorESet;
        numerator = NUMERATOR_EDEFAULT;
        numeratorESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.READING_INTERHARMONIC__NUMERATOR, oldNumerator, NUMERATOR_EDEFAULT, oldNumeratorESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetNumerator() {
        return numeratorESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch( featureID ) {
        case CimPackage.READING_INTERHARMONIC__DENOMINATOR:
            return getDenominator();
        case CimPackage.READING_INTERHARMONIC__NUMERATOR:
            return getNumerator();
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
        case CimPackage.READING_INTERHARMONIC__DENOMINATOR:
            setDenominator( ( Integer ) newValue );
            return;
        case CimPackage.READING_INTERHARMONIC__NUMERATOR:
            setNumerator( ( Integer ) newValue );
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
        case CimPackage.READING_INTERHARMONIC__DENOMINATOR:
            unsetDenominator();
            return;
        case CimPackage.READING_INTERHARMONIC__NUMERATOR:
            unsetNumerator();
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
        case CimPackage.READING_INTERHARMONIC__DENOMINATOR:
            return isSetDenominator();
        case CimPackage.READING_INTERHARMONIC__NUMERATOR:
            return isSetNumerator();
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
        result.append( " (denominator: " );
        if( denominatorESet )
            result.append( denominator );
        else
            result.append( "<unset>" );
        result.append( ", numerator: " );
        if( numeratorESet )
            result.append( numerator );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //ReadingInterharmonicImpl
