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

import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AssetTestLab;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LabTestDataSet;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Specimen;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TestReason;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Lab Test Data Set</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.LabTestDataSetImpl#getConclusion <em>Conclusion</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.LabTestDataSetImpl#getConclusionConfidence <em>Conclusion Confidence</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.LabTestDataSetImpl#getReasonForTest <em>Reason For Test</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.LabTestDataSetImpl#getTestEquipmentID <em>Test Equipment ID</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.LabTestDataSetImpl#getAssetTestLab <em>Asset Test Lab</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.LabTestDataSetImpl#getSpecimen <em>Specimen</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LabTestDataSetImpl extends ProcedureDataSetImpl implements LabTestDataSet {
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
     * The default value of the '{@link #getConclusionConfidence() <em>Conclusion Confidence</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getConclusionConfidence()
     * @generated
     * @ordered
     */
    protected static final String CONCLUSION_CONFIDENCE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getConclusionConfidence() <em>Conclusion Confidence</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getConclusionConfidence()
     * @generated
     * @ordered
     */
    protected String conclusionConfidence = CONCLUSION_CONFIDENCE_EDEFAULT;

    /**
     * This is true if the Conclusion Confidence attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean conclusionConfidenceESet;

    /**
     * The default value of the '{@link #getReasonForTest() <em>Reason For Test</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReasonForTest()
     * @generated
     * @ordered
     */
    protected static final TestReason REASON_FOR_TEST_EDEFAULT = TestReason.POST_OPERATION_FAULT;

    /**
     * The cached value of the '{@link #getReasonForTest() <em>Reason For Test</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReasonForTest()
     * @generated
     * @ordered
     */
    protected TestReason reasonForTest = REASON_FOR_TEST_EDEFAULT;

    /**
     * This is true if the Reason For Test attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean reasonForTestESet;

    /**
     * The default value of the '{@link #getTestEquipmentID() <em>Test Equipment ID</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTestEquipmentID()
     * @generated
     * @ordered
     */
    protected static final String TEST_EQUIPMENT_ID_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTestEquipmentID() <em>Test Equipment ID</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTestEquipmentID()
     * @generated
     * @ordered
     */
    protected String testEquipmentID = TEST_EQUIPMENT_ID_EDEFAULT;

    /**
     * This is true if the Test Equipment ID attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean testEquipmentIDESet;

    /**
     * The cached value of the '{@link #getAssetTestLab() <em>Asset Test Lab</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAssetTestLab()
     * @generated
     * @ordered
     */
    protected AssetTestLab assetTestLab;

    /**
     * This is true if the Asset Test Lab reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean assetTestLabESet;

    /**
     * The cached value of the '{@link #getSpecimen() <em>Specimen</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSpecimen()
     * @generated
     * @ordered
     */
    protected Specimen specimen;

    /**
     * This is true if the Specimen reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean specimenESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected LabTestDataSetImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getLabTestDataSet();
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
                CimPackage.LAB_TEST_DATA_SET__CONCLUSION, oldConclusion, conclusion, !oldConclusionESet ) );
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
                CimPackage.LAB_TEST_DATA_SET__CONCLUSION, oldConclusion, CONCLUSION_EDEFAULT, oldConclusionESet ) );
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
    public String getConclusionConfidence() {
        return conclusionConfidence;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setConclusionConfidence( String newConclusionConfidence ) {
        String oldConclusionConfidence = conclusionConfidence;
        conclusionConfidence = newConclusionConfidence;
        boolean oldConclusionConfidenceESet = conclusionConfidenceESet;
        conclusionConfidenceESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.LAB_TEST_DATA_SET__CONCLUSION_CONFIDENCE,
                    oldConclusionConfidence, conclusionConfidence, !oldConclusionConfidenceESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetConclusionConfidence() {
        String oldConclusionConfidence = conclusionConfidence;
        boolean oldConclusionConfidenceESet = conclusionConfidenceESet;
        conclusionConfidence = CONCLUSION_CONFIDENCE_EDEFAULT;
        conclusionConfidenceESet = false;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.UNSET, CimPackage.LAB_TEST_DATA_SET__CONCLUSION_CONFIDENCE,
                        oldConclusionConfidence, CONCLUSION_CONFIDENCE_EDEFAULT, oldConclusionConfidenceESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetConclusionConfidence() {
        return conclusionConfidenceESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public TestReason getReasonForTest() {
        return reasonForTest;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setReasonForTest( TestReason newReasonForTest ) {
        TestReason oldReasonForTest = reasonForTest;
        reasonForTest = newReasonForTest == null ? REASON_FOR_TEST_EDEFAULT : newReasonForTest;
        boolean oldReasonForTestESet = reasonForTestESet;
        reasonForTestESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.LAB_TEST_DATA_SET__REASON_FOR_TEST,
                    oldReasonForTest, reasonForTest, !oldReasonForTestESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetReasonForTest() {
        TestReason oldReasonForTest = reasonForTest;
        boolean oldReasonForTestESet = reasonForTestESet;
        reasonForTest = REASON_FOR_TEST_EDEFAULT;
        reasonForTestESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.LAB_TEST_DATA_SET__REASON_FOR_TEST,
                    oldReasonForTest, REASON_FOR_TEST_EDEFAULT, oldReasonForTestESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetReasonForTest() {
        return reasonForTestESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getTestEquipmentID() {
        return testEquipmentID;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTestEquipmentID( String newTestEquipmentID ) {
        String oldTestEquipmentID = testEquipmentID;
        testEquipmentID = newTestEquipmentID;
        boolean oldTestEquipmentIDESet = testEquipmentIDESet;
        testEquipmentIDESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.LAB_TEST_DATA_SET__TEST_EQUIPMENT_ID,
                    oldTestEquipmentID, testEquipmentID, !oldTestEquipmentIDESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTestEquipmentID() {
        String oldTestEquipmentID = testEquipmentID;
        boolean oldTestEquipmentIDESet = testEquipmentIDESet;
        testEquipmentID = TEST_EQUIPMENT_ID_EDEFAULT;
        testEquipmentIDESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.LAB_TEST_DATA_SET__TEST_EQUIPMENT_ID,
                    oldTestEquipmentID, TEST_EQUIPMENT_ID_EDEFAULT, oldTestEquipmentIDESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTestEquipmentID() {
        return testEquipmentIDESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public AssetTestLab getAssetTestLab() {
        return assetTestLab;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetAssetTestLab( AssetTestLab newAssetTestLab, NotificationChain msgs ) {
        AssetTestLab oldAssetTestLab = assetTestLab;
        assetTestLab = newAssetTestLab;
        boolean oldAssetTestLabESet = assetTestLabESet;
        assetTestLabESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.LAB_TEST_DATA_SET__ASSET_TEST_LAB, oldAssetTestLab, newAssetTestLab,
                    !oldAssetTestLabESet );
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
    public void setAssetTestLab( AssetTestLab newAssetTestLab ) {
        if( newAssetTestLab != assetTestLab ) {
            NotificationChain msgs = null;
            if( assetTestLab != null ) msgs = ( ( InternalEObject ) assetTestLab ).eInverseRemove( this,
                    CimPackage.ASSET_TEST_LAB__LAB_TEST_DATA_SET, AssetTestLab.class, msgs );
            if( newAssetTestLab != null ) msgs = ( ( InternalEObject ) newAssetTestLab ).eInverseAdd( this,
                    CimPackage.ASSET_TEST_LAB__LAB_TEST_DATA_SET, AssetTestLab.class, msgs );
            msgs = basicSetAssetTestLab( newAssetTestLab, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldAssetTestLabESet = assetTestLabESet;
            assetTestLabESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.LAB_TEST_DATA_SET__ASSET_TEST_LAB,
                        newAssetTestLab, newAssetTestLab, !oldAssetTestLabESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetAssetTestLab( NotificationChain msgs ) {
        AssetTestLab oldAssetTestLab = assetTestLab;
        assetTestLab = null;
        boolean oldAssetTestLabESet = assetTestLabESet;
        assetTestLabESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.LAB_TEST_DATA_SET__ASSET_TEST_LAB, oldAssetTestLab, null, oldAssetTestLabESet );
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
    public void unsetAssetTestLab() {
        if( assetTestLab != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) assetTestLab ).eInverseRemove( this,
                    CimPackage.ASSET_TEST_LAB__LAB_TEST_DATA_SET, AssetTestLab.class, msgs );
            msgs = basicUnsetAssetTestLab( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldAssetTestLabESet = assetTestLabESet;
            assetTestLabESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.LAB_TEST_DATA_SET__ASSET_TEST_LAB, null, null, oldAssetTestLabESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetAssetTestLab() {
        return assetTestLabESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Specimen getSpecimen() {
        return specimen;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetSpecimen( Specimen newSpecimen, NotificationChain msgs ) {
        Specimen oldSpecimen = specimen;
        specimen = newSpecimen;
        boolean oldSpecimenESet = specimenESet;
        specimenESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.LAB_TEST_DATA_SET__SPECIMEN, oldSpecimen, newSpecimen, !oldSpecimenESet );
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
    public void setSpecimen( Specimen newSpecimen ) {
        if( newSpecimen != specimen ) {
            NotificationChain msgs = null;
            if( specimen != null ) msgs = ( ( InternalEObject ) specimen ).eInverseRemove( this,
                    CimPackage.SPECIMEN__LAB_TEST_DATA_SET, Specimen.class, msgs );
            if( newSpecimen != null ) msgs = ( ( InternalEObject ) newSpecimen ).eInverseAdd( this,
                    CimPackage.SPECIMEN__LAB_TEST_DATA_SET, Specimen.class, msgs );
            msgs = basicSetSpecimen( newSpecimen, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldSpecimenESet = specimenESet;
            specimenESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.LAB_TEST_DATA_SET__SPECIMEN, newSpecimen, newSpecimen, !oldSpecimenESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetSpecimen( NotificationChain msgs ) {
        Specimen oldSpecimen = specimen;
        specimen = null;
        boolean oldSpecimenESet = specimenESet;
        specimenESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.LAB_TEST_DATA_SET__SPECIMEN, oldSpecimen, null, oldSpecimenESet );
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
    public void unsetSpecimen() {
        if( specimen != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) specimen ).eInverseRemove( this, CimPackage.SPECIMEN__LAB_TEST_DATA_SET,
                    Specimen.class, msgs );
            msgs = basicUnsetSpecimen( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldSpecimenESet = specimenESet;
            specimenESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.LAB_TEST_DATA_SET__SPECIMEN, null, null, oldSpecimenESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetSpecimen() {
        return specimenESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.LAB_TEST_DATA_SET__ASSET_TEST_LAB:
            if( assetTestLab != null ) msgs = ( ( InternalEObject ) assetTestLab ).eInverseRemove( this,
                    CimPackage.ASSET_TEST_LAB__LAB_TEST_DATA_SET, AssetTestLab.class, msgs );
            return basicSetAssetTestLab( ( AssetTestLab ) otherEnd, msgs );
        case CimPackage.LAB_TEST_DATA_SET__SPECIMEN:
            if( specimen != null ) msgs = ( ( InternalEObject ) specimen ).eInverseRemove( this,
                    CimPackage.SPECIMEN__LAB_TEST_DATA_SET, Specimen.class, msgs );
            return basicSetSpecimen( ( Specimen ) otherEnd, msgs );
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
        case CimPackage.LAB_TEST_DATA_SET__ASSET_TEST_LAB:
            return basicUnsetAssetTestLab( msgs );
        case CimPackage.LAB_TEST_DATA_SET__SPECIMEN:
            return basicUnsetSpecimen( msgs );
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
        case CimPackage.LAB_TEST_DATA_SET__CONCLUSION:
            return getConclusion();
        case CimPackage.LAB_TEST_DATA_SET__CONCLUSION_CONFIDENCE:
            return getConclusionConfidence();
        case CimPackage.LAB_TEST_DATA_SET__REASON_FOR_TEST:
            return getReasonForTest();
        case CimPackage.LAB_TEST_DATA_SET__TEST_EQUIPMENT_ID:
            return getTestEquipmentID();
        case CimPackage.LAB_TEST_DATA_SET__ASSET_TEST_LAB:
            return getAssetTestLab();
        case CimPackage.LAB_TEST_DATA_SET__SPECIMEN:
            return getSpecimen();
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
        case CimPackage.LAB_TEST_DATA_SET__CONCLUSION:
            setConclusion( ( String ) newValue );
            return;
        case CimPackage.LAB_TEST_DATA_SET__CONCLUSION_CONFIDENCE:
            setConclusionConfidence( ( String ) newValue );
            return;
        case CimPackage.LAB_TEST_DATA_SET__REASON_FOR_TEST:
            setReasonForTest( ( TestReason ) newValue );
            return;
        case CimPackage.LAB_TEST_DATA_SET__TEST_EQUIPMENT_ID:
            setTestEquipmentID( ( String ) newValue );
            return;
        case CimPackage.LAB_TEST_DATA_SET__ASSET_TEST_LAB:
            setAssetTestLab( ( AssetTestLab ) newValue );
            return;
        case CimPackage.LAB_TEST_DATA_SET__SPECIMEN:
            setSpecimen( ( Specimen ) newValue );
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
        case CimPackage.LAB_TEST_DATA_SET__CONCLUSION:
            unsetConclusion();
            return;
        case CimPackage.LAB_TEST_DATA_SET__CONCLUSION_CONFIDENCE:
            unsetConclusionConfidence();
            return;
        case CimPackage.LAB_TEST_DATA_SET__REASON_FOR_TEST:
            unsetReasonForTest();
            return;
        case CimPackage.LAB_TEST_DATA_SET__TEST_EQUIPMENT_ID:
            unsetTestEquipmentID();
            return;
        case CimPackage.LAB_TEST_DATA_SET__ASSET_TEST_LAB:
            unsetAssetTestLab();
            return;
        case CimPackage.LAB_TEST_DATA_SET__SPECIMEN:
            unsetSpecimen();
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
        case CimPackage.LAB_TEST_DATA_SET__CONCLUSION:
            return isSetConclusion();
        case CimPackage.LAB_TEST_DATA_SET__CONCLUSION_CONFIDENCE:
            return isSetConclusionConfidence();
        case CimPackage.LAB_TEST_DATA_SET__REASON_FOR_TEST:
            return isSetReasonForTest();
        case CimPackage.LAB_TEST_DATA_SET__TEST_EQUIPMENT_ID:
            return isSetTestEquipmentID();
        case CimPackage.LAB_TEST_DATA_SET__ASSET_TEST_LAB:
            return isSetAssetTestLab();
        case CimPackage.LAB_TEST_DATA_SET__SPECIMEN:
            return isSetSpecimen();
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
        result.append( ", conclusionConfidence: " );
        if( conclusionConfidenceESet )
            result.append( conclusionConfidence );
        else
            result.append( "<unset>" );
        result.append( ", reasonForTest: " );
        if( reasonForTestESet )
            result.append( reasonForTest );
        else
            result.append( "<unset>" );
        result.append( ", testEquipmentID: " );
        if( testEquipmentIDESet )
            result.append( testEquipmentID );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //LabTestDataSetImpl
