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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PotentialTransformer;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PotentialTransformerKind;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Potential Transformer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PotentialTransformerImpl#getAccuracyClass <em>Accuracy Class</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PotentialTransformerImpl#getNominalRatio <em>Nominal Ratio</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PotentialTransformerImpl#getPtClass <em>Pt Class</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PotentialTransformerImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PotentialTransformerImpl extends SensorImpl implements PotentialTransformer {
    /**
     * The default value of the '{@link #getAccuracyClass() <em>Accuracy Class</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAccuracyClass()
     * @generated
     * @ordered
     */
    protected static final String ACCURACY_CLASS_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getAccuracyClass() <em>Accuracy Class</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAccuracyClass()
     * @generated
     * @ordered
     */
    protected String accuracyClass = ACCURACY_CLASS_EDEFAULT;

    /**
     * This is true if the Accuracy Class attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean accuracyClassESet;

    /**
     * The default value of the '{@link #getNominalRatio() <em>Nominal Ratio</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNominalRatio()
     * @generated
     * @ordered
     */
    protected static final Float NOMINAL_RATIO_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getNominalRatio() <em>Nominal Ratio</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNominalRatio()
     * @generated
     * @ordered
     */
    protected Float nominalRatio = NOMINAL_RATIO_EDEFAULT;

    /**
     * This is true if the Nominal Ratio attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean nominalRatioESet;

    /**
     * The default value of the '{@link #getPtClass() <em>Pt Class</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPtClass()
     * @generated
     * @ordered
     */
    protected static final String PT_CLASS_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPtClass() <em>Pt Class</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPtClass()
     * @generated
     * @ordered
     */
    protected String ptClass = PT_CLASS_EDEFAULT;

    /**
     * This is true if the Pt Class attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean ptClassESet;

    /**
     * The default value of the '{@link #getType() <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getType()
     * @generated
     * @ordered
     */
    protected static final PotentialTransformerKind TYPE_EDEFAULT = PotentialTransformerKind.INDUCTIVE;

    /**
     * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getType()
     * @generated
     * @ordered
     */
    protected PotentialTransformerKind type = TYPE_EDEFAULT;

    /**
     * This is true if the Type attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean typeESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected PotentialTransformerImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getPotentialTransformer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getAccuracyClass() {
        return accuracyClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setAccuracyClass( String newAccuracyClass ) {
        String oldAccuracyClass = accuracyClass;
        accuracyClass = newAccuracyClass;
        boolean oldAccuracyClassESet = accuracyClassESet;
        accuracyClassESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.POTENTIAL_TRANSFORMER__ACCURACY_CLASS,
                    oldAccuracyClass, accuracyClass, !oldAccuracyClassESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetAccuracyClass() {
        String oldAccuracyClass = accuracyClass;
        boolean oldAccuracyClassESet = accuracyClassESet;
        accuracyClass = ACCURACY_CLASS_EDEFAULT;
        accuracyClassESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.POTENTIAL_TRANSFORMER__ACCURACY_CLASS,
                    oldAccuracyClass, ACCURACY_CLASS_EDEFAULT, oldAccuracyClassESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetAccuracyClass() {
        return accuracyClassESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getNominalRatio() {
        return nominalRatio;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setNominalRatio( Float newNominalRatio ) {
        Float oldNominalRatio = nominalRatio;
        nominalRatio = newNominalRatio;
        boolean oldNominalRatioESet = nominalRatioESet;
        nominalRatioESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.POTENTIAL_TRANSFORMER__NOMINAL_RATIO,
                    oldNominalRatio, nominalRatio, !oldNominalRatioESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetNominalRatio() {
        Float oldNominalRatio = nominalRatio;
        boolean oldNominalRatioESet = nominalRatioESet;
        nominalRatio = NOMINAL_RATIO_EDEFAULT;
        nominalRatioESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.POTENTIAL_TRANSFORMER__NOMINAL_RATIO,
                    oldNominalRatio, NOMINAL_RATIO_EDEFAULT, oldNominalRatioESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetNominalRatio() {
        return nominalRatioESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getPtClass() {
        return ptClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setPtClass( String newPtClass ) {
        String oldPtClass = ptClass;
        ptClass = newPtClass;
        boolean oldPtClassESet = ptClassESet;
        ptClassESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.POTENTIAL_TRANSFORMER__PT_CLASS, oldPtClass, ptClass, !oldPtClassESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetPtClass() {
        String oldPtClass = ptClass;
        boolean oldPtClassESet = ptClassESet;
        ptClass = PT_CLASS_EDEFAULT;
        ptClassESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.POTENTIAL_TRANSFORMER__PT_CLASS, oldPtClass, PT_CLASS_EDEFAULT, oldPtClassESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPtClass() {
        return ptClassESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public PotentialTransformerKind getType() {
        return type;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setType( PotentialTransformerKind newType ) {
        PotentialTransformerKind oldType = type;
        type = newType == null ? TYPE_EDEFAULT : newType;
        boolean oldTypeESet = typeESet;
        typeESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.POTENTIAL_TRANSFORMER__TYPE, oldType, type, !oldTypeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetType() {
        PotentialTransformerKind oldType = type;
        boolean oldTypeESet = typeESet;
        type = TYPE_EDEFAULT;
        typeESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.POTENTIAL_TRANSFORMER__TYPE, oldType, TYPE_EDEFAULT, oldTypeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetType() {
        return typeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch( featureID ) {
        case CimPackage.POTENTIAL_TRANSFORMER__ACCURACY_CLASS:
            return getAccuracyClass();
        case CimPackage.POTENTIAL_TRANSFORMER__NOMINAL_RATIO:
            return getNominalRatio();
        case CimPackage.POTENTIAL_TRANSFORMER__PT_CLASS:
            return getPtClass();
        case CimPackage.POTENTIAL_TRANSFORMER__TYPE:
            return getType();
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
        case CimPackage.POTENTIAL_TRANSFORMER__ACCURACY_CLASS:
            setAccuracyClass( ( String ) newValue );
            return;
        case CimPackage.POTENTIAL_TRANSFORMER__NOMINAL_RATIO:
            setNominalRatio( ( Float ) newValue );
            return;
        case CimPackage.POTENTIAL_TRANSFORMER__PT_CLASS:
            setPtClass( ( String ) newValue );
            return;
        case CimPackage.POTENTIAL_TRANSFORMER__TYPE:
            setType( ( PotentialTransformerKind ) newValue );
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
        case CimPackage.POTENTIAL_TRANSFORMER__ACCURACY_CLASS:
            unsetAccuracyClass();
            return;
        case CimPackage.POTENTIAL_TRANSFORMER__NOMINAL_RATIO:
            unsetNominalRatio();
            return;
        case CimPackage.POTENTIAL_TRANSFORMER__PT_CLASS:
            unsetPtClass();
            return;
        case CimPackage.POTENTIAL_TRANSFORMER__TYPE:
            unsetType();
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
        case CimPackage.POTENTIAL_TRANSFORMER__ACCURACY_CLASS:
            return isSetAccuracyClass();
        case CimPackage.POTENTIAL_TRANSFORMER__NOMINAL_RATIO:
            return isSetNominalRatio();
        case CimPackage.POTENTIAL_TRANSFORMER__PT_CLASS:
            return isSetPtClass();
        case CimPackage.POTENTIAL_TRANSFORMER__TYPE:
            return isSetType();
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
        result.append( " (accuracyClass: " );
        if( accuracyClassESet )
            result.append( accuracyClass );
        else
            result.append( "<unset>" );
        result.append( ", nominalRatio: " );
        if( nominalRatioESet )
            result.append( nominalRatio );
        else
            result.append( "<unset>" );
        result.append( ", ptClass: " );
        if( ptClassESet )
            result.append( ptClass );
        else
            result.append( "<unset>" );
        result.append( ", type: " );
        if( typeESet )
            result.append( type );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //PotentialTransformerImpl
