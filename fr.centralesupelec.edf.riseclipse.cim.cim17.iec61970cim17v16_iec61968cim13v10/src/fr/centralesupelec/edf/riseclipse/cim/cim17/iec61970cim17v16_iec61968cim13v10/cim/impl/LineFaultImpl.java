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

import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ACLineSegment;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LineFault;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Line Fault</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.LineFaultImpl#getLengthFromTerminal1 <em>Length From Terminal1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.LineFaultImpl#getACLineSegment <em>AC Line Segment</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LineFaultImpl extends FaultImpl implements LineFault {
    /**
     * The default value of the '{@link #getLengthFromTerminal1() <em>Length From Terminal1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLengthFromTerminal1()
     * @generated
     * @ordered
     */
    protected static final Float LENGTH_FROM_TERMINAL1_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getLengthFromTerminal1() <em>Length From Terminal1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLengthFromTerminal1()
     * @generated
     * @ordered
     */
    protected Float lengthFromTerminal1 = LENGTH_FROM_TERMINAL1_EDEFAULT;

    /**
     * This is true if the Length From Terminal1 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean lengthFromTerminal1ESet;

    /**
     * The cached value of the '{@link #getACLineSegment() <em>AC Line Segment</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getACLineSegment()
     * @generated
     * @ordered
     */
    protected ACLineSegment acLineSegment;

    /**
     * This is true if the AC Line Segment reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean acLineSegmentESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected LineFaultImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getLineFault();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getLengthFromTerminal1() {
        return lengthFromTerminal1;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setLengthFromTerminal1( Float newLengthFromTerminal1 ) {
        Float oldLengthFromTerminal1 = lengthFromTerminal1;
        lengthFromTerminal1 = newLengthFromTerminal1;
        boolean oldLengthFromTerminal1ESet = lengthFromTerminal1ESet;
        lengthFromTerminal1ESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.LINE_FAULT__LENGTH_FROM_TERMINAL1,
                    oldLengthFromTerminal1, lengthFromTerminal1, !oldLengthFromTerminal1ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetLengthFromTerminal1() {
        Float oldLengthFromTerminal1 = lengthFromTerminal1;
        boolean oldLengthFromTerminal1ESet = lengthFromTerminal1ESet;
        lengthFromTerminal1 = LENGTH_FROM_TERMINAL1_EDEFAULT;
        lengthFromTerminal1ESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.LINE_FAULT__LENGTH_FROM_TERMINAL1,
                    oldLengthFromTerminal1, LENGTH_FROM_TERMINAL1_EDEFAULT, oldLengthFromTerminal1ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetLengthFromTerminal1() {
        return lengthFromTerminal1ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ACLineSegment getACLineSegment() {
        return acLineSegment;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetACLineSegment( ACLineSegment newACLineSegment, NotificationChain msgs ) {
        ACLineSegment oldACLineSegment = acLineSegment;
        acLineSegment = newACLineSegment;
        boolean oldACLineSegmentESet = acLineSegmentESet;
        acLineSegmentESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.LINE_FAULT__AC_LINE_SEGMENT, oldACLineSegment, newACLineSegment, !oldACLineSegmentESet );
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
    public void setACLineSegment( ACLineSegment newACLineSegment ) {
        if( newACLineSegment != acLineSegment ) {
            NotificationChain msgs = null;
            if( acLineSegment != null ) msgs = ( ( InternalEObject ) acLineSegment ).eInverseRemove( this,
                    CimPackage.AC_LINE_SEGMENT__LINE_FAULTS, ACLineSegment.class, msgs );
            if( newACLineSegment != null ) msgs = ( ( InternalEObject ) newACLineSegment ).eInverseAdd( this,
                    CimPackage.AC_LINE_SEGMENT__LINE_FAULTS, ACLineSegment.class, msgs );
            msgs = basicSetACLineSegment( newACLineSegment, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldACLineSegmentESet = acLineSegmentESet;
            acLineSegmentESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.LINE_FAULT__AC_LINE_SEGMENT,
                        newACLineSegment, newACLineSegment, !oldACLineSegmentESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetACLineSegment( NotificationChain msgs ) {
        ACLineSegment oldACLineSegment = acLineSegment;
        acLineSegment = null;
        boolean oldACLineSegmentESet = acLineSegmentESet;
        acLineSegmentESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.LINE_FAULT__AC_LINE_SEGMENT, oldACLineSegment, null, oldACLineSegmentESet );
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
    public void unsetACLineSegment() {
        if( acLineSegment != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) acLineSegment ).eInverseRemove( this, CimPackage.AC_LINE_SEGMENT__LINE_FAULTS,
                    ACLineSegment.class, msgs );
            msgs = basicUnsetACLineSegment( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldACLineSegmentESet = acLineSegmentESet;
            acLineSegmentESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.LINE_FAULT__AC_LINE_SEGMENT, null, null, oldACLineSegmentESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetACLineSegment() {
        return acLineSegmentESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.LINE_FAULT__AC_LINE_SEGMENT:
            if( acLineSegment != null ) msgs = ( ( InternalEObject ) acLineSegment ).eInverseRemove( this,
                    CimPackage.AC_LINE_SEGMENT__LINE_FAULTS, ACLineSegment.class, msgs );
            return basicSetACLineSegment( ( ACLineSegment ) otherEnd, msgs );
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
        case CimPackage.LINE_FAULT__AC_LINE_SEGMENT:
            return basicUnsetACLineSegment( msgs );
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
        case CimPackage.LINE_FAULT__LENGTH_FROM_TERMINAL1:
            return getLengthFromTerminal1();
        case CimPackage.LINE_FAULT__AC_LINE_SEGMENT:
            return getACLineSegment();
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
        case CimPackage.LINE_FAULT__LENGTH_FROM_TERMINAL1:
            setLengthFromTerminal1( ( Float ) newValue );
            return;
        case CimPackage.LINE_FAULT__AC_LINE_SEGMENT:
            setACLineSegment( ( ACLineSegment ) newValue );
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
        case CimPackage.LINE_FAULT__LENGTH_FROM_TERMINAL1:
            unsetLengthFromTerminal1();
            return;
        case CimPackage.LINE_FAULT__AC_LINE_SEGMENT:
            unsetACLineSegment();
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
        case CimPackage.LINE_FAULT__LENGTH_FROM_TERMINAL1:
            return isSetLengthFromTerminal1();
        case CimPackage.LINE_FAULT__AC_LINE_SEGMENT:
            return isSetACLineSegment();
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
        result.append( " (lengthFromTerminal1: " );
        if( lengthFromTerminal1ESet )
            result.append( lengthFromTerminal1 );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //LineFaultImpl
