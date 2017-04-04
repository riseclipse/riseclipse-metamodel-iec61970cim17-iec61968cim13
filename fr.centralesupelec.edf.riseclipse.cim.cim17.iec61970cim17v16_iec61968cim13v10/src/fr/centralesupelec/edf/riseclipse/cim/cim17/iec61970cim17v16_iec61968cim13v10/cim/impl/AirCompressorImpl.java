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

import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AirCompressor;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CAESPlant;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CombustionTurbine;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Air Compressor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.AirCompressorImpl#getAirCompressorRating <em>Air Compressor Rating</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.AirCompressorImpl#getCombustionTurbine <em>Combustion Turbine</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.AirCompressorImpl#getCAESPlant <em>CAES Plant</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AirCompressorImpl extends PowerSystemResourceImpl implements AirCompressor {
    /**
     * The default value of the '{@link #getAirCompressorRating() <em>Air Compressor Rating</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAirCompressorRating()
     * @generated
     * @ordered
     */
    protected static final Float AIR_COMPRESSOR_RATING_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getAirCompressorRating() <em>Air Compressor Rating</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAirCompressorRating()
     * @generated
     * @ordered
     */
    protected Float airCompressorRating = AIR_COMPRESSOR_RATING_EDEFAULT;

    /**
     * This is true if the Air Compressor Rating attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean airCompressorRatingESet;

    /**
     * The cached value of the '{@link #getCombustionTurbine() <em>Combustion Turbine</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCombustionTurbine()
     * @generated
     * @ordered
     */
    protected CombustionTurbine combustionTurbine;

    /**
     * This is true if the Combustion Turbine reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean combustionTurbineESet;

    /**
     * The cached value of the '{@link #getCAESPlant() <em>CAES Plant</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCAESPlant()
     * @generated
     * @ordered
     */
    protected CAESPlant caesPlant;

    /**
     * This is true if the CAES Plant reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean caesPlantESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected AirCompressorImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getAirCompressor();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getAirCompressorRating() {
        return airCompressorRating;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setAirCompressorRating( Float newAirCompressorRating ) {
        Float oldAirCompressorRating = airCompressorRating;
        airCompressorRating = newAirCompressorRating;
        boolean oldAirCompressorRatingESet = airCompressorRatingESet;
        airCompressorRatingESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.AIR_COMPRESSOR__AIR_COMPRESSOR_RATING,
                    oldAirCompressorRating, airCompressorRating, !oldAirCompressorRatingESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetAirCompressorRating() {
        Float oldAirCompressorRating = airCompressorRating;
        boolean oldAirCompressorRatingESet = airCompressorRatingESet;
        airCompressorRating = AIR_COMPRESSOR_RATING_EDEFAULT;
        airCompressorRatingESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.AIR_COMPRESSOR__AIR_COMPRESSOR_RATING,
                    oldAirCompressorRating, AIR_COMPRESSOR_RATING_EDEFAULT, oldAirCompressorRatingESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetAirCompressorRating() {
        return airCompressorRatingESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public CombustionTurbine getCombustionTurbine() {
        if( combustionTurbine != null && combustionTurbine.eIsProxy() ) {
            InternalEObject oldCombustionTurbine = ( InternalEObject ) combustionTurbine;
            combustionTurbine = ( CombustionTurbine ) eResolveProxy( oldCombustionTurbine );
            if( combustionTurbine != oldCombustionTurbine ) {
                if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.RESOLVE,
                        CimPackage.AIR_COMPRESSOR__COMBUSTION_TURBINE, oldCombustionTurbine, combustionTurbine ) );
            }
        }
        return combustionTurbine;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CombustionTurbine basicGetCombustionTurbine() {
        return combustionTurbine;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetCombustionTurbine( CombustionTurbine newCombustionTurbine,
            NotificationChain msgs ) {
        CombustionTurbine oldCombustionTurbine = combustionTurbine;
        combustionTurbine = newCombustionTurbine;
        boolean oldCombustionTurbineESet = combustionTurbineESet;
        combustionTurbineESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.AIR_COMPRESSOR__COMBUSTION_TURBINE, oldCombustionTurbine, newCombustionTurbine,
                    !oldCombustionTurbineESet );
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
    public void setCombustionTurbine( CombustionTurbine newCombustionTurbine ) {
        if( newCombustionTurbine != combustionTurbine ) {
            NotificationChain msgs = null;
            if( combustionTurbine != null ) msgs = ( ( InternalEObject ) combustionTurbine ).eInverseRemove( this,
                    CimPackage.COMBUSTION_TURBINE__AIR_COMPRESSOR, CombustionTurbine.class, msgs );
            if( newCombustionTurbine != null ) msgs = ( ( InternalEObject ) newCombustionTurbine ).eInverseAdd( this,
                    CimPackage.COMBUSTION_TURBINE__AIR_COMPRESSOR, CombustionTurbine.class, msgs );
            msgs = basicSetCombustionTurbine( newCombustionTurbine, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldCombustionTurbineESet = combustionTurbineESet;
            combustionTurbineESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.AIR_COMPRESSOR__COMBUSTION_TURBINE,
                        newCombustionTurbine, newCombustionTurbine, !oldCombustionTurbineESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetCombustionTurbine( NotificationChain msgs ) {
        CombustionTurbine oldCombustionTurbine = combustionTurbine;
        combustionTurbine = null;
        boolean oldCombustionTurbineESet = combustionTurbineESet;
        combustionTurbineESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.AIR_COMPRESSOR__COMBUSTION_TURBINE, oldCombustionTurbine, null,
                    oldCombustionTurbineESet );
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
    public void unsetCombustionTurbine() {
        if( combustionTurbine != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) combustionTurbine ).eInverseRemove( this,
                    CimPackage.COMBUSTION_TURBINE__AIR_COMPRESSOR, CombustionTurbine.class, msgs );
            msgs = basicUnsetCombustionTurbine( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldCombustionTurbineESet = combustionTurbineESet;
            combustionTurbineESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.AIR_COMPRESSOR__COMBUSTION_TURBINE, null, null, oldCombustionTurbineESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetCombustionTurbine() {
        return combustionTurbineESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public CAESPlant getCAESPlant() {
        return caesPlant;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetCAESPlant( CAESPlant newCAESPlant, NotificationChain msgs ) {
        CAESPlant oldCAESPlant = caesPlant;
        caesPlant = newCAESPlant;
        boolean oldCAESPlantESet = caesPlantESet;
        caesPlantESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.AIR_COMPRESSOR__CAES_PLANT, oldCAESPlant, newCAESPlant, !oldCAESPlantESet );
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
    public void setCAESPlant( CAESPlant newCAESPlant ) {
        if( newCAESPlant != caesPlant ) {
            NotificationChain msgs = null;
            if( caesPlant != null ) msgs = ( ( InternalEObject ) caesPlant ).eInverseRemove( this,
                    CimPackage.CAES_PLANT__AIR_COMPRESSOR, CAESPlant.class, msgs );
            if( newCAESPlant != null ) msgs = ( ( InternalEObject ) newCAESPlant ).eInverseAdd( this,
                    CimPackage.CAES_PLANT__AIR_COMPRESSOR, CAESPlant.class, msgs );
            msgs = basicSetCAESPlant( newCAESPlant, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldCAESPlantESet = caesPlantESet;
            caesPlantESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.AIR_COMPRESSOR__CAES_PLANT, newCAESPlant, newCAESPlant, !oldCAESPlantESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetCAESPlant( NotificationChain msgs ) {
        CAESPlant oldCAESPlant = caesPlant;
        caesPlant = null;
        boolean oldCAESPlantESet = caesPlantESet;
        caesPlantESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.AIR_COMPRESSOR__CAES_PLANT, oldCAESPlant, null, oldCAESPlantESet );
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
    public void unsetCAESPlant() {
        if( caesPlant != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) caesPlant ).eInverseRemove( this, CimPackage.CAES_PLANT__AIR_COMPRESSOR,
                    CAESPlant.class, msgs );
            msgs = basicUnsetCAESPlant( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldCAESPlantESet = caesPlantESet;
            caesPlantESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.AIR_COMPRESSOR__CAES_PLANT, null, null, oldCAESPlantESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetCAESPlant() {
        return caesPlantESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.AIR_COMPRESSOR__COMBUSTION_TURBINE:
            if( combustionTurbine != null ) msgs = ( ( InternalEObject ) combustionTurbine ).eInverseRemove( this,
                    CimPackage.COMBUSTION_TURBINE__AIR_COMPRESSOR, CombustionTurbine.class, msgs );
            return basicSetCombustionTurbine( ( CombustionTurbine ) otherEnd, msgs );
        case CimPackage.AIR_COMPRESSOR__CAES_PLANT:
            if( caesPlant != null ) msgs = ( ( InternalEObject ) caesPlant ).eInverseRemove( this,
                    CimPackage.CAES_PLANT__AIR_COMPRESSOR, CAESPlant.class, msgs );
            return basicSetCAESPlant( ( CAESPlant ) otherEnd, msgs );
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
        case CimPackage.AIR_COMPRESSOR__COMBUSTION_TURBINE:
            return basicUnsetCombustionTurbine( msgs );
        case CimPackage.AIR_COMPRESSOR__CAES_PLANT:
            return basicUnsetCAESPlant( msgs );
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
        case CimPackage.AIR_COMPRESSOR__AIR_COMPRESSOR_RATING:
            return getAirCompressorRating();
        case CimPackage.AIR_COMPRESSOR__COMBUSTION_TURBINE:
            if( resolve ) return getCombustionTurbine();
            return basicGetCombustionTurbine();
        case CimPackage.AIR_COMPRESSOR__CAES_PLANT:
            return getCAESPlant();
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
        case CimPackage.AIR_COMPRESSOR__AIR_COMPRESSOR_RATING:
            setAirCompressorRating( ( Float ) newValue );
            return;
        case CimPackage.AIR_COMPRESSOR__COMBUSTION_TURBINE:
            setCombustionTurbine( ( CombustionTurbine ) newValue );
            return;
        case CimPackage.AIR_COMPRESSOR__CAES_PLANT:
            setCAESPlant( ( CAESPlant ) newValue );
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
        case CimPackage.AIR_COMPRESSOR__AIR_COMPRESSOR_RATING:
            unsetAirCompressorRating();
            return;
        case CimPackage.AIR_COMPRESSOR__COMBUSTION_TURBINE:
            unsetCombustionTurbine();
            return;
        case CimPackage.AIR_COMPRESSOR__CAES_PLANT:
            unsetCAESPlant();
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
        case CimPackage.AIR_COMPRESSOR__AIR_COMPRESSOR_RATING:
            return isSetAirCompressorRating();
        case CimPackage.AIR_COMPRESSOR__COMBUSTION_TURBINE:
            return isSetCombustionTurbine();
        case CimPackage.AIR_COMPRESSOR__CAES_PLANT:
            return isSetCAESPlant();
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
        result.append( " (airCompressorRating: " );
        if( airCompressorRatingESet )
            result.append( airCompressorRating );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //AirCompressorImpl
