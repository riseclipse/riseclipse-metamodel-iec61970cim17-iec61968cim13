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

import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CIGREStandard;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CIGREStandardEditionKind;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CIGREStandardKind;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIGRE Standard</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.CIGREStandardImpl#getStandardEdition <em>Standard Edition</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.CIGREStandardImpl#getStandardNumber <em>Standard Number</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIGREStandardImpl extends MinimalEObjectImpl.Container implements CIGREStandard {
    /**
     * The default value of the '{@link #getStandardEdition() <em>Standard Edition</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getStandardEdition()
     * @generated
     * @ordered
     */
    protected static final CIGREStandardEditionKind STANDARD_EDITION_EDEFAULT = CIGREStandardEditionKind.NONE;

    /**
     * The cached value of the '{@link #getStandardEdition() <em>Standard Edition</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getStandardEdition()
     * @generated
     * @ordered
     */
    protected CIGREStandardEditionKind standardEdition = STANDARD_EDITION_EDEFAULT;

    /**
     * This is true if the Standard Edition attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean standardEditionESet;

    /**
     * The default value of the '{@link #getStandardNumber() <em>Standard Number</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getStandardNumber()
     * @generated
     * @ordered
     */
    protected static final CIGREStandardKind STANDARD_NUMBER_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getStandardNumber() <em>Standard Number</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getStandardNumber()
     * @generated
     * @ordered
     */
    protected CIGREStandardKind standardNumber = STANDARD_NUMBER_EDEFAULT;

    /**
     * This is true if the Standard Number attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean standardNumberESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected CIGREStandardImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getCIGREStandard();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public CIGREStandardEditionKind getStandardEdition() {
        return standardEdition;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setStandardEdition( CIGREStandardEditionKind newStandardEdition ) {
        CIGREStandardEditionKind oldStandardEdition = standardEdition;
        standardEdition = newStandardEdition == null ? STANDARD_EDITION_EDEFAULT : newStandardEdition;
        boolean oldStandardEditionESet = standardEditionESet;
        standardEditionESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.CIGRE_STANDARD__STANDARD_EDITION,
                    oldStandardEdition, standardEdition, !oldStandardEditionESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetStandardEdition() {
        CIGREStandardEditionKind oldStandardEdition = standardEdition;
        boolean oldStandardEditionESet = standardEditionESet;
        standardEdition = STANDARD_EDITION_EDEFAULT;
        standardEditionESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.CIGRE_STANDARD__STANDARD_EDITION,
                    oldStandardEdition, STANDARD_EDITION_EDEFAULT, oldStandardEditionESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetStandardEdition() {
        return standardEditionESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public CIGREStandardKind getStandardNumber() {
        return standardNumber;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setStandardNumber( CIGREStandardKind newStandardNumber ) {
        CIGREStandardKind oldStandardNumber = standardNumber;
        standardNumber = newStandardNumber == null ? STANDARD_NUMBER_EDEFAULT : newStandardNumber;
        boolean oldStandardNumberESet = standardNumberESet;
        standardNumberESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.CIGRE_STANDARD__STANDARD_NUMBER,
                    oldStandardNumber, standardNumber, !oldStandardNumberESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetStandardNumber() {
        CIGREStandardKind oldStandardNumber = standardNumber;
        boolean oldStandardNumberESet = standardNumberESet;
        standardNumber = STANDARD_NUMBER_EDEFAULT;
        standardNumberESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.CIGRE_STANDARD__STANDARD_NUMBER,
                    oldStandardNumber, STANDARD_NUMBER_EDEFAULT, oldStandardNumberESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetStandardNumber() {
        return standardNumberESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch( featureID ) {
        case CimPackage.CIGRE_STANDARD__STANDARD_EDITION:
            return getStandardEdition();
        case CimPackage.CIGRE_STANDARD__STANDARD_NUMBER:
            return getStandardNumber();
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
        case CimPackage.CIGRE_STANDARD__STANDARD_EDITION:
            setStandardEdition( ( CIGREStandardEditionKind ) newValue );
            return;
        case CimPackage.CIGRE_STANDARD__STANDARD_NUMBER:
            setStandardNumber( ( CIGREStandardKind ) newValue );
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
        case CimPackage.CIGRE_STANDARD__STANDARD_EDITION:
            unsetStandardEdition();
            return;
        case CimPackage.CIGRE_STANDARD__STANDARD_NUMBER:
            unsetStandardNumber();
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
        case CimPackage.CIGRE_STANDARD__STANDARD_EDITION:
            return isSetStandardEdition();
        case CimPackage.CIGRE_STANDARD__STANDARD_NUMBER:
            return isSetStandardNumber();
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
        result.append( " (standardEdition: " );
        if( standardEditionESet )
            result.append( standardEdition );
        else
            result.append( "<unset>" );
        result.append( ", standardNumber: " );
        if( standardNumberESet )
            result.append( standardNumber );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //CIGREStandardImpl
