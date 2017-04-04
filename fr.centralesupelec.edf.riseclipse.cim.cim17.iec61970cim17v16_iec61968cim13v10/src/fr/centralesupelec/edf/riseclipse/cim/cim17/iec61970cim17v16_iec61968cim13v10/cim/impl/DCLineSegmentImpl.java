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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DCLineSegment;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PerLengthDCLineParameter;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DC Line Segment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.DCLineSegmentImpl#getCapacitance <em>Capacitance</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.DCLineSegmentImpl#getInductance <em>Inductance</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.DCLineSegmentImpl#getLength <em>Length</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.DCLineSegmentImpl#getResistance <em>Resistance</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.DCLineSegmentImpl#getPerLengthParameter <em>Per Length Parameter</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DCLineSegmentImpl extends DCConductingEquipmentImpl implements DCLineSegment {
    /**
     * The default value of the '{@link #getCapacitance() <em>Capacitance</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCapacitance()
     * @generated
     * @ordered
     */
    protected static final Float CAPACITANCE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getCapacitance() <em>Capacitance</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCapacitance()
     * @generated
     * @ordered
     */
    protected Float capacitance = CAPACITANCE_EDEFAULT;

    /**
     * This is true if the Capacitance attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean capacitanceESet;

    /**
     * The default value of the '{@link #getInductance() <em>Inductance</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInductance()
     * @generated
     * @ordered
     */
    protected static final Float INDUCTANCE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getInductance() <em>Inductance</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInductance()
     * @generated
     * @ordered
     */
    protected Float inductance = INDUCTANCE_EDEFAULT;

    /**
     * This is true if the Inductance attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean inductanceESet;

    /**
     * The default value of the '{@link #getLength() <em>Length</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLength()
     * @generated
     * @ordered
     */
    protected static final Float LENGTH_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getLength() <em>Length</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLength()
     * @generated
     * @ordered
     */
    protected Float length = LENGTH_EDEFAULT;

    /**
     * This is true if the Length attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean lengthESet;

    /**
     * The default value of the '{@link #getResistance() <em>Resistance</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getResistance()
     * @generated
     * @ordered
     */
    protected static final Float RESISTANCE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getResistance() <em>Resistance</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getResistance()
     * @generated
     * @ordered
     */
    protected Float resistance = RESISTANCE_EDEFAULT;

    /**
     * This is true if the Resistance attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean resistanceESet;

    /**
     * The cached value of the '{@link #getPerLengthParameter() <em>Per Length Parameter</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPerLengthParameter()
     * @generated
     * @ordered
     */
    protected PerLengthDCLineParameter perLengthParameter;

    /**
     * This is true if the Per Length Parameter reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean perLengthParameterESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected DCLineSegmentImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getDCLineSegment();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getCapacitance() {
        return capacitance;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setCapacitance( Float newCapacitance ) {
        Float oldCapacitance = capacitance;
        capacitance = newCapacitance;
        boolean oldCapacitanceESet = capacitanceESet;
        capacitanceESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.DC_LINE_SEGMENT__CAPACITANCE, oldCapacitance, capacitance, !oldCapacitanceESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetCapacitance() {
        Float oldCapacitance = capacitance;
        boolean oldCapacitanceESet = capacitanceESet;
        capacitance = CAPACITANCE_EDEFAULT;
        capacitanceESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.DC_LINE_SEGMENT__CAPACITANCE, oldCapacitance, CAPACITANCE_EDEFAULT, oldCapacitanceESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetCapacitance() {
        return capacitanceESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getInductance() {
        return inductance;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setInductance( Float newInductance ) {
        Float oldInductance = inductance;
        inductance = newInductance;
        boolean oldInductanceESet = inductanceESet;
        inductanceESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.DC_LINE_SEGMENT__INDUCTANCE, oldInductance, inductance, !oldInductanceESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetInductance() {
        Float oldInductance = inductance;
        boolean oldInductanceESet = inductanceESet;
        inductance = INDUCTANCE_EDEFAULT;
        inductanceESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.DC_LINE_SEGMENT__INDUCTANCE, oldInductance, INDUCTANCE_EDEFAULT, oldInductanceESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetInductance() {
        return inductanceESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getLength() {
        return length;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setLength( Float newLength ) {
        Float oldLength = length;
        length = newLength;
        boolean oldLengthESet = lengthESet;
        lengthESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.DC_LINE_SEGMENT__LENGTH, oldLength, length, !oldLengthESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetLength() {
        Float oldLength = length;
        boolean oldLengthESet = lengthESet;
        length = LENGTH_EDEFAULT;
        lengthESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.DC_LINE_SEGMENT__LENGTH, oldLength, LENGTH_EDEFAULT, oldLengthESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetLength() {
        return lengthESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getResistance() {
        return resistance;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setResistance( Float newResistance ) {
        Float oldResistance = resistance;
        resistance = newResistance;
        boolean oldResistanceESet = resistanceESet;
        resistanceESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.DC_LINE_SEGMENT__RESISTANCE, oldResistance, resistance, !oldResistanceESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetResistance() {
        Float oldResistance = resistance;
        boolean oldResistanceESet = resistanceESet;
        resistance = RESISTANCE_EDEFAULT;
        resistanceESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.DC_LINE_SEGMENT__RESISTANCE, oldResistance, RESISTANCE_EDEFAULT, oldResistanceESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetResistance() {
        return resistanceESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public PerLengthDCLineParameter getPerLengthParameter() {
        return perLengthParameter;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetPerLengthParameter( PerLengthDCLineParameter newPerLengthParameter,
            NotificationChain msgs ) {
        PerLengthDCLineParameter oldPerLengthParameter = perLengthParameter;
        perLengthParameter = newPerLengthParameter;
        boolean oldPerLengthParameterESet = perLengthParameterESet;
        perLengthParameterESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.DC_LINE_SEGMENT__PER_LENGTH_PARAMETER, oldPerLengthParameter, newPerLengthParameter,
                    !oldPerLengthParameterESet );
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
    public void setPerLengthParameter( PerLengthDCLineParameter newPerLengthParameter ) {
        if( newPerLengthParameter != perLengthParameter ) {
            NotificationChain msgs = null;
            if( perLengthParameter != null ) msgs = ( ( InternalEObject ) perLengthParameter ).eInverseRemove( this,
                    CimPackage.PER_LENGTH_DC_LINE_PARAMETER__DC_LINE_SEGMENTS, PerLengthDCLineParameter.class, msgs );
            if( newPerLengthParameter != null ) msgs = ( ( InternalEObject ) newPerLengthParameter ).eInverseAdd( this,
                    CimPackage.PER_LENGTH_DC_LINE_PARAMETER__DC_LINE_SEGMENTS, PerLengthDCLineParameter.class, msgs );
            msgs = basicSetPerLengthParameter( newPerLengthParameter, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldPerLengthParameterESet = perLengthParameterESet;
            perLengthParameterESet = true;
            if( eNotificationRequired() ) eNotify(
                    new ENotificationImpl( this, Notification.SET, CimPackage.DC_LINE_SEGMENT__PER_LENGTH_PARAMETER,
                            newPerLengthParameter, newPerLengthParameter, !oldPerLengthParameterESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetPerLengthParameter( NotificationChain msgs ) {
        PerLengthDCLineParameter oldPerLengthParameter = perLengthParameter;
        perLengthParameter = null;
        boolean oldPerLengthParameterESet = perLengthParameterESet;
        perLengthParameterESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.DC_LINE_SEGMENT__PER_LENGTH_PARAMETER, oldPerLengthParameter, null,
                    oldPerLengthParameterESet );
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
    public void unsetPerLengthParameter() {
        if( perLengthParameter != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) perLengthParameter ).eInverseRemove( this,
                    CimPackage.PER_LENGTH_DC_LINE_PARAMETER__DC_LINE_SEGMENTS, PerLengthDCLineParameter.class, msgs );
            msgs = basicUnsetPerLengthParameter( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldPerLengthParameterESet = perLengthParameterESet;
            perLengthParameterESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.DC_LINE_SEGMENT__PER_LENGTH_PARAMETER, null, null, oldPerLengthParameterESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPerLengthParameter() {
        return perLengthParameterESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.DC_LINE_SEGMENT__PER_LENGTH_PARAMETER:
            if( perLengthParameter != null ) msgs = ( ( InternalEObject ) perLengthParameter ).eInverseRemove( this,
                    CimPackage.PER_LENGTH_DC_LINE_PARAMETER__DC_LINE_SEGMENTS, PerLengthDCLineParameter.class, msgs );
            return basicSetPerLengthParameter( ( PerLengthDCLineParameter ) otherEnd, msgs );
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
        case CimPackage.DC_LINE_SEGMENT__PER_LENGTH_PARAMETER:
            return basicUnsetPerLengthParameter( msgs );
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
        case CimPackage.DC_LINE_SEGMENT__CAPACITANCE:
            return getCapacitance();
        case CimPackage.DC_LINE_SEGMENT__INDUCTANCE:
            return getInductance();
        case CimPackage.DC_LINE_SEGMENT__LENGTH:
            return getLength();
        case CimPackage.DC_LINE_SEGMENT__RESISTANCE:
            return getResistance();
        case CimPackage.DC_LINE_SEGMENT__PER_LENGTH_PARAMETER:
            return getPerLengthParameter();
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
        case CimPackage.DC_LINE_SEGMENT__CAPACITANCE:
            setCapacitance( ( Float ) newValue );
            return;
        case CimPackage.DC_LINE_SEGMENT__INDUCTANCE:
            setInductance( ( Float ) newValue );
            return;
        case CimPackage.DC_LINE_SEGMENT__LENGTH:
            setLength( ( Float ) newValue );
            return;
        case CimPackage.DC_LINE_SEGMENT__RESISTANCE:
            setResistance( ( Float ) newValue );
            return;
        case CimPackage.DC_LINE_SEGMENT__PER_LENGTH_PARAMETER:
            setPerLengthParameter( ( PerLengthDCLineParameter ) newValue );
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
        case CimPackage.DC_LINE_SEGMENT__CAPACITANCE:
            unsetCapacitance();
            return;
        case CimPackage.DC_LINE_SEGMENT__INDUCTANCE:
            unsetInductance();
            return;
        case CimPackage.DC_LINE_SEGMENT__LENGTH:
            unsetLength();
            return;
        case CimPackage.DC_LINE_SEGMENT__RESISTANCE:
            unsetResistance();
            return;
        case CimPackage.DC_LINE_SEGMENT__PER_LENGTH_PARAMETER:
            unsetPerLengthParameter();
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
        case CimPackage.DC_LINE_SEGMENT__CAPACITANCE:
            return isSetCapacitance();
        case CimPackage.DC_LINE_SEGMENT__INDUCTANCE:
            return isSetInductance();
        case CimPackage.DC_LINE_SEGMENT__LENGTH:
            return isSetLength();
        case CimPackage.DC_LINE_SEGMENT__RESISTANCE:
            return isSetResistance();
        case CimPackage.DC_LINE_SEGMENT__PER_LENGTH_PARAMETER:
            return isSetPerLengthParameter();
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
        result.append( " (capacitance: " );
        if( capacitanceESet )
            result.append( capacitance );
        else
            result.append( "<unset>" );
        result.append( ", inductance: " );
        if( inductanceESet )
            result.append( inductance );
        else
            result.append( "<unset>" );
        result.append( ", length: " );
        if( lengthESet )
            result.append( length );
        else
            result.append( "<unset>" );
        result.append( ", resistance: " );
        if( resistanceESet )
            result.append( resistance );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //DCLineSegmentImpl
