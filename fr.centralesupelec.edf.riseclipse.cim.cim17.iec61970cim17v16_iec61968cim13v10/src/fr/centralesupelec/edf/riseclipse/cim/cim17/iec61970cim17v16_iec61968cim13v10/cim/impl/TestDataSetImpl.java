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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TestDataSet;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Test Data Set</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.TestDataSetImpl#getConclusion <em>Conclusion</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.TestDataSetImpl#getSpecimenID <em>Specimen ID</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.TestDataSetImpl#getSpecimenToLabDateTime <em>Specimen To Lab Date Time</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TestDataSetImpl extends ProcedureDataSetImpl implements TestDataSet {
    /**
     * The default value of the '{@link #getConclusion() <em>Conclusion</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getConclusion()
     * @generated
     * @ordered
     */
    protected static final String CONCLUSION_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getConclusion() <em>Conclusion</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getConclusion()
     * @generated
     * @ordered
     */
    protected String conclusion = CONCLUSION_EDEFAULT;

    /**
     * This is true if the Conclusion attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean conclusionESet;

    /**
     * The default value of the '{@link #getSpecimenID() <em>Specimen ID</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSpecimenID()
     * @generated
     * @ordered
     */
    protected static final String SPECIMEN_ID_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSpecimenID() <em>Specimen ID</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSpecimenID()
     * @generated
     * @ordered
     */
    protected String specimenID = SPECIMEN_ID_EDEFAULT;

    /**
     * This is true if the Specimen ID attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean specimenIDESet;

    /**
     * The default value of the '{@link #getSpecimenToLabDateTime() <em>Specimen To Lab Date Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSpecimenToLabDateTime()
     * @generated
     * @ordered
     */
    protected static final Date SPECIMEN_TO_LAB_DATE_TIME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSpecimenToLabDateTime() <em>Specimen To Lab Date Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSpecimenToLabDateTime()
     * @generated
     * @ordered
     */
    protected Date specimenToLabDateTime = SPECIMEN_TO_LAB_DATE_TIME_EDEFAULT;

    /**
     * This is true if the Specimen To Lab Date Time attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean specimenToLabDateTimeESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected TestDataSetImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getTestDataSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getConclusion() {
        return conclusion;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setConclusion( String newConclusion ) {
        String oldConclusion = conclusion;
        conclusion = newConclusion;
        boolean oldConclusionESet = conclusionESet;
        conclusionESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.TEST_DATA_SET__CONCLUSION, oldConclusion, conclusion, !oldConclusionESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetConclusion() {
        String oldConclusion = conclusion;
        boolean oldConclusionESet = conclusionESet;
        conclusion = CONCLUSION_EDEFAULT;
        conclusionESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.TEST_DATA_SET__CONCLUSION, oldConclusion, CONCLUSION_EDEFAULT, oldConclusionESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetConclusion() {
        return conclusionESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getSpecimenID() {
        return specimenID;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setSpecimenID( String newSpecimenID ) {
        String oldSpecimenID = specimenID;
        specimenID = newSpecimenID;
        boolean oldSpecimenIDESet = specimenIDESet;
        specimenIDESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.TEST_DATA_SET__SPECIMEN_ID, oldSpecimenID, specimenID, !oldSpecimenIDESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetSpecimenID() {
        String oldSpecimenID = specimenID;
        boolean oldSpecimenIDESet = specimenIDESet;
        specimenID = SPECIMEN_ID_EDEFAULT;
        specimenIDESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.TEST_DATA_SET__SPECIMEN_ID, oldSpecimenID, SPECIMEN_ID_EDEFAULT, oldSpecimenIDESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetSpecimenID() {
        return specimenIDESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Date getSpecimenToLabDateTime() {
        return specimenToLabDateTime;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setSpecimenToLabDateTime( Date newSpecimenToLabDateTime ) {
        Date oldSpecimenToLabDateTime = specimenToLabDateTime;
        specimenToLabDateTime = newSpecimenToLabDateTime;
        boolean oldSpecimenToLabDateTimeESet = specimenToLabDateTimeESet;
        specimenToLabDateTimeESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.TEST_DATA_SET__SPECIMEN_TO_LAB_DATE_TIME,
                    oldSpecimenToLabDateTime, specimenToLabDateTime, !oldSpecimenToLabDateTimeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetSpecimenToLabDateTime() {
        Date oldSpecimenToLabDateTime = specimenToLabDateTime;
        boolean oldSpecimenToLabDateTimeESet = specimenToLabDateTimeESet;
        specimenToLabDateTime = SPECIMEN_TO_LAB_DATE_TIME_EDEFAULT;
        specimenToLabDateTimeESet = false;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.UNSET, CimPackage.TEST_DATA_SET__SPECIMEN_TO_LAB_DATE_TIME,
                        oldSpecimenToLabDateTime, SPECIMEN_TO_LAB_DATE_TIME_EDEFAULT, oldSpecimenToLabDateTimeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetSpecimenToLabDateTime() {
        return specimenToLabDateTimeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch( featureID ) {
        case CimPackage.TEST_DATA_SET__CONCLUSION:
            return getConclusion();
        case CimPackage.TEST_DATA_SET__SPECIMEN_ID:
            return getSpecimenID();
        case CimPackage.TEST_DATA_SET__SPECIMEN_TO_LAB_DATE_TIME:
            return getSpecimenToLabDateTime();
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
        case CimPackage.TEST_DATA_SET__CONCLUSION:
            setConclusion( ( String ) newValue );
            return;
        case CimPackage.TEST_DATA_SET__SPECIMEN_ID:
            setSpecimenID( ( String ) newValue );
            return;
        case CimPackage.TEST_DATA_SET__SPECIMEN_TO_LAB_DATE_TIME:
            setSpecimenToLabDateTime( ( Date ) newValue );
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
        case CimPackage.TEST_DATA_SET__CONCLUSION:
            unsetConclusion();
            return;
        case CimPackage.TEST_DATA_SET__SPECIMEN_ID:
            unsetSpecimenID();
            return;
        case CimPackage.TEST_DATA_SET__SPECIMEN_TO_LAB_DATE_TIME:
            unsetSpecimenToLabDateTime();
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
        case CimPackage.TEST_DATA_SET__CONCLUSION:
            return isSetConclusion();
        case CimPackage.TEST_DATA_SET__SPECIMEN_ID:
            return isSetSpecimenID();
        case CimPackage.TEST_DATA_SET__SPECIMEN_TO_LAB_DATE_TIME:
            return isSetSpecimenToLabDateTime();
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
        result.append( " (conclusion: " );
        if( conclusionESet )
            result.append( conclusion );
        else
            result.append( "<unset>" );
        result.append( ", specimenID: " );
        if( specimenIDESet )
            result.append( specimenID );
        else
            result.append( "<unset>" );
        result.append( ", specimenToLabDateTime: " );
        if( specimenToLabDateTimeESet )
            result.append( specimenToLabDateTime );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //TestDataSetImpl
