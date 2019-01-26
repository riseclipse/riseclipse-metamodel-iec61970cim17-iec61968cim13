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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerEnd;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerEndInfo;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerStarImpedance;

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
 * An implementation of the model object '<em><b>Transformer Star Impedance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.TransformerStarImpedanceImpl#getR <em>R</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.TransformerStarImpedanceImpl#getR0 <em>R0</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.TransformerStarImpedanceImpl#getX <em>X</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.TransformerStarImpedanceImpl#getX0 <em>X0</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.TransformerStarImpedanceImpl#getTransformerEnd <em>Transformer End</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.TransformerStarImpedanceImpl#getTransformerEndInfo <em>Transformer End Info</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransformerStarImpedanceImpl extends IdentifiedObjectImpl implements TransformerStarImpedance {
    /**
     * The default value of the '{@link #getR() <em>R</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getR()
     * @generated
     * @ordered
     */
    protected static final Float R_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getR() <em>R</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getR()
     * @generated
     * @ordered
     */
    protected Float r = R_EDEFAULT;

    /**
     * This is true if the R attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean rESet;

    /**
     * The default value of the '{@link #getR0() <em>R0</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getR0()
     * @generated
     * @ordered
     */
    protected static final Float R0_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getR0() <em>R0</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getR0()
     * @generated
     * @ordered
     */
    protected Float r0 = R0_EDEFAULT;

    /**
     * This is true if the R0 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean r0ESet;

    /**
     * The default value of the '{@link #getX() <em>X</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getX()
     * @generated
     * @ordered
     */
    protected static final Float X_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getX() <em>X</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getX()
     * @generated
     * @ordered
     */
    protected Float x = X_EDEFAULT;

    /**
     * This is true if the X attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean xESet;

    /**
     * The default value of the '{@link #getX0() <em>X0</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getX0()
     * @generated
     * @ordered
     */
    protected static final Float X0_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getX0() <em>X0</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getX0()
     * @generated
     * @ordered
     */
    protected Float x0 = X0_EDEFAULT;

    /**
     * This is true if the X0 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean x0ESet;

    /**
     * The cached value of the '{@link #getTransformerEnd() <em>Transformer End</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTransformerEnd()
     * @generated
     * @ordered
     */
    protected EList< TransformerEnd > transformerEnd;

    /**
     * The cached value of the '{@link #getTransformerEndInfo() <em>Transformer End Info</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTransformerEndInfo()
     * @generated
     * @ordered
     */
    protected TransformerEndInfo transformerEndInfo;

    /**
     * This is true if the Transformer End Info reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean transformerEndInfoESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected TransformerStarImpedanceImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getTransformerStarImpedance();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getR() {
        return r;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setR( Float newR ) {
        Float oldR = r;
        r = newR;
        boolean oldRESet = rESet;
        rESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.TRANSFORMER_STAR_IMPEDANCE__R, oldR, r, !oldRESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetR() {
        Float oldR = r;
        boolean oldRESet = rESet;
        r = R_EDEFAULT;
        rESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.TRANSFORMER_STAR_IMPEDANCE__R, oldR, R_EDEFAULT, oldRESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetR() {
        return rESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getR0() {
        return r0;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setR0( Float newR0 ) {
        Float oldR0 = r0;
        r0 = newR0;
        boolean oldR0ESet = r0ESet;
        r0ESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.TRANSFORMER_STAR_IMPEDANCE__R0, oldR0, r0, !oldR0ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetR0() {
        Float oldR0 = r0;
        boolean oldR0ESet = r0ESet;
        r0 = R0_EDEFAULT;
        r0ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.TRANSFORMER_STAR_IMPEDANCE__R0, oldR0, R0_EDEFAULT, oldR0ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetR0() {
        return r0ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getX() {
        return x;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setX( Float newX ) {
        Float oldX = x;
        x = newX;
        boolean oldXESet = xESet;
        xESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.TRANSFORMER_STAR_IMPEDANCE__X, oldX, x, !oldXESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetX() {
        Float oldX = x;
        boolean oldXESet = xESet;
        x = X_EDEFAULT;
        xESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.TRANSFORMER_STAR_IMPEDANCE__X, oldX, X_EDEFAULT, oldXESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetX() {
        return xESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getX0() {
        return x0;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setX0( Float newX0 ) {
        Float oldX0 = x0;
        x0 = newX0;
        boolean oldX0ESet = x0ESet;
        x0ESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.TRANSFORMER_STAR_IMPEDANCE__X0, oldX0, x0, !oldX0ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetX0() {
        Float oldX0 = x0;
        boolean oldX0ESet = x0ESet;
        x0 = X0_EDEFAULT;
        x0ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.TRANSFORMER_STAR_IMPEDANCE__X0, oldX0, X0_EDEFAULT, oldX0ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetX0() {
        return x0ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< TransformerEnd > getTransformerEnd() {
        if( transformerEnd == null ) {
            transformerEnd = new EObjectWithInverseResolvingEList.Unsettable< TransformerEnd >( TransformerEnd.class,
                    this, CimPackage.TRANSFORMER_STAR_IMPEDANCE__TRANSFORMER_END,
                    CimPackage.TRANSFORMER_END__STAR_IMPEDANCE );
        }
        return transformerEnd;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTransformerEnd() {
        if( transformerEnd != null ) ( ( InternalEList.Unsettable< ? > ) transformerEnd ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTransformerEnd() {
        return transformerEnd != null && ( ( InternalEList.Unsettable< ? > ) transformerEnd ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public TransformerEndInfo getTransformerEndInfo() {
        return transformerEndInfo;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetTransformerEndInfo( TransformerEndInfo newTransformerEndInfo,
            NotificationChain msgs ) {
        TransformerEndInfo oldTransformerEndInfo = transformerEndInfo;
        transformerEndInfo = newTransformerEndInfo;
        boolean oldTransformerEndInfoESet = transformerEndInfoESet;
        transformerEndInfoESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.TRANSFORMER_STAR_IMPEDANCE__TRANSFORMER_END_INFO, oldTransformerEndInfo,
                    newTransformerEndInfo, !oldTransformerEndInfoESet );
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
    public void setTransformerEndInfo( TransformerEndInfo newTransformerEndInfo ) {
        if( newTransformerEndInfo != transformerEndInfo ) {
            NotificationChain msgs = null;
            if( transformerEndInfo != null ) msgs = ( ( InternalEObject ) transformerEndInfo ).eInverseRemove( this,
                    CimPackage.TRANSFORMER_END_INFO__TRANSFORMER_STAR_IMPEDANCE, TransformerEndInfo.class, msgs );
            if( newTransformerEndInfo != null ) msgs = ( ( InternalEObject ) newTransformerEndInfo ).eInverseAdd( this,
                    CimPackage.TRANSFORMER_END_INFO__TRANSFORMER_STAR_IMPEDANCE, TransformerEndInfo.class, msgs );
            msgs = basicSetTransformerEndInfo( newTransformerEndInfo, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldTransformerEndInfoESet = transformerEndInfoESet;
            transformerEndInfoESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.TRANSFORMER_STAR_IMPEDANCE__TRANSFORMER_END_INFO, newTransformerEndInfo,
                    newTransformerEndInfo, !oldTransformerEndInfoESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetTransformerEndInfo( NotificationChain msgs ) {
        TransformerEndInfo oldTransformerEndInfo = transformerEndInfo;
        transformerEndInfo = null;
        boolean oldTransformerEndInfoESet = transformerEndInfoESet;
        transformerEndInfoESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.TRANSFORMER_STAR_IMPEDANCE__TRANSFORMER_END_INFO, oldTransformerEndInfo, null,
                    oldTransformerEndInfoESet );
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
    public void unsetTransformerEndInfo() {
        if( transformerEndInfo != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) transformerEndInfo ).eInverseRemove( this,
                    CimPackage.TRANSFORMER_END_INFO__TRANSFORMER_STAR_IMPEDANCE, TransformerEndInfo.class, msgs );
            msgs = basicUnsetTransformerEndInfo( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldTransformerEndInfoESet = transformerEndInfoESet;
            transformerEndInfoESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.TRANSFORMER_STAR_IMPEDANCE__TRANSFORMER_END_INFO, null, null,
                    oldTransformerEndInfoESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTransformerEndInfo() {
        return transformerEndInfoESet;
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
        case CimPackage.TRANSFORMER_STAR_IMPEDANCE__TRANSFORMER_END:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getTransformerEnd() )
                    .basicAdd( otherEnd, msgs );
        case CimPackage.TRANSFORMER_STAR_IMPEDANCE__TRANSFORMER_END_INFO:
            if( transformerEndInfo != null ) msgs = ( ( InternalEObject ) transformerEndInfo ).eInverseRemove( this,
                    CimPackage.TRANSFORMER_END_INFO__TRANSFORMER_STAR_IMPEDANCE, TransformerEndInfo.class, msgs );
            return basicSetTransformerEndInfo( ( TransformerEndInfo ) otherEnd, msgs );
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
        case CimPackage.TRANSFORMER_STAR_IMPEDANCE__TRANSFORMER_END:
            return ( ( InternalEList< ? > ) getTransformerEnd() ).basicRemove( otherEnd, msgs );
        case CimPackage.TRANSFORMER_STAR_IMPEDANCE__TRANSFORMER_END_INFO:
            return basicUnsetTransformerEndInfo( msgs );
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
        case CimPackage.TRANSFORMER_STAR_IMPEDANCE__R:
            return getR();
        case CimPackage.TRANSFORMER_STAR_IMPEDANCE__R0:
            return getR0();
        case CimPackage.TRANSFORMER_STAR_IMPEDANCE__X:
            return getX();
        case CimPackage.TRANSFORMER_STAR_IMPEDANCE__X0:
            return getX0();
        case CimPackage.TRANSFORMER_STAR_IMPEDANCE__TRANSFORMER_END:
            return getTransformerEnd();
        case CimPackage.TRANSFORMER_STAR_IMPEDANCE__TRANSFORMER_END_INFO:
            return getTransformerEndInfo();
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
        case CimPackage.TRANSFORMER_STAR_IMPEDANCE__R:
            setR( ( Float ) newValue );
            return;
        case CimPackage.TRANSFORMER_STAR_IMPEDANCE__R0:
            setR0( ( Float ) newValue );
            return;
        case CimPackage.TRANSFORMER_STAR_IMPEDANCE__X:
            setX( ( Float ) newValue );
            return;
        case CimPackage.TRANSFORMER_STAR_IMPEDANCE__X0:
            setX0( ( Float ) newValue );
            return;
        case CimPackage.TRANSFORMER_STAR_IMPEDANCE__TRANSFORMER_END:
            getTransformerEnd().clear();
            getTransformerEnd().addAll( ( Collection< ? extends TransformerEnd > ) newValue );
            return;
        case CimPackage.TRANSFORMER_STAR_IMPEDANCE__TRANSFORMER_END_INFO:
            setTransformerEndInfo( ( TransformerEndInfo ) newValue );
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
        case CimPackage.TRANSFORMER_STAR_IMPEDANCE__R:
            unsetR();
            return;
        case CimPackage.TRANSFORMER_STAR_IMPEDANCE__R0:
            unsetR0();
            return;
        case CimPackage.TRANSFORMER_STAR_IMPEDANCE__X:
            unsetX();
            return;
        case CimPackage.TRANSFORMER_STAR_IMPEDANCE__X0:
            unsetX0();
            return;
        case CimPackage.TRANSFORMER_STAR_IMPEDANCE__TRANSFORMER_END:
            unsetTransformerEnd();
            return;
        case CimPackage.TRANSFORMER_STAR_IMPEDANCE__TRANSFORMER_END_INFO:
            unsetTransformerEndInfo();
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
        case CimPackage.TRANSFORMER_STAR_IMPEDANCE__R:
            return isSetR();
        case CimPackage.TRANSFORMER_STAR_IMPEDANCE__R0:
            return isSetR0();
        case CimPackage.TRANSFORMER_STAR_IMPEDANCE__X:
            return isSetX();
        case CimPackage.TRANSFORMER_STAR_IMPEDANCE__X0:
            return isSetX0();
        case CimPackage.TRANSFORMER_STAR_IMPEDANCE__TRANSFORMER_END:
            return isSetTransformerEnd();
        case CimPackage.TRANSFORMER_STAR_IMPEDANCE__TRANSFORMER_END_INFO:
            return isSetTransformerEndInfo();
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
        result.append( " (r: " );
        if( rESet )
            result.append( r );
        else
            result.append( "<unset>" );
        result.append( ", r0: " );
        if( r0ESet )
            result.append( r0 );
        else
            result.append( "<unset>" );
        result.append( ", x: " );
        if( xESet )
            result.append( x );
        else
            result.append( "<unset>" );
        result.append( ", x0: " );
        if( x0ESet )
            result.append( x0 );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //TransformerStarImpedanceImpl
