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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerCoreAdmittance;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerEnd;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerEndInfo;

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
 * An implementation of the model object '<em><b>Transformer Core Admittance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.TransformerCoreAdmittanceImpl#getB <em>B</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.TransformerCoreAdmittanceImpl#getB0 <em>B0</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.TransformerCoreAdmittanceImpl#getG <em>G</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.TransformerCoreAdmittanceImpl#getG0 <em>G0</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.TransformerCoreAdmittanceImpl#getTransformerEnd <em>Transformer End</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.TransformerCoreAdmittanceImpl#getTransformerEndInfo <em>Transformer End Info</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransformerCoreAdmittanceImpl extends IdentifiedObjectImpl implements TransformerCoreAdmittance {
    /**
     * The default value of the '{@link #getB() <em>B</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getB()
     * @generated
     * @ordered
     */
    protected static final Float B_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getB() <em>B</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getB()
     * @generated
     * @ordered
     */
    protected Float b = B_EDEFAULT;

    /**
     * This is true if the B attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean bESet;

    /**
     * The default value of the '{@link #getB0() <em>B0</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getB0()
     * @generated
     * @ordered
     */
    protected static final Float B0_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getB0() <em>B0</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getB0()
     * @generated
     * @ordered
     */
    protected Float b0 = B0_EDEFAULT;

    /**
     * This is true if the B0 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean b0ESet;

    /**
     * The default value of the '{@link #getG() <em>G</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getG()
     * @generated
     * @ordered
     */
    protected static final Float G_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getG() <em>G</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getG()
     * @generated
     * @ordered
     */
    protected Float g = G_EDEFAULT;

    /**
     * This is true if the G attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean gESet;

    /**
     * The default value of the '{@link #getG0() <em>G0</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getG0()
     * @generated
     * @ordered
     */
    protected static final Float G0_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getG0() <em>G0</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getG0()
     * @generated
     * @ordered
     */
    protected Float g0 = G0_EDEFAULT;

    /**
     * This is true if the G0 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean g0ESet;

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
    protected TransformerCoreAdmittanceImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getTransformerCoreAdmittance();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getB() {
        return b;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setB( Float newB ) {
        Float oldB = b;
        b = newB;
        boolean oldBESet = bESet;
        bESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.TRANSFORMER_CORE_ADMITTANCE__B, oldB, b, !oldBESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetB() {
        Float oldB = b;
        boolean oldBESet = bESet;
        b = B_EDEFAULT;
        bESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.TRANSFORMER_CORE_ADMITTANCE__B, oldB, B_EDEFAULT, oldBESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetB() {
        return bESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getB0() {
        return b0;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setB0( Float newB0 ) {
        Float oldB0 = b0;
        b0 = newB0;
        boolean oldB0ESet = b0ESet;
        b0ESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.TRANSFORMER_CORE_ADMITTANCE__B0, oldB0, b0, !oldB0ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetB0() {
        Float oldB0 = b0;
        boolean oldB0ESet = b0ESet;
        b0 = B0_EDEFAULT;
        b0ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.TRANSFORMER_CORE_ADMITTANCE__B0, oldB0, B0_EDEFAULT, oldB0ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetB0() {
        return b0ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getG() {
        return g;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setG( Float newG ) {
        Float oldG = g;
        g = newG;
        boolean oldGESet = gESet;
        gESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.TRANSFORMER_CORE_ADMITTANCE__G, oldG, g, !oldGESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetG() {
        Float oldG = g;
        boolean oldGESet = gESet;
        g = G_EDEFAULT;
        gESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.TRANSFORMER_CORE_ADMITTANCE__G, oldG, G_EDEFAULT, oldGESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetG() {
        return gESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getG0() {
        return g0;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setG0( Float newG0 ) {
        Float oldG0 = g0;
        g0 = newG0;
        boolean oldG0ESet = g0ESet;
        g0ESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.TRANSFORMER_CORE_ADMITTANCE__G0, oldG0, g0, !oldG0ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetG0() {
        Float oldG0 = g0;
        boolean oldG0ESet = g0ESet;
        g0 = G0_EDEFAULT;
        g0ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.TRANSFORMER_CORE_ADMITTANCE__G0, oldG0, G0_EDEFAULT, oldG0ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetG0() {
        return g0ESet;
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
                    this, CimPackage.TRANSFORMER_CORE_ADMITTANCE__TRANSFORMER_END,
                    CimPackage.TRANSFORMER_END__CORE_ADMITTANCE );
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
                    CimPackage.TRANSFORMER_CORE_ADMITTANCE__TRANSFORMER_END_INFO, oldTransformerEndInfo,
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
                    CimPackage.TRANSFORMER_END_INFO__CORE_ADMITTANCE, TransformerEndInfo.class, msgs );
            if( newTransformerEndInfo != null ) msgs = ( ( InternalEObject ) newTransformerEndInfo ).eInverseAdd( this,
                    CimPackage.TRANSFORMER_END_INFO__CORE_ADMITTANCE, TransformerEndInfo.class, msgs );
            msgs = basicSetTransformerEndInfo( newTransformerEndInfo, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldTransformerEndInfoESet = transformerEndInfoESet;
            transformerEndInfoESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.TRANSFORMER_CORE_ADMITTANCE__TRANSFORMER_END_INFO, newTransformerEndInfo,
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
                    CimPackage.TRANSFORMER_CORE_ADMITTANCE__TRANSFORMER_END_INFO, oldTransformerEndInfo, null,
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
                    CimPackage.TRANSFORMER_END_INFO__CORE_ADMITTANCE, TransformerEndInfo.class, msgs );
            msgs = basicUnsetTransformerEndInfo( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldTransformerEndInfoESet = transformerEndInfoESet;
            transformerEndInfoESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.TRANSFORMER_CORE_ADMITTANCE__TRANSFORMER_END_INFO, null, null,
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
        case CimPackage.TRANSFORMER_CORE_ADMITTANCE__TRANSFORMER_END:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getTransformerEnd() )
                    .basicAdd( otherEnd, msgs );
        case CimPackage.TRANSFORMER_CORE_ADMITTANCE__TRANSFORMER_END_INFO:
            if( transformerEndInfo != null ) msgs = ( ( InternalEObject ) transformerEndInfo ).eInverseRemove( this,
                    CimPackage.TRANSFORMER_END_INFO__CORE_ADMITTANCE, TransformerEndInfo.class, msgs );
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
        case CimPackage.TRANSFORMER_CORE_ADMITTANCE__TRANSFORMER_END:
            return ( ( InternalEList< ? > ) getTransformerEnd() ).basicRemove( otherEnd, msgs );
        case CimPackage.TRANSFORMER_CORE_ADMITTANCE__TRANSFORMER_END_INFO:
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
        case CimPackage.TRANSFORMER_CORE_ADMITTANCE__B:
            return getB();
        case CimPackage.TRANSFORMER_CORE_ADMITTANCE__B0:
            return getB0();
        case CimPackage.TRANSFORMER_CORE_ADMITTANCE__G:
            return getG();
        case CimPackage.TRANSFORMER_CORE_ADMITTANCE__G0:
            return getG0();
        case CimPackage.TRANSFORMER_CORE_ADMITTANCE__TRANSFORMER_END:
            return getTransformerEnd();
        case CimPackage.TRANSFORMER_CORE_ADMITTANCE__TRANSFORMER_END_INFO:
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
        case CimPackage.TRANSFORMER_CORE_ADMITTANCE__B:
            setB( ( Float ) newValue );
            return;
        case CimPackage.TRANSFORMER_CORE_ADMITTANCE__B0:
            setB0( ( Float ) newValue );
            return;
        case CimPackage.TRANSFORMER_CORE_ADMITTANCE__G:
            setG( ( Float ) newValue );
            return;
        case CimPackage.TRANSFORMER_CORE_ADMITTANCE__G0:
            setG0( ( Float ) newValue );
            return;
        case CimPackage.TRANSFORMER_CORE_ADMITTANCE__TRANSFORMER_END:
            getTransformerEnd().clear();
            getTransformerEnd().addAll( ( Collection< ? extends TransformerEnd > ) newValue );
            return;
        case CimPackage.TRANSFORMER_CORE_ADMITTANCE__TRANSFORMER_END_INFO:
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
        case CimPackage.TRANSFORMER_CORE_ADMITTANCE__B:
            unsetB();
            return;
        case CimPackage.TRANSFORMER_CORE_ADMITTANCE__B0:
            unsetB0();
            return;
        case CimPackage.TRANSFORMER_CORE_ADMITTANCE__G:
            unsetG();
            return;
        case CimPackage.TRANSFORMER_CORE_ADMITTANCE__G0:
            unsetG0();
            return;
        case CimPackage.TRANSFORMER_CORE_ADMITTANCE__TRANSFORMER_END:
            unsetTransformerEnd();
            return;
        case CimPackage.TRANSFORMER_CORE_ADMITTANCE__TRANSFORMER_END_INFO:
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
        case CimPackage.TRANSFORMER_CORE_ADMITTANCE__B:
            return isSetB();
        case CimPackage.TRANSFORMER_CORE_ADMITTANCE__B0:
            return isSetB0();
        case CimPackage.TRANSFORMER_CORE_ADMITTANCE__G:
            return isSetG();
        case CimPackage.TRANSFORMER_CORE_ADMITTANCE__G0:
            return isSetG0();
        case CimPackage.TRANSFORMER_CORE_ADMITTANCE__TRANSFORMER_END:
            return isSetTransformerEnd();
        case CimPackage.TRANSFORMER_CORE_ADMITTANCE__TRANSFORMER_END_INFO:
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
        result.append( " (b: " );
        if( bESet )
            result.append( b );
        else
            result.append( "<unset>" );
        result.append( ", b0: " );
        if( b0ESet )
            result.append( b0 );
        else
            result.append( "<unset>" );
        result.append( ", g: " );
        if( gESet )
            result.append( g );
        else
            result.append( "<unset>" );
        result.append( ", g0: " );
        if( g0ESet )
            result.append( g0 );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //TransformerCoreAdmittanceImpl
