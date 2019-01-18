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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Streetlight;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Streetlight</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.StreetlightImpl#getArmLength <em>Arm Length</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.StreetlightImpl#getLightRating <em>Light Rating</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StreetlightImpl extends AssetImpl implements Streetlight {
    /**
     * The default value of the '{@link #getArmLength() <em>Arm Length</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getArmLength()
     * @generated
     * @ordered
     */
    protected static final Float ARM_LENGTH_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getArmLength() <em>Arm Length</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getArmLength()
     * @generated
     * @ordered
     */
    protected Float armLength = ARM_LENGTH_EDEFAULT;

    /**
     * This is true if the Arm Length attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean armLengthESet;

    /**
     * The default value of the '{@link #getLightRating() <em>Light Rating</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLightRating()
     * @generated
     * @ordered
     */
    protected static final Float LIGHT_RATING_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getLightRating() <em>Light Rating</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLightRating()
     * @generated
     * @ordered
     */
    protected Float lightRating = LIGHT_RATING_EDEFAULT;

    /**
     * This is true if the Light Rating attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean lightRatingESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected StreetlightImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getStreetlight();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getArmLength() {
        return armLength;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setArmLength( Float newArmLength ) {
        Float oldArmLength = armLength;
        armLength = newArmLength;
        boolean oldArmLengthESet = armLengthESet;
        armLengthESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.STREETLIGHT__ARM_LENGTH, oldArmLength, armLength, !oldArmLengthESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetArmLength() {
        Float oldArmLength = armLength;
        boolean oldArmLengthESet = armLengthESet;
        armLength = ARM_LENGTH_EDEFAULT;
        armLengthESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.STREETLIGHT__ARM_LENGTH, oldArmLength, ARM_LENGTH_EDEFAULT, oldArmLengthESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetArmLength() {
        return armLengthESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getLightRating() {
        return lightRating;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setLightRating( Float newLightRating ) {
        Float oldLightRating = lightRating;
        lightRating = newLightRating;
        boolean oldLightRatingESet = lightRatingESet;
        lightRatingESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.STREETLIGHT__LIGHT_RATING, oldLightRating, lightRating, !oldLightRatingESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetLightRating() {
        Float oldLightRating = lightRating;
        boolean oldLightRatingESet = lightRatingESet;
        lightRating = LIGHT_RATING_EDEFAULT;
        lightRatingESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.STREETLIGHT__LIGHT_RATING, oldLightRating, LIGHT_RATING_EDEFAULT, oldLightRatingESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetLightRating() {
        return lightRatingESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch( featureID ) {
        case CimPackage.STREETLIGHT__ARM_LENGTH:
            return getArmLength();
        case CimPackage.STREETLIGHT__LIGHT_RATING:
            return getLightRating();
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
        case CimPackage.STREETLIGHT__ARM_LENGTH:
            setArmLength( ( Float ) newValue );
            return;
        case CimPackage.STREETLIGHT__LIGHT_RATING:
            setLightRating( ( Float ) newValue );
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
        case CimPackage.STREETLIGHT__ARM_LENGTH:
            unsetArmLength();
            return;
        case CimPackage.STREETLIGHT__LIGHT_RATING:
            unsetLightRating();
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
        case CimPackage.STREETLIGHT__ARM_LENGTH:
            return isSetArmLength();
        case CimPackage.STREETLIGHT__LIGHT_RATING:
            return isSetLightRating();
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
        result.append( " (armLength: " );
        if( armLengthESet )
            result.append( armLength );
        else
            result.append( "<unset>" );
        result.append( ", lightRating: " );
        if( lightRatingESet )
            result.append( lightRating );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //StreetlightImpl
