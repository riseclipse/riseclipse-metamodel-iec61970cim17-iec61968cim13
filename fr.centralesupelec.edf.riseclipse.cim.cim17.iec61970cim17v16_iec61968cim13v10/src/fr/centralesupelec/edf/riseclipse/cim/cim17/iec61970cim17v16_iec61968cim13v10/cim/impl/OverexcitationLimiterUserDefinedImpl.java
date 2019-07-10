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

import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OverexcitationLimiterUserDefined;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ProprietaryParameterDynamics;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Overexcitation Limiter User Defined</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.OverexcitationLimiterUserDefinedImpl#getProprietary <em>Proprietary</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.OverexcitationLimiterUserDefinedImpl#getProprietaryParameterDynamics <em>Proprietary Parameter Dynamics</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OverexcitationLimiterUserDefinedImpl extends OverexcitationLimiterDynamicsImpl
        implements OverexcitationLimiterUserDefined {
    /**
     * The default value of the '{@link #getProprietary() <em>Proprietary</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getProprietary()
     * @generated
     * @ordered
     */
    protected static final Boolean PROPRIETARY_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getProprietary() <em>Proprietary</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getProprietary()
     * @generated
     * @ordered
     */
    protected Boolean proprietary = PROPRIETARY_EDEFAULT;

    /**
     * This is true if the Proprietary attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean proprietaryESet;

    /**
     * The cached value of the '{@link #getProprietaryParameterDynamics() <em>Proprietary Parameter Dynamics</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getProprietaryParameterDynamics()
     * @generated
     * @ordered
     */
    protected EList< ProprietaryParameterDynamics > proprietaryParameterDynamics;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected OverexcitationLimiterUserDefinedImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getOverexcitationLimiterUserDefined();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getProprietary() {
        return proprietary;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setProprietary( Boolean newProprietary ) {
        Boolean oldProprietary = proprietary;
        proprietary = newProprietary;
        boolean oldProprietaryESet = proprietaryESet;
        proprietaryESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.OVEREXCITATION_LIMITER_USER_DEFINED__PROPRIETARY, oldProprietary, proprietary,
                !oldProprietaryESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetProprietary() {
        Boolean oldProprietary = proprietary;
        boolean oldProprietaryESet = proprietaryESet;
        proprietary = PROPRIETARY_EDEFAULT;
        proprietaryESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.OVEREXCITATION_LIMITER_USER_DEFINED__PROPRIETARY, oldProprietary, PROPRIETARY_EDEFAULT,
                oldProprietaryESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetProprietary() {
        return proprietaryESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< ProprietaryParameterDynamics > getProprietaryParameterDynamics() {
        if( proprietaryParameterDynamics == null ) {
            proprietaryParameterDynamics = new EObjectWithInverseResolvingEList.Unsettable< ProprietaryParameterDynamics >(
                    ProprietaryParameterDynamics.class, this,
                    CimPackage.OVEREXCITATION_LIMITER_USER_DEFINED__PROPRIETARY_PARAMETER_DYNAMICS,
                    CimPackage.PROPRIETARY_PARAMETER_DYNAMICS__OVEREXCITATION_LIMITER_USER_DEFINED );
        }
        return proprietaryParameterDynamics;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetProprietaryParameterDynamics() {
        if( proprietaryParameterDynamics != null )
            ( ( InternalEList.Unsettable< ? > ) proprietaryParameterDynamics ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetProprietaryParameterDynamics() {
        return proprietaryParameterDynamics != null
                && ( ( InternalEList.Unsettable< ? > ) proprietaryParameterDynamics ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings( "unchecked" )
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.OVEREXCITATION_LIMITER_USER_DEFINED__PROPRIETARY_PARAMETER_DYNAMICS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getProprietaryParameterDynamics() )
                    .basicAdd( otherEnd, msgs );
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
        case CimPackage.OVEREXCITATION_LIMITER_USER_DEFINED__PROPRIETARY_PARAMETER_DYNAMICS:
            return ( ( InternalEList< ? > ) getProprietaryParameterDynamics() ).basicRemove( otherEnd, msgs );
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
        case CimPackage.OVEREXCITATION_LIMITER_USER_DEFINED__PROPRIETARY:
            return getProprietary();
        case CimPackage.OVEREXCITATION_LIMITER_USER_DEFINED__PROPRIETARY_PARAMETER_DYNAMICS:
            return getProprietaryParameterDynamics();
        }
        return super.eGet( featureID, resolve, coreType );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings( "unchecked" )
    @Override
    public void eSet( int featureID, Object newValue ) {
        switch( featureID ) {
        case CimPackage.OVEREXCITATION_LIMITER_USER_DEFINED__PROPRIETARY:
            setProprietary( ( Boolean ) newValue );
            return;
        case CimPackage.OVEREXCITATION_LIMITER_USER_DEFINED__PROPRIETARY_PARAMETER_DYNAMICS:
            getProprietaryParameterDynamics().clear();
            getProprietaryParameterDynamics()
                    .addAll( ( Collection< ? extends ProprietaryParameterDynamics > ) newValue );
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
        case CimPackage.OVEREXCITATION_LIMITER_USER_DEFINED__PROPRIETARY:
            unsetProprietary();
            return;
        case CimPackage.OVEREXCITATION_LIMITER_USER_DEFINED__PROPRIETARY_PARAMETER_DYNAMICS:
            unsetProprietaryParameterDynamics();
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
        case CimPackage.OVEREXCITATION_LIMITER_USER_DEFINED__PROPRIETARY:
            return isSetProprietary();
        case CimPackage.OVEREXCITATION_LIMITER_USER_DEFINED__PROPRIETARY_PARAMETER_DYNAMICS:
            return isSetProprietaryParameterDynamics();
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
        result.append( " (proprietary: " );
        if( proprietaryESet )
            result.append( proprietary );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //OverexcitationLimiterUserDefinedImpl
