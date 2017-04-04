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
package fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.provider;

import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SwitchingStepGroup;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SwitchingStepGroup} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SwitchingStepGroupItemProvider extends DocumentItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SwitchingStepGroupItemProvider( AdapterFactory adapterFactory ) {
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

            addIsFreeSequencePropertyDescriptor( object );
            addSequenceNumberPropertyDescriptor( object );
            addGenericActionsPropertyDescriptor( object );
            addEnergySourceActionsPropertyDescriptor( object );
            addGroundActionsPropertyDescriptor( object );
            addSwitchingPlanPropertyDescriptor( object );
            addJumperActionsPropertyDescriptor( object );
            addTagActionsPropertyDescriptor( object );
            addClearanceActionsPropertyDescriptor( object );
            addCutActionsPropertyDescriptor( object );
            addSwitchActionsPropertyDescriptor( object );
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Is Free Sequence feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addIsFreeSequencePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_SwitchingStepGroup_isFreeSequence_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_SwitchingStepGroup_isFreeSequence_feature",
                        "_UI_SwitchingStepGroup_type" ),
                CimPackage.eINSTANCE.getSwitchingStepGroup_IsFreeSequence(), true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Sequence Number feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addSequenceNumberPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_SwitchingStepGroup_sequenceNumber_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_SwitchingStepGroup_sequenceNumber_feature",
                        "_UI_SwitchingStepGroup_type" ),
                CimPackage.eINSTANCE.getSwitchingStepGroup_SequenceNumber(), true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Generic Actions feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addGenericActionsPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_SwitchingStepGroup_GenericActions_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_SwitchingStepGroup_GenericActions_feature",
                        "_UI_SwitchingStepGroup_type" ),
                CimPackage.eINSTANCE.getSwitchingStepGroup_GenericActions(), true, false, true, null, null, null ) );
    }

    /**
     * This adds a property descriptor for the Energy Source Actions feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addEnergySourceActionsPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_SwitchingStepGroup_EnergySourceActions_feature" ),
                        getString( "_UI_PropertyDescriptor_description",
                                "_UI_SwitchingStepGroup_EnergySourceActions_feature", "_UI_SwitchingStepGroup_type" ),
                        CimPackage.eINSTANCE.getSwitchingStepGroup_EnergySourceActions(), true, false, true, null, null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Ground Actions feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addGroundActionsPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_SwitchingStepGroup_GroundActions_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_SwitchingStepGroup_GroundActions_feature",
                        "_UI_SwitchingStepGroup_type" ),
                CimPackage.eINSTANCE.getSwitchingStepGroup_GroundActions(), true, false, true, null, null, null ) );
    }

    /**
     * This adds a property descriptor for the Switching Plan feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addSwitchingPlanPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_SwitchingStepGroup_SwitchingPlan_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_SwitchingStepGroup_SwitchingPlan_feature",
                        "_UI_SwitchingStepGroup_type" ),
                CimPackage.eINSTANCE.getSwitchingStepGroup_SwitchingPlan(), true, false, true, null, null, null ) );
    }

    /**
     * This adds a property descriptor for the Jumper Actions feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addJumperActionsPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_SwitchingStepGroup_JumperActions_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_SwitchingStepGroup_JumperActions_feature",
                        "_UI_SwitchingStepGroup_type" ),
                CimPackage.eINSTANCE.getSwitchingStepGroup_JumperActions(), true, false, true, null, null, null ) );
    }

    /**
     * This adds a property descriptor for the Tag Actions feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTagActionsPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_SwitchingStepGroup_TagActions_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_SwitchingStepGroup_TagActions_feature",
                        "_UI_SwitchingStepGroup_type" ),
                CimPackage.eINSTANCE.getSwitchingStepGroup_TagActions(), true, false, true, null, null, null ) );
    }

    /**
     * This adds a property descriptor for the Clearance Actions feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addClearanceActionsPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_SwitchingStepGroup_ClearanceActions_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_SwitchingStepGroup_ClearanceActions_feature",
                        "_UI_SwitchingStepGroup_type" ),
                CimPackage.eINSTANCE.getSwitchingStepGroup_ClearanceActions(), true, false, true, null, null, null ) );
    }

    /**
     * This adds a property descriptor for the Cut Actions feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addCutActionsPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_SwitchingStepGroup_CutActions_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_SwitchingStepGroup_CutActions_feature",
                        "_UI_SwitchingStepGroup_type" ),
                CimPackage.eINSTANCE.getSwitchingStepGroup_CutActions(), true, false, true, null, null, null ) );
    }

    /**
     * This adds a property descriptor for the Switch Actions feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addSwitchActionsPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_SwitchingStepGroup_SwitchActions_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_SwitchingStepGroup_SwitchActions_feature",
                        "_UI_SwitchingStepGroup_type" ),
                CimPackage.eINSTANCE.getSwitchingStepGroup_SwitchActions(), true, false, true, null, null, null ) );
    }

    /**
     * This returns SwitchingStepGroup.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage( Object object ) {
        return overlayImage( object, getResourceLocator().getImage( "full/obj16/SwitchingStepGroup" ) );
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText( Object object ) {
        String label = ( ( SwitchingStepGroup ) object ).getName();
        return label == null || label.length() == 0 ? getString( "_UI_SwitchingStepGroup_type" )
                : getString( "_UI_SwitchingStepGroup_type" ) + " " + label;
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

        switch( notification.getFeatureID( SwitchingStepGroup.class ) ) {
        case CimPackage.SWITCHING_STEP_GROUP__IS_FREE_SEQUENCE:
        case CimPackage.SWITCHING_STEP_GROUP__SEQUENCE_NUMBER:
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

        boolean qualify = childFeature == CimPackage.eINSTANCE.getDocument_DocStatus()
                || childFeature == CimPackage.eINSTANCE.getDocument_Status();

        if( qualify ) {
            return getString( "_UI_CreateChild_text2",
                    new Object[] { getTypeText( childObject ), getFeatureText( childFeature ), getTypeText( owner ) } );
        }
        return super.getCreateChildText( owner, feature, child, selection );
    }

}
