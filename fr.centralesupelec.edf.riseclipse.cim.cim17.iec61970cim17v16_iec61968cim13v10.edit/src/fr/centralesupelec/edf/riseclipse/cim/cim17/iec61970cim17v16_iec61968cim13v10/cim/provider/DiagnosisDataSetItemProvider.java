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
package fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.provider;

import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DiagnosisDataSet;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DiagnosisDataSet} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DiagnosisDataSetItemProvider extends ProcedureDataSetItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DiagnosisDataSetItemProvider( AdapterFactory adapterFactory ) {
        super( adapterFactory );
    }

    /**
     * This returns the property descriptors for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public List< IItemPropertyDescriptor > getPropertyDescriptors( Object object ) {
        if( itemPropertyDescriptors == null ) {
            super.getPropertyDescriptors( object );

            addEffectPropertyDescriptor( object );
            addFailureModePropertyDescriptor( object );
            addFinalCausePropertyDescriptor( object );
            addFinalCodePropertyDescriptor( object );
            addFinalOriginPropertyDescriptor( object );
            addFinalRemarkPropertyDescriptor( object );
            addPhaseCodePropertyDescriptor( object );
            addPreliminaryCodePropertyDescriptor( object );
            addPreliminaryDateTimePropertyDescriptor( object );
            addPreliminaryRemarkPropertyDescriptor( object );
            addRootCausePropertyDescriptor( object );
            addRootOriginPropertyDescriptor( object );
            addRootRemarkPropertyDescriptor( object );
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Effect feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addEffectPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_DiagnosisDataSet_effect_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_DiagnosisDataSet_effect_feature",
                                "_UI_DiagnosisDataSet_type" ),
                        CimPackage.eINSTANCE.getDiagnosisDataSet_Effect(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Failure Mode feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addFailureModePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_DiagnosisDataSet_failureMode_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_DiagnosisDataSet_failureMode_feature",
                                "_UI_DiagnosisDataSet_type" ),
                        CimPackage.eINSTANCE.getDiagnosisDataSet_FailureMode(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Final Cause feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addFinalCausePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_DiagnosisDataSet_finalCause_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_DiagnosisDataSet_finalCause_feature",
                                "_UI_DiagnosisDataSet_type" ),
                        CimPackage.eINSTANCE.getDiagnosisDataSet_FinalCause(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Final Code feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addFinalCodePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_DiagnosisDataSet_finalCode_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_DiagnosisDataSet_finalCode_feature",
                                "_UI_DiagnosisDataSet_type" ),
                        CimPackage.eINSTANCE.getDiagnosisDataSet_FinalCode(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Final Origin feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addFinalOriginPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_DiagnosisDataSet_finalOrigin_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_DiagnosisDataSet_finalOrigin_feature",
                                "_UI_DiagnosisDataSet_type" ),
                        CimPackage.eINSTANCE.getDiagnosisDataSet_FinalOrigin(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Final Remark feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addFinalRemarkPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_DiagnosisDataSet_finalRemark_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_DiagnosisDataSet_finalRemark_feature",
                                "_UI_DiagnosisDataSet_type" ),
                        CimPackage.eINSTANCE.getDiagnosisDataSet_FinalRemark(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Phase Code feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPhaseCodePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_DiagnosisDataSet_phaseCode_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_DiagnosisDataSet_phaseCode_feature",
                                "_UI_DiagnosisDataSet_type" ),
                        CimPackage.eINSTANCE.getDiagnosisDataSet_PhaseCode(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Preliminary Code feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPreliminaryCodePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_DiagnosisDataSet_preliminaryCode_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_DiagnosisDataSet_preliminaryCode_feature",
                                "_UI_DiagnosisDataSet_type" ),
                        CimPackage.eINSTANCE.getDiagnosisDataSet_PreliminaryCode(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Preliminary Date Time feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPreliminaryDateTimePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_DiagnosisDataSet_preliminaryDateTime_feature" ),
                        getString( "_UI_PropertyDescriptor_description",
                                "_UI_DiagnosisDataSet_preliminaryDateTime_feature", "_UI_DiagnosisDataSet_type" ),
                        CimPackage.eINSTANCE.getDiagnosisDataSet_PreliminaryDateTime(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Preliminary Remark feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPreliminaryRemarkPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_DiagnosisDataSet_preliminaryRemark_feature" ),
                        getString( "_UI_PropertyDescriptor_description",
                                "_UI_DiagnosisDataSet_preliminaryRemark_feature", "_UI_DiagnosisDataSet_type" ),
                        CimPackage.eINSTANCE.getDiagnosisDataSet_PreliminaryRemark(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Root Cause feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addRootCausePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_DiagnosisDataSet_rootCause_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_DiagnosisDataSet_rootCause_feature",
                                "_UI_DiagnosisDataSet_type" ),
                        CimPackage.eINSTANCE.getDiagnosisDataSet_RootCause(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Root Origin feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addRootOriginPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_DiagnosisDataSet_rootOrigin_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_DiagnosisDataSet_rootOrigin_feature",
                                "_UI_DiagnosisDataSet_type" ),
                        CimPackage.eINSTANCE.getDiagnosisDataSet_RootOrigin(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Root Remark feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addRootRemarkPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_DiagnosisDataSet_rootRemark_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_DiagnosisDataSet_rootRemark_feature",
                                "_UI_DiagnosisDataSet_type" ),
                        CimPackage.eINSTANCE.getDiagnosisDataSet_RootRemark(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This returns DiagnosisDataSet.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage( Object object ) {
        return overlayImage( object, getResourceLocator().getImage( "full/obj16/DiagnosisDataSet" ) );
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText( Object object ) {
        String label = ( ( DiagnosisDataSet ) object ).getName();
        return label == null || label.length() == 0 ? getString( "_UI_DiagnosisDataSet_type" )
                : getString( "_UI_DiagnosisDataSet_type" ) + " " + label;
    }

    /**
     * This handles model notifications by calling {@link #updateChildren} to update any cached
     * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void notifyChanged( Notification notification ) {
        updateChildren( notification );

        switch( notification.getFeatureID( DiagnosisDataSet.class ) ) {
        case CimPackage.DIAGNOSIS_DATA_SET__EFFECT:
        case CimPackage.DIAGNOSIS_DATA_SET__FAILURE_MODE:
        case CimPackage.DIAGNOSIS_DATA_SET__FINAL_CAUSE:
        case CimPackage.DIAGNOSIS_DATA_SET__FINAL_CODE:
        case CimPackage.DIAGNOSIS_DATA_SET__FINAL_ORIGIN:
        case CimPackage.DIAGNOSIS_DATA_SET__FINAL_REMARK:
        case CimPackage.DIAGNOSIS_DATA_SET__PHASE_CODE:
        case CimPackage.DIAGNOSIS_DATA_SET__PRELIMINARY_CODE:
        case CimPackage.DIAGNOSIS_DATA_SET__PRELIMINARY_DATE_TIME:
        case CimPackage.DIAGNOSIS_DATA_SET__PRELIMINARY_REMARK:
        case CimPackage.DIAGNOSIS_DATA_SET__ROOT_CAUSE:
        case CimPackage.DIAGNOSIS_DATA_SET__ROOT_ORIGIN:
        case CimPackage.DIAGNOSIS_DATA_SET__ROOT_REMARK:
            fireNotifyChanged( new ViewerNotification( notification, notification.getNotifier(), false, true ) );
            return;
        }
        super.notifyChanged( notification );
    }

    /**
     * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
     * that can be created under this object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected void collectNewChildDescriptors( Collection< Object > newChildDescriptors, Object object ) {
        super.collectNewChildDescriptors( newChildDescriptors, object );
    }

    /**
     * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getCreateChildText( Object owner, Object feature, Object child, Collection< ? > selection ) {
        Object childFeature = feature;
        Object childObject = child;

        boolean qualify = childFeature == CimPackage.eINSTANCE.getDocument_DocStatus() ||
                childFeature == CimPackage.eINSTANCE.getDocument_Status();

        if( qualify ) {
            return getString( "_UI_CreateChild_text2",
                    new Object[] { getTypeText( childObject ), getFeatureText( childFeature ), getTypeText( owner ) } );
        }
        return super.getCreateChildText( owner, feature, child, selection );
    }

}
