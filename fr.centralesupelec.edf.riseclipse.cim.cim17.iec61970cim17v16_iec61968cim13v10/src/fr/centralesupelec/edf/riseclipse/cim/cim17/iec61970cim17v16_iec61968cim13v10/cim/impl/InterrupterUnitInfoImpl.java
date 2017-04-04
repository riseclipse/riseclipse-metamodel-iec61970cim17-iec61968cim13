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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.InterrupterUnitInfo;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.InterruptingMediumKind;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interrupter Unit Info</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.InterrupterUnitInfoImpl#getInterruptingMedium <em>Interrupting Medium</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InterrupterUnitInfoImpl extends AssetInfoImpl implements InterrupterUnitInfo {
    /**
     * The default value of the '{@link #getInterruptingMedium() <em>Interrupting Medium</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInterruptingMedium()
     * @generated
     * @ordered
     */
    protected static final InterruptingMediumKind INTERRUPTING_MEDIUM_EDEFAULT = InterruptingMediumKind.AIR_BLAST;

    /**
     * The cached value of the '{@link #getInterruptingMedium() <em>Interrupting Medium</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInterruptingMedium()
     * @generated
     * @ordered
     */
    protected InterruptingMediumKind interruptingMedium = INTERRUPTING_MEDIUM_EDEFAULT;

    /**
     * This is true if the Interrupting Medium attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean interruptingMediumESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected InterrupterUnitInfoImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getInterrupterUnitInfo();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public InterruptingMediumKind getInterruptingMedium() {
        return interruptingMedium;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setInterruptingMedium( InterruptingMediumKind newInterruptingMedium ) {
        InterruptingMediumKind oldInterruptingMedium = interruptingMedium;
        interruptingMedium = newInterruptingMedium == null ? INTERRUPTING_MEDIUM_EDEFAULT : newInterruptingMedium;
        boolean oldInterruptingMediumESet = interruptingMediumESet;
        interruptingMediumESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.INTERRUPTER_UNIT_INFO__INTERRUPTING_MEDIUM,
                        oldInterruptingMedium, interruptingMedium, !oldInterruptingMediumESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetInterruptingMedium() {
        InterruptingMediumKind oldInterruptingMedium = interruptingMedium;
        boolean oldInterruptingMediumESet = interruptingMediumESet;
        interruptingMedium = INTERRUPTING_MEDIUM_EDEFAULT;
        interruptingMediumESet = false;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.UNSET, CimPackage.INTERRUPTER_UNIT_INFO__INTERRUPTING_MEDIUM,
                        oldInterruptingMedium, INTERRUPTING_MEDIUM_EDEFAULT, oldInterruptingMediumESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetInterruptingMedium() {
        return interruptingMediumESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch( featureID ) {
        case CimPackage.INTERRUPTER_UNIT_INFO__INTERRUPTING_MEDIUM:
            return getInterruptingMedium();
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
        case CimPackage.INTERRUPTER_UNIT_INFO__INTERRUPTING_MEDIUM:
            setInterruptingMedium( ( InterruptingMediumKind ) newValue );
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
        case CimPackage.INTERRUPTER_UNIT_INFO__INTERRUPTING_MEDIUM:
            unsetInterruptingMedium();
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
        case CimPackage.INTERRUPTER_UNIT_INFO__INTERRUPTING_MEDIUM:
            return isSetInterruptingMedium();
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
        result.append( " (interruptingMedium: " );
        if( interruptingMediumESet )
            result.append( interruptingMedium );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //InterrupterUnitInfoImpl
