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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Curve;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CurveData;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Curve Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.CurveDataImpl#getXvalue <em>Xvalue</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.CurveDataImpl#getY1value <em>Y1value</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.CurveDataImpl#getY2value <em>Y2value</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.CurveDataImpl#getY3value <em>Y3value</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.CurveDataImpl#getCurve <em>Curve</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CurveDataImpl extends CimObjectWithIDImpl implements CurveData {
    /**
     * The default value of the '{@link #getXvalue() <em>Xvalue</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getXvalue()
     * @generated
     * @ordered
     */
    protected static final Float XVALUE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getXvalue() <em>Xvalue</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getXvalue()
     * @generated
     * @ordered
     */
    protected Float xvalue = XVALUE_EDEFAULT;

    /**
     * This is true if the Xvalue attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean xvalueESet;

    /**
     * The default value of the '{@link #getY1value() <em>Y1value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getY1value()
     * @generated
     * @ordered
     */
    protected static final Float Y1VALUE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getY1value() <em>Y1value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getY1value()
     * @generated
     * @ordered
     */
    protected Float y1value = Y1VALUE_EDEFAULT;

    /**
     * This is true if the Y1value attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean y1valueESet;

    /**
     * The default value of the '{@link #getY2value() <em>Y2value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getY2value()
     * @generated
     * @ordered
     */
    protected static final Float Y2VALUE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getY2value() <em>Y2value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getY2value()
     * @generated
     * @ordered
     */
    protected Float y2value = Y2VALUE_EDEFAULT;

    /**
     * This is true if the Y2value attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean y2valueESet;

    /**
     * The default value of the '{@link #getY3value() <em>Y3value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getY3value()
     * @generated
     * @ordered
     */
    protected static final Float Y3VALUE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getY3value() <em>Y3value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getY3value()
     * @generated
     * @ordered
     */
    protected Float y3value = Y3VALUE_EDEFAULT;

    /**
     * This is true if the Y3value attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean y3valueESet;

    /**
     * The cached value of the '{@link #getCurve() <em>Curve</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCurve()
     * @generated
     * @ordered
     */
    protected Curve curve;

    /**
     * This is true if the Curve reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean curveESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected CurveDataImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getCurveData();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getXvalue() {
        return xvalue;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setXvalue( Float newXvalue ) {
        Float oldXvalue = xvalue;
        xvalue = newXvalue;
        boolean oldXvalueESet = xvalueESet;
        xvalueESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.CURVE_DATA__XVALUE, oldXvalue, xvalue, !oldXvalueESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetXvalue() {
        Float oldXvalue = xvalue;
        boolean oldXvalueESet = xvalueESet;
        xvalue = XVALUE_EDEFAULT;
        xvalueESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.CURVE_DATA__XVALUE, oldXvalue, XVALUE_EDEFAULT, oldXvalueESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetXvalue() {
        return xvalueESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getY1value() {
        return y1value;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setY1value( Float newY1value ) {
        Float oldY1value = y1value;
        y1value = newY1value;
        boolean oldY1valueESet = y1valueESet;
        y1valueESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.CURVE_DATA__Y1VALUE, oldY1value, y1value, !oldY1valueESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetY1value() {
        Float oldY1value = y1value;
        boolean oldY1valueESet = y1valueESet;
        y1value = Y1VALUE_EDEFAULT;
        y1valueESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.CURVE_DATA__Y1VALUE, oldY1value, Y1VALUE_EDEFAULT, oldY1valueESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetY1value() {
        return y1valueESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getY2value() {
        return y2value;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setY2value( Float newY2value ) {
        Float oldY2value = y2value;
        y2value = newY2value;
        boolean oldY2valueESet = y2valueESet;
        y2valueESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.CURVE_DATA__Y2VALUE, oldY2value, y2value, !oldY2valueESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetY2value() {
        Float oldY2value = y2value;
        boolean oldY2valueESet = y2valueESet;
        y2value = Y2VALUE_EDEFAULT;
        y2valueESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.CURVE_DATA__Y2VALUE, oldY2value, Y2VALUE_EDEFAULT, oldY2valueESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetY2value() {
        return y2valueESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getY3value() {
        return y3value;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setY3value( Float newY3value ) {
        Float oldY3value = y3value;
        y3value = newY3value;
        boolean oldY3valueESet = y3valueESet;
        y3valueESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.CURVE_DATA__Y3VALUE, oldY3value, y3value, !oldY3valueESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetY3value() {
        Float oldY3value = y3value;
        boolean oldY3valueESet = y3valueESet;
        y3value = Y3VALUE_EDEFAULT;
        y3valueESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.CURVE_DATA__Y3VALUE, oldY3value, Y3VALUE_EDEFAULT, oldY3valueESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetY3value() {
        return y3valueESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Curve getCurve() {
        return curve;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetCurve( Curve newCurve, NotificationChain msgs ) {
        Curve oldCurve = curve;
        curve = newCurve;
        boolean oldCurveESet = curveESet;
        curveESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.CURVE_DATA__CURVE, oldCurve, newCurve, !oldCurveESet );
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
    public void setCurve( Curve newCurve ) {
        if( newCurve != curve ) {
            NotificationChain msgs = null;
            if( curve != null ) msgs = ( ( InternalEObject ) curve ).eInverseRemove( this,
                    CimPackage.CURVE__CURVE_DATAS, Curve.class, msgs );
            if( newCurve != null ) msgs = ( ( InternalEObject ) newCurve ).eInverseAdd( this,
                    CimPackage.CURVE__CURVE_DATAS, Curve.class, msgs );
            msgs = basicSetCurve( newCurve, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldCurveESet = curveESet;
            curveESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.CURVE_DATA__CURVE, newCurve, newCurve, !oldCurveESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetCurve( NotificationChain msgs ) {
        Curve oldCurve = curve;
        curve = null;
        boolean oldCurveESet = curveESet;
        curveESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.CURVE_DATA__CURVE, oldCurve, null, oldCurveESet );
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
    public void unsetCurve() {
        if( curve != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) curve ).eInverseRemove( this, CimPackage.CURVE__CURVE_DATAS, Curve.class,
                    msgs );
            msgs = basicUnsetCurve( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldCurveESet = curveESet;
            curveESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.CURVE_DATA__CURVE, null, null, oldCurveESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetCurve() {
        return curveESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.CURVE_DATA__CURVE:
            if( curve != null ) msgs = ( ( InternalEObject ) curve ).eInverseRemove( this,
                    CimPackage.CURVE__CURVE_DATAS, Curve.class, msgs );
            return basicSetCurve( ( Curve ) otherEnd, msgs );
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
        case CimPackage.CURVE_DATA__CURVE:
            return basicUnsetCurve( msgs );
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
        case CimPackage.CURVE_DATA__XVALUE:
            return getXvalue();
        case CimPackage.CURVE_DATA__Y1VALUE:
            return getY1value();
        case CimPackage.CURVE_DATA__Y2VALUE:
            return getY2value();
        case CimPackage.CURVE_DATA__Y3VALUE:
            return getY3value();
        case CimPackage.CURVE_DATA__CURVE:
            return getCurve();
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
        case CimPackage.CURVE_DATA__XVALUE:
            setXvalue( ( Float ) newValue );
            return;
        case CimPackage.CURVE_DATA__Y1VALUE:
            setY1value( ( Float ) newValue );
            return;
        case CimPackage.CURVE_DATA__Y2VALUE:
            setY2value( ( Float ) newValue );
            return;
        case CimPackage.CURVE_DATA__Y3VALUE:
            setY3value( ( Float ) newValue );
            return;
        case CimPackage.CURVE_DATA__CURVE:
            setCurve( ( Curve ) newValue );
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
        case CimPackage.CURVE_DATA__XVALUE:
            unsetXvalue();
            return;
        case CimPackage.CURVE_DATA__Y1VALUE:
            unsetY1value();
            return;
        case CimPackage.CURVE_DATA__Y2VALUE:
            unsetY2value();
            return;
        case CimPackage.CURVE_DATA__Y3VALUE:
            unsetY3value();
            return;
        case CimPackage.CURVE_DATA__CURVE:
            unsetCurve();
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
        case CimPackage.CURVE_DATA__XVALUE:
            return isSetXvalue();
        case CimPackage.CURVE_DATA__Y1VALUE:
            return isSetY1value();
        case CimPackage.CURVE_DATA__Y2VALUE:
            return isSetY2value();
        case CimPackage.CURVE_DATA__Y3VALUE:
            return isSetY3value();
        case CimPackage.CURVE_DATA__CURVE:
            return isSetCurve();
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
        result.append( " (xvalue: " );
        if( xvalueESet )
            result.append( xvalue );
        else
            result.append( "<unset>" );
        result.append( ", y1value: " );
        if( y1valueESet )
            result.append( y1value );
        else
            result.append( "<unset>" );
        result.append( ", y2value: " );
        if( y2valueESet )
            result.append( y2value );
        else
            result.append( "<unset>" );
        result.append( ", y3value: " );
        if( y3valueESet )
            result.append( y3value );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //CurveDataImpl
