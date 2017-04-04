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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.MechLoad1;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mech Load1</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.MechLoad1Impl#getA <em>A</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.MechLoad1Impl#getB <em>B</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.MechLoad1Impl#getD <em>D</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.MechLoad1Impl#getE <em>E</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MechLoad1Impl extends MechanicalLoadDynamicsImpl implements MechLoad1 {
    /**
     * The default value of the '{@link #getA() <em>A</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getA()
     * @generated
     * @ordered
     */
    protected static final Float A_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getA() <em>A</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getA()
     * @generated
     * @ordered
     */
    protected Float a = A_EDEFAULT;

    /**
     * This is true if the A attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean aESet;

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
     * The default value of the '{@link #getD() <em>D</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getD()
     * @generated
     * @ordered
     */
    protected static final Float D_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getD() <em>D</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getD()
     * @generated
     * @ordered
     */
    protected Float d = D_EDEFAULT;

    /**
     * This is true if the D attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean dESet;

    /**
     * The default value of the '{@link #getE() <em>E</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getE()
     * @generated
     * @ordered
     */
    protected static final Float E_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getE() <em>E</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getE()
     * @generated
     * @ordered
     */
    protected Float e = E_EDEFAULT;

    /**
     * This is true if the E attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean eESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected MechLoad1Impl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getMechLoad1();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getA() {
        return a;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setA( Float newA ) {
        Float oldA = a;
        a = newA;
        boolean oldAESet = aESet;
        aESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.MECH_LOAD1__A, oldA, a, !oldAESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetA() {
        Float oldA = a;
        boolean oldAESet = aESet;
        a = A_EDEFAULT;
        aESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.MECH_LOAD1__A, oldA, A_EDEFAULT, oldAESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetA() {
        return aESet;
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
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.MECH_LOAD1__B, oldB, b, !oldBESet ) );
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
                CimPackage.MECH_LOAD1__B, oldB, B_EDEFAULT, oldBESet ) );
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
    public Float getD() {
        return d;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setD( Float newD ) {
        Float oldD = d;
        d = newD;
        boolean oldDESet = dESet;
        dESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.MECH_LOAD1__D, oldD, d, !oldDESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetD() {
        Float oldD = d;
        boolean oldDESet = dESet;
        d = D_EDEFAULT;
        dESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.MECH_LOAD1__D, oldD, D_EDEFAULT, oldDESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetD() {
        return dESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getE() {
        return e;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setE( Float newE ) {
        Float oldE = e;
        e = newE;
        boolean oldEESet = eESet;
        eESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.MECH_LOAD1__E, oldE, e, !oldEESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetE() {
        Float oldE = e;
        boolean oldEESet = eESet;
        e = E_EDEFAULT;
        eESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.MECH_LOAD1__E, oldE, E_EDEFAULT, oldEESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetE() {
        return eESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch( featureID ) {
        case CimPackage.MECH_LOAD1__A:
            return getA();
        case CimPackage.MECH_LOAD1__B:
            return getB();
        case CimPackage.MECH_LOAD1__D:
            return getD();
        case CimPackage.MECH_LOAD1__E:
            return getE();
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
        case CimPackage.MECH_LOAD1__A:
            setA( ( Float ) newValue );
            return;
        case CimPackage.MECH_LOAD1__B:
            setB( ( Float ) newValue );
            return;
        case CimPackage.MECH_LOAD1__D:
            setD( ( Float ) newValue );
            return;
        case CimPackage.MECH_LOAD1__E:
            setE( ( Float ) newValue );
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
        case CimPackage.MECH_LOAD1__A:
            unsetA();
            return;
        case CimPackage.MECH_LOAD1__B:
            unsetB();
            return;
        case CimPackage.MECH_LOAD1__D:
            unsetD();
            return;
        case CimPackage.MECH_LOAD1__E:
            unsetE();
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
        case CimPackage.MECH_LOAD1__A:
            return isSetA();
        case CimPackage.MECH_LOAD1__B:
            return isSetB();
        case CimPackage.MECH_LOAD1__D:
            return isSetD();
        case CimPackage.MECH_LOAD1__E:
            return isSetE();
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
        result.append( " (a: " );
        if( aESet )
            result.append( a );
        else
            result.append( "<unset>" );
        result.append( ", b: " );
        if( bESet )
            result.append( b );
        else
            result.append( "<unset>" );
        result.append( ", d: " );
        if( dESet )
            result.append( d );
        else
            result.append( "<unset>" );
        result.append( ", e: " );
        if( eESet )
            result.append( e );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //MechLoad1Impl
