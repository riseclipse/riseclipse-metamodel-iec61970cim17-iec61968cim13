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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DrumBoiler;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Drum Boiler</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.DrumBoilerImpl#getDrumBoilerRating <em>Drum Boiler Rating</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DrumBoilerImpl extends FossilSteamSupplyImpl implements DrumBoiler {
    /**
     * The default value of the '{@link #getDrumBoilerRating() <em>Drum Boiler Rating</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDrumBoilerRating()
     * @generated
     * @ordered
     */
    protected static final Float DRUM_BOILER_RATING_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDrumBoilerRating() <em>Drum Boiler Rating</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDrumBoilerRating()
     * @generated
     * @ordered
     */
    protected Float drumBoilerRating = DRUM_BOILER_RATING_EDEFAULT;

    /**
     * This is true if the Drum Boiler Rating attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean drumBoilerRatingESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected DrumBoilerImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getDrumBoiler();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getDrumBoilerRating() {
        return drumBoilerRating;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setDrumBoilerRating( Float newDrumBoilerRating ) {
        Float oldDrumBoilerRating = drumBoilerRating;
        drumBoilerRating = newDrumBoilerRating;
        boolean oldDrumBoilerRatingESet = drumBoilerRatingESet;
        drumBoilerRatingESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.DRUM_BOILER__DRUM_BOILER_RATING,
                    oldDrumBoilerRating, drumBoilerRating, !oldDrumBoilerRatingESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetDrumBoilerRating() {
        Float oldDrumBoilerRating = drumBoilerRating;
        boolean oldDrumBoilerRatingESet = drumBoilerRatingESet;
        drumBoilerRating = DRUM_BOILER_RATING_EDEFAULT;
        drumBoilerRatingESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.DRUM_BOILER__DRUM_BOILER_RATING,
                    oldDrumBoilerRating, DRUM_BOILER_RATING_EDEFAULT, oldDrumBoilerRatingESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetDrumBoilerRating() {
        return drumBoilerRatingESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch( featureID ) {
        case CimPackage.DRUM_BOILER__DRUM_BOILER_RATING:
            return getDrumBoilerRating();
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
        case CimPackage.DRUM_BOILER__DRUM_BOILER_RATING:
            setDrumBoilerRating( ( Float ) newValue );
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
        case CimPackage.DRUM_BOILER__DRUM_BOILER_RATING:
            unsetDrumBoilerRating();
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
        case CimPackage.DRUM_BOILER__DRUM_BOILER_RATING:
            return isSetDrumBoilerRating();
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
        result.append( " (drumBoilerRating: " );
        if( drumBoilerRatingESet )
            result.append( drumBoilerRating );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //DrumBoilerImpl
