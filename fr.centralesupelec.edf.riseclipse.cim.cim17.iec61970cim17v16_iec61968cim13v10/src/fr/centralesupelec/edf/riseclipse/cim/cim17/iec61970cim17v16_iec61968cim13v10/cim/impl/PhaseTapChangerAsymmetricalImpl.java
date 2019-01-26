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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PhaseTapChangerAsymmetrical;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Phase Tap Changer Asymmetrical</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PhaseTapChangerAsymmetricalImpl#getWindingConnectionAngle <em>Winding Connection Angle</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PhaseTapChangerAsymmetricalImpl extends PhaseTapChangerNonLinearImpl
        implements PhaseTapChangerAsymmetrical {
    /**
     * The default value of the '{@link #getWindingConnectionAngle() <em>Winding Connection Angle</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getWindingConnectionAngle()
     * @generated
     * @ordered
     */
    protected static final Float WINDING_CONNECTION_ANGLE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getWindingConnectionAngle() <em>Winding Connection Angle</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getWindingConnectionAngle()
     * @generated
     * @ordered
     */
    protected Float windingConnectionAngle = WINDING_CONNECTION_ANGLE_EDEFAULT;

    /**
     * This is true if the Winding Connection Angle attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean windingConnectionAngleESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected PhaseTapChangerAsymmetricalImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getPhaseTapChangerAsymmetrical();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getWindingConnectionAngle() {
        return windingConnectionAngle;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setWindingConnectionAngle( Float newWindingConnectionAngle ) {
        Float oldWindingConnectionAngle = windingConnectionAngle;
        windingConnectionAngle = newWindingConnectionAngle;
        boolean oldWindingConnectionAngleESet = windingConnectionAngleESet;
        windingConnectionAngleESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.PHASE_TAP_CHANGER_ASYMMETRICAL__WINDING_CONNECTION_ANGLE, oldWindingConnectionAngle,
                windingConnectionAngle, !oldWindingConnectionAngleESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetWindingConnectionAngle() {
        Float oldWindingConnectionAngle = windingConnectionAngle;
        boolean oldWindingConnectionAngleESet = windingConnectionAngleESet;
        windingConnectionAngle = WINDING_CONNECTION_ANGLE_EDEFAULT;
        windingConnectionAngleESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.PHASE_TAP_CHANGER_ASYMMETRICAL__WINDING_CONNECTION_ANGLE, oldWindingConnectionAngle,
                WINDING_CONNECTION_ANGLE_EDEFAULT, oldWindingConnectionAngleESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetWindingConnectionAngle() {
        return windingConnectionAngleESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch( featureID ) {
        case CimPackage.PHASE_TAP_CHANGER_ASYMMETRICAL__WINDING_CONNECTION_ANGLE:
            return getWindingConnectionAngle();
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
        case CimPackage.PHASE_TAP_CHANGER_ASYMMETRICAL__WINDING_CONNECTION_ANGLE:
            setWindingConnectionAngle( ( Float ) newValue );
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
        case CimPackage.PHASE_TAP_CHANGER_ASYMMETRICAL__WINDING_CONNECTION_ANGLE:
            unsetWindingConnectionAngle();
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
        case CimPackage.PHASE_TAP_CHANGER_ASYMMETRICAL__WINDING_CONNECTION_ANGLE:
            return isSetWindingConnectionAngle();
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
        result.append( " (windingConnectionAngle: " );
        if( windingConnectionAngleESet )
            result.append( windingConnectionAngle );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //PhaseTapChangerAsymmetricalImpl
