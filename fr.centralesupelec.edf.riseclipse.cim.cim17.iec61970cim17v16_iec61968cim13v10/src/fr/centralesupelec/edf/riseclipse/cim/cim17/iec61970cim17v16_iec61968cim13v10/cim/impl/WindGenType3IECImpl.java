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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindGenType3IEC;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindTurbineType3IEC;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Wind Gen Type3 IEC</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.WindGenType3IECImpl#getDipmax <em>Dipmax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.WindGenType3IECImpl#getDiqmax <em>Diqmax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.WindGenType3IECImpl#getXs <em>Xs</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.WindGenType3IECImpl#getWindTurbineType3IEC <em>Wind Turbine Type3 IEC</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WindGenType3IECImpl extends IdentifiedObjectImpl implements WindGenType3IEC {
    /**
     * The default value of the '{@link #getDipmax() <em>Dipmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDipmax()
     * @generated
     * @ordered
     */
    protected static final Float DIPMAX_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDipmax() <em>Dipmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDipmax()
     * @generated
     * @ordered
     */
    protected Float dipmax = DIPMAX_EDEFAULT;

    /**
     * This is true if the Dipmax attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean dipmaxESet;

    /**
     * The default value of the '{@link #getDiqmax() <em>Diqmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDiqmax()
     * @generated
     * @ordered
     */
    protected static final Float DIQMAX_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDiqmax() <em>Diqmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDiqmax()
     * @generated
     * @ordered
     */
    protected Float diqmax = DIQMAX_EDEFAULT;

    /**
     * This is true if the Diqmax attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean diqmaxESet;

    /**
     * The default value of the '{@link #getXs() <em>Xs</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getXs()
     * @generated
     * @ordered
     */
    protected static final Float XS_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getXs() <em>Xs</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getXs()
     * @generated
     * @ordered
     */
    protected Float xs = XS_EDEFAULT;

    /**
     * This is true if the Xs attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean xsESet;

    /**
     * The cached value of the '{@link #getWindTurbineType3IEC() <em>Wind Turbine Type3 IEC</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getWindTurbineType3IEC()
     * @generated
     * @ordered
     */
    protected WindTurbineType3IEC windTurbineType3IEC;

    /**
     * This is true if the Wind Turbine Type3 IEC reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean windTurbineType3IECESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected WindGenType3IECImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getWindGenType3IEC();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getDipmax() {
        return dipmax;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setDipmax( Float newDipmax ) {
        Float oldDipmax = dipmax;
        dipmax = newDipmax;
        boolean oldDipmaxESet = dipmaxESet;
        dipmaxESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.WIND_GEN_TYPE3_IEC__DIPMAX, oldDipmax, dipmax, !oldDipmaxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetDipmax() {
        Float oldDipmax = dipmax;
        boolean oldDipmaxESet = dipmaxESet;
        dipmax = DIPMAX_EDEFAULT;
        dipmaxESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.WIND_GEN_TYPE3_IEC__DIPMAX, oldDipmax, DIPMAX_EDEFAULT, oldDipmaxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetDipmax() {
        return dipmaxESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getDiqmax() {
        return diqmax;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setDiqmax( Float newDiqmax ) {
        Float oldDiqmax = diqmax;
        diqmax = newDiqmax;
        boolean oldDiqmaxESet = diqmaxESet;
        diqmaxESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.WIND_GEN_TYPE3_IEC__DIQMAX, oldDiqmax, diqmax, !oldDiqmaxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetDiqmax() {
        Float oldDiqmax = diqmax;
        boolean oldDiqmaxESet = diqmaxESet;
        diqmax = DIQMAX_EDEFAULT;
        diqmaxESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.WIND_GEN_TYPE3_IEC__DIQMAX, oldDiqmax, DIQMAX_EDEFAULT, oldDiqmaxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetDiqmax() {
        return diqmaxESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getXs() {
        return xs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setXs( Float newXs ) {
        Float oldXs = xs;
        xs = newXs;
        boolean oldXsESet = xsESet;
        xsESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.WIND_GEN_TYPE3_IEC__XS, oldXs, xs, !oldXsESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetXs() {
        Float oldXs = xs;
        boolean oldXsESet = xsESet;
        xs = XS_EDEFAULT;
        xsESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.WIND_GEN_TYPE3_IEC__XS, oldXs, XS_EDEFAULT, oldXsESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetXs() {
        return xsESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public WindTurbineType3IEC getWindTurbineType3IEC() {
        return windTurbineType3IEC;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetWindTurbineType3IEC( WindTurbineType3IEC newWindTurbineType3IEC,
            NotificationChain msgs ) {
        WindTurbineType3IEC oldWindTurbineType3IEC = windTurbineType3IEC;
        windTurbineType3IEC = newWindTurbineType3IEC;
        boolean oldWindTurbineType3IECESet = windTurbineType3IECESet;
        windTurbineType3IECESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.WIND_GEN_TYPE3_IEC__WIND_TURBINE_TYPE3_IEC, oldWindTurbineType3IEC,
                    newWindTurbineType3IEC, !oldWindTurbineType3IECESet );
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
    public void setWindTurbineType3IEC( WindTurbineType3IEC newWindTurbineType3IEC ) {
        if( newWindTurbineType3IEC != windTurbineType3IEC ) {
            NotificationChain msgs = null;
            if( windTurbineType3IEC != null ) msgs = ( ( InternalEObject ) windTurbineType3IEC ).eInverseRemove( this,
                    CimPackage.WIND_TURBINE_TYPE3_IEC__WIND_GEN_TYPE3_IEC, WindTurbineType3IEC.class, msgs );
            if( newWindTurbineType3IEC != null )
                msgs = ( ( InternalEObject ) newWindTurbineType3IEC ).eInverseAdd( this,
                        CimPackage.WIND_TURBINE_TYPE3_IEC__WIND_GEN_TYPE3_IEC, WindTurbineType3IEC.class, msgs );
            msgs = basicSetWindTurbineType3IEC( newWindTurbineType3IEC, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldWindTurbineType3IECESet = windTurbineType3IECESet;
            windTurbineType3IECESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.WIND_GEN_TYPE3_IEC__WIND_TURBINE_TYPE3_IEC, newWindTurbineType3IEC,
                    newWindTurbineType3IEC, !oldWindTurbineType3IECESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetWindTurbineType3IEC( NotificationChain msgs ) {
        WindTurbineType3IEC oldWindTurbineType3IEC = windTurbineType3IEC;
        windTurbineType3IEC = null;
        boolean oldWindTurbineType3IECESet = windTurbineType3IECESet;
        windTurbineType3IECESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.WIND_GEN_TYPE3_IEC__WIND_TURBINE_TYPE3_IEC, oldWindTurbineType3IEC, null,
                    oldWindTurbineType3IECESet );
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
    public void unsetWindTurbineType3IEC() {
        if( windTurbineType3IEC != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) windTurbineType3IEC ).eInverseRemove( this,
                    CimPackage.WIND_TURBINE_TYPE3_IEC__WIND_GEN_TYPE3_IEC, WindTurbineType3IEC.class, msgs );
            msgs = basicUnsetWindTurbineType3IEC( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldWindTurbineType3IECESet = windTurbineType3IECESet;
            windTurbineType3IECESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.WIND_GEN_TYPE3_IEC__WIND_TURBINE_TYPE3_IEC, null, null, oldWindTurbineType3IECESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetWindTurbineType3IEC() {
        return windTurbineType3IECESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.WIND_GEN_TYPE3_IEC__WIND_TURBINE_TYPE3_IEC:
            if( windTurbineType3IEC != null ) msgs = ( ( InternalEObject ) windTurbineType3IEC ).eInverseRemove( this,
                    CimPackage.WIND_TURBINE_TYPE3_IEC__WIND_GEN_TYPE3_IEC, WindTurbineType3IEC.class, msgs );
            return basicSetWindTurbineType3IEC( ( WindTurbineType3IEC ) otherEnd, msgs );
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
        case CimPackage.WIND_GEN_TYPE3_IEC__WIND_TURBINE_TYPE3_IEC:
            return basicUnsetWindTurbineType3IEC( msgs );
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
        case CimPackage.WIND_GEN_TYPE3_IEC__DIPMAX:
            return getDipmax();
        case CimPackage.WIND_GEN_TYPE3_IEC__DIQMAX:
            return getDiqmax();
        case CimPackage.WIND_GEN_TYPE3_IEC__XS:
            return getXs();
        case CimPackage.WIND_GEN_TYPE3_IEC__WIND_TURBINE_TYPE3_IEC:
            return getWindTurbineType3IEC();
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
        case CimPackage.WIND_GEN_TYPE3_IEC__DIPMAX:
            setDipmax( ( Float ) newValue );
            return;
        case CimPackage.WIND_GEN_TYPE3_IEC__DIQMAX:
            setDiqmax( ( Float ) newValue );
            return;
        case CimPackage.WIND_GEN_TYPE3_IEC__XS:
            setXs( ( Float ) newValue );
            return;
        case CimPackage.WIND_GEN_TYPE3_IEC__WIND_TURBINE_TYPE3_IEC:
            setWindTurbineType3IEC( ( WindTurbineType3IEC ) newValue );
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
        case CimPackage.WIND_GEN_TYPE3_IEC__DIPMAX:
            unsetDipmax();
            return;
        case CimPackage.WIND_GEN_TYPE3_IEC__DIQMAX:
            unsetDiqmax();
            return;
        case CimPackage.WIND_GEN_TYPE3_IEC__XS:
            unsetXs();
            return;
        case CimPackage.WIND_GEN_TYPE3_IEC__WIND_TURBINE_TYPE3_IEC:
            unsetWindTurbineType3IEC();
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
        case CimPackage.WIND_GEN_TYPE3_IEC__DIPMAX:
            return isSetDipmax();
        case CimPackage.WIND_GEN_TYPE3_IEC__DIQMAX:
            return isSetDiqmax();
        case CimPackage.WIND_GEN_TYPE3_IEC__XS:
            return isSetXs();
        case CimPackage.WIND_GEN_TYPE3_IEC__WIND_TURBINE_TYPE3_IEC:
            return isSetWindTurbineType3IEC();
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
        result.append( " (dipmax: " );
        if( dipmaxESet )
            result.append( dipmax );
        else
            result.append( "<unset>" );
        result.append( ", diqmax: " );
        if( diqmaxESet )
            result.append( diqmax );
        else
            result.append( "<unset>" );
        result.append( ", xs: " );
        if( xsESet )
            result.append( xs );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //WindGenType3IECImpl
